package com.gnb.MyWasteFree.controller;

import com.gnb.MyWasteFree.service.RecycleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class RecycleController {

    private final RecycleService recycleService;


}
