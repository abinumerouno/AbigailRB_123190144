package tugasopp1;

public class transversewave extends physic {
    float wavelenght;
    float totalwave;
    float time;

    @Override
    float getResult(){
        float getResult = (wavelenght/totalwave)/(time/totalwave);
        System.out.println("Cepat Rambat Gelombang "+getResult+" cm/s");
        return getResult;
    }

    @Override
    float getResult2() {
        return 0;
    }
}
