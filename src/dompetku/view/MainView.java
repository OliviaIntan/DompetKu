/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dompetku.view;

/**
 *
 * @author WORKPLUS
 */

import dompetku.model.Kategori;
import dompetku.controller.TransaksiController;
import dompetku.model.Transaksi;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainView {
    public static void main(String[] args) {
        TransaksiController controller = new TransaksiController();

        // Kategori
        Kategori gaji = new Kategori("Gaji");
        Kategori makanan = new Kategori("Makanan");
        Kategori transportasi = new Kategori("Transportasi");

        // Tambah transaksi
        controller.tambahPemasukan(3000000, "Gaji Bulanan", gaji);
        controller.tambahPengeluaran(50000, "Beli makan siang", makanan);
        controller.tambahPengeluaran(15000, "Ojek Online", transportasi);

        // Formatter
        Locale indonesia = new Locale("id", "ID");
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(indonesia);
        DateTimeFormatter tanggalFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy", indonesia);

        // Header tabel
        System.out.printf("%-5s %-20s %-25s %-20s %-15s%n", 
            "No", "Tanggal", "Deskripsi", "Jumlah", "Kategori");
        System.out.println("------------------------------------------------------------------------------------------");

        // Isi tabel
        int no = 1;
        for (Transaksi t : controller.getDaftarTransaksi()) {
            System.out.printf("%-5d %-20s %-25s %-20s %-15s%n",
                no++,
                t.getTanggal().format(tanggalFormat),
                t.getDeskripsi(),
                rupiahFormat.format(t.getJumlah()),
                t.getKategori().getNama()
            );
        }

        // Ringkasan keuangan
        double totalPemasukan = controller.hitungTotalPemasukan();
        double totalPengeluaran = controller.hitungTotalPengeluaran();
        double saldo = totalPemasukan - totalPengeluaran;

        System.out.println("\nTotal Pemasukan  : " + rupiahFormat.format(totalPemasukan));
        System.out.println("Total Pengeluaran: " + rupiahFormat.format(totalPengeluaran));
        System.out.println("Saldo Saat Ini   : " + rupiahFormat.format(saldo));
    }
}


