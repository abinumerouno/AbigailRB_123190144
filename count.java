package tugasopp1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int select;
        name abi = new name();
        abi.setUsername("abinumerouno");
        boolean lanjutkanInput = true;
        do{
        System.out.print("\n 1. Transformator\n 2. Qalor\n 3. Gelombang Transversal ");
        System.out.print("\nMasukkan pilihan : ");
        select = input.nextInt();
        switch(select)
        {
            case 1 :
                //skenario pertama tidak terjadi exception sehingga "catch()" tidak akan dieksekusi 
                //sekanrio kedua terjadi exception pada method saat menginput dan input tidak sesuai tipe data maka akan mengarah ke "catch()" yang bersesuaian
                //dengan exception yang terjadi
                try {
                    System.out.println("Username : " + abi.getUsername());
                    transforma Trnsfrmtr = new transforma();
                    System.out.print("Tegangan Kumparan sekunder(Vs) : "); //input bisa saja salah seperti huruf dan pemakaian (,)
                    Trnsfrmtr.reelsecondary = input.nextFloat();
                    System.out.print("Banyak lilitan primer(Np) : ");
                    Trnsfrmtr.coilprimer = input.nextFloat();
                    System.out.print("Banyak lilitan sekunder(Ns) : ");
                    Trnsfrmtr.coilsecondary = input.nextFloat();
                    System.out.print("Arus listrik sekunder(Is) : ");
                    Trnsfrmtr.currentsecondary = input.nextFloat();
                    Trnsfrmtr.getResult();
                    Trnsfrmtr.getResult2();

                }
                catch(InputMismatchException ex){
                    System.out.println("Silahkan coba lagi. ("+"Input yang dimasukka tidak sesuai : "+ex.getMessage());
                    input.nextLine(); //Akan membuang input saat ini sehingga user dpt memasukkan input baru
                }
                
            break;

            case 2 :
                try {
                    System.out.println("Username : " + abi.getUsername());
                    qalor Kalor = new qalor();
                    System.out.print("massa(kg) : "); //input bisa saja salah seperti huruf dan pemakaian (,)
                    Kalor.massa = input.nextFloat();
                    System.out.print("kalor jenis(j/kg) : ");
                    Kalor.specificqalor = input.nextFloat();
                    System.out.print("Suhu pertama(C) : ");
                    Kalor.temprtr1 = input.nextFloat();
                    System.out.print("Suhu kedua(C) : ");
                    Kalor.temprtr2 = input.nextFloat();
                    Kalor.getResult();
                }
                catch (InputMismatchException ex){
                    System.out.println("Silahkan coba lagi. ("+"Input yang dimasukka tidak sesuai : "+ex.getMessage());
                    input.nextLine(); //Akan membuang input saat ini sehingga user dpt memasukkan input baru
                }

            break;

            case 3 :
                try{
                    System.out.println("Username : " + abi.getUsername());
                    transversewave glmbgtrsns = new transversewave();
                    System.out.print("Panjang gelombang(cm) : "); //input bisa saja salah seperti huruf dan pemakaian (,)
                    glmbgtrsns.wavelenght = input.nextFloat();
                    System.out.print("Jumlah gelombang(n) : ");
                    glmbgtrsns.totalwave = input.nextFloat();
                    System.out.print("waktu(s) : ");
                    glmbgtrsns.time = input.nextFloat();
                    glmbgtrsns.getResult();
                }
                catch(InputMismatchException ex){
                    System.out.println("Silahkan coba lagi. ("+"Input yang dimasukka tidak sesuai : "+ex.getMessage());
                    input.nextLine(); //Akan membuang input saat ini sehingga user dpt memasukkan input baru
                }
                
            break;
            default :
                System.out.println("Menu tidak ada");
            break;
        }
        }while(lanjutkanInput);
    }
}
