package com.fullstack.todo;
/* 5:48 PM 
created by: ajaypalsingh , 2018-11-24
Project: HelloBean 
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TodoController {

    @Autowired
  private TodoService todoService;



    @GetMapping("/users/{username}/todos")
    public List<TodoPojo> findallTodo(@PathVariable String username) {

        return this.todoService.findall(username);

    }

    @GetMapping("/users/{username}/todos/{id}")
    public TodoPojo retreiveTodobyId(@PathVariable String username, @PathVariable long id) {

       return this.todoService.findbyId(id);
    }

    @PostMapping("/users/{username}/todos")
    public ResponseEntity<Void> updateTodo(@PathVariable String username, @RequestBody TodoPojo todoPojo) {

        TodoPojo createdTodo = todoService.saveTodo(todoPojo);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(createdTodo.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/users/{username}/todos/{id}")
    public ResponseEntity<TodoPojo> updateTodo(
            @PathVariable String username, @PathVariable long id, @RequestBody TodoPojo todo) {

        TodoPojo updatedtodo = this.todoService.saveTodo(todo);
        return new ResponseEntity<TodoPojo>(todo, HttpStatus.OK);
    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deletebyId(@PathVariable String username, @PathVariable long id) {

        TodoPojo todo = todoService.deletetodo(id);
        if(todo!=null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();

    }


}

