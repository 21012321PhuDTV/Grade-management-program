/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java07.baitapto.SinhVien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyDiem {

    public QuanLyDiem() {
    }
    

    List<SinhVien> listSV = new ArrayList<SinhVien>();

    public void themSV() {
        SinhVien sv = new SinhVien();// khoi tao nay thi se nhap cac thong tin cua sinh vien r
        listSV.add(sv);
    }

    public void suaTT() {
        //nhap Ma Sv can sua
        //check maSV de lay inDex
        //them thao tac sua
    }

    public void xoaTT() {
        //nhap ma SV can xoa
        //check maSV de lay index
        //remove
    }
    public void taoDSMonHoc(List<MonHoc> listMH){
        MonHoc monHoc = new MonHoc(); 
        listMH.add(monHoc);
    }
    
    public void nhapDiem(List<SinhVien> listSV){
        //nhap maSV can nhap
        //lay index
        listSV.get(0).themDiem(); //lay index thay so 0
        
    }
    //loc cac kieu = cach duyet listSV
    //1.theo ten 
    //2, theo maSV
    //3. theo diemTB>7 
    //4. theo diemTB <4 
}
