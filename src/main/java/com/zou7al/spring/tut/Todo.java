package com.zou7al.spring.tut;

public class Todo {

		private int id;
		private String title;
		private String description;
		
	
		public Todo() {
			
		}
		public Todo(int id, String title, String description) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			
		}
		public int getId() {
			return id;
		}
		public String getTitle() {
			return title;
		}
		public String getDescription() {
			return description;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		
		
}
