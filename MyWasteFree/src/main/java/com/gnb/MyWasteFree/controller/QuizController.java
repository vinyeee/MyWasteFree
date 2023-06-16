package com.gnb.MyWasteFree.controller;

import com.gnb.MyWasteFree.domain.Quiz;
import com.gnb.MyWasteFree.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;
    @GetMapping("/myWaste/recycle/quiz")
    public String recycleQuiz(Model model){
        List<Quiz> quizList = quizService.findAllQuiz();
        model.addAttribute("quizList",quizList);
        return "quiz/trash_quiz";
    }

    @GetMapping("myWaste/recycle/quiz/correct")
    public String correctQuizResult(Model model,@RequestParam(value = "quizId") Long id){
        Optional<Quiz> quiz = quizService.findById(id);
        model.addAttribute("quiz",quiz);
        return "quiz/correctPage";
    }

    @GetMapping("/myWaste/recycle/quiz/incorrect")
    public String incorrectQuizResult(Model model,@RequestParam(value = "quizId") Long id){
        Optional<Quiz> quiz = quizService.findById(id);
        model.addAttribute("quiz",quiz);
        return "quiz/incorrectPage";
    }


}
