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

        SingletonProj obj3 = (SingletonProj) context.getBean("singletonProj");
        obj3.setFirstInteger(30);
        obj3.setSecondInteger(43);

        obj3.addInteger(obj3.getFirstInteger(), obj3.getSecondInteger());
    }
}
