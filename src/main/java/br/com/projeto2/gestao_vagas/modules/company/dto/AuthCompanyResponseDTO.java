package br.com.projeto2.gestao_vagas.modules.company.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthCompanyResponseDTO {
  
  private String access_token;
  private List<String> roles;
  private Long expires_in;
}
