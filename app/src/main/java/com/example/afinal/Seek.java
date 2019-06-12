package com.example.afinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Seek extends AppCompatActivity {
    private TextView tvText;
    private SeekBar sbSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seek);
        findViews();
    }

    private void findViews() {
        tvText = (TextView) findViewById(R.id.text);
        sbSize = (SeekBar) findViewById(R.id.seekBar);

        sbSize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvText.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Seek.this, "start size = " + seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Seek.this, "stop size = " + seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onBackClick (View view) {finish();}
}
