package com.dicoding.picodiploma.diagnosakolesterol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainDiagnosaActivity extends AppCompatActivity {
    CheckBox ChckC1, ChckC2, ChckC3, ChckC4, ChckC5, ChckC6, ChckC7, ChckC8, ChckC9, ChckC10, ChckC11,
            ChckC12, ChckC13, ChckC14, ChckC15, ChckC16, ChckC17, ChckC18, ChckC19, ChckC20, ChckC21,
            ChckC22, ChckC23, ChckC24, ChckC25, ChckC26, ChckC27, ChckC28, ChckC29;

    TextView hslDiagnosa, ketDiagnosa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_diagnosa);
        ChckC1 = findViewById(R.id.checkBox1);
        ChckC2 = findViewById(R.id.checkBox2);
        ChckC3 = findViewById(R.id.checkBox3);
        ChckC4 = findViewById(R.id.checkBox4);
        ChckC5 = findViewById(R.id.checkBox5);
        ChckC6 = findViewById(R.id.checkBox6);
        ChckC7 = findViewById(R.id.checkBox7);
        ChckC8 = findViewById(R.id.checkBox8);
        ChckC9 = findViewById(R.id.checkBox9);
        ChckC10 = findViewById(R.id.checkBox10);
        ChckC11 = findViewById(R.id.checkBox11);
        ChckC12 = findViewById(R.id.checkBox12);
        ChckC13 = findViewById(R.id.checkBox13);
        ChckC14 = findViewById(R.id.checkBox14);
        ChckC15 = findViewById(R.id.checkBox15);
        ChckC16 = findViewById(R.id.checkBox16);
        ChckC17 = findViewById(R.id.checkBox17);
        ChckC18 = findViewById(R.id.checkBox18);
        ChckC19 = findViewById(R.id.checkBox19);
        ChckC20 = findViewById(R.id.checkBox20);
        ChckC21 = findViewById(R.id.checkBox21);
        ChckC22 = findViewById(R.id.checkBox22);
        ChckC23 = findViewById(R.id.checkBox23);
        ChckC24 = findViewById(R.id.checkBox24);
        ChckC25 = findViewById(R.id.checkBox25);
        ChckC26 = findViewById(R.id.checkBox26);
        ChckC27 = findViewById(R.id.checkBox27);
        ChckC28 = findViewById(R.id.checkBox28);
        ChckC29 = findViewById(R.id.checkBox29);
        hslDiagnosa = findViewById(R.id.hasilDiagnosa);
        ketDiagnosa = findViewById(R.id.ketDiagnosa);

        hslDiagnosa.setText("0%");
        ketDiagnosa.setText("Keterangan");
    }

    public void prosesDiagnosa(View view) {
        String hdl = "Kolestrol HDL";
        String ldl= "Kolesterol LDL";

        if (ChckC1.isChecked() && ChckC2.isChecked() && ChckC3.isChecked() && ChckC4.isChecked() && ChckC5.isChecked()) {
            hslDiagnosa.setText("51% - 79%\n");
            ketDiagnosa.setText(hdl);
        }
        else if (ChckC6.isChecked() && ChckC7.isChecked() && ChckC8.isChecked() && ChckC9.isChecked()) {
            hslDiagnosa.setText("0% - 50%\n");
            ketDiagnosa.setText(ldl);
        }
        else if (ChckC10.isChecked() && ChckC11.isChecked()) {
            hslDiagnosa.setText("80% - 99%\n");
            ketDiagnosa.setText(hdl);
        }
        else if (ChckC12.isChecked() && ChckC13.isChecked() && ChckC14.isChecked()) {
            hslDiagnosa.setText("0% - 50%\n");
            ketDiagnosa.setText(hdl);
        }
        else if (ChckC15.isChecked() && ChckC16.isChecked() && ChckC17.isChecked() && ChckC18.isChecked()) {
            hslDiagnosa.setText("51% - 79%\n");
            ketDiagnosa.setText(ldl);
        }
        else if (ChckC19.isChecked() && ChckC20.isChecked() && ChckC21.isChecked()) {
            hslDiagnosa.setText("51% - 79%\n");
            ketDiagnosa.setText(ldl);
        }
        else if (ChckC22.isChecked() && ChckC23.isChecked() && ChckC24.isChecked() && ChckC25.isChecked()) {
            hslDiagnosa.setText("0% - 50%\n");
            ketDiagnosa.setText(ldl);
        }
        else if (ChckC26.isChecked() && ChckC27.isChecked() && ChckC28.isChecked() && ChckC29.isChecked()) {
            hslDiagnosa.setText("0% - 50%\n");
            ketDiagnosa.setText(hdl);
        }
        else{
            Toast.makeText(this, "Silahkan Isi Sesuai Aturan Diatas", Toast.LENGTH_SHORT).show();
            hslDiagnosa.setText("0%");
            ketDiagnosa.setText("Keterangan");
        }

    }
}
