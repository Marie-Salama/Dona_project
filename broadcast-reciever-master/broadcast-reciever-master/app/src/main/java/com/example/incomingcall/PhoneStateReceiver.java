package com.example.incomingcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PhoneStateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            System.out.println("Receiver start");
            Toast.makeText(context," incoming call ",Toast.LENGTH_SHORT).show();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
