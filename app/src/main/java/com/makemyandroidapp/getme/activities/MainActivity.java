package com.makemyandroidapp.getme.activities;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.makemyandroidapp.getme.EventManager;
import com.makemyandroidapp.getme.database.Event;
import com.makemyandroidapp.getme.forecast.Forecast;
import com.makemyandroidapp.getme.forecast.ForecastService;
import com.makemyandroidapp.getme.services.GpsService;
import com.makemyandroidapp.getme.R;
import com.makemyandroidapp.getme.database.DatabaseHelper;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    int TAKE_PHOTO_CODE = 0;
    public static int count = 0;
    private BroadcastReceiver myActivityReceiver;
    private Context context;
    private WifiManager wifiManager;

    private Button btnShowLocation;
    private Button btnTakePhoto;
//    private Button btnCapture;

//    OrientationEventListener mOrientationListener;

    private GpsService gps;

    private EventManager eventManager;

    private ForecastService forecastService = new ForecastService();
    private TextView textView;

    private DatabaseHelper myDb;
    private final OkHttpClient client = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDb = new DatabaseHelper(this);
        wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView2);

        btnTakePhoto = (Button) findViewById(R.id.button_view_history);

//        mOrientationListener = new OrientationEventListener(this,
//                SensorManager.SENSOR_DELAY_NORMAL) {
//
//            @Override
//            public void onOrientationChanged(int orientation) {
////                Log.v(DEBUG_TAG,
////                        "Orientation changed to " + orientation);
//                Toast.makeText(getApplicationContext(), "orientation changed", Toast.LENGTH_SHORT).show();
//
//            }
//        };

//        if (mOrientationListener.canDetectOrientation() == true) {
////            Log.v(DEBUG_TAG, "Can detect orientation");
//            mOrientationListener.enable();
//        } else {
////            Log.v(DEBUG_TAG, "Cannot detect orientation");
//            mOrientationListener.disable();
//        }


        context = this;
        gps = new GpsService(MainActivity.this);
        eventManager = new EventManager();

//        btnCapture = (Button) findViewById(R.id.btnCapture);


//        btnCapture.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Here, the counter will be incremented each time, and the
//                // picture taken by camera will be stored as 1.jpg,2.jpg
//                // and likewise.
//                count++;
//                String file = dir + count + ".jpg";
//                File newfile = new File(file);
//                try {
//                    newfile.createNewFile();
//                } catch (IOException e) {
//                }
//
//                Uri outputFileUri = Uri.fromFile(newfile);
//
//                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
//
//                startActivityForResult(cameraIntent, TAKE_PHOTO_CODE);
//                Event event = new Event("taking photo", "request for taking photo", "0", "", "");
//                myDb.insertData(event);
//            }
//        });

        btnTakePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(MainActivity.this, ViewHistory.class);

                Cursor res = myDb.getAllData();
                if (res.getCount() == 0) {
//                    showMessage("Error", "Nothing found");
                    return;
                } else {
                    List<Event> events = new ArrayList<Event>();

                    res.moveToFirst();
                    do {
                        Event event = new Event();
                        event.setId(Integer.parseInt(res.getString(0)));
                        event.setName(res.getString(1));
                        event.setDescription(res.getString(2));
                        event.setIsLocation(res.getString(3));
                        event.setLatitude(res.getString(4));
                        event.setLongitude(res.getString(5));

                        events.add(event);
                    } while (res.moveToNext());

//                    while (res.moveToNext()) {
//                        Event event = new Event();
//                        event.setId(Integer.parseInt(res.getString(0)));
//                        event.setName(res.getString(1));
//                        event.setDescription(res.getString(2));
//                        event.setIsLocation(res.getString(3));
//                        event.setLatitude(res.getString(4));
//                        event.setLongitude(res.getString(5));
//
//                        events.add(event);
//                    }

                    k.putExtra("events", (Serializable) events);

                    startActivity(k);
                }

            }
        });

        btnShowLocation = (Button) findViewById(R.id.button_show_location);

        btnShowLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // create class object

                boolean wifiEnabled = wifiManager.isWifiEnabled();
                if (wifiEnabled) {
                    wifiManager.setWifiEnabled(false);
                    Event event = new Event("wifi operation", "wifi from on to off", "0", "", "");

                    myDb.insertData(event);

                    new AsyncTask<String, String, String>() {


                        @Override
                        protected String doInBackground(String... params) {
                            try {
                                RequestBody formBody = new FormBody.Builder()
                                        .add("message", ("wifi from on to off"))
                                        .build();

                                Request request = new Request.Builder()
                                        .url("http://192.168.0.59:3016")
                                        .post(formBody)
                                        .build();

                                okhttp3.Response response = client.newCall(request).execute();
                                return response.body().string();
                            } catch (IOException e) {
                                return "Error: " + e.getMessage();
                            }
                        }


                    }.execute("");

                } else {
                    wifiManager.setWifiEnabled(true);
                    Event event = new Event("wifi operation", "wifi from off to on", "0", "", "");
                    myDb.insertData(event);

                    new AsyncTask<String, String, String>() {

                        @Override
                        protected String doInBackground(String... params) {
                            try {
                                RequestBody formBody = new FormBody.Builder()
                                        .add("message", ("wifi from off to on"))
                                        .build();

                                Request request = new Request.Builder()
                                        .url("http://192.168.0.59:3016")
                                        .post(formBody)
                                        .build();

                                okhttp3.Response response = client.newCall(request).execute();
                                return response.body().string();
                            } catch (IOException e) {
                                return "Error: " + e.getMessage();
                            }
                        }

                    }.execute("");
                }

                // check if GPS enabled
                if (gps.canGetLocation()) {

                    double latitude = gps.getLatitude();
                    double longitude = gps.getLongitude();

//                    test(String.valueOf(latitude), String.valueOf(longitude));

                    Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_SHORT).show();
                } else {
                    // can't get location
                    // GPS or Network is not enabled
                    // Ask user to enable GPS/network in settings
                    gps.showSettingsAlert();
                }

            }
        });

        IntentFilter filter = new IntentFilter();
        filter.addAction("service.to.activity.transfer");

        myActivityReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (intent != null) {
                    final String number = intent.getStringExtra("number").toString();
//                    Toast.makeText(context, "hejka"+intent.getStringExtra("number").toString(), Toast.LENGTH_SHORT).show();

                    final double latitude = gps.getLatitude();
                    final double longitude = gps.getLongitude();

//                    String message = test(String.valueOf(latitude), String.valueOf(longitude));

                    Callback<Forecast> callback = new Callback<Forecast>() {
                        @Override
                        public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                            double result = response.body().getCurrently().getTemperature();

                            final double temperatue = ((Double.valueOf(result) - 32) * 5) / 9;

                            textView.setText(String.format("%.2f", temperatue));
//                            message = (String.format("%.2f", temperatue));

                            eventManager.sendSMS(number, "lat: " + String.format("%.2f", latitude) + ", longi: " + String.format("%.2f", longitude) + " temp: " + (String.format("%.2f", temperatue)));
                            Event event = new Event("get location&temp", "request for location&temperature", "1", String.valueOf(latitude), String.valueOf(longitude));
                            myDb.insertData(event);

                            new AsyncTask<String, String, String>() {


                                @Override
                                protected String doInBackground(String... params) {
                                    try {
                                        RequestBody formBody = new FormBody.Builder()
                                                .add("message", ("request for location&temperature"))
                                                .add("latitude", String.valueOf(latitude))
                                                .add("longitude", String.valueOf(longitude))
                                                .add("temperature: ", String.valueOf(temperatue))
                                                .build();

                                        Request request = new Request.Builder()
                                                .url("http://192.168.0.59:3016")
                                                .post(formBody)
                                                .build();

                                        okhttp3.Response response = client.newCall(request).execute();
                                        return response.body().string();
                                    } catch (IOException e) {
                                        return "Error: " + e.getMessage();
                                    }
                                }


                            }.execute("");
                        }

                        @Override
                        public void onFailure(Call<Forecast> call, Throwable t) {

                        }
                    };
                    forecastService.loadForecastData(callback, String.valueOf(latitude), String.valueOf(longitude));


//                    eventManager.sendSMS(number, "wiadomosc");
//                    Toast.makeText(context, "message sent", Toast.LENGTH_SHORT).show();
                }
            }
        };

        registerReceiver(myActivityReceiver, filter);
    }

//    private void sendSMS(String phoneNumber, String message) {
//        PendingIntent pi = PendingIntent.getActivity(this, 0,
//                new Intent(this, MainActivity.class), 0);
//        SmsManager sms = SmsManager.getDefault();
//        sms.sendTextMessage(phoneNumber, null, message, pi, null);
//    }


    @Override
    public void onPause() {
        super.onPause();
        //Don't forget to unregister your receiver when you are done with it.
//        unregisterReceiver(myActivityReceiver);
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setContentView(R.layout.activity_main);
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
            count++;
            final String dir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + "/picFolder/";
            File newdir = new File(dir);
            newdir.mkdirs();
            String file = dir + count + ".jpg";
            File newfile = new File(file);
            try {
                newfile.createNewFile();
            } catch (IOException e) {
            }

            Uri outputFileUri = Uri.fromFile(newfile);

            Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);

            startActivityForResult(cameraIntent, TAKE_PHOTO_CODE);
            Event event = new Event("taking photo", "request for taking photo", "0", "", "");
            myDb.insertData(event);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }

//    @Override
//    public void onOrientationChanged(int i) {
//        Toast.makeText(this, "landscape222", Toast.LENGTH_SHORT).show();
//    }
}

