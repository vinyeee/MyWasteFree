package com.gnb.MyWasteFree.service;

import com.gnb.MyWasteFree.domain.Category;
import com.gnb.MyWasteFree.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public Optional<Category> findById(Long id){
        Optional<Category> category = categoryRepository.findById(id);
        return category;
    }



}
