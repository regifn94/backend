package com.regi.backend.introjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomKelompok {
    public static void main(String[] args) {
        // Daftar nama siswa sesuai yang diberikan
        List<String> siswa = new ArrayList<>();
        siswa.add("Yorry Efrem");
        siswa.add("Anapu, Akmal Rizki");
        siswa.add("Atan, Oatman Gheo");
        siswa.add("Dapu, Yeremia Hendrik Luther");
        siswa.add("Kalangi, Reyvan Clief");
        siswa.add("Lumban Raja, Luck Lee");
        siswa.add("Makalalag, Fajrikun");
        siswa.add("Mamuaya, Tiara Pretty");
        siswa.add("Mawuntu, Yeremia Milano");
        siswa.add("Mia, Ferdi Akson");
        siswa.add("Mirah, Gabriel Natalio Kristius");
        siswa.add("Mnahonin, Wendell Yuven Runesi");
        siswa.add("Pangemanan, Emily Sintikhe");
        siswa.add("Rarentewan, Mayjen Mclearen Putra");
        siswa.add("Regar, Sergio Cagliary Matthew");
        siswa.add("Seredei, Cristania");
        siswa.add("Tumbol, Zevan Rigel Akwila");
        siswa.add("Waworuntu, Stivel");

        // Mengacak urutan siswa
        Collections.shuffle(siswa);

        // Membagi menjadi kelompok
        int jumlahKelompok = siswa.size() / 3;
        for (int i = 0; i < jumlahKelompok; i++) {
            System.out.println("Kelompok " + (i + 1) + ": "
                    + siswa.get(i * 3) + ", "
                    + siswa.get(i * 3 + 1) + ", "
                    + siswa.get(i * 3 + 2));
        }
    }
}
