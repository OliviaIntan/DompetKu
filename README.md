# DompetKu 
Aplikasi Manajemen Keuangan Pribadi - Tugas Besar PBO Telkom University Purwokerto

DompetKu adalah aplikasi berbasis Java yang membantu pengguna mencatat pengeluaran dan pemasukan, mengelompokkan transaksi berdasarkan kategori, serta membuat budgeting bulanan.

## 🎯 Fitur Utama
- Catat pemasukan dan pengeluaran
- Klasifikasi transaksi berdasarkan kategori
- Budgeting bulanan
- Visualisasi grafik pengeluaran (fitur dalam pengembangan)

## 🔧 Konsep OOP dan MVC
- **Inheritance**: `Transaksi` → `Pemasukan`, `Pengeluaran`
- **Polymorphism**: `getDeskripsi()` berbeda di setiap subclass
- **Encapsulation**: Informasi akun (saldo) tidak bisa diakses langsung
- **Exception Handling**: Validasi saldo negatif dan format tanggal

## 🏛️ Arsitektur MVC
- **Model**: `Transaksi`, `Kategori`, `Akun`
- **View**: `MainView` (Form UI)
- **Controller**: `AkunController`, `TransaksiController`

## 📸 Screenshot Tampilan Aplikasi

### Form Input Transaksi
![Form Input](screenshots/form_transaksi.png)

### Grafik Pengeluaran
![Grafik](screenshots/grafik_pengeluaran.png)

## 🗂️ Class Diagram
![Class Diagram](class_diagram.png)

## 👥 Tim Pengembang
- Olivia Intan Puspita - 2311110006
- Afifah Faiqatzzahra - 2311110043
- Yasmine Alifta - 2311110044

