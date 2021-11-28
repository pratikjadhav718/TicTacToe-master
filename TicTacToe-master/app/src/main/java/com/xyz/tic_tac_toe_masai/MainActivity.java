package com.xyz.tic_tac_toe_masai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix,
            buttonSeven, buttonEight, buttonNine, buttonReset;

    int turn = 1; // X = 1 , O = 2
    boolean isEnded = false;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonReset = findViewById(R.id.buttonReset);


        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonOne);


            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonTwo);
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonThree);
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonFour);
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonFive);
            }
        });


        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonSix);
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonSeven);
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonEight);
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonNine);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();

            }
        });



    }


    private void playGame(Button button){
        if (button.getText().toString().equals("")){
            if (turn == 1){
                button.setText("X");
                turn = 2;
            }else {
                button.setText("O");
                turn = 1;
            }
            count = count +1;
            endGame();
        }
    }

    private void endGame(){

        String Box1, Box2 ,Box3, Box4, Box5, Box6, Box7, Box8, Box9;
        Box1 = buttonOne.getText().toString();
        Box2 = buttonTwo.getText().toString();
        Box3 = buttonThree.getText().toString();
        Box4 = buttonFour.getText().toString();
        Box5 = buttonFive.getText().toString();
        Box6 = buttonSix.getText().toString();
        Box7 = buttonSeven.getText().toString();
        Box8 = buttonEight.getText().toString();
        Box9 = buttonNine.getText().toString();

        // logic for is X is win

        if (Box1.equals("X") && Box2.equals("X") && Box3.equals("X") ){
            Toast.makeText(MainActivity.this,"Player X Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box4.equals("X") && Box5.equals("X") && Box6.equals("X") ){
            Toast.makeText(MainActivity.this,"Player X Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box7.equals("X") && Box8.equals("X") && Box9.equals("X") ){
            Toast.makeText(MainActivity.this,"Player X Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box1.equals("X") && Box4.equals("X") && Box7.equals("X") ){
            Toast.makeText(MainActivity.this,"Player X Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box2.equals("X") && Box5.equals("X") && Box8.equals("X") ){
            Toast.makeText(MainActivity.this,"Player X Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box3.equals("X") && Box6.equals("X") && Box9.equals("X") ){
            Toast.makeText(MainActivity.this,"Player X Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box1.equals("X") && Box5.equals("X") && Box9.equals("X") ){
            Toast.makeText(MainActivity.this,"Player X Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box3.equals("X") && Box5.equals("X") && Box7.equals("X") ){
            Toast.makeText(MainActivity.this,"Player X Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }

        // Logic for O is Win

        if (Box1.equals("O") && Box2.equals("O") && Box3.equals("O") ){
            Toast.makeText(MainActivity.this,"Player O Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }

        if (Box4.equals("O") && Box5.equals("O") && Box6.equals("O") ){
            Toast.makeText(MainActivity.this,"Player O Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box4.equals("O") && Box5.equals("O") && Box6.equals("O") ){
            Toast.makeText(MainActivity.this,"Player O Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box7.equals("O") && Box8.equals("O") && Box9.equals("O") ){
            Toast.makeText(MainActivity.this,"Player O Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box1.equals("O") && Box4.equals("O") && Box7.equals("O") ){
            Toast.makeText(MainActivity.this,"Player O Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box2.equals("O") && Box5.equals("O") && Box8.equals("O") ){
            Toast.makeText(MainActivity.this,"Player O Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box3.equals("O") && Box6.equals("O") && Box9.equals("O") ){
            Toast.makeText(MainActivity.this,"Player O Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box1.equals("O") && Box5.equals("O") && Box9.equals("O") ){
            Toast.makeText(MainActivity.this,"Player O Won",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (Box3.equals("O") && Box5.equals("O") && Box7.equals("O") ){
            Toast.makeText(MainActivity.this,"Player O Won",Toast.LENGTH_SHORT).show();
            isEnded = true;

            // Logic for Match Draw
        }
        if (count == 9){
            Toast.makeText(MainActivity.this,"Match  Draw",Toast.LENGTH_SHORT).show();
            isEnded = true;
        }


        if (isEnded){
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            buttonSix.setEnabled(false);
            buttonSeven.setEnabled(false);
            buttonEight.setEnabled(false);
            buttonNine.setEnabled(false);
            buttonReset.setText("Play Again");
        }

    }
}