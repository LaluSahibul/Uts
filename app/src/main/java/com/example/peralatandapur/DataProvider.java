package com.example.peralatandapur;

import android.content.Context;


import com.example.peralatandapur.model.Elektronik;
import com.example.peralatandapur.model.Nelektronik;
import com.example.peralatandapur.model.Hewan;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Nelektronik> initDataKucing(Context ctx) {
        List<Nelektronik> kucings = new ArrayList<>();
        kucings.add(new Nelektronik("N Elektronik", "Pisau",
                "Alat ini sangat berguna untuk mengolah bahan makanan yang masih mentah. Pisau digunakan untuk mengiris atau pun memotong berbagai bahan makanan seperti buah dan bawang", R.drawable.pisau));
        kucings.add(new Nelektronik("N Elektronik", "Wajan",
                "Wajan merupakan alat dapur non elektronik yang digunakan untuk menggoreng berbagai bahan makanan. Wajan juga sangat dibutuhkan di dapur untuk membuat lauk pauk. Jenis wajan pun bermacam-macam, ada yang ukurannya kecil hingga besar, tergantung fungsi dan kebutuhan pemakaiannya", R.drawable.wajan));
        kucings.add(new Nelektronik("N Elektronik", "Panci", "Panci memiliki banyak sekali fungsi, diantaranya yaitu untuk memasak sayuran, memasak nasi, mengukus, dan merebus air. Ukuran panci pun bervariasi, ada yang kecil ada juga yang besar", R.drawable.panci));
        kucings.add(new Nelektronik("N Elektronik", "Parutan", "Alat ini digunakan untuk memarut kelapa serta umbi-umbian. Keberadaan alat ini juga sangat penting di dapur, terutama ketika Anda ingin membuat makanan yang berbahan dari santan", R.drawable.parutan));
        return kucings;
    }

    private static List<Elektronik> initDataAnjing(Context ctx) {
        List<Elektronik> anjings = new ArrayList<>();
        anjings.add(new Elektronik("Elektronik", "Kulkas",
                "Kulkas merupakan salah satu alat dapur elektronik yang banyak digunakan untuk mengawetkan atau menyimpan makanan maupun minuman dan lain – lain. Selain itu, ada bagian kulkas yang dimanfaatkan untuk membekukan", R.drawable.kulkas));
        anjings.add(new Elektronik("Elektronik", "Blender",
                "Blender merupakan salah satu alat elektronik yang berfungsi untuk menghaluskan bumbu – bumbu masakan seperti bawang merah, bawang putih, cabai san lain – lain menggunakan tenaga listrik. Selain itu, blender juga dapat digunakan untuk membuat jus beranekaragam buah", R.drawable.blender));
        anjings.add(new Elektronik("Elektronik", "Rice Cooker", "Rice cooker merupakan alat elektronik yang berfungsi untuk memasak nasi dengan tenaga listrik secara otomatis. Rice cooker ini juga merupakan barang yang multifungsi, antara lain adalah untuk merebus mie instan, menggoreng lauk pauk, membuat agar – agar, memasak air, sayuran dan lain – lain", R.drawable.rice_cooker));
        anjings.add(new Elektronik("Elektronik", "Oven", "Seiring dengan berkembangnya teknologi maka kini tersedia oven listrik yang memanfaatkan energi listrik. Kehadiran oven listrik ini membantu Anda dalam memasak sehingga lebih cepat, praktis dan efisien", R.drawable.oven));
        anjings.add(new Elektronik("Elektronik", "Dispenser", "Dispenser merupakan alat yang digunakan  sebagai tempat air minum yang menyediakan air panas dan dingin. Dispenser ini merupakan alat elektronik di dapur karena membutuhkan listrik untuk memanaskan air minum pada alat tersebut", R.drawable.dispenser));
        return anjings;

    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
