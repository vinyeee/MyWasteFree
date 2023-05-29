package com.gnb.MyWasteFree.service;

import com.gnb.MyWasteFree.repository.RecycleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RecycleService {
    private final RecycleRepository recycleRepository;


}
