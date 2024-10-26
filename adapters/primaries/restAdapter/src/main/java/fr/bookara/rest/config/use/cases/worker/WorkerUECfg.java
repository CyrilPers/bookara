package fr.bookara.rest.config.use.cases.worker;

import fr.bookara.authentification.AuthUtils;
import fr.bookara.ports.auth.IAuthentificationPT;
import fr.bookara.ports.worker.IWorkerRepositoryPT;
import fr.bookara.repositories.WorkerJpaRepository;
import fr.bookara.use.cases.worker.CreateWorkerUE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class WorkerUECfg {

    @Bean
    protected IWorkerRepositoryPT workerRepository() {return new WorkerJpaRepository();}

    @Bean
    protected IAuthentificationPT auth(){return new AuthUtils();}

    @Bean
    @DependsOn
    public CreateWorkerUE createWorkerUE(IWorkerRepositoryPT workerRepository, IAuthentificationPT auth) {
        return new CreateWorkerUE(workerRepository, auth);
    }

    @Bean
    @DependsOn(value = {"createWorkerUE"})
    public WorkerUseCases workerUseCases(CreateWorkerUE createWorkerUE) {
        WorkerUseCases useCases = WorkerUseCases.builder()
                .createWorkerUE(createWorkerUE)
                .build();
        return useCases;
    }

}
