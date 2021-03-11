package Models;

public class Mahasiswa extends Person {
    
    private String nim;
    private KRS krs;

    public Mahasiswa(String nim,String nama)(
        this.nim = nim;
        ModelPerson.setNama(nama); 
    )

    public void cetakKRS(){
        System.out.print();
    }

    public void setNim(String nim){
        this.nim = nim;
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
