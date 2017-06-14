package com.makemyandroidapp.getme;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by Admin on 2017-06-08.
 */

//robi zdjecia
public class PhotoService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void takeFrontPhoto(){

    }
}
