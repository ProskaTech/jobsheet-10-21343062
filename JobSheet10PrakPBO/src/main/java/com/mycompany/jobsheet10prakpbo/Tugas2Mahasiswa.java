/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet10prakpbo;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
import java.util.Scanner;
public class Tugas2Mahasiswa {
  String nama,nim,smt;
  float ip;
  
  public void inputData(){
      Scanner input = new
Scanner(System.in);
      System.out.println("Masukkan Nama Mahasiswa     :");
      nama = input.nextLine();
      System.out.println("Masukkan NIM Mahasiswa      :");
      nim = input.nextLine();
      System.out.println("Masukkan Semester Mahasiswa :");
      smt = input.nextLine();
      System.out.println("Masukkan IP Mahasiswa       :");
      ip = input.nextFloat();
  }
  
  public void NilaiIP(){
      if(ip>=3.5){
          System.out.println("Anda Berhak Mengontrak 24 SKS Pada Semester" + smt);
      }
      else if((ip<3.5)&& (ip>=3.0)){
          System.out.println("Anda Berhak Mengontrak 22 SKS Pada Semester" + smt);
      }
      else if((ip<2.5)&& (ip>=2.5)){
          System.out.println("Anda Berhak Mengontrak 20 SKS Pada Semester" + smt);
      }
      else if ((ip<2.5)&& (ip>=2.0)){
          System.out.println("Anda Berhak Mengontrak 18 SKS Pada Semester" + smt);
      }
      else{
          System.out.println("Anda Berhak Mengontrak 15 SKS Pada Semester" + smt);
      }
  }
      
   public void Tampil(){
       System.out.println("Nama            :" + nama);
       System.out.println("NIM             :" + nim );
       System.out.println("Semester        :" + smt );
       System.out.println("IP Semester Ini :" + ip  );
   
  }
}