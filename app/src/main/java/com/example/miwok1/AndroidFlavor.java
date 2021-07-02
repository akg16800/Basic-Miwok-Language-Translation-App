package com.example.miwok1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AndroidFlavor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_flavor);


        ArrayList<flavor> androidFlavors = new ArrayList<flavor>();
        androidFlavors.add(new flavor("Donut", "1.6", R.drawable.donut));
        androidFlavors.add(new flavor("Eclair", "2.0-2.1", R.drawable.eclair));
        androidFlavors.add(new flavor("Froyo", "2.2-2.2.3", R.drawable.froyo));
        androidFlavors.add(new flavor("GingerBread", "2.3-2.3.7", R.drawable.gingerbread));
        androidFlavors.add(new flavor("Honeycomb", "3.0-3.2.6", R.drawable.honeycomb));
        androidFlavors.add(new flavor("Ice Cream Sandwich", "4.0-4.0.4", R.drawable.icecream));
        androidFlavors.add(new flavor("Jelly Bean", "4.1-4.3.1", R.drawable.jellybean));
        androidFlavors.add(new flavor("KitKat", "4.4-4.4.4", R.drawable.kitkat));
        androidFlavors.add(new flavor("Lollipop", "5.0-5.1.1", R.drawable.lollipop));
        androidFlavors.add(new flavor("Marshmallow", "6.0-6.0.1", R.drawable.marshmallow));

        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this, androidFlavors);
        ListView listView =  findViewById(R.id.listView_flavour);
        listView.setAdapter(flavorAdapter);

    }
}