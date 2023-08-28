package com.example.week6.Service;

import com.example.week6.Api.ApiException;
import com.example.week6.Model.Todo;
import com.example.week6.Repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;
    public List<Todo> getAllTodo(){
        return todoRepository.findAll();

    }

    public void addTodo(Todo todo){
        todoRepository.save(todo);
    }

    public void todoUpdate(Integer id,Todo todo){
        Todo todo1=todoRepository.findTodoById(id);
        if (todo1==null){
            throw new ApiException("Id not Found");
        }
        todo1.setUser(todo.getUser());
        todo1.setTitle(todo.getTitle());
        todoRepository.save(todo1);
    }


    public void deleteTodo(Integer id){
        Todo todo1=todoRepository.findTodoById(id);
        if (todo1==null){
            throw new ApiException("Id not Found");
        }
        todoRepository.delete(todo1);
    }

}
