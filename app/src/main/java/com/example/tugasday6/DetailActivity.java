package com.example.tugasday6;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailactivity);

        // Mendapatkan data dari intent
        String nama_item = getIntent().getStringExtra("nama_item");
        String deskripsi_item = getIntent().getStringExtra("deskripsi_item");
        String harga_item = getIntent().getStringExtra("harga_item");

        // Menampilkan data pada layout detail item
        TextView namaItemTextView = findViewById(R.id.nama_item);
        TextView deskripsiItemTextView = findViewById(R.id.deskripsi_item);
        TextView hargaItemTextView = findViewById(R.id.harga_item);
        ImageView logoItemImageView = findViewById(R.id.logo_item);

        namaItemTextView.setText(nama_item);
        deskripsiItemTextView.setText(deskripsi_item);
        hargaItemTextView.setText(harga_item);

        // Menampilkan gambar
        logoItemImageView.setImageResource(R.drawable.ic_launcher_background);
    }
}
