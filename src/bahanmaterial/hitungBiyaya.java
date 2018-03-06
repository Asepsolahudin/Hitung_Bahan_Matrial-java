/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahanmaterial;

/**
 *
 * @author Apsalboy
 */
public class hitungBiyaya {
    public int HargaPasir, HargaSemen, HargaBatubata, HargaKayu, HargaBatuKali, HargaGenting;
    public int jumlahBarangP,jumlahBarangS,jumlahBarangBB,jumlahBarangK,jumlahBarangBK,jumlahBarangG;
    public int jumlahBiyaya;
    public int totalbiyaya;
    public int Pasir()
    {
        HargaPasir = 120000;
        jumlahBiyaya = HargaPasir*jumlahBarangP;
        return jumlahBiyaya;
    }
    public int Semen()
    {
        HargaSemen = 90000;
        jumlahBiyaya = HargaSemen*jumlahBarangS;
        return jumlahBiyaya;
    }
    public int BatuBata()
    {
        HargaBatubata = 500;
        jumlahBiyaya = HargaBatubata*jumlahBarangBB;
        return jumlahBiyaya;
    }
    public int Kayu()
    {
        HargaKayu =200000;
        jumlahBiyaya = HargaKayu*jumlahBarangK;
        return jumlahBiyaya;
    }
    public int BatuKali()
    {
        HargaBatuKali = 1000;
        jumlahBiyaya = HargaBatuKali*jumlahBarangBK;
        return jumlahBiyaya;
    }
    public int Genting()
    {
        HargaGenting = 2000;
        jumlahBiyaya = HargaGenting*jumlahBarangG;
        return jumlahBiyaya;
    }
    public void TotalKeseluruhan()
    {
        totalbiyaya = Pasir()+ Semen()+ BatuBata()+ Kayu()+ BatuKali()+ Genting();
    }
    public void totalBiyaya()
    {
        System.out.println("Total harga pasir : "+Pasir());
        System.out.println("Total harga semen : "+Semen());
        System.out.println("Total harga batu bata : "+BatuBata());
        System.out.println("Total harga kayu kalimantan : "+Kayu());
        System.out.println("Total harga batu kali : "+BatuKali());
        System.out.println("Total harga genting : "+Genting());
        System.out.println("========================================");
        System.out.println("Total harga keseluruhan : "+totalbiyaya);
    }
    
}
