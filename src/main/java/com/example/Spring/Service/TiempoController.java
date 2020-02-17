package com.example.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TiempoController
 */
@Controller
public class TiempoController {

    @Autowired
    private TiempoService ts;

    @GetMapping("/time")
    @ResponseBody
    public String tiempo() {
        return ts.getTime();
    }

}
