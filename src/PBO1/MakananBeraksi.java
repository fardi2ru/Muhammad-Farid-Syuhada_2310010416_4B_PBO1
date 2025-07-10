package PBO1;

import java.util.Scanner;

public class MakananBeraksi {
    public static void main(String[] args) {
        // IO SEDERHANA
        Scanner input = new Scanner(System.in);

        // ARRAY: daftar menu makanan
        Makanan[] menu = {
            new Makanan("Nasi Goreng", 15000),
            new Makanan("Mie Ayam", 12000),
            new MakananSpesial("Ayam Geprek", 18000, 3000),
            new MakananSpesial("Sate Ayam", 20000, 4000)
        };

        // ENCAPSULATION: akses melalui getter/setter
        int[] pesanan = new int[menu.length]; // jumlah porsi tiap makanan

        // PERULANGAN: menu berulang hingga selesai
        while (true) {
            System.out.println("\n==== Menu Pemesanan Makanan ====");
            for (int i = 0; i < menu.length; i++) {
                System.out.print((i + 1) + ". ");
                menu[i].tampilkanInfo();
            }

            System.out.println("0. Selesai dan Cetak Struk");
            System.out.print("Pilih menu (1-" + menu.length + "): ");

            // ERROR HANDLING
            try {
                int pilihan = Integer.parseInt(input.nextLine());

                // SELEKSI
                if (pilihan == 0) break;
                if (pilihan < 1 || pilihan > menu.length) {
                    System.out.println("Menu tidak valid!");
                    continue;
                }

                System.out.print("Jumlah porsi: ");
                int jumlah = Integer.parseInt(input.nextLine());
                pesanan[pilihan - 1] += jumlah;
                System.out.println("Pesanan ditambahkan!");

            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }

        // Cetak struk
        System.out.println("\n===== Struk Pemesanan =====");
        int total = 0;
        for (int i = 0; i < menu.length; i++) {
            if (pesanan[i] > 0) {
                int hargaSatuan = menu[i].getHarga();
                if (menu[i] instanceof MakananSpesial) {
                    hargaSatuan -= ((MakananSpesial) menu[i]).getDiskon(); // polymorphism + downcast
                }
                int subtotal = hargaSatuan * pesanan[i];
                total += subtotal;
                System.out.println(menu[i].getNama() + " x" + pesanan[i] + " = Rp " + subtotal);
            }
        }
        System.out.println("Total Bayar: Rp " + total);
        System.out.println("Terima kasih telah memesan!");
    }
}
