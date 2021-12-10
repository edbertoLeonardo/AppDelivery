package com.example.leonardo.appdelivery.abc.Adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
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
import com.example.leonardo.appdelivery.R;
import com.example.leonardo.appdelivery.abc.Activity.MostrarDetalheActivity;
import com.example.leonardo.appdelivery.abc.Domain.CategoriaDomain;
import com.example.leonardo.appdelivery.abc.Domain.ComidaDomain;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {

    ArrayList<ComidaDomain> comidaDomain;

    public PopularAdapter(ArrayList<ComidaDomain> comidaDomain){
        this.comidaDomain = comidaDomain;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular, parent, false);

        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.tituloPopular.setText(comidaDomain.get(position).getTitulo());
        holder.preco.setText(String.valueOf(comidaDomain.get(position).getPreco()));

        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(comidaDomain.get(position).getFoto(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.fotoPopular);

        holder.botaoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(holder.itemView.getContext(), MostrarDetalheActivity.class);
                i.putExtra("object", comidaDomain.get(position));
                holder.itemView.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return comidaDomain.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

            TextView tituloPopular;
            TextView preco;
            TextView botaoAdd;
            ImageView fotoPopular;


            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                tituloPopular = itemView.findViewById(R.id.tituloPopular);
                preco = itemView.findViewById(R.id.preco);
                botaoAdd = itemView.findViewById(R.id.botaoAdd);
                fotoPopular = itemView.findViewById(R.id.fotoPopular);

        }
    }
}
