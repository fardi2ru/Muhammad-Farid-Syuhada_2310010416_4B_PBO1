# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pemesanan makanan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama makanan yang akan dipesan dan porsi  makanan yang dipesan, dan memberikan output berupa informasi nama makanan, porsi, dan total pembayaran

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Makanan`, `MakananSpesial`, dan `MakananBeraksi` adalah contoh dari class.

```bash
public class Makanan {
    ...
}

public class Makanan extends Mahasiswa {
    ...
}

public class MahasiswaBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Makanan[] = new Makanan(nama, harga, diskon);` adalah contoh pembuatan object.

```bash
 Makanan[] menu = {
            new Makanan("Nasi Goreng", 15000),
            new Makanan("Mie Ayam", 12000),
            new MakananSpesial("Ayam Geprek", 18000, 3000),
            new MakananSpesial("Sate Ayam", 20000, 4000)
        };

```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `harga`, dan `diskon` adalah contoh atribut.

```bash
String nama;
int harga;
int diskon;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Makanan` dan `MakananSpesial`.

```bash
public Makanan(String nama, int harga) {
    this.nama = nama;
    this.harga = harga;
}

public MakananSpesial(String nama, int harga, int diskon) {
    super(nama, harga);
    this.diskon = diskon;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setHarga` dan `setDiskon` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setHarga(int harga) {
    this.harga = harga;
}

public void setDiskon(int diskon) {
    this.diskon = diskon;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getHarga`, dan `getDiskon` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public int getHarga() {
    return harga;
}

public int getDiskon() {
    return diskon;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `harga`, dan `diskon` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int harga;
private int diskon;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MakananSpesial` mewarisi `makanan` dengan sintaks `extends`.

```bash
public class MakananSpesial extends Makanan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo()` di `MakananSpesial` merupakan override dari method `tampilkanInfo()` di `Makanan`

```bash

@Override
public void tampilkanInfo() {
    int hargaDiskon = getHarga() - diskon;
    System.out.println(getNama() + " - Rp " + hargaDiskon);
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi.  
Pada kode ini, digunakan seleksi `if` untuk:
- Mengakhiri program saat pengguna memilih menu `0`,
- Memvalidasi pilihan menu agar tidak di luar indeks array,
- Mengecek apakah suatu objek merupakan `MakananSpesial` menggunakan `instanceof`,
- Menampilkan hanya makanan yang dipesan pada saat mencetak struk.`.

```bash
if (pilihan == 0) break;

if (pilihan < 1 || pilihan > menu.length) {
    System.out.println("Menu tidak valid!");
    continue;
}

if (menu[i] instanceof MakananSpesial) {
    harga -= ((MakananSpesial) menu[i]).getDiskon();
}

if (pesanan[i] > 0) {
    ...
}


```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode secara berulang.  
Pada kode ini, digunakan perulangan `while` untuk menampilkan menu secara terus-menerus sampai pengguna memilih selesai, dan `for` untuk menampilkan daftar menu makanan serta mencetak struk pesanan.

```bash
while (true) {
    // Menampilkan daftar menu
    for (int i = 0; i < menu.length; i++) {
        System.out.print((i + 1) + ". ");
        menu[i].tampilkanInfo();
    }
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari pengguna dan menampilkan output ke layar.  
Pada kode ini, digunakan class `Scanner` untuk menerima input menu dan jumlah porsi dari pengguna, serta `System.out.println` untuk menampilkan daftar menu, konfirmasi pesanan, dan total pembayaran di struk.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Pilih menu (1-4): ");
int pilihan = Integer.parseInt(input.nextLine());

System.out.print("Jumlah porsi: ");
int jumlah = Integer.parseInt(input.nextLine());

System.out.println("Pesanan ditambahkan!");
System.out.println("Total Bayar: Rp " + total);
```

13.  **Array** adalah struktur data yang digunakan untuk menyimpan banyak data dalam satu variabel dengan tipe yang sama.  
Pada kode ini, array digunakan untuk menyimpan daftar menu makanan (`Makanan[] menu`) dan jumlah porsi pesanan dari setiap item (`int[] pesanan`).

```bash
Makanan[] menu = {
    new Makanan("Nasi Goreng", 15000),
    new Makanan("Mie Ayam", 12000),
    new MakananSpesial("Ayam Geprek", 18000, 3000),
    new MakananSpesial("Sate Ayam", 20000, 4000)
};

int[] pesanan = new int[menu.length];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    int pilihan = Integer.parseInt(input.nextLine());
    if (pilihan == 0) break;

    System.out.print("Jumlah porsi: ");
    int jumlah = Integer.parseInt(input.nextLine());

    pesanan[pilihan - 1] += jumlah;
} catch (NumberFormatException e) {
    System.out.println("Input harus berupa angka!");
} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
}

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Farid Syuhada
NPM: 2310010416
