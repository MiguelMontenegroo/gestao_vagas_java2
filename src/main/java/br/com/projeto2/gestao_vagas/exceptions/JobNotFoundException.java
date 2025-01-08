package br.com.projeto2.gestao_vagas.exceptions;

public class JobNotFoundException extends RuntimeException {
  public JobNotFoundException() {
    super("Job not found");
  }
}
