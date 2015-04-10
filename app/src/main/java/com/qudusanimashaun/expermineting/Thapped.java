package com.qudusanimashaun.expermineting;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

//import com.facebook.appevents.AppEventsLogger;
import com.parse.Parse;
import com.parse.ParseFacebookUtils;


public class Thapped extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "ovG2YcOPTv7Ex3THKOvWOqCANXlAJwwKPkz1U3RS", "KYzJbWmi7YV17FwJheiUKi7jd8cQLVQDFD55bRWk");
        // Logs 'install' and 'app activate' App Events.
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);




    }


}
