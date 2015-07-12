package com.example.winniecheng.tutti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class ConcertListActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_list);

//        TableLayout tl = (TableLayout) findViewById(R.id.venueTable);

        // NAME OF VENUES
//        String lands = "Lands' End";
//        String sutro = "Sutro";
//        String panhandle = "Panhandle";
//        String twin_peaks = "Twin Peaks";
//
//        Button lands_btn = new Button(this);
//        lands_btn.setText(lands);
//
//        Button sutro_btn = new Button(this);
//        sutro_btn.setText(sutro);
//
//        Button panhandle_btn = new Button(this);
//        panhandle_btn.setText(panhandle);
//
//        Button twin_peaks_btn = new Button(this);
//        twin_peaks_btn.setText(twin_peaks);
//
//        TableRow tr1 = new TableRow(this);
//        tr1.addView(lands_btn);
//        tl.addView(tr1);
//
//        TableRow tr2 = new TableRow(this);
//        tr2.addView(sutro_btn);
//        tl.addView(tr2);
//
//        TableRow tr3 = new TableRow(this);
//        tr3.addView(panhandle_btn);
//        tl.addView(tr3);
//
//        TableRow tr4 = new TableRow(this);
//        tr4.addView(twin_peaks_btn);
//        tl.addView(tr4);


    }

    public void startLandsLoad(View v) {
        String audioURL = "lands image";
        String queryURL = "landsquery";

        Intent intent = new Intent(this, LoadVenueActivity.class);
        intent.putExtra("audioURL", audioURL);
        intent.putExtra("queryURL", queryURL);

        startActivity(intent);
    }

    public void startPanhandlesLoad(View v) {
        String audioURL = "panHandle image";
        String queryURL = "panHandle image";

        Intent intent = new Intent(this, LoadVenueActivity.class);
        intent.putExtra("audioURL", audioURL);
        intent.putExtra("queryURL", queryURL);

        startActivity(intent);
    }

    public void startSutroLoad(View v) {
        String audioURL = "sutro image";
        String queryURL = "sutro query";

        Intent intent = new Intent(this, LoadVenueActivity.class);
        intent.putExtra("audioURL", audioURL);
        intent.putExtra("queryURL", queryURL);

        startActivity(intent);
    }

    public void startTwinPeaksLoad(View v) {
        String audioURL = "twinpeaks image";
        String queryURL = "twinpeaks query";

        Intent intent = new Intent(this, LoadVenueActivity.class);
        intent.putExtra("audioURL", audioURL);
        intent.putExtra("queryURL", queryURL);

        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_concert_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
