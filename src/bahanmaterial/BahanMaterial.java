/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahanmaterial;
import java.util.Scanner;
/**
 *
 * @author Apsalboy
 */
public class BahanMaterial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    hitungBiyaya Bahan = new hitungBiyaya();
    System.out.println("========================================");
    System.out.println("DAFTAR JUMLAH BARANG YANG INGIN DIBELI");
    System.out.println("========================================");
    System.out.print("Jumlah pasir/meter kubik : ");
    Bahan.jumlahBarangP = input.nextInt();
    System.out.print("Jumlah semen/sak : ");
    Bahan.jumlahBarangS = input.nextInt();
    System.out.print("Jumlah batu bata/buah : ");
    Bahan.jumlahBarangBB = input.nextInt();
    System.out.print("Jumlah kayu/meter kubik : ");
    Bahan.jumlahBarangK = input.nextInt();
    System.out.print("Jumlah batu kali/buah : ");
    Bahan.jumlahBarangBK = input.nextInt();
    System.out.print("Jumlah genting/buah : ");
    Bahan.jumlahBarangG = input.nextInt();
    Bahan.TotalKeseluruhan();
    System.out.println("========================================");
    Bahan.totalBiyaya();
    }
    
}
