package com.example.TVApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    boolean populatedShows = false; //Checks if the user has any saved shows
    boolean has_profile = false;//Checks to see if there is a profile attached
    Button MenuButton;
    GridView gridView; //the gridview with the tv objects

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        MenuButton = (Button) findViewById(R.id.Menubutton);
        gridView = (GridView) findViewById(R.id.gridView);

        /*Checks to see that the user has an established profile
           If so, the content is loaded and displayed onto the screen
           if not, a new page will be displayed to register their information
         */

        /*
           Method to load profile here
           Check storage location
           has_profile variable is set to true
         */

        if(has_profile){
            /*
                load the tv shows into the gridview
             */
        }
        else{
            //The user does not have a established profile
            Intent registerIntent = new Intent(this, Registration.class);
            startActivity(registerIntent);
        }
    }
}
