package com.amoharib.jokeslibandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeViewerActivity extends AppCompatActivity {

    private TextView joke;
    public final static String JOKE_EXTRA = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_viewer);
        initView();
        if (getIntent() != null && getIntent().hasExtra(JOKE_EXTRA)) {
            String jokeStr = getIntent().getStringExtra(JOKE_EXTRA);
            joke.setText(jokeStr);
        }
    }

    private void initView() {
        joke = (TextView) findViewById(R.id.joke);
    }
}
