package com.gnb.MyWasteFree.service;

import com.gnb.MyWasteFree.domain.Category;
import com.gnb.MyWasteFree.domain.Trash;
import com.gnb.MyWasteFree.repository.TrashRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TrashService {
    private final TrashRepository trashRepository;

    // 쓰레기 이름으로 찾기
    public List<Trash> trashSearch(String trashName){
        List<Trash> trashList = trashRepository.findByName(trashName);
        return trashList;
    }



}
