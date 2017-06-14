package com.makemyandroidapp.getme.activities;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.makemyandroidapp.getme.R;
import com.makemyandroidapp.getme.database.Event;

import java.util.ArrayList;
import java.util.List;

public class ViewHistory extends Activity {

    private Button button;
    private List<Event> eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_history);
        eventList = new ArrayList<>();

        populateListView();
        registerClickCallback();

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewHistory.this, MapsActivity.class);

                intent.putExtra("latitude", "37.8267");
                intent.putExtra("longitude", "-122.4233");
                startActivity(intent);
            }
        });
    }


    private void populateListView() {
        List<Event> events = (List<Event>) getIntent().getSerializableExtra("events");
        List<String> items = new ArrayList<>();
        for (Event event : events) {
            Event e = new Event();
            e.setId(event.getId());
            e.setName(event.getName());
            e.setDescription(event.getDescription());
            e.setIsLocation(event.getIsLocation());
            e.setLongitude(event.getLongitude());
            e.setLatitude(event.getLatitude());
            eventList.add(e);
            items.add(event.getName() + " " + event.getIsLocation());
        }

//        String[] items = {"jeden", "dwa", "trzy", String.valueOf(events.size())};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.e_item, items);

        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);
    }

    private void registerClickCallback() {
        ListView list = (ListView) findViewById(R.id.listView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view;
                String message = "you clicked # " + i + " which is string: " + textView.getText().toString() + " : " + getEvent(i).getIsLocation();
                Toast.makeText(ViewHistory.this, message, Toast.LENGTH_SHORT).show();

                if (getEvent(i) != null) {
                    if (getEvent(i).getIsLocation().equals("1")) {
                        Intent intent = new Intent(ViewHistory.this, MapsActivity.class);

                        intent.putExtra("latitude", getEvent(i).getLatitude());
                        intent.putExtra("longitude", getEvent(i).getLongitude());
                        startActivity(intent);
                    }
                }
            }
        });
    }

    private Event getEvent(int id) {
        for (Event event : eventList) {
            if (event.getId() == id) {
                return event;
            }
        }
        return new Event();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

}
