package com.tms.controller;

import com.tms.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistoryController {
    @Autowired
    private HistoryService historyService;

    @GetMapping("/history")
    public String getHistory(Model model){
        model.addAttribute("history", historyService.getHistory());
        return "history";
    }
}
