package Model;

public class MataKuliah {
    private String namaMataKuliah;
    private int sks, semester;
    private ModelDosen pengampu;

    public MataKuliah(String namaMataKuliah, int sks) {
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }

    public void setPengampu(ModelDosen pengampu) {
        this.pengampu = pengampu;
    }

    public ModelDosen getPengampu() {
        return pengampu;
    }

    public void showMataKuliah() {
        System.out.print("Semester " + semester + " :\n" + "Mata Kuliah : " + namaMataKuliah + "\nSKS : "
                + sks + "\nPengampu : " + pengampu
            );
    }

}
