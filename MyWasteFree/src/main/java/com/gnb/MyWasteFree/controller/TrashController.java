package com.gnb.MyWasteFree.controller;

import com.gnb.MyWasteFree.domain.Category;
import com.gnb.MyWasteFree.domain.Trash;
import com.gnb.MyWasteFree.repository.CategoryRepository;
import com.gnb.MyWasteFree.service.CategoryService;
import com.gnb.MyWasteFree.service.TrashService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class TrashController {

    private final TrashService trashService;
    private final CategoryService categoryService;

    @GetMapping("/myWaste/recycle/search")
    public String trashSearch(Model model, @RequestParam("keyword") String keyword){
        List<Trash> searchList = trashService.trashSearch(keyword);
        System.out.println(keyword);
        System.out.println(searchList.size());
        model.addAttribute("searchList",searchList);
        model.addAttribute("keyword",keyword);
        return "/trash/searchResults";
    }

    @GetMapping("/myWaste/recycle/search/{id}")
    public String trashDetail(Model model, @PathVariable Long id){
        // 해당 쓰레기의 id
        Optional<Category> category = categoryService.findById(id);
        model.addAttribute("category",category);

        return "/trash/searchResultDetail";
    }
}
