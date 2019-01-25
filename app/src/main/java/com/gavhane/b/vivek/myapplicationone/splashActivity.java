package com.gavhane.b.vivek.myapplicationone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread td = new Thread()                    // thread is used to start something in parallel
        {
            public void run1()          //define any method run1 here ,  we r doing this to provide delay
            {
                try{
                    sleep(4000);            // where 2000 is in milliseconds
                }catch(Exception e){
                    e.printStackTrace();        // this shows error on monitor
                }finally {                       // finally block executes anyhow
                    Intent it = new Intent(splashActivity.this,MainActivity.class);    // This will take us from splashActivity to MainActivity   This is the use of Intent class
                    startActivity(it);      // This will start the Intent it
                }
            }
        };td.start();      // This is how we start the thread                     //do not forget to give semicolon here
    }
}
