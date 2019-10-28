package com.infernal93.singletontemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Button btnStartGame, btnAddPlayer, btnNewScreen;
    private GameConfig nGameConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartGame = findViewById(R.id.start_game);
        btnAddPlayer = findViewById(R.id.add_player);
        btnNewScreen = findViewById(R.id.start_new_screen);

        nGameConfig = GameConfig.getInstance();

        btnStartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GameConfig.getInstance().printConfig();
            }
        });

        btnAddPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nGameConfig.addWaitingGamers();
            }
        });

        btnNewScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}