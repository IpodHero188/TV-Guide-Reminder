package com.example.TVApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by DanielMaclin on 5/22/2014.
 */
public class Registration extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);



    }

    public void OnRadioButtonClicked(View view){
        //checks to see if a radio button is selected
        boolean clicked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.LocalradioButton:
                //user will create a new profile
                Intent newProfile = new Intent(this, newProfile.class);
                break;
            case R.id.FollowShowReadioButton:
                //user will access their FollowShows profile from FollowSHow
                //disabled for the current stage of the project
                break;
        }
    }
}