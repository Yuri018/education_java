package main;

import main.model.ToDo;
import main.model.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DefaultController {
    @Autowired
    private ToDoRepository toDoRepository;
//    @RequestMapping("/index")
//    public String index() {
//        return (new Date()) + " - дата-время и случайное число - " +
//                Math.random();
//    }
    @RequestMapping("/")
    public String index(Model model) {
        Iterable<ToDo> toDoIterable = toDoRepository.findAll();
        ArrayList<ToDo> toDosList = new ArrayList<>();
        for (ToDo toDo : toDoIterable) {
            toDosList.add(toDo);
        }
        model.addAttribute("toDosList", toDosList)
                .addAttribute("toDosCount", toDosList.size());
        return "index";
    }
}
