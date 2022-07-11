package com.example.makanan311910612;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.CardViewHolder> {

    private ArrayList<ModeKuliner> datakuliner;

    public AdapterCard(ArrayList<ModeKuliner> datakuliner) {
        this.datakuliner = datakuliner;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,
                        false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        ModeKuliner kulinermodel = datakuliner.get(position);

        holder.tvNamaKuliner.setText(kulinermodel.getNama());
        holder.tvTentangKuliner.setText(kulinermodel.getTentang());

        Glide.with(holder.itemView.getContext()).load(kulinermodel.getFoto()).into(holder.ivKuliner);
    }

    @Override
    public int getItemCount() {
        return datakuliner.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{
        ImageView ivKuliner;
        TextView tvNamaKuliner, tvTentangKuliner;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            ivKuliner = itemView.findViewById(R.id.iv_card_foto);
            tvNamaKuliner = itemView.findViewById(R.id.tv_card_nama);
            tvTentangKuliner = itemView.findViewById(R.id.tv_card_tentang);


        }
    }
}
