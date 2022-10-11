package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetup extends AppCompatActivity {

    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);

        player1 =findViewById(R.id.player1name);
        player2 =findViewById(R.id.player2name);
    }

    public void submitButtonClick(View view){
        String player1name = player1.getText().toString();
        String player2name = player2.getText().toString();

        Intent intent = new Intent(this,GameDisplay.class);
        intent.putExtra("PLAYER_NAMES", new String[]{player1name,player2name});
        startActivity(intent);

    }
}