package com.example.bosonit55.Controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class logController {

    Logger logger = LoggerFactory.getLogger(logController.class);

    @RequestMapping("/")
    public String index(){
        //TODO imprimir por consola todos menos el error.
        logger.trace("Mensaje a nivel de TRACE");
        logger.debug("Mensaje a nivel de DEBUG");
        logger.info("Mensaje a nivel de INFO");
        logger.warn("Mensaje a nivel de WARNING");
        logger.error("Mensaje a nivel de ERROR");
        return "Hola! Mira los logs para ver los resultados";
    }

    @GetMapping("/ERROR")
    public void getError(){
        log.error("esto es un error");
    }

    @GetMapping("/WARNING")
    public void getWarining(){
        log.warn("esto es un warning");
    }
}
