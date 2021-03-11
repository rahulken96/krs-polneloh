package Models;
public abstract class Person {
    private String nama;

    public void showProfile(){
        System.out.print("Nama : " + nama);
    }

    public void setNama (String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
}
