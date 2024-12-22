package br.com.projeto2.gestao_vagas.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;


public class UserFoundException extends RuntimeException {
  public UserFoundException() {
    super("Usuário já existe");
  }
}
