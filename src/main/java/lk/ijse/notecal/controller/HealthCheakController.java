package lk.ijse.notecal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/health")
public class HealthCheakController {
    @GetMapping
    public String healthCheak(){
        return "note calculator is working";
    }
}
