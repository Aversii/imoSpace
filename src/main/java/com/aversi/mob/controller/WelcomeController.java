package com.aversi.mob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "<!DOCTYPE html>" +
               "<html>" +
               "<head>" +
               "    <meta charset=\"UTF-8\">" +
               "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
               "    <title>Bem-vindo</title>" +
               "    <style>" +
               "        body {" +
               "            font-family: Arial, sans-serif;" +
               "            background-color: #212121;" +
               "            text-align: center;" +
               "            padding: 50px;" +
               "        }" +
               "        h1 {" +
               "            color: #bbb;" +
               "        }" +
               "        p {" +
               "            color: #bbb;" +
               "        }" +
               "    </style>" +
               "</head>" +
               "<body>" +
               "    <h1>Bem-vindo à ImoSpace API</h1>" +
               "    <p>Estamos felizes em ter você aqui!</p>" +
               "</body>" +
               "</html>";
    }
}
