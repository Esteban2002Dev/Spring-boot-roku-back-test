package com.esteban.roku_back_test.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RestController;


@Controller
/**
 * * En caso de querer usarlo como api en lugar de monolito.
 * Asi ya no busca retornar un html sino un string o json.
 */
// @RestController
public class WelcomeController {

    @GetMapping
    // @PostMapping // Para que el metodo sea llamado con un post en lugar de un get
    // @ResponseBody
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/courses")
    @ResponseBody
    public List<String> courses(
        // @RequestParam(defaultValue = "ASC") String orderBy,
        @RequestParam(required = false) List<String> categories
    ) {
        return categories;
        // String message = "Listado de cursos";
        // if (orderBy != null) message += " ordenado por: " + orderBy;
        // if (category != null) message += " en la categoría: " + category;
        // return message;
    }

    // // @GetMapping("/courses/{courseName}/{categoryName}")
    // // Si queremos que la url tenga un param opcional, podemos usar el siguiente formato:
    // @GetMapping({"/courses/{courseName}/{categoryName}", "/courses/{courseName}"}) // las llaves indican que es un arreglo de strings, por lo que podemos poner varias rutas para el mismo metodo
    // @ResponseBody
    // public String showCourses(
    //     @PathVariable String courseName,
    //     @PathVariable(required = false) String categoryName
    // ) {
    //     if (categoryName == null) return "Curso: " + courseName + " - Categoría: No especificada";
    //     return "Curso: " + courseName + " - Categoría: " + categoryName;
    // }

    @GetMapping("/courses/{courseName}")
    @ResponseBody
    public String showCourses(
        @PathVariable String courseName
    ) {
        return "Curso: " + courseName;
    }
}
