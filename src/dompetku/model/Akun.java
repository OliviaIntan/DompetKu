/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dompetku.model;

/**
 *
 * @author WORKPLUS
 */

import java.util.ArrayList;

public class Akun {
    private String nama;
    private double saldo;
    private ArrayList<Transaksi> transaksiList;  // <- deklarasi transaksiList

    public Akun(String nama, double saldoAwal) {
        this.nama = nama;
        this.saldo = saldoAwal;
        this.transaksiList = new ArrayList<>(); // <- inisialisasi
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void tambahTransaksi(Transaksi t) {
        if (t instanceof Pengeluaran) {
            if (saldo >= t.getJumlah()) {
                saldo -= t.getJumlah();
                transaksiList.add(t);
            } else {
                System.out.println("❌ Saldo tidak mencukupi untuk pengeluaran: " + t.getDeskripsi());
            }
        } else if (t instanceof Pemasukan) {
            saldo += t.getJumlah();
            transaksiList.add(t);
        }
    }

    public ArrayList<Transaksi> getTransaksiList() {
        return transaksiList;
    }
}


