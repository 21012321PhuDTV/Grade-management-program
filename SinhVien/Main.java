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
public class Main {
    public static void main(String[] args) {
        QuanLyDiem project1 = new QuanLyDiem();
        //khi khoi tao project 1 thi no se co 1 list SV roi
        //tiep theo minh se them sinh vien
        project1.themSV();
      //phuong thuc nay chi moi khoi tao va them vao 1 sinh vien, muon them bao nhieu sinh vien thi can bay nhieu lenh project1.themSV()
      //co the them 1 phuong thuc them sinh vien cho list tu dau den cuoi
      
      //them ds mon hoc cho Sinh vien
      List<MonHoc> listMH = new ArrayList<MonHoc>();
      project1.taoDSMonHoc(listMH);
      // m.n xem thu de gan list mon hoc nay vao list mon hoc cua sinh vien 
      //van de minh chua thu la list mon hoc nay no co khop voi list monhoc moi sinh vien khoi tao ko
      
      
      //tiep theo minh se them diem vao cho sinh vien
      //ma luc khoi tao sinh vien thi moi sinh vien da tu khoi tao 1 list mon hoc 
      for (int i = 0; i < project1.listSV.size(); i++) {
            project1.listSV.get(i).themDiem();
            //duyet tung sinh vien va them diem tung mon hoc
        }
     //con tiep
        
    }
}
