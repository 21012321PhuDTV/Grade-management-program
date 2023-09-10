/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java07.baitapto.SinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
    Scanner sc = new Scanner(System.in);

    private String MaSV;
    private String HoTen;
    private String TenLop;
    private String NgaySinh;
    private String QueQuan;
    List<MonHoc> listDiem; // list mon hoc dc khoi tao

    public SinhVien() {
        this.listDiem = new ArrayList<MonHoc>();
        System.out.println("Nhap HoTen: ");this.HoTen = sc.nextLine();
        System.out.println("Nhap TenLop: ");this.TenLop = sc.nextLine();
        System.out.println("Nhap NgaySinh: ");this.NgaySinh = sc.nextLine();
        System.out.println("Nhap QueQuan: ");this.QueQuan = sc.nextLine();
        
    }

    public SinhVien(String MaSV, String HoTen, String TenLop, String NgaySinh, String QueQuan) {
        this.listDiem = new ArrayList<MonHoc>();
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.TenLop = TenLop;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    
    
    public void themDiem(){
        
        for (int i = 0; i < listDiem.size(); i++) {
            System.out.println(listDiem.get(i).getTenMonHoc()+":");
            listDiem.get(i).setDiemMon(sc.nextDouble());
        }
    }
    public double tinhDiemTB() {
        double sum = 0;
        int n = 1;
        for (int i = 0; i < listDiem.size(); i++) {
            double temp = listDiem.get(i).getDiemMon();
            sum += temp;
            n++;
        }
        return sum/n;
    }
   
}
