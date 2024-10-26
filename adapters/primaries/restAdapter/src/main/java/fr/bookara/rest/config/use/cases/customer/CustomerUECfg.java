package fr.bookara.rest.config.use.cases.customer;

import fr.bookara.authentification.AuthUtils;
import fr.bookara.ports.auth.IAuthentificationPT;
import fr.bookara.ports.customer.ICustomerRepositoryPT;
import fr.bookara.repositories.CustomerJpaRepository;
import fr.bookara.use.cases.customer.CreateCustomerUE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;


@Configuration
public class CustomerUECfg {

    @Bean
    protected ICustomerRepositoryPT customerRepository()  {return new CustomerJpaRepository();}

    @Bean
    protected IAuthentificationPT auth(){return new AuthUtils();}

    @Bean
    @DependsOn
    public CreateCustomerUE createCustomerUE(ICustomerRepositoryPT repository, IAuthentificationPT auth) {
        return new CreateCustomerUE(repository, auth);
    }

    @Bean
    @DependsOn(value = {"createCustomerUE"})
    public CustomerUseCases customerUseCases(CreateCustomerUE createCustomerUE) {
        CustomerUseCases useCases = CustomerUseCases.builder()
                .createCustomerUseCase(createCustomerUE)
                .build();
        return useCases;

    }
}
