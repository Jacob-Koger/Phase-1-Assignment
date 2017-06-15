package com.metova.koger.phase1assignment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;


public class MainActivity extends AppCompatActivity {
    //Setting up UI elements
    @BindView(R.id.webButton) Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        button.setOnClickListener(v->
                goToChrome()
        );
    }

    void goToChrome() {
        //Creating intent
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse(BuildConfig.key));
        //Logging which website is gone to
        Timber.d("Website: " + BuildConfig.key);
        //Loading web browser selector
        startActivity(intent);
    }
}
