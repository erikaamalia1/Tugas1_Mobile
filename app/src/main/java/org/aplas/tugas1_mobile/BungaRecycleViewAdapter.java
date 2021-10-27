package org.aplas.tugas1_mobile;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BungaRecycleViewAdapter extends RecyclerView.Adapter<BungaRecycleViewAdapter.BungaViewHolder> {
    ArrayList<Bunga> arrayListBunga;

    public BungaRecycleViewAdapter(ArrayList<Bunga> arrayListBunga) {
        this.arrayListBunga = arrayListBunga;
    }

    @NonNull
    @Override
    public BungaRecycleViewAdapter.BungaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bunga, parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BungaRecycleViewAdapter.BungaViewHolder holder, int position) {
        final Bunga bunga = arrayListBunga.get(position);

        holder.textViewTittle.setText(bunga.getTittle());
        holder.textViewDeskripsi.setText(bunga.getDeskripsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailBungaActivity.class);
                intent.putExtra("BUNGA", bunga);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayListBunga.size();
    }

    public class BungaViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTittle, textViewDeskripsi;
        ImageView imageViewBunga;
        public BungaViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTittle = itemView.findViewById(R.id.tvTittle);
            textViewDeskripsi = itemView.findViewById(R.id.tvDeskripsi);
            imageViewBunga = itemView.findViewById(R.id.imgVBunga);
        }
    }
}
