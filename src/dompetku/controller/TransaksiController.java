/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dompetku.controller;

/**
 *
 * @author WORKPLUS
 */

import dompetku.model.Transaksi;
import dompetku.model.Pemasukan;
import dompetku.model.Pengeluaran;
import dompetku.model.Kategori;

import java.util.ArrayList;
import java.util.List;

public class TransaksiController {
    private List<Transaksi> daftarTransaksi;

    public TransaksiController() {
        daftarTransaksi = new ArrayList<>();
    }

    public void tambahPemasukan(double jumlah, String deskripsi, Kategori kategori) {
        Pemasukan pemasukan = new Pemasukan(jumlah, deskripsi, kategori);
        daftarTransaksi.add(pemasukan);
    }

    public void tambahPengeluaran(double jumlah, String deskripsi, Kategori kategori) {
        Pengeluaran pengeluaran = new Pengeluaran(jumlah, deskripsi, kategori);
        daftarTransaksi.add(pengeluaran);
    }

    public List<Transaksi> getDaftarTransaksi() {
        return daftarTransaksi;
    }

    public double hitungTotalPemasukan() {
        double total = 0;
        for (Transaksi t : daftarTransaksi) {
            if (t instanceof Pemasukan) {
                total += t.getJumlah();
            }
        }
        return total;
    }

    public double hitungTotalPengeluaran() {
        double total = 0;
        for (Transaksi t : daftarTransaksi) {
            if (t instanceof Pengeluaran) {
                total += t.getJumlah();
            }
        }
        return total;
    }
}



