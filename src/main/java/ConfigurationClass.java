import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
    public class ConfigurationClass {

        @Bean
        public PersonBean personBean() {
            return new PersonBean();
        }
        @Bean
    public Room room(){
            return new Room(new Chair());
        }
        @Bean
    public Chair chair(){
            return new Chair();
        }
        @Bean
    public CRefreshEvent cRefreshEvent(){
            return new CRefreshEvent();
        }
    @Bean
    public CStartEventHandler cStartEventHandler(){
        return new CStartEventHandler();
    }
    // do zmiany
//    @Bean
//    public CStopEventHandler cStopEventHandler(){
//        return new CStopEventHandler();
//    }
    @Bean
    public CustomEventPublisher customEventPublisher(){
        return new CustomEventPublisher();
    }
//    // do zmiany
//    @Bean
//    public CustomEventHandler customEventHandler(){
//        return new CustomEventHandler();
//    }
}


