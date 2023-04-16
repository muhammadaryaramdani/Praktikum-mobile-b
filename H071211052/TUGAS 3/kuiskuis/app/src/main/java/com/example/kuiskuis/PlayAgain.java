package com.example.kuiskuis;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayAgain extends AppCompatActivity {


    TextView yourName, bestScore;
    Button btnPlay;

    ImageView profile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_again);

        yourName = findViewById(R.id.yourName);
        bestScore = findViewById(R.id.score);
        profile = findViewById(R.id.profile);
        btnPlay = findViewById(R.id.btnPlay);

        String profileImage = getIntent().getStringExtra("PROFILE_IMAGE_URI");
        if (profileImage != null){
            Uri profileImageUri = Uri.parse(profileImage);
            profile.setImageURI(profileImageUri);
        }



        String name = getIntent().getStringExtra("extra_name");
        yourName.setText(name);

        int s = getIntent().getIntExtra("TOTAL_SCORE", 0);
        String score = String.valueOf(s);
        bestScore.setText("Best Score : " +score);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QnA.class);
                intent.putExtra("extra_name", name);
                intent.putExtra("PROFILE_IMAGE_URI", profileImage);
                startActivity(intent);
            }
        });

    }
}