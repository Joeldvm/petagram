package com.bbva.petagram;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class top5Pets extends AppCompatActivity {

    ArrayList<ListaPets> toplist = new ArrayList<ListaPets>();
    private RecyclerView lista_pets;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        this.setActionBar(miActionBar);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        //Se usa por compatibilidad de widget.Toolbar
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle param = getIntent().getExtras();

        lista_pets = (RecyclerView) findViewById(R.id.rvtoppets);

        LinearLayoutManager ltop = new LinearLayoutManager(this);
        ltop.setOrientation(LinearLayoutManager.VERTICAL);

        lista_pets.setLayoutManager(ltop);

        toplist.add(new ListaPets("Kiwi",R.drawable.gato1));
        toplist.add(new ListaPets("Perro",R.drawable.perro2));
        toplist.add(new ListaPets("Perrito",R.drawable.perro3));
        toplist.add(new ListaPets("Roky",R.drawable.gato2));
        toplist.add(new ListaPets("Per",R.drawable.perro1));


        inicializaAdaptador();


    }

    public void inicializaAdaptador() {
        PetsAdaptador adaptador = new PetsAdaptador(toplist);
        lista_pets.setAdapter(adaptador);
    }
}


