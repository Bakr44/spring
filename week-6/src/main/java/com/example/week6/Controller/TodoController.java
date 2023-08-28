package com.example.week6.Controller;

import com.example.week6.Api.ApiResponse;
import com.example.week6.Model.Todo;
import com.example.week6.Service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/get")
    public ResponseEntity getAllTodo() {
        return ResponseEntity.status(200).body(todoService.getAllTodo());
    }

    @PostMapping("/add")
    public ResponseEntity addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
        return ResponseEntity.status(200).body(new ApiResponse("Added"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateTodo(@PathVariable("id") Integer id,
                                           @RequestBody Todo todo) {
        todoService.todoUpdate(id, todo);
        return ResponseEntity.status(200).body("Updated");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteTodo(@PathVariable("id") Integer id) {
        todoService.deleteTodo(id);
        return ResponseEntity.status(200).body("Deleted");
    }
}
