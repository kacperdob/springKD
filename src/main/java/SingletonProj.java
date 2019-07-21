public class SingletonProj {
    private int firstInteger;
    private int secondInteger;

    public SingletonProj(int firstInteger, int secondInteger) {
        this.firstInteger = firstInteger;
        this.secondInteger = secondInteger;
    }
    public SingletonProj(){

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
        System.out.println("Wynik dodawania (singleton) to: " + c);
    }
}
