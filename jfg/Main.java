package convert;

import java.util.Scanner;

import Prime.Pri;

public class Main {

    public static void main(String[] args) {

        Pri priObj=new Pri(1);
        Scanner sc=new Scanner(System.in);

        Sup.menu();
        int k=sc.nextInt();

        if(k==1) Sup.incryption();
        else if(k==2) Sup.decryption();
        else System.out.println("invalid input");     

    }

}
