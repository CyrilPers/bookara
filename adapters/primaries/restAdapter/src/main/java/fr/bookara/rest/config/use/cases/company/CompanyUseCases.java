package fr.bookara.rest.config.use.cases.company;

import fr.bookara.use.cases.company.CreateCompanyUE;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyUseCases {

    private CreateCompanyUE createCompanyUE;
}
