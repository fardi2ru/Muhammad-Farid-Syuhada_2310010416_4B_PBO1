package PBO1;

// INHERITANCE: mewarisi dari Makanan
public class MakananSpesial extends Makanan {
    private int diskon;

    // CONSTRUCTOR
    public MakananSpesial(String nama, int harga, int diskon) {
        super(nama, harga);
        this.diskon = diskon;
    }
    
    // ACCESSOR
    public int getDiskon() {
        return diskon;
    }
    
    // MUTATOR
    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    // POLYMORPHISM: override tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        int hargaAkhir = getHarga() - diskon;
        System.out.println(getNama() + " (Spesial) - Rp " + hargaAkhir + " (Diskon Rp " + diskon + ")");
    }
}
