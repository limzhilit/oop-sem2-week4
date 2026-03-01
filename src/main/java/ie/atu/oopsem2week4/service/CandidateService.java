package ie.atu.oopsem2week4.service;

import ie.atu.oopsem2week4.model.Candidate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidateService {
  private final List<Candidate> candidates = new ArrayList<>();
  private long nextId = 1;

  public Candidate addCandidate(Candidate candidate) {
    candidate.setId(nextId++);
    candidates.add(candidate);
    return candidate;
  }

  public List<Candidate> getAllCandidates () {
    return candidates;
  }
}