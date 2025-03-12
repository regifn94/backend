package com.regi.backend.introjava;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomKelompokExcel {
    public static void main(String[] args) {
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
        List<String> shuffledSiswa = new ArrayList<>(siswa);
        Collections.shuffle(shuffledSiswa);

        // Tampilkan di terminal
        System.out.println("=== Pembagian Kelompok Siswa ===");
        int jumlahKelompok = shuffledSiswa.size() / 3;
        for (int i = 0; i < jumlahKelompok; i++) {
            System.out.println("Kelompok " + (i + 1) + ": "
                    + shuffledSiswa.get(i * 3) + ", "
                    + shuffledSiswa.get(i * 3 + 1) + ", "
                    + shuffledSiswa.get(i * 3 + 2));
        }

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Group");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Group");
            headerRow.createCell(1).setCellValue("Name 1");
            headerRow.createCell(2).setCellValue("Name 2");
            headerRow.createCell(3).setCellValue("Name 3");

            for (int i = 0; i < jumlahKelompok; i++) {
                Row row = sheet.createRow(i + 1);
                row.createCell(0).setCellValue("Group " + (i + 1));
                row.createCell(1).setCellValue(shuffledSiswa.get(i * 3));
                row.createCell(2).setCellValue(shuffledSiswa.get(i * 3 + 1));
                row.createCell(3).setCellValue(shuffledSiswa.get(i * 3 + 2));
            }

            try (FileOutputStream fileOut = new FileOutputStream("GroupBackend.xlsx")) {
                workbook.write(fileOut);
            }

            System.out.println("\nFile Excel Successfully created: GroupBackend.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
