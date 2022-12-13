package br.com.curso.udemy.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class CursoResource {
@GetMapping
  public String getOi(){
    return " Oi ";
  }

}
