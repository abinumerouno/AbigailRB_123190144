package tugasopp1;

public class qalor extends physic {

    float massa;
    float specificqalor;
    float temprtr1;
    float temprtr2;

    @Override
    float getResult(){
        float getResult = massa*specificqalor*(temprtr2-temprtr1);
        System.out.println("Jumlah Kalor yang dibutuhkan(Q) : "+getResult+" joule");
        return getResult;
    }


    @Override
    float getResult2() {
        return 0;
    }
}
