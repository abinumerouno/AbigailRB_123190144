package tugasopp1;

public class transforma extends physic {

    float reelsecondary;
    float coilprimer;
    float coilsecondary;
    float currentsecondary;


    @Override
    float getResult(){
        float getResult = (coilprimer*reelsecondary)/coilsecondary; 
        System.out.println("Hasil Kumparan Primer(Vp) : "+getResult+" lilitan");
        return getResult;
    }

    @Override
    float getResult2(){
        float getResult2 = currentsecondary/(coilprimer*coilsecondary);
        System.out.println("Hasil Arus Primer(Ip) : "+getResult2+" Ampere");
        return getResult2;
    }
}
