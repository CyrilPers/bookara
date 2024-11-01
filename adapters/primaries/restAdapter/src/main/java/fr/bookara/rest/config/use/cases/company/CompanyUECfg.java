package fr.bookara.rest.config.use.cases.company;

import fr.bookara.ports.company.ICompanyRepositoryPT;
import fr.bookara.repositories.CompanyJpaRepository;
import fr.bookara.use.cases.company.CreateCompanyUE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class CompanyUECfg {

    @Bean
    protected ICompanyRepositoryPT companyRepository() {return new CompanyJpaRepository();}

    @Bean
    @DependsOn
    protected CreateCompanyUE createCompanyUE(ICompanyRepositoryPT repository) {
        return new CreateCompanyUE(repository);
    }

    @Bean
    @DependsOn(value = {"createCompanyUE"})
    public CompanyUseCases companyUseCases(CreateCompanyUE createCompanyUE) {
        CompanyUseCases useCases = CompanyUseCases.builder()
                .createCompanyUE(createCompanyUE)
                .build();
        return useCases;
    }
}
