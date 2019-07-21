import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleIntegerMaster {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IntegerMaster obj = (IntegerMaster) context.getBean("integerMaster");
        obj.setFirstInteger(300);
        obj.getFirstInteger();

        IntegerMaster obj2 = (IntegerMaster) context.getBean("integerMaster");
        obj2.addInteger(obj.getFirstInteger(), obj.getSecondInteger());
    }
}
