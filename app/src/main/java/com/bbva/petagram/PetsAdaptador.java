package com.bbva.petagram;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PetsAdaptador extends  RecyclerView.Adapter<PetsAdaptador.ListaViewHolder>{

    ArrayList<ListaPets> lista;

    public  PetsAdaptador (ArrayList<ListaPets> lista){

        this.lista = lista;
    }



    @NonNull
    @Override
    public ListaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listapets, parent, false);

        return new ListaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaViewHolder listaViewHolder, int position) {
        ListaPets listaanimal =lista.get(position);
        listaViewHolder.imagPets.setImageResource(listaanimal.getFotoP());
        listaViewHolder.nombrePets.setText(listaanimal.getNombreP());

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ListaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imagPets;
        private TextView nombrePets;

        public ListaViewHolder(@NonNull View itemView) {
            super(itemView);
            imagPets = (ImageView) itemView.findViewById(R.id.foto);
            nombrePets = (TextView) itemView.findViewById(R.id.txtpet);
        }
    }

}
