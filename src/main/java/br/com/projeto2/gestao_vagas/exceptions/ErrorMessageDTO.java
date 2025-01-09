package br.com.projeto2.gestao_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessageDTO {
  
  private String message;  // Add appropriate fields
  private String errorCode;

  // If you're using Lombok's @AllArgsConstructor, this is already generated.
  // If not, manually add the constructor below:



public ErrorMessageDTO(String message, boolean isMessage) {
  if (isMessage) {
      this.message = message;
  } else {
      this.errorCode = message;
  }
}
}