/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java07.baitapto.SinhVien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MonHoc {
    Scanner sc = new Scanner(System.in);
    private String tenMonHoc;
    private int tinChi;
    private double diemMon;

    public MonHoc() {
        System.out.println("Nhap ten mon: ");
        this.tenMonHoc = sc.nextLine();
        System.out.println("Nhap so tin chi: ");
        this.tinChi = sc.nextInt();
    }
     
    
    public MonHoc(String tenMonHoc, int tinChi) {
        this.tenMonHoc = tenMonHoc;
        this.tinChi = tinChi;
    }

    public double getDiemMon() {
        return diemMon;
    }

    public void setDiemMon(double diemMon) {
        this.diemMon = diemMon;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getTinChi() {
        return tinChi;
    }

    public void setTinChi(int tinChi) {
        this.tinChi = tinChi;
    }
    
    
   
}
