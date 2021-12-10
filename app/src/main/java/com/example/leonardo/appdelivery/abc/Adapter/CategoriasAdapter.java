package com.example.leonardo.appdelivery.abc.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.leonardo.appdelivery.abc.Domain.CategoriaDomain;
import com.example.leonardo.appdelivery.R;

import java.util.ArrayList;

public class CategoriasAdapter extends RecyclerView.Adapter<CategoriasAdapter.ViewHolder> {

    ArrayList<CategoriaDomain> categoriaDomains;

    public CategoriasAdapter(ArrayList<CategoriaDomain> categoriaDomains){
        this.categoriaDomains = categoriaDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_categoria, parent, false);

        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tituloDaCategoria.setText(categoriaDomains.get(position).getTitulo());
        String fotoUrl = "";
        switch (position){
            case 0: {
                fotoUrl = "cat_1";
                holder.layoutPrincipal.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.categoria_background));
                break;
            }
            case 1: {
                fotoUrl = "cat_2";
                holder.layoutPrincipal.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.categoria_background2));
                break;
            }
            case 2: {
                fotoUrl = "cat_3";
                holder.layoutPrincipal.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.categoria_background3));
                break;
            }
            case 3: {
                fotoUrl = "cat_4";
                holder.layoutPrincipal.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.categoria_background4));
                break;
            }
            case 4: {
                fotoUrl = "cat_5";
                holder.layoutPrincipal.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.categoria_background5));
                break;
            }
        }

        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(fotoUrl, "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.fotoDaCategoria);

    }

    @Override
    public int getItemCount() {
        return categoriaDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

            TextView tituloDaCategoria;
            ImageView fotoDaCategoria;
            ConstraintLayout layoutPrincipal;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                tituloDaCategoria = itemView.findViewById(R.id.tituloDaCategoria);
                fotoDaCategoria = itemView.findViewById(R.id.fotoDaCategoria);
                layoutPrincipal = itemView.findViewById(R.id.layoutCategorias);
        }
    }
}
