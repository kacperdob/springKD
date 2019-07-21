import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Computer {
    private HardDisc hardDisc;
    public Computer(){}

    public Computer(HardDisc hardDisc) {
        this.hardDisc = hardDisc;
    }

    public HardDisc getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(HardDisc hardDisc) {
        this.hardDisc = hardDisc;
    }

    public void getCapacity(){
        System.out.println(hardDisc.getCapacity());
    }




}
