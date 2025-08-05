package com.dim.tsinjo.endpoint.rest.controller.tsinjo;

import com.dim.tsinjo.model.Help;
import com.dim.tsinjo.model.Payment;
import com.dim.tsinjo.service.TsinjoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TsinjoController {
    private TsinjoService tsinjoService;


    @GetMapping("/helps")
    public List<Help> getHelps() {
        return tsinjoService.;
    }

    @PostMapping("/helps")
    public Help createHelp() {
        return new Object();
    }
}
