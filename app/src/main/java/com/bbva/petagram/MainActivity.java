package com.bbva.petagram;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ListaPets> lista = new ArrayList<ListaPets>();
    private RecyclerView lista_pets;
    ImageButton likeBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista_pets = (RecyclerView) findViewById(R.id.rvpets);
        likeBut = (ImageButton) findViewById(R.id.ibot);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        lista_pets.setLayoutManager(llm);

        lista.add(new ListaPets("Gato",R.drawable.gato1));
        lista.add(new ListaPets("Perro",R.drawable.perro2));
        lista.add(new ListaPets("Perrito",R.drawable.perro3));

        inicializaAdaptador();

        likeBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"Toy en la clase irtoppet",Toast.LENGTH_SHORT).show();
                //irTop5pets();
                Intent llamado;
                llamado = new Intent(MainActivity.this,top5Pets.class);
                //llamado.putExtra("PerroT","Perro");
                startActivity(llamado);
            }
        });


        };

    public void inicializaAdaptador(){
        PetsAdaptador adaptador = new PetsAdaptador(lista);
        lista_pets.setAdapter(adaptador);

    }

    public void irTop5pets(){
        //Toast.makeText(this,"Toy en la clase irtoppet",Toast.LENGTH_SHORT).show();
        Intent intent;
        intent = new Intent(MainActivity.this,top5Pets.class);
        startActivity(intent);


    }


}