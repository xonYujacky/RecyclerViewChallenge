package com.xonyujacky.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] thingsToDo ={
                new BucketListEntry("Climb Mt Kilimanjoro","Do it the difficult way!",R.drawable.kilimanjaro,5),
                new BucketListEntry("Experience the Northern Lights", "Somewhere in the artic circle,probably Northway", R.drawable.northern_lights,5),
                new BucketListEntry("Road Trip across USA","Hire a car from west coast, and travel to the east coast",R.drawable.road_trip,3.5f),
                new BucketListEntry("Scuba Dive","In Koh Tao , Thailand",R.drawable.scubadive,4),
                new BucketListEntry("Skydive","Preferably over somewhwre with an amazing view",R.drawable.skydive,3.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);

    }


}
