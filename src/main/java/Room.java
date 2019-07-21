import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Room {
    Chair chair;
    public Room(){}

    public Room(Chair chair) {
        this.chair = chair;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Room obj = (Room) ctx.getBean("room");
        obj.chair.setMaterial("wood");
        System.out.println(obj.chair.getMaterial());
    }
}
