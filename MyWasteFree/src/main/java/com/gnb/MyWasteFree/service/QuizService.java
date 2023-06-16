package com.gnb.MyWasteFree.service;

import com.gnb.MyWasteFree.domain.Quiz;
import com.gnb.MyWasteFree.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class QuizService {
    private final QuizRepository quizRepository;

    //퀴즈 리스트 가져오기
    public List findAllQuiz(){
        List<Quiz> quizList = quizRepository.findAll();
        return quizList;
    }

    //퀴즈 아이디로 찾기
    public Optional<Quiz> findById(Long id){
        Optional<Quiz> quiz = quizRepository.findById(id);
        return quiz;
    }
}
