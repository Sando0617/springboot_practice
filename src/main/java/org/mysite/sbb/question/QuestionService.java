package org.mysite.sbb.question;

import java.util.Optional;

import org.mysite.sbb.DataNotFoundException;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {

	private final QuestionRepository questionRepository;

	public Question getQuestion(Integer id) {
		Optional<Question> question = this.questionRepository.findById(id);
		if (question.isPresent()) {
			return question.get();
		} else {
			throw new DataNotFoundException("question not found");
		}
	}
}
