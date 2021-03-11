/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Models.Person;

public class Mahasiswa extends Person{
    
    Person person;
    private String nim;
    private KRS krs;

    public Mahasiswa() {
    
    }

    public Mahasiswa(String nim,String nama) {
        this.nim = nim;
        person.setNama(nama);
    }
    
   

    public void cetakKRS(){
        System.out.print("");
    }

    public String setNim(String nim){
        
         
        if (nim.length()!=7){
            return "Panjang NIM harus 7!";
        }
        
        boolean bukanHuruf;
        try {
            int angka = Integer.parseInt(nim);
            bukanHuruf = true;
        } 
        catch (Exception e) {
            bukanHuruf = false;
        }
        
        if(nim.equals("") || nim == null){
            return "NIM tidak boleh kosong!";
        }
       
        if(!bukanHuruf){
            return "NIM harus berisi angka!";
        }

        return this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public void pilihPaketKRS(KRS krs){
        this.krs = krs;
    }

    public KRS getKRS(){
        return krs;
    }
}
