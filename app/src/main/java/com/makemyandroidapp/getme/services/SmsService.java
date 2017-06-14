package com.makemyandroidapp.getme.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/*
//odbiera sms do uruchomienia/wylaczenia wifi
// odbiera sms do zrobienia zdjecia
// odbiera sms do zarejestrowania zdarzenia w bazie
// odbiera sms do wyslania info na server
// pozwala/blokuje dostep do bazy zdarzen

 */

public class SmsService extends BroadcastReceiver {
    public static final String TAG = "Fun With Receivers";

    @Override
    public void onReceive(Context context, Intent intent) {
//		Log.i(TAG,"MY_CUSTOM_ACTION Recevied!");

//		Toast.makeText(context, "00000", Toast.LENGTH_LONG).show();

        Bundle bundle = intent.getExtras();
        SmsMessage[] msgs = null;
        String str = "";
        String incomingNumber = "";
        if (bundle != null) {
            //---retrieve the SMS message received---
            Object[] pdus = (Object[]) bundle.get("pdus");
            msgs = new SmsMessage[pdus.length];
            for (int i = 0; i < msgs.length; i++) {
//                incomingNumber = msgs[i].getOriginatingAddress();
                msgs[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
                str += "SMS get: " + msgs[i].getOriginatingAddress();
                incomingNumber += msgs[i].getOriginatingAddress();
                str += " :";
                str += msgs[i].getMessageBody().toString();
                str += "\n";
            }
            //---display the new SMS message---
            Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
        }

        System.out.println("Receiver start");
//        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
//        String incomingNumber = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
//        Toast.makeText(context, "number: " + incomingNumber, Toast.LENGTH_SHORT).show();
//		if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
        Intent local = new Intent();
        local.setAction("service.to.activity.transfer");
        local.putExtra("number", incomingNumber);
        context.sendBroadcast(local);
//		}

//		ObservableObject.getInstance().updateValue(i);

    }

}
