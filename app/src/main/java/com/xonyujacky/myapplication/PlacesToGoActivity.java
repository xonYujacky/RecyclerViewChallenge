package com.xonyujacky.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }

    private void setupList() {
        BucketListEntry [] placesToGo = {
                new BucketListEntry("Amazon","Try to survive being scared by all the creepy crawlies",R.drawable.amazon,4),
                new BucketListEntry("Iceland", "Dumkamdo Waterfall, nature reserves, maybe the Northen Lights too!", R.drawable.iceland,5),
                new BucketListEntry("Japan","Hot springs, sushi , bamboo forest , bullet train through mountains.",R.drawable.japan,5),
                new BucketListEntry("Kerala","Try varied tea flavours, stay in houseboat , the fabulous food!",R.drawable.kerala,3.8f),
                new BucketListEntry("Vietnam","Con Dao Island , Hanoi , Halong Bay , Hoi AN , Lang Co. ",R.drawable.vietnam,4.5f)
        };

        RecyclerView recyclerViewPlaceView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerViewPlaceView.setAdapter(adapter);

    }
}
