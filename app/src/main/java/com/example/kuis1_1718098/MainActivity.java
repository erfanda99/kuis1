package com.example.kuis1_1718098;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity  extends AppCompatActivity {

    private RecyclerView recyclerView;
    private keluargaAdapter keluargaAdapter;
    private ArrayList<keluarga>keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recyclerview);
        keluargaAdapter = new keluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keluargaAdapter);
    }
    private void tambahData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga("SUPRIYANTO", "Ayah",  getDrawable(R.drawable.g2)));
        keluargaArrayList.add(new keluarga("LILIK INDAYATI", "Ibu", getDrawable(R.drawable.g3)));
        keluargaArrayList.add(new keluarga("ERIK SUGIARTO", "Anak Pertama", getDrawable(R.drawable.g1)));
        keluargaArrayList.add(new keluarga("ERFANDA ANDRIANTO", "Anak Kedua", getDrawable(R.drawable.g4)));
    }
}