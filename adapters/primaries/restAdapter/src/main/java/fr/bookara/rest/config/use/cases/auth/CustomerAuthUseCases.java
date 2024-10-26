package fr.bookara.rest.config.use.cases.auth;
import fr.bookara.use.cases.authentification.LoginCustomerUE;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerAuthUseCases {

    private LoginCustomerUE loginCustomerUE;

}
