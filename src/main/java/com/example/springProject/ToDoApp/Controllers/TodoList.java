package com.example.springProject.ToDoApp.Controllers;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


@Repository
public class TodoList {
    private static List<Todo> todos = new ArrayList<>();
    private static int count = 0;


    static {
        todos.add(new Todo(++count, "Yashwanth", "Learn AWS Cloud", LocalDate.now().plusDays(4), false));
        todos.add(new Todo(++count, "Yashwanth", "Learn Azure", LocalDate.now().plusDays(10), false));
        todos.add(new Todo(++count, "Chennu", "Learn React and Node js", LocalDate.now().plusDays(20), false));
        todos.add(new Todo(++count, "Yashwanth", "Learn English", LocalDate.now().plusDays(5), false));

    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void addTask(String name, String task){
        todos.add(new Todo(++count, name, task, LocalDate.now().plusMonths(3), false));

    }

    public void addTaskByObject(Todo todo, String name){
        todo.setName(name);
        todos.add(todo) ;
    }

    public void deleteTaskById(int id){
        Predicate<? super Todo> predicate = todos -> todos.getId() == id;
        todos.removeIf(predicate);


    }

    public Todo getDetailsById(int id){
        Predicate<? super Todo> predicate = todos -> todos.getId() == id;
        return  todos.stream().filter(predicate).findFirst().get();


    }
    public List<Todo> getTodosByName(String name){
        System.out.println(todos);

        Predicate<Todo> predicate = input -> (input.getName().equalsIgnoreCase(name));

        List<Todo> a =  todos.stream().filter(predicate).toList();


        return a;
    }
}
