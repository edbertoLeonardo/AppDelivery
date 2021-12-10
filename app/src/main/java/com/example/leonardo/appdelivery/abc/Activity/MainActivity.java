package com.example.leonardo.appdelivery.abc.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.leonardo.appdelivery.abc.Adapter.CategoriasAdapter;
import com.example.leonardo.appdelivery.abc.Adapter.PopularAdapter;
import com.example.leonardo.appdelivery.abc.Domain.CategoriaDomain;
import com.example.leonardo.appdelivery.R;
import com.example.leonardo.appdelivery.abc.Domain.ComidaDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter;
    private RecyclerView.Adapter adapter2;
    private RecyclerView recyclerViewCategoriaList;
    private RecyclerView recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategoria();
        recyclerViewPopular();
    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPopularList = findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<ComidaDomain> comidasList = new ArrayList<>();
        comidasList.add(new ComidaDomain("Pizza peperoni", "pizza1", "", 10.20));
        comidasList.add(new ComidaDomain("X-Burguer", "burger", "", 8.00));
        comidasList.add(new ComidaDomain("Pizza Vegan", "pizza2", "", 11.50));

        adapter2 = new PopularAdapter(comidasList);
        recyclerViewPopularList.setAdapter(adapter2);




    }

    private void recyclerViewCategoria() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoriaList =findViewById(R.id.recyclerView);
        recyclerViewCategoriaList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoriaDomain> categoriaLista = new ArrayList<>();
        categoriaLista.add(new CategoriaDomain("Pizza", "cat_1"));
        categoriaLista.add(new CategoriaDomain("Burgers", "cat_2"));
        categoriaLista.add(new CategoriaDomain("HotDog", "cat_3"));
        categoriaLista.add(new CategoriaDomain("Bebidas", "cat_4"));
        categoriaLista.add(new CategoriaDomain("Doces", "cat_5"));

        adapter =new CategoriasAdapter(categoriaLista);
        recyclerViewCategoriaList.setAdapter(adapter);
    }
}