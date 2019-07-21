import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomEventTest {

        public static void main(String main[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        CustomEventPublisher customEventPublisher = context.getBean(CustomEventPublisher.class);
        customEventPublisher.publish();

    }
}
