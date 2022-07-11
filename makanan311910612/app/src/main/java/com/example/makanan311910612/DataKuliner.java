package com.example.makanan311910612;

import java.util.ArrayList;

public class DataKuliner {
    public static String[][] data = new String[][]{
            {"Soto Betawi", "merupakan soto yang khas dari daerah DKI Jakarta. Seperti halnya Soto Madura dan Soto Sulung, soto Betawi juga menggunakan jeroan. Selain jeroan, sering kali organ-organ lain juga disertakan, seperti mata, terpedo, dan juga hati. Daging sapi juga menjadi bahan campuran dalam soto Betawi..",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Soto_Betawi_Jakarta_Street_Side_Food.JPG/800px-Soto_Betawi_Jakarta_Street_Side_Food.JPG"},
            {"Pecel", "merupakan makanan berasal dari pulau Jawa, makanan ini biasanya dihidangkan dengan bumbu sambal kacang sebagai bahan utamanya dan dicampur dengan aneka jenis sayuran. " +
                    "Makanan ini populer terutama di wilayah DI Yogyakarta, Jawa Tengah, dan Jawa Timur.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Pecel_Hariadhi.JPG/1024px-Pecel_Hariadhi.JPG"},
            {"Tongseng", "adalah sejenis gulai dengan bumbu yang lebih \"tajam\". Perbedaan yang lebih jelas adalah pada penggunaan dagingnya. " +
                    "Tongseng dibuat dengan menggunakan daging yang masih melekat pada tulang, terutama tulang iga dan tulang belakang.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Tongseng_Dish.jpg/1024px-Tongseng_Dish.jpg"},
            {"Rendang", "adalah Masakan Minangkabau yang berbahan dasar daging yang berasal dari Sumatera Barat," +
                    " Indonesia. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama dengan menggunakan aneka rempah-rempah dan santan.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Rendang_daging_sapi_asli_Padang.JPG/1024px-Rendang_daging_sapi_asli_Padang.JPG"},
            {"Sate", "adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu. Sate disajikan dengan berbagai macam bumbu yang bergantung pada variasi resep sate.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Sate_Ponorogo.jpg/800px-Sate_Ponorogo.jpg"},

    };
    public static ArrayList<ModeKuliner> ambilDataKuliner() {
        ArrayList<ModeKuliner> dataKuliner = new ArrayList<>();
        for (String[] varData : data) {
            ModeKuliner model = new ModeKuliner();
            model.setNama(varData[0]);
            model.setTentang(varData[1]);
            model.setFoto(varData[2]);
            dataKuliner.add(model);
        }
        return dataKuliner;
    }
}


