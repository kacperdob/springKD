public class IntegerMaster {
    private int firstInteger;
    private int secondInteger;

    public IntegerMaster(int firstInteger, int secondInteger) {
        this.firstInteger = firstInteger;
        this.secondInteger = secondInteger;
    }

    public IntegerMaster() {
    }

    public int getFirstInteger() {
        return firstInteger;
    }

    public void setFirstInteger(int firstInteger) {
        this.firstInteger = firstInteger;
    }

    public int getSecondInteger() {
        return secondInteger;
    }

    public void setSecondInteger(int secondInteger) {
        this.secondInteger = secondInteger;
    }

    public void addInteger(int a, int b) {
        int c;
        c = a + b;
        System.out.printf("Wynik dodawania to: " + c);
    }

}
