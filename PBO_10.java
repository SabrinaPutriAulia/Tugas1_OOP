/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_1.pkg0;
import java.util.Scanner;
/**
 *
 * @author DELL
 */

public class PBO_10 {
    
public static class Pegawai {
        String nama, alamat, pengalaman, skill, departemen;
        static int gaji, gajiPengalaman;
        
        void dataPegawai(String nama1, String alamat1, String pengalaman1, String skill1, String departemen1){
            nama = nama1;
            alamat = alamat1;
            pengalaman = pengalaman1;
            skill = skill1;
            departemen = departemen1;
        }
        
        void totalGaji (){
            gaji = 0;
            int gajiPengalaman = 0;
            int gajiSkill = 0;
            int gajiDepartemen = 0;
            switch (pengalaman){
                case "pemula" :
                    gajiPengalaman = 500000;
                    break;
                case "menengah" :
                    gajiPengalaman = 1000000;
                    break;
                case "expert" :
                    gajiPengalaman = 2000000;
                    break;
            }
            switch (skill){
                case "web" :
                    gajiSkill = 1000000;
                    break;
                case "mobile" :
                    gajiSkill = 2000000;
                    break;
                case "desktop" :
                    gajiSkill = 2500000;
                    break;
            }
            switch (departemen){
                case "IT" :
                    gajiDepartemen = 8000000;
                    break;
                case "HRD" :
                    gajiDepartemen = 5000000;
                    break;
                case "finance" :
                    gajiDepartemen = 4000000;
                    break;
            }
            gaji = gajiPengalaman + gajiSkill + gajiDepartemen;
        }
        
        void display(){
            System.out.println("Nama        : " + nama);
            System.out.println("Alamat      : " + alamat);
            System.out.println("Pengalaman  : " + pengalaman);
            System.out.println("Skill       : " + skill);
            System.out.println("Departemen  : " + departemen);
            System.out.println("Gaji        : " + gaji);   
        }
        }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SILAHKAN MASUKAN DATA ANDA ===");
        System.out.print("Nama        : ");
        String nama1 = sc.nextLine();
        
        System.out.print("Alamat      : ");
        String alamat1 = sc.nextLine();
        
        System.out.print("Pengalaman  : ");
        String pengalaman1 = sc.nextLine();
        
        System.out.print("Skill       : ");
        String skill1 = sc.nextLine();
        
        System.out.print("Departemen  : ");
        String departemen1 = sc.nextLine();
        
        System.out.println();
        System.out.println("=== GAJI PEGAWAI ATAS NAMA " + nama1 + " ===");
        
        Pegawai pegawai1=new Pegawai();
        pegawai1.dataPegawai(nama1, alamat1, pengalaman1, skill1, departemen1);
        pegawai1.totalGaji();
        pegawai1.display();
}
}