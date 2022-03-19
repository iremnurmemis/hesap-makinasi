package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   int n1,n2,secim,sonuc;
        Scanner inp=new Scanner(System.in);
        System.out.print("sayi1:");
        n1= inp.nextInt();
        System.out.print("sayi2:");
        n2=inp.nextInt();

        System.out.print("1-toplama\n 2_cıkarma\n 3-carpma\n 4-bölme\n");
        System.out.print("\nsecim:");
        secim=inp.nextInt();


        if(secim==1){
            sonuc=n1+n2;
            System.out.print("sonuc:"+sonuc);
        }else if(secim==2){
            sonuc=n1-n2;
            System.out.print("sonuc:"+sonuc);
        }else if(secim==3){
            sonuc=n1*n2;
            System.out.print("sonuc:"+sonuc);
        }else if(secim==4){
            if(n2!=0){
                sonuc=n1/n2;
                System.out.print("sonuc:"+sonuc);
            }else{
                System.out.print("n2 0 olamaz");
            }
        }else{
            System.out.print("gecersiz islem secimi");
        }
    }
}
