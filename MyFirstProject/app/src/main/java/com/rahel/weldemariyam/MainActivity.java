package com.rahel.weldemariyam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rachel_layout);

        Button button = findViewById(R.id.button2);


        ImageView imageView = findViewById(R.id.image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int score = random.nextInt(6) + 1;

                switch (score){

                    case 1 :
                        imageView.setImageResource(R.drawable.dice_1);
                     break;

                    case 2:
                        imageView.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.dice_6);
                        break;


                }


                TextView textView = findViewById(R.id.textView5);
                textView.setText(String.valueOf(score));


            }
        });
    }
}