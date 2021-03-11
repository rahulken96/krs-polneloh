package Models;

import java.util.ArrayList;

public class Dosen extends Person {
    
    private String nidn;
    private ArrayList<Matakuliah> listMataKuliahPengampu;
    private Matakuliah matakKuliahPengampu;

    public Dosen(String nidn,String nama){
        this.nidn = nidn;
        ModelPerson.setNama(nama);
    }

    public void lihatListMataKuliahPengampu(){
        //Code Program
    }

    public void tambahMataKuliahPengampu(Matakuliah matakuliah){
        //Code Program
    }

    public void setNidn(String nidn){
        this.nidn = nidn;
    }

    public String getNidn(){
        return nidn;
    }

}
