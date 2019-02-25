package Vending;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        ArrayList<String> kopi=new ArrayList<>();
        MesinKopi robusta=new MesinKopi();
        MesinKopi arabica=new MesinKopi();
        MesinKopi flores=new MesinKopi();

        robusta.setJenisKopi("Robusta");
        arabica.setJenisKopi("Arabica");
        flores.setJenisKopi("Kopi Flores");

        robusta.setJumlahStokKopi(40);
        arabica.setJumlahStokKopi(35);
        flores.setJumlahStokKopi(30);

        kopi.add(robusta.getJenisKopi());
        kopi.add(arabica.getJenisKopi());
        kopi.add(flores.getJenisKopi());

        System.out.println("Menu Kopi");
        for(int i=0; i<kopi.size(); i++){
            int j=i+1;
            System.out.println(j+". "+kopi.get(i));
        }

        System.out.print("Masukan kopi yang mau dipilih : ");
        int pilihanKopi=keyboard.nextInt()-1;

        ArrayList<String> topping=new ArrayList<>();
        Topping susu=new Topping();
        Topping gula=new Topping();
        Topping cream=new Topping();

        susu.setJenisTopping("Susu");
        gula.setJenisTopping("Gula");
        cream.setJenisTopping("Cream");

        susu.setJumlahStokTopping(23);
        gula.setJumlahStokTopping(23);
        cream.setJumlahStokTopping(23);

        topping.add(susu.getJenisTopping());
        topping.add(gula.getJenisTopping());
        topping.add(cream.getJenisTopping());

        System.out.println("Menu Topping");
        for(int i=0; i<topping.size(); i++){
            int j=i+1;
            System.out.println(j+". "+topping.get(i));
        }

        System.out.print("Masukan kopi yang mau dipilih : ");
        int pilihanTopping=keyboard.nextInt()-1;

        System.out.println("Pesanan Anda  adalah "+kopi.get(pilihanKopi)+" dengan topping "+topping.get(pilihanTopping));
    }
}
