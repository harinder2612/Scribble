package me.gurpreet.collabratevid;

import android.app.Application;

import io.realm.Realm;

public class DrawApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
//        RealmLog.setLevel(Log.VERBOSE);
    }
}
