package com.example.uasanmp.util

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter
import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.uasanmp.R
import com.example.uasanmp.model.Food
import com.example.uasanmp.model.UbayaKulinerDatabase
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

val DB_NAME = "ubayakuliner"

fun buildDB(context: Context):UbayaKulinerDatabase{
    val db = Room.databaseBuilder(
        context,
        UbayaKulinerDatabase::class.java,
        DB_NAME
    ).build()

    return db
}

val foodArray = arrayOf(
    Food(
        nama = "Nasi + Ayam Goreng / Bakar Original",
        harga = 18000,
        deskripsi = "Ayam Bumbu Kuning",
        kategori = "dinner",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/ayambakar.jpeg"
    ),
    Food(
        nama = "Nasi + Ayam Goreng / Bakar Spesial",
        harga = 18000,
        deskripsi = "Ayam Berbumbu Khusus & Rasa Khas Asam Manis",
        kategori = "dinner",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/ayambakar.jpeg"
    ),
    Food(
        nama = "Nasi + Chicken Teriyaki",
        harga = 18000,
        deskripsi = "-",
        kategori = "lunch",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/teriyaki.jpeg"
    ),
    Food(
        nama = "Crispy Fish Pop + Fries Sambal Matah",
        harga = 18000,
        deskripsi = "Ikan goreng tepung, sambal matah, kentang goreng/nasi liwet",
        kategori = "lunch",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/crispyfishpop.jpeg"
    ),
    Food(
        nama = "Pangsit Mie Ayam",
        harga = 13000,
        deskripsi = "-",
        kategori = "breakfast",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/miayam.jpeg"
    ),
    Food(
        nama = "Pangsit Mie Ayam Jumbo",
        harga = 16000,
        deskripsi = "-",
        kategori = "breakfast",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/miayam.jpeg"
    ),
    Food(
        nama = "Pangsit Mie Ayam + Bakso",
        harga = 18000,
        deskripsi = "-",
        kategori = "lunch",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/miayambakso.jpeg"
    ),
    Food(
        nama = "Indomie Goreng Special",
        harga = 12000,
        deskripsi = "-",
        kategori = "dinner",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/indomie.jpeg"
    ),
    Food(
        nama = "Indomie Kuah Soto",
        harga = 10000,
        deskripsi = "-",
        kategori = "breakfast",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/indomie%20kuah.jpeg"
    ),
    Food(
        nama = "Indomie Kuah Kare",
        harga = 10000,
        deskripsi = "-",
        kategori = "breakfast",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/indomie%20kuah.jpeg"
    ),
    Food(
        nama = "Sup Tom Yum / Sup Sehat",
        harga = 20000,
        deskripsi = "-",
        kategori = "lunch",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/suptomyam.jpeg"
    ),
    Food(
        nama = "Nasi Goreng Hongkong",
        harga = 19000,
        deskripsi = "-",
        kategori = "dinner",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/nasigoreng.jpeg"
    ),
    Food(
        nama = "Kwetiau Siram Seafood",
        harga = 20000,
        deskripsi = "-",
        kategori = "lunch",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/kwetiau.jpeg"
    ),
    Food(
        nama = "Ayam Cabe Bawang",
        harga = 26000,
        deskripsi = "-",
        kategori = "dinner",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/ayamcabebawang.jpeg"
    ),
    Food(
        nama = "Bubur Ayam Polosan",
        harga = 7000,
        deskripsi = "-",
        kategori = "breakfast",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/buburayam.jpeg"
    ),
    Food(
        nama = "Bubur Ayam Original",
        harga = 10000,
        deskripsi = "-",
        kategori = "breakfast",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/buburayam.jpeg"
    ),
    Food(
        nama = "Seblak Original",
        harga = 12000,
        deskripsi = "-",
        kategori = "lunch",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/seblak.jpeg"
    ),
    Food(
        nama = "Seblak Special",
        harga = 17000,
        deskripsi = "-",
        kategori = "lunch",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/seblak.jpeg"
    ),
    Food(
        nama = "Dada Bebek Goreng Free Tahu Tempe",
        harga = 25000,
        deskripsi = "Nasi + ikan + lalapan + sambal + serundeng + bumbu kuning + tahu tempe",
        kategori = "dinner",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/bebek.jpeg"
    ),
    Food(
        nama = "Nasi Lele Goreng Free Tahu Tempe",
        harga = 23000,
        deskripsi = "Nasi + ikan + lalapan + sambal + serundeng + bumbu kuning + tahu tempe",
        kategori = "dinner",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/lele.jpeg"
    ),
    Food(
        nama = "Nasi Telur Free Tahu Tempe",
        harga = 21000,
        deskripsi = "Nasi + ikan + lalapan + sambal + serundeng + bumbu kuning + tahu tempe",
        kategori = "dinner",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/telorpenyet.jpeg"
    ),
    Food(
        nama = "Ayam Geprek + Nasi",
        harga = 10000,
        deskripsi = "-",
        kategori = "lunch",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/ayamgeprek.jpeg"
    ),
    Food(
        nama = "Ayam Crispy + Nasi",
        harga = 10000,
        deskripsi = "-",
        kategori = "lunch",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/ayamgeprek.jpeg"
    ),
    Food(
        nama = "Ayam Geprek + Indomie",
        harga = 12000,
        deskripsi = "-",
        kategori = "lunch",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/ayamgeprekindomie.jpeg"
    ),
    Food(
        nama = "Ayam Geprek + Nasi + Indomie",
        harga = 15000,
        deskripsi = "-",
        kategori = "dinner",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/ayamgeprekindomie.jpeg"
    ),
    Food(
        nama = "Nasgoprek (Nasi Goreng + Telur + Ayam Geprek)",
        harga = 28000,
        deskripsi = "-",
        kategori = "dinner",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/ayampenyet.jpeg"
    ),
    Food(
        nama = "Ayam Geprek Molor (Mozarella Telur)",
        harga = 27000,
        deskripsi = "-",
        kategori = "dinner",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/ayamgeprekindomie.jpeg"
    ),
    Food(
        nama = "Ayam Geprek Mozarella",
        harga = 23000,
        deskripsi = "-",
        kategori = "lunch",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/ayamgeprekindomie.jpeg"
    ),
    Food(
        nama = "Ayam Geprek Telor Asin",
        harga = 24000,
        deskripsi = "-",
        kategori = "lunch",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/ayamgeprekindomie.jpeg"
    ),
    Food(
        nama = "Mie / Yamie / Lamie Ayam",
        harga = 13000,
        deskripsi = "-",
        kategori = "breakfast",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/miayambakso.jpeg"
    ),
    Food(
        nama = "Mie / Yamie / Lamie Spesial",
        harga = 23000,
        deskripsi = "-",
        kategori = "breakfast",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/miayam.jpeg"
    ),
    Food(
        nama = "Mie / Yamie / Lamie Ayam Jamur",
        harga = 17000,
        deskripsi = "-",
        kategori = "breakfast",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/miayam.jpeg"
    ),
    Food(
        nama = "Nasi Tim Ayam Spesial",
        harga = 15000,
        deskripsi = "-",
        kategori = "breakfast",
        photourl = "https://fanny-tn.000webhostapp.com/images/food/miayambakso.jpeg"
    )
)

fun ImageView.loadImage(url: String?,){
    Picasso.get()
        .load(url)
        .resize(400,400)
        .centerCrop()
        .error(R.drawable.ic_baseline_error_24)
        .into(this, object: Callback {
            override fun onSuccess() {
            }

            override fun onError(e: Exception?) {

            }
        })
}

@BindingAdapter("android:imageUrl")
fun loadPhotoUrl(view: ImageView, url:String){
    view.loadImage(url)
}

val MIGRATION_1_2 = object : Migration(1,2){
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            "ALTER TABLE user ADD COLUMN saldo INTEGER DEFAULT 1000000 not null")
    }
}
