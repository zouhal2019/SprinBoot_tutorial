package com.zou7al.spring.tut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

@Service
public class TodoService {
	private List<Todo> data= new ArrayList<>(Arrays.asList(
	        new Todo(1,"First Todo", "This the first output"),
			new Todo(2,"Second Todo", "This the 2 output"),
			new Todo(3,"Third Todo", "This the 3 output"),
			new Todo(4,"Fourth Todo", "This the 4 output"),
			new Todo(5,"Fifth Todo", "This the 5 foutput")));

	public List<Todo> findAll() {
		return data;
	}

	public Todo getById(int id) {
		for(Todo todo: data) 
			if(todo.getId()==id ) return todo;
		    return null;
		
	}

	
	public boolean save(Todo todo) {
		return data.add(todo);
		
	}
	
	
	public void delete(int id) {
		for(Todo todo: data) {
			if(todo.getId()== id) {
				data.remove(todo);
			}
		}
		
	}
}
