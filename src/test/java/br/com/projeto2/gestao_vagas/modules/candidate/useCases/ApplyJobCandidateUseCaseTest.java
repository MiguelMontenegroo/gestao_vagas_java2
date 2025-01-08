package br.com.projeto2.gestao_vagas.modules.candidate.useCases;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.projeto2.gestao_vagas.exceptions.UserNotFoundException;
import br.com.projeto2.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.projeto2.gestao_vagas.modules.company.repositories.JobRepository;

import org.assertj.core.api.Assertions;

@ExtendWith(MockitoExtension.class)
public class ApplyJobCandidateUseCaseTest {
  
  @InjectMocks
  private ApplyJobCandidateUseCase applyJobCandidateUseCase;

  @Mock
  private CandidateRepository candidateRepository;

  @Mock
  private JobRepository jobRepository;

  @Test
  @DisplayName("Should not be able to apply job with candidate not found")
  public void should_not_be_able_to_apply_job_with_candidate_not_found() {
    try{
      applyJobCandidateUseCase.execute(null, null);
    }catch(Exception e) {
      Assertions.assertThat(e).isInstanceOf(UserNotFoundException.class);
    }  
  
  }
}
