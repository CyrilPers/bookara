package fr.bookara.ports.auth;

public interface IAuthentificationPT {
    String encode(String rawPassword);
}
