package com.makemyandroidapp.getme;

import android.app.PendingIntent;
import android.content.Intent;
import android.telephony.SmsManager;

/**
 * Created by Admin on 2017-06-08.
 */

//rejestrator zdarzen - zapisuje w bazie danych
public class EventManager {

    public void addEvent(){

    }

    public void sendSMS(String number, String message){
//        PendingIntent pi = PendingIntent.getActivity(this, 0,
//                new Intent(this, MainActivity.class), 0);
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(number, null, message, null, null);
    }
}
