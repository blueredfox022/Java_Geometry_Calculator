package com.SwingMainForm;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Tentukan path direktori yang akan dibuat
        StringBuilder folderPath = new StringBuilder("D:\\_Latihan Java\\IntellijIDEA\\Java Swing\\TestSwing_MainForm\\coba"); // Ganti dengan path yang sesuai


        int i = 0;
        while(i < 15){
                Path directoryPath = Paths.get(folderPath.toString());
        // Cek apakah direktori sudah ada, jika belum, maka buat
            if (!Files.exists(directoryPath)) {
                try {
                    Files.createDirectories(directoryPath);
                    System.out.println("Direktori baru telah berhasil dibuat.");
                } catch (IOException e) {
                    System.err.println("Gagal membuat direktori: " + e.getMessage());
                }
            } else {
               folderPath.append("\\coba");
            }
            i++;
        }
        System.out.println("selesai");
    }
}
