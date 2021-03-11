package Models;

import java.util.ArrayList;

public class Dosen extends Person {
    
    Person person;
    private String nidn;
    private ArrayList<Matakuliah> listMataKuliahPengampu;
    private Matakuliah matakKuliahPengampu;

    public Dosen() {
    
    }

    public Dosen(String nidn,String nama){
        this.nidn = nidn;
        person.setNama(nama);
    }

    public void lihatListMataKuliahPengampu(){
        //Code Program
    }

    public void tambahMataKuliahPengampu(Matakuliah matakuliah){
        //Code Program
    }

    public String setNidn(String nidn){
        boolean bukanHuruf;
        try {
            int angka = Integer.parseInt(nidn);
            bukanHuruf = true;
        } 
        catch (Exception e) {
            bukanHuruf = false;
        }
        
        if(nidn.equals("")){
            return "NIDN tidak boleh kosong!";
        }
        
        if (nidn.length()!=7){
            return "Panjang NIDN harus 7!";
        }

        if(!bukanHuruf){
            return "NIDN harus berisi angka!";
        }

        return this.nidn = nidn;

    }

    public String getNidn(){
        return nidn;
    }

}

