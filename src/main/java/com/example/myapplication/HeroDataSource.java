package com.example.myapplication;

import android.widget.Button;

import java.util.ArrayList;

public class HeroDataSource {
    private static String[] heroNames = {
            "Persia",
            "British Shorthair",
            "Maine Coon",
            "Siam",
            "Bengal",
            "Bali",
            "Manx",
            "Munchkin",
            "Javanese",
            "American Shorthair"
    };


    private static String[] heroDetails = {
            "Deskripsi:\n" +
                    "Kucing Persia adalah salah satu kucing rumahan \n" +
                    "Paling populer di banyak negara di seluruh dunia. \n" +
                    "Mereka berasal dari Persia (Iran saat ini).\n" +
                    "Catatan pertama mengenai eksistensi kucing Persia berasal dari abad ke-17.\n",
            "Deskripsi:\n" +
                    "British Shorthair atau juga dikenal sebagai British Blue\n" +
                    "Salah satu kucing peliharaan yang paling lucu dan populer. \n" +
                    "Dengan tubuh chunky yang khas, bentuk wajah yang luas, dan mantel bulu yang lebat\n" +
                    "British Shorthair juga menjadi inspirasi Cheshire Cat yang terkenal dari film.\n",
            "Deskripsi:\n" +
                    "Kucing raksasa ini adalah satwa asli Negara Bagian Maine, Amerika Serikat\n" +
                    "merupakan salah satu ras alami tertua di Amerika Utara. \n" +
                    "Maine Coon sangat ramah dan bersahabat terlepas dari penampilan mereka yang gahar\n" +
                    "karena itulah mereka dijuluki sebagai raksasa yang lembut.\n",
            "Deskripsi:\n" +
                    "Jika anda sudah bertemu kucing Siam, besar kemungkinan Anda akan jatuh cinta pada mereka. \n" +
                    "Kucing ini sangat toleran, tenang, dan ramah. \n" +
                    "Mereka sangat memuja pemiliknya.\n",
            "Deskripsi:\n" +
                    "Kucing Bengal barangkali adalah yang paling terkenal  \n" +
                    "di antara semua ras kucing desainer dan eksotis. \n" +
                    "Mereka adalah kucing besar yang merupakan campuran antara kucing domestik dan kucing liar.\n" +
                    "Dengan demikian, mereka memiliki penampilan kucing liar \n" +
                    "yang dapat dikenali lewat tubuh ramping, perawakan elegan, dan pola bulu roset.\n",
            "Deskripsi:\n" +
                    "Kucing Bali sangat mirip dengan kucing Siam populer. \n" +
                    "dijuluki sebagai versi Siam berbulu panjang. \n" +
                    "Bertentangan dengan namanya, kucing Bali bukan asli Bali atau bagian Indonesia lainnya.\n" +
                    "Trah ini berasal dari AS di mana beberapa kucing Siam, yang membawa gen longhair resesif\n" +
                    "dikembangbiakkan dalam upaya untuk menghasilkan versi longhair.\n",
            "Deskripsi:\n" +
                    "Manx adalah hewan asli dari Isle of Man dan terkenal karena gen tak berekor mereka. \n" +
                    "kucing Manx sama sekali tidak memiliki ekor,\n" +
                    "sedangkan yang lain dapat memiliki setengah panjang ekor kucing standar.\n" +
                    "Manx telah diakui oleh banyak registry kucing sejak akhir abad ke-19.\n",
            "Deskripsi:\n" +
                    "Munchkin yang terkenal sebenarnya adalah jenis kucing yang relatif baru\n" +
                    "Secara resmi mereka diakui oleh TICA (The International Cat Association) pada tahun 1995.\n" +
                    "Munchkin pertama kali diperkenalkan pada tahun 1991.\n" +
                    "berbagai risiko kesehatan yang mungkin rentan terhadap ras baru ini.\n",
            "Deskripsi:\n" +
                    "Cat Fanciers Association mengklasifikasikan kucing Javanese sebagai jenis kucing pameran. \n" +
                    "Mereka adalah kucing berbulu panjang dari keluarga tipe Oriental\n" +
                    "Meskipun namanya kucing jawa namun kucing ini tidak berasal dari pulau Jawa\n" +
                    "Kucing Jawa sebenarnya asli dari Amerika Utara.\n",
            "Deskripsi:\n" +
                    "American Shorthair adalah salah satu trah kucing terpopuler di Amerika Serikat\n" +
                    "Dijuluki kucing pekerja\n" +
                    "mereka pada awalnya dibiakkan dengan tujuan untuk membasmi hewan pengerat."
    };



    private static int[] heroesImages = {
            R.drawable.persia,
            R.drawable.british_shorthair,
            R.drawable.maine_coon,
            R.drawable.siam,
            R.drawable.bengal,
            R.drawable.bali,
            R.drawable.manx,
            R.drawable.munchkin,
            R.drawable.javanese,
            R.drawable.american_shorthair
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }

    static Hero getDataIndex(int position) {
        Hero hero = new Hero();
        hero.setName(heroNames[position]);
        hero.setDetail(heroDetails[position]);
        hero.setPhoto(heroesImages[position]);
        return hero;
    }
}