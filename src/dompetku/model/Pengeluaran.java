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

public class Pengeluaran extends Transaksi {
    private String deskripsi;

    public Pengeluaran(double jumlah, String deskripsi, Kategori kategori) {
        super(generateId(), LocalDate.now(), jumlah, kategori);
        this.deskripsi = deskripsi;
    }

    @Override
    public String getDeskripsi() {
        return deskripsi;
    }
}

