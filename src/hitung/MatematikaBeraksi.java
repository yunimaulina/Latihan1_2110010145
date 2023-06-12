package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
    //membuat objek
    Matematika yuni = new Matematika (4,5);
    
    System.out.println("Hasil penjumlahan : "+yuni.setPenjumlahan());
    System.out.println("Hasil pengurangan : "+yuni.setPengurangan());
    System.out.println("Hasil perkalian   : "+yuni.setPerkalian());
    System.out.println("Hasil pembagian   : "+yuni.setPembagian());
    } 
}
