package fr.bookara.rest.config.use.cases.customer;
import fr.bookara.use.cases.customer.CreateCustomerUE;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerUseCases {
    private CreateCustomerUE createCustomerUseCase;
}
