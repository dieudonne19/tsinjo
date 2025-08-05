package com.dim.tsinjo.endpoint.rest.controller.tsinjo;

import com.dim.tsinjo.model.Help;
import com.dim.tsinjo.model.Payment;
import com.dim.tsinjo.repository.model.JDon;
import com.dim.tsinjo.service.DonService;
import com.dim.tsinjo.service.TsinjoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TsinjoController {
    private TsinjoService tsinjoService;
    private DonService donService;


    @GetMapping("/helps")
    public List<JDon> getDons() {
        return donService.getDons();
    }

    @PostMapping("/helps")
    public JDon createDon(@RequestBody JDon body) {
        return donService.createDon(body);
    }
}
