package com.tms.controller;

import com.tms.entity.Operation;
import com.tms.service.CalculatorService;
import com.tms.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private OperationService operationService;

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping
    public String calculator(){
        return "calculator";
    }

    @PostMapping
    public String postCalculator(Operation operation, Model model){
        Operation operation1 = calculatorService.calculate(operation);
        model.addAttribute("operation", operation1);
        operationService.save(operation1);
        return "calculator";
    }
}
