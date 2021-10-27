package org.aplas.tugas1_mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    BungaRecycleViewAdapter adapter;
    ArrayList<Bunga> objBunga = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.r_bunga);
        objBunga.add(new Bunga("Alamanda","Alamanda populer dijadikan tanaman hias karena bunganya yang besar dan berwarna-warni. Tanaman ini dikenal pula sebagai golden trumpet karena bentuknya yang menyerupai terompet. Selain kuning, terdapat pula warna lain yang tidak kalah menariknya.","alamanda"));

    }
}