package kg.peaksoft.peaksoftlmsab4.service;

import kg.peaksoft.peaksoftlmsab4.api.payload.OptionRequest;
import kg.peaksoft.peaksoftlmsab4.api.payload.QuestionRequest;
import kg.peaksoft.peaksoftlmsab4.api.payload.QuestionResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {

    QuestionResponse create(Long id,QuestionRequest questionRequest);
    QuestionResponse update(Long id,QuestionRequest questionRequest);
    QuestionResponse findById(Long id);
    QuestionResponse deleteById(Long id);
    List<QuestionResponse> findAll();
    QuestionResponse findByQuestionToTest(Long testId, Long questionId);
}
