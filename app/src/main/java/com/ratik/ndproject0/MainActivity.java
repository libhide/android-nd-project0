package com.ratik.ndproject0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Attaching an onClickListener to each button in the view
        findViewById(R.id.spotify_streamer_button).setOnClickListener(this);
        findViewById(R.id.scores_app_button).setOnClickListener(this);
        findViewById(R.id.library_app_button).setOnClickListener(this);
        findViewById(R.id.build_it_bigger_button).setOnClickListener(this);
        findViewById(R.id.xyz_reader_button).setOnClickListener(this);
        findViewById(R.id.capstone_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, ((Button) view).getText() + " will be here soon!",
                Toast.LENGTH_SHORT).show();
    }
}
