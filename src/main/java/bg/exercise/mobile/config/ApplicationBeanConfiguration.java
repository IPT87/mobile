package bg.exercise.mobile.config;

import bg.exercise.mobile.domain.dto.LoggedUser;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class ApplicationBeanConfiguration {

    @Bean
    public ModelMapper createModelMapper() {
        return new ModelMapper();
    }

    @Bean
    @SessionScope
    public LoggedUser loggedUser() {
        return new LoggedUser();
    }

}
