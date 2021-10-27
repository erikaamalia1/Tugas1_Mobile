package org.aplas.tugas1_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBungaActivity extends AppCompatActivity {
    TextView textViewTitle, textViewDeskripsi;
    ImageView imageViewBunga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bunga);

        textViewTitle = findViewById(R.id.tvTittle);
        textViewDeskripsi = findViewById(R.id.tvDeskripsi);
        imageViewBunga = findViewById(R.id.imgVBunga);

        Bunga bunga = getIntent().getParcelableExtra("BUNGA");
        textViewTitle.setText(bunga.getTittle());
        textViewDeskripsi.setText(bunga.getDeskripsi());


    }
}