package fr.bookara.ports.user;

import fr.bookara.domain.UserDN;

import java.net.UnknownHostException;
import java.sql.SQLException;

public interface IUserRepositoryPT {

    UserDN findByEmail(String email) throws UnknownHostException, SQLException;
}
