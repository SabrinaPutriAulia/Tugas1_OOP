class Pegawai{
    String nama;
    String alamat;
    int gaji;

    //objek
    Pengalaman pengalaman;
    Skill skill;
    Departemen departemen;

    Pegawai(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    void hitungGaji(){
        int gajiSkill = this.skill.gajiSkill;
        int gajiPengalaman = this.pengalaman.gajiPengalaman;
        int gajiDepartemen = this.departemen.gajiDepartemen;

        this.gaji = gajiDepartemen + gajiPengalaman + gajiSkill;
    }

    void dataPengalaman(Pengalaman pengalaman){
        this.pengalaman = pengalaman;
    }

    void dataSkill(Skill skill){
        this.skill = skill;
    }

    void dataDepartemen(Departemen departemen){
        this.departemen = departemen;
    }

    void display(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Alamat : " + this.alamat);
        this.pengalaman.display();
        this.skill.display();
        this. departemen. display();
        System.out.println("Total Gaji : " + this.gaji);
    }
}

class Pengalaman{
    String nama;
    int gajiPengalaman;

    Pengalaman(String nama, int gajiPengalaman){
        this.nama = nama;
        this.gajiPengalaman = gajiPengalaman;
    }

    void display(){
        System.out.println("Pengalaman : " + this.nama + ", Gaji : " + this.gajiPengalaman);
    }
}

class Skill{
    String nama;
    int gajiSkill;

    Skill(String nama, int gajiSkill){
        this.nama = nama;
        this.gajiSkill = gajiSkill;
    }

    void display(){
        System.out.println("Skill : " + this.nama + ", Gaji : " + this.gajiSkill);
    }
}

class Departemen{
    String nama;
    int gajiDepartemen;

    Departemen(String nama, int gajiDepartemen){
        this.nama = nama;
        this.gajiDepartemen = gajiDepartemen;
    }

    void display(){
        System.out.println("Departemen : " + this.nama + ", Gaji : " + this.gajiDepartemen);
    }
}

public class Tugas1_OOP{
   public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Sabrina Putri Aulia", "Kabupaten Magetan");

        Pengalaman pemula = new Pengalaman("pemula", 500000);
        Pengalaman menengah = new Pengalaman("menengah", 1000000);
        Pengalaman expert = new Pengalaman("expert", 2000000);


        Skill Web = new Skill("Web", 1000000);
        Skill Mobile = new Skill("Mobile", 2000000);
        Skill Desktop = new Skill("Desktop", 2500000);

        Departemen IT = new Departemen("IT", 8000000);
        Departemen HRD = new Departemen("HRD", 5000000);
        Departemen Finance = new Departemen("Finance", 2000000);
        
        pegawai1.dataPengalaman(expert);
        pegawai1.dataSkill(Desktop);
        pegawai1.dataDepartemen(IT);
        pegawai1.hitungGaji();
        pegawai1.display();
    }
}

