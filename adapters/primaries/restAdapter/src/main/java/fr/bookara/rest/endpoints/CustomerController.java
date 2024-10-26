package fr.bookara.rest.endpoints;

import com.bookIt.demo.dto.AuthRequestDTO;
import com.bookIt.demo.dto.CustomerAuthResponseDTO;
import com.bookIt.demo.service.AuthentificationCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

    @Autowired
    private AuthentificationCustomerService authCustomerService;

    @PostMapping("/login")
    public CustomerAuthResponseDTO login(@RequestBody AuthRequestDTO authRequest){
        return authCustomerService.login(authRequest);
    }
}
