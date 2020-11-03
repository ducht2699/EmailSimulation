package com.example.emailsimulation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<CustomItemEmail> itemEmailList;
ListView lv_EmailList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemEmailList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            itemEmailList.add(new CustomItemEmail("S" + i, "Subject" + i, "Details" + i, "12:45 PM", false));
        }


        CustomItemAdapter adapter = new CustomItemAdapter(this, itemEmailList);
        lv_EmailList = findViewById(R.id.lv_EmailList);
        lv_EmailList.setAdapter(adapter);
    }
}