package com.example.peralatandapur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

import com.example.peralatandapur.R;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKucing,btnAnjing;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
        btnKucing.setOnClickListener(view -> bukaGaleri("Non Elektronik"));
        btnAnjing.setOnClickListener(view -> bukaGaleri("Elektronik"));

    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity kucing");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}