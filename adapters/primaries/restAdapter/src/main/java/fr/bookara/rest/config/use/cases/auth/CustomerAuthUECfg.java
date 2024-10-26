package fr.bookara.rest.config.use.cases.auth;

import fr.bookara.ports.user.IUserRepositoryPT;
import fr.bookara.repositories.UserJpaRepository;
import fr.bookara.use.cases.authentification.LoginCustomerUE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;


@Configuration
public class CustomerAuthUECfg {

    @Bean
    public IUserRepositoryPT customerRepository() {return new UserJpaRepository();}

    @Bean
    @DependsOn
    public LoginCustomerUE customerAuthUE(IUserRepositoryPT logRepository) {
        return new LoginCustomerUE(logRepository);
    }

    @Bean
    @DependsOn(value = {"customerAuthUE"})
    public CustomerAuthUseCases customerAuthUseCases(LoginCustomerUE loginCustomerUE) {
        CustomerAuthUseCases useCases = CustomerAuthUseCases.builder()
                .loginCustomerUE(loginCustomerUE)
                .build();
        return useCases;

    }
}
