package com.example.tugasday6;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterItem adapterItem;
    private ArrayList<ItemModel> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi RecyclerView
        recyclerView = findViewById(R.id.recycleview);

        // Generate data untuk RecyclerView
        itemList = generateItemModelList();

        // Inisialisasi AdapterItem dengan data dan listener
        adapterItem = new AdapterItem(this, itemList, new AdapterItem.OnItemClickListener() {
            @Override
            public void onItemClick(ItemModel item) {
                // Ketika item diklik, buka DetailActivity dengan data terkait
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("nama_item", item.getNamaitem());
                intent.putExtra("deskripsi_item", item.getDeskripsi());
                intent.putExtra("harga_item", item.getHarga());
                startActivity(intent);
            }
        });

        // Atur layout manager dan adapter untuk RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterItem);
    }
    // Metode untuk mengisi data item-model
    private ArrayList<ItemModel> generateItemModelList() {
        ArrayList<ItemModel> list = new ArrayList<>();
        // Tambahkan item-model ke dalam list
        list.add(new ItemModel("Xiaomi 14",
                R.drawable.hp14t,
                "Xiaomi 14 ada pada konfigurasi tiga kamera belakang. Dimana kamera utamanya menggunakan lensa optik Leica Summilux",
                "Rp 11.999.000"));
        list.add(new ItemModel("Xiaomi 13T",
                R.drawable.hp13t,
                " Xiaomi 13T mengusung panel AMOLED berukuran 6,67 inci, resolusi 1.5K, refresh rate 144Hz dan tingkat kecerahan mencapai 2.600 nits",
                "Rp 8.999.000"));
        list.add(new ItemModel("Xiaomi 12T",
                R.drawable.hp12t, "Xiaomi 12T 5G dilengkapi kamera utama 108 MP menggunakan sensor ISOCELL HM6.",
                "Rp 6.000.000"));
        list.add(new ItemModel("Xiaomi 12PRO", R.drawable.hp12pro, "Xiaomi 12 Pro menjadi hp Xiaomi terbaru di kelas premium.", "Rp 8.5000.000"));
        list.add(new ItemModel("Xiaomi 12lite", R.drawable.hp12, "Xiaomi 12 Lite 5G dibekali layar AMOLED berukuran 6.55 inci.", "Rp 4.500.000"));
        list.add(new ItemModel("Kipas Angin Portable", R.drawable.kipas1, "produk dari KADONIA ini menggunakan kabel USB. Anda hanya tinggal mencolokkan.", "Rp 131.666"));
        list.add(new ItemModel("Ceiling Fan", R.drawable.kipas2, "Kipas angin gantung dari Nagoya ini memiliki lima tingkat kecepatan yang dapat disesuaikan dengan kebutuhan", "Rp 650.000"));
        list.add(new ItemModel("Electric Fan ", R.drawable.kipas3, "Inilah kipas angin 2-in-1 seri terbaru dari Miyako. Sebenarnya seri ini tidak jauh berbeda dengan seri kipas sebelumnya, yakni KAS-1618 KB.", "Rp 268.400"));
        list.add(new ItemModel("XDesk Fan 12-LDA", R.drawable.kipas4, "visualnya pun terlihat elegan dengan balutan warna hitam dan adanya tombol model piano.", "Rp 230.000"));
        list.add(new ItemModel("Stand Fan F-EP405", R.drawable.kipas5, "Kipas ini diklaim RoHS-free sehingga bebas dari zat-zat berbahaya yang dapat mengganggu kesehatan tubuh.", "Rp 605.000"));
        list.add(new ItemModel("Polytron Primadona Giant PWM 03 Series", R.drawable.cuci1, "Polytron Primadona Giant PWM 03 Series dilengkapi dengan teknologi Mega Pulsator yang dapat mencuci pakaian hingga 30% lebih banyak.", "Rp. 2.000.000"));
        list.add(new ItemModel("Samsung WW65J3033LW", R.drawable.cuci2, "Samsung WW65J3033LW merupakan mesin cuci 1 tabung bukaan depan. Mesin cuci ini mampu menampung pakaian kotor hingga 6,5kg.", "Rp 4.000.000"));
        list.add(new ItemModel("Sharp ES-FL1082", R.drawable.cuci3, "Desain dan ukurannya yang ramping sangat cocok untuk rumah tangga dengan ruang cuci mungil. Mesin cuci ini sendiri mampu menampung pakaian kotor hingga 8kg.", "Rp 4.500.000"));
        list.add(new ItemModel(" Polytron Zeromatic Laguna PAW 8028", R.drawable.cuci4, "Desainnya cukup mewah dengan fitur Easy to Access yang membuat Anda semakin mudah mencuci berbagai macam pakaian.", "Rp 2.500.000"));
        list.add(new ItemModel("Aqua AQW-89XTF", R.drawable.cuci5, "Aqua AQW-89XTF adalah sebuah produk mesin cuci dengan bukaan di bagian atas (top loading) dan memiliki kapasitas mencuci hingga 8kg.", "Rp 3.500.000"));

        return list;
    }
}
