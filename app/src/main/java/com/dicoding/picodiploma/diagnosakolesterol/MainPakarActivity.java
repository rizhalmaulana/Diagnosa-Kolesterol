package com.dicoding.picodiploma.diagnosakolesterol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPakarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pakar);
    }

    public void PindahActivity(View view) {
        Intent pindahActivity = new Intent(MainPakarActivity.this, MainDiagnosaActivity.class);
        startActivity(pindahActivity);
    }
}
