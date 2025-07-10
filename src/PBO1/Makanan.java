package PBO1;
// CLASS
public class Makanan {
       // ATRIBUT
    private String nama;
    private int harga;

    // CONSTRUCTOR
    public Makanan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // ACCESSOR
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    // MUTATOR
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // POLYMORPHISM (akan dioverride)
    public void tampilkanInfo() {
        System.out.println(nama + " - Rp " + harga);
    }
    
}
