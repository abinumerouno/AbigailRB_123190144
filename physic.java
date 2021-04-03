package tugasopp1;

public abstract class physic {
    String phase;

    void setLines(String phase)
    {
        this.phase = phase;
    }    

    String getLines()
    {
        return this.phase;
    }

    abstract float getResult();
    abstract float getResult2();
}
