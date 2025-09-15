    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zidan
 */
public class ServisWarga {
    private ArrayList<Warga> daftarWarga = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private int nextId = 1;
    
    // Create (C)
    public void tambahWarga(){
        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.println("Masukkan Umur: ");
        int umur;
        try {
            umur = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Umur harus angka bro!");
            return;
        }
        
        Warga warga = new Warga(nextId++, nama, umur);
        daftarWarga.add(warga);
        System.out.println("Nama warga telah dimasukkan ke dalam data");
    }
    
    // Read (R)
    public void tampilkanWarga(){
        if (daftarWarga.isEmpty()){
            System.out.println("Data masih kosong");
            return;
        }
        for (Warga warga : daftarWarga){
            System.out.println(warga);
        }
    }
    
    //update (U)
        public void updateWarga() {
        System.out.print("Masukkan ID Warga yang ingin diupdate: ");
        int id = Integer.parseInt(input.nextLine());

        Warga warga = cariById(id);
        if (warga == null) {
            System.out.println("Data warga tidak ditemukan.");
            return;
        }
        
        
        System.out.print("Masukkan Nama Baru: ");
        String namaBaru = input.nextLine();
        System.out.print("Masukkan Umur Baru: ");
        int umurBaru = Integer.parseInt(input.nextLine());

        warga.setNama(namaBaru);
        warga.setUmur(umurBaru);
        System.out.println("Data berhasil diperbarui!");
    }
        
    //Delete (D)
        public void hapusWarga(){
            System.out.println("Masukkan id warga yang mau dihapus: ");
            int id = Integer.parseInt(input.nextLine());
            
            Warga warga = cariById(id);
            if (warga != null){
                daftarWarga.remove(warga);
                System.out.println("Data berhasil dihapus.");
            } else {
                System.out.println("data tidak ditemukan/not found");
            }
        }
        
        //search (nilai tambah)
            public void cariWarga() {
        System.out.print("Masukkan Nama yang dicari: ");
        String keyword = input.nextLine().toLowerCase();

        boolean ditemukan = false;
        for (Warga warga : daftarWarga) {
            if (warga.getNama().toLowerCase().contains(keyword)) {
                System.out.println(warga);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }
            
    //helper yg caribyid
    private Warga cariById(int id){
        for (Warga warga : daftarWarga){
            if (warga.getId() == id);
            return warga;
        }
        return null;
    }
}
