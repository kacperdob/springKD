public class Engine {
    int power;
    String paliwo;
    public Engine(){}

    public Engine(int power, String paliwo) {
        this.power = power;
        this.paliwo = paliwo;
    }

    public String getPaliwo() {
        return paliwo;
    }

    public void setPaliwo(String paliwo) {
        this.paliwo = paliwo;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
