package com.babenkovladimir.image;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.babenkovladimir.R;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ImageView picassoImage = findViewById(R.id.ivPicasso);
        ImageView glideImage = findViewById(R.id.ivGlide);

        Picasso
                .get()
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzhnYvffH6b9n4JUIUQBbXJOqrhIYWe0fyOGCyynzAaz2uxdoIbA")
                .placeholder(R.drawable.ic_launcher_background)
                .into(picassoImage);


        Glide
                .with(ImageActivity.this)
                .load("https://image.shutterstock.com/image-photo/bright-spring-view-cameo-island-260nw-1048185397.jpg")
                .into(glideImage);
    }
}
