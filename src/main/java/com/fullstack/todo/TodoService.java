package com.fullstack.todo;
/* 5:47 PM 
created by: ajaypalsingh , 2018-11-24
Project: HelloBean 
*/

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {

    private static List<TodoPojo> todolist = new ArrayList<>();
    private static long idCounter;

    public TodoService(){}



    static{

        todolist.add(new TodoPojo(++idCounter, "username1", "description1", new Date(), false));
        todolist.add(new TodoPojo(++idCounter, "username2", "description2", new Date(), false));
        todolist.add(new TodoPojo(++idCounter, "username3", "description3", new Date(), false));

    }

    public List<TodoPojo> findall(String username) {

        return todolist;
    }


    public TodoPojo saveTodo(TodoPojo todo) {
        if(todo.getId() == -1) {
            todo.setId(++idCounter);
            todolist.add(todo);
        } else {
            deletetodo(todo.getId());
            todolist.add(todo);
        }
        return todo;
    }

    public TodoPojo deletetodo(long id) {

        TodoPojo todo = findbyId(id);
        if(todo==null) return null;

        if(todolist.remove(todo)) {
            return todo;
        }

        return null;

    }

    public TodoPojo findbyId(long id) {

        for(TodoPojo todo: todolist) {
            if(todo.getId() == id){
                return todo;
            }
        }
        return null;
    }
}
