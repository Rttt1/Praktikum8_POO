package praktikum8;

public class MainProgram {
    public static void main(String[] args){
        Customer Adi = new Customer();
        Adi.nama = "Adidarma Mahendra";
        Adi.alamat = "Cikarang";
        
        Order Barang = new Order();
        
        Barang.date = 19;
        Barang.status = "New";
        
        Payment Baru = new Payment();
        
        Baru.jumlah = 12000000;
    }  
}