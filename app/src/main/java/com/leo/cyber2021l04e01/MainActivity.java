package com.leo.cyber2021l04e01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random rnd;
    private Button button;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rnd = new Random();
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
    }

    public void onButtonClick(View view) {
        int index = rnd.nextInt(3);
        button.setText(Integer.toString(index + 1));
        switch (index) {
            case 0:
                imageView.setImageResource(R.drawable.img1);
                break;
            case 1:
                imageView.setImageResource(R.drawable.img2);
                break;
            case 2:
                imageView.setImageResource(R.drawable.img3);
                break;
        }
    }
}
