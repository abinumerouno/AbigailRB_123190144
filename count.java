package tugasopp1;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int select;
        name abi = new name();
        abi.setUsername("abinumerouno");
        System.out.print("\n 1. Transformator\n 2. Qalor\n 3. Gelombang Transversal ");
        System.out.print("\nMasukkan pilihan : ");
        select = input.nextInt();
        switch(select)
        {
            case 1 :
                System.out.println("Username : " + abi.getUsername());
                transforma Trnsfrmtr = new transforma();
                System.out.print("Tegangan Kumparan sekunder(Vs) : ");
                Trnsfrmtr.reelsecondary = input.nextFloat();
                System.out.print("Banyak lilitan primer(Np) : ");
                Trnsfrmtr.coilprimer = input.nextFloat();
                System.out.print("Banyak lilitan sekunder(Ns) : ");
                Trnsfrmtr.coilsecondary = input.nextFloat();
                System.out.print("Arus listrik sekunder(Is) : ");
                Trnsfrmtr.currentsecondary = input.nextFloat();
                Trnsfrmtr.getResult();
                Trnsfrmtr.getResult2();

            break;

            case 2 :
                System.out.println("Username : " + abi.getUsername());
                qalor Kalor = new qalor();
                System.out.print("massa(kg) : ");
                Kalor.massa = input.nextFloat();
                System.out.print("kalor jenis(j/kg) : ");
                Kalor.specificqalor = input.nextFloat();
                System.out.print("Suhu pertama(C) : ");
                Kalor.temprtr1 = input.nextFloat();
                System.out.print("Suhu kedua(C) : ");
                Kalor.temprtr2 = input.nextFloat();
                Kalor.getResult();

            break;

            case 3 :
                System.out.println("Username : " + abi.getUsername());
                transversewave glmbgtrsns = new transversewave();
                System.out.print("Panjang gelombang(cm) : ");
                glmbgtrsns.wavelenght = input.nextFloat();
                System.out.print("Jumlah gelombang(n) : ");
                glmbgtrsns.totalwave = input.nextFloat();
                System.out.print("waktu(s) : ");
                glmbgtrsns.time = input.nextFloat();
                glmbgtrsns.getResult();
            
            break;
            default :
                System.out.println("Menu tidak ada");
            break;
        }
    }
}
