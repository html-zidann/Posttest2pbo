/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Zidan
 */
public class Warga {
    private int id;
    private String nama;
    private int umur;
    
    //consturctk
    public Warga(int id, String nama, int umur){
        this.id = id;
        this.nama = nama;
        this.umur = umur;
    }
    
    //get dan set
    public int getId(){
            return id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur (int umur){
        this.umur = umur;
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "|Nama :" + nama + "|Umur : " + umur;
    }
}