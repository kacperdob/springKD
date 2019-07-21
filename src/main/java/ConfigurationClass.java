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

    }
