package fr.bookara.rest.endpoints;

import com.bookIt.demo.model.UserAccount;
import com.bookIt.demo.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;


@Controller
@RequestMapping("/api/user/")
@CrossOrigin(origins = "http://localhost:4200")
public class UserAccountController {

    @Autowired
    public UserAccountService userAccountSvc;


    private Principal principal;

    @PostMapping("/{id}")
    public UserAccount update(@PathVariable int idUser, @RequestBody UserAccount userAccount) {
        String authenticatedUsername = principal.getName();



        if (idUser == userAccount.getId()) {
            return userAccountSvc.update(userAccount);
        }


    }
}
