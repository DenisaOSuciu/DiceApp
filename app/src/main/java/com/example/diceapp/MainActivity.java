package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView diceImage1=findViewById(R.id.image_dice1);
        ImageView diceImage2=findViewById(R.id.image_dice2);

        int [] diceImages = {R.drawable.dice1 , R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};

        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rndmObject=new Random();
                int myRandomNumber =rndmObject.nextInt(5);
                int myRandomNumber2 =rndmObject.nextInt(5);

                diceImage1.setImageResource(diceImages[myRandomNumber]);
                diceImage2.setImageResource(diceImages[myRandomNumber2]);
            }
        });
    }
}