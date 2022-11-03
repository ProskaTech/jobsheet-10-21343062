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
public class Tugas2MahasiswaMain {
   public static void main(String[] args){
       Tugas2Mahasiswa mahasiswa = new Tugas2Mahasiswa();
       System.out.println();
       System.out.println("==^_^==Data Mahasiswa Universitas Negeri Padang==^-^==");
       mahasiswa.inputData();
       System.out.println("------------------------------------------------------");
       System.out.println("==^-^==Data Mahasiswa Univeristas Negeri Padang==^-^==");
       mahasiswa.Tampil();
       mahasiswa.NilaiIP();
   }
}