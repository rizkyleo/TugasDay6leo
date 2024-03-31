package com.example.tugasday6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.ViewHolder> {

    private Context context;
    private ArrayList<ItemModel> itemList;
    private OnItemClickListener listener;

    public AdapterItem(Context context, ArrayList<ItemModel> itemList, OnItemClickListener listener) {
        this.context = context;
        this.itemList = itemList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemModel item = itemList.get(position);
        holder.bind(item, listener);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView logoItemImageView;
        private TextView namaItemTextView;
        private TextView deskripsiItemTextView;
        private TextView hargaItemTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoItemImageView = itemView.findViewById(R.id.logo_item);
            namaItemTextView = itemView.findViewById(R.id.nama_item);
            deskripsiItemTextView = itemView.findViewById(R.id.deskripsi_item);
            hargaItemTextView = itemView.findViewById(R.id.harga_item);
        }

        public void bind(final ItemModel item, final OnItemClickListener listener) {
            // Menampilkan data pada layout item
            logoItemImageView.setImageResource(item.getLogoitem());
            namaItemTextView.setText(item.getNamaitem());
            deskripsiItemTextView.setText(item.getDeskripsi());
            hargaItemTextView.setText(item.getHarga());

            // Menambahkan listener klik pada setiap item
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }

    // Antarmuka untuk listener klik item
    public interface OnItemClickListener {
        void onItemClick(ItemModel item);
    }
}
