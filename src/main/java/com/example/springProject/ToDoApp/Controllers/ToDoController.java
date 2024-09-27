package com.example.springProject.ToDoApp.Controllers;
import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@SessionAttributes(names = "name")
@Controller
public class ToDoController {
    public TodoList todolist;

    public ToDoController(TodoList todolist) {
        this.todolist = todolist;
    }

    @RequestMapping("todo-html")
    public String getTodo(ModelMap map){
        map.put("name", GetLoggedInUser());


    List<Todo> a = todolist.getTodosByName(GetLoggedInUser());



    map.addAttribute("todosList", a);
        return "todoHTML";
    }



    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String addTodo(ModelMap map){
        Todo todo = new Todo(0,(String)map.get("name"), "",LocalDate.now().plusYears(1), false );
        map.put("todo", todo);

        return "addTodo";

    }


    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String redirectToDOList(ModelMap map, @Valid Todo todo, BindingResult result){
        if(result.hasErrors())  return "addTodo";



        todolist.addTask(GetLoggedInUser(), todo.getTask());

        return "redirect:todo-html";

    }





    @RequestMapping("delete-todo")
    public String deleteTask(@RequestParam int id){
        todolist.deleteTaskById(id);
        return "redirect:todo-html";


    }

    @RequestMapping(value = "update-todo", method = RequestMethod.GET)
//    @ResponseBody
    public String updateTask(ModelMap map, @RequestParam int id){
        Todo todo = todolist.getDetailsById(id);
        map.put("todo",todo);
        return "updateTodo";

    }

    @RequestMapping(value = "update-todo",  method = RequestMethod.POST)

    public String updateTask(ModelMap map, @Valid Todo todo){
            todolist.deleteTaskById(todo.getId());
            todolist.addTaskByObject(todo, GetLoggedInUser());



            return "redirect:todo-html";
    }


    public String GetLoggedInUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();


    }



}
