package com.agriono.controller;

import com.agriono.services.ResearcherServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Service
@RestController
@RequestMapping("/researcher")
public class ResearcherController {
    @Autowired
   private ResearcherServiceImpl researcherService;
}
