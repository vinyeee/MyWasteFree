package com.gnb.MyWasteFree.controller;

import com.gnb.MyWasteFree.domain.Trash;
import com.gnb.MyWasteFree.service.TrashService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class TrashController {

    private final TrashService trashService;
    @GetMapping("/myWaste/recycle/search")
    public String trashSearch(Model model, @RequestParam("keyword") String keyword){
        List<Trash> searchList = trashService.trashSearch(keyword);
        System.out.println(keyword);
        System.out.println(searchList.size());
        model.addAttribute("searchList",searchList);
        return "/trash/searchResults";
    }
}
