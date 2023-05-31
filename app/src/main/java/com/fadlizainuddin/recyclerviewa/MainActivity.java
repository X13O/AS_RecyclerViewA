package com.fadlizainuddin.recyclerviewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView _recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _recyclerView = findViewById(R.id.recyclerView);
        List<NegaraModel> namaVariabel_negaraModelList = new ArrayList<>();

        NegaraModel namaVariabel_negaraModel = new NegaraModel();
        namaVariabel_negaraModel.setNama("Albania");
        namaVariabel_negaraModel.setDeskripsi("Negara ini bernama Albania yang menggunakan bendera warna merah");
        namaVariabel_negaraModel.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Albania-Flag-icon.png");
        namaVariabel_negaraModelList.add(namaVariabel_negaraModel);

        namaVariabel_negaraModel = new NegaraModel();
        namaVariabel_negaraModel.setNama("Hungary");
        namaVariabel_negaraModel.setDeskripsi("Negara ini bernama Hungary yang menggunakan bendera warna merah, putih, dan hijau");
        namaVariabel_negaraModel.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Hungary-Flag-icon.png");
        namaVariabel_negaraModelList.add(namaVariabel_negaraModel);

        namaVariabel_negaraModel = new NegaraModel();
        namaVariabel_negaraModel.setNama("Slovenia");
        namaVariabel_negaraModel.setDeskripsi("Negara ini bernama Slovenia yang menggunakan bendera mirip dengan Rusia");
        namaVariabel_negaraModel.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Slovenia-Flag-icon.png");
        namaVariabel_negaraModelList.add(namaVariabel_negaraModel);

        namaVariabel_negaraModel = new NegaraModel();
        namaVariabel_negaraModel.setNama("Belgium");
        namaVariabel_negaraModel.setDeskripsi("Negara ini bernama Belgium yang menggunakan bendera mirip dengan Jerman");
        namaVariabel_negaraModel.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Belgium-Flag-icon.png");
        namaVariabel_negaraModelList.add(namaVariabel_negaraModel);

        namaVariabel_negaraModel = new NegaraModel();
        namaVariabel_negaraModel.setNama("Canada");
        namaVariabel_negaraModel.setDeskripsi("Negara ini bernama Canada yang menggunakan bendera dengan icon daun");
        namaVariabel_negaraModel.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Canada-Flag-icon.png");
        namaVariabel_negaraModelList.add(namaVariabel_negaraModel);

        RecyclerView.LayoutManager namaVariabel_layoutManager = new LinearLayoutManager(MainActivity.this);
        _recyclerView.setLayoutManager(namaVariabel_layoutManager);

        NegaraAdapter namaVariabel_negaraAdapter = new NegaraAdapter(getApplicationContext(), namaVariabel_negaraModelList);
        _recyclerView.setAdapter(namaVariabel_negaraAdapter);
    }
}