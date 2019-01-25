package com.gavhane.b.vivek.myapplicationone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;        //  mention all the variables here i.e. Globally for better view only
    Button b1 , b2;
    int counter = 0;    // initialise ur counter here and not in on click listener bcz  we dont want to set counter to 0 after clicking on click listener

    @Override
    protected void onCreate(Bundle savedInstanceState) {        //onCreate  acts as a main function and code execution starts from here
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);         //this binds our xml file to this java file

        t1 = (TextView) findViewById(R.id.txt1);   //where R is a class that stores all ids
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);

        b1.setOnClickListener(new View.OnClickListener() {      //write b1.set  select from auto suggestion   then write   new V    and select from auto suggestion  to auto implement the interface method
            @Override
            public void onClick(View view) {
            counter++;
            t1.setText("Your counter: "+counter);           // here we used setText  to set the text on t1
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            counter = 0;
            t1.setText("Your counter is now after resetting is: "+counter);     // here we used setText  to set the text on t1
            }
        });


    }
}
