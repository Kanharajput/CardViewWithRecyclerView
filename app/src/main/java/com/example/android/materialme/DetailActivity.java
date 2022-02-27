package com.example.android.materialme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private TextView sportTitle;
    private ImageView sportImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // reference the resources
        sportTitle = findViewById(R.id.titleDetail);
        sportImage = findViewById(R.id.sportsImageDetail);

        // get the intent
        Intent intentFromMain = getIntent();
        String title = intentFromMain.getStringExtra("sport_title");

        // setting the title and image
        sportTitle.setText(title);
        Glide.with(this).load(intentFromMain.getIntExtra("sport_image",0)).into(sportImage);     // directly get image from it's resource
    }
}