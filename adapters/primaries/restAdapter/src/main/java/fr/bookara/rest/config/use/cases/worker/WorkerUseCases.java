package fr.bookara.rest.config.use.cases.worker;

import fr.bookara.use.cases.worker.CreateWorkerUE;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkerUseCases {
    private CreateWorkerUE createWorkerUE;
}
