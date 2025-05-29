/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dompetku.model;

/**
 *
 * @author WORKPLUS
 */

import java.time.LocalDate;

public abstract class Transaksi {
    private int id;
    private LocalDate tanggal;
    private double jumlah;
    private Kategori kategori;
    private static int nextId = 1;

    public Transaksi(int id, LocalDate tanggal, double jumlah, Kategori kategori) {
        this.id = id;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.kategori = kategori;
    }

    protected static int generateId() {
        return nextId++;
    }

    public int getId() {
        return id;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public double getJumlah() {
        return jumlah;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public abstract String getDeskripsi();
}




