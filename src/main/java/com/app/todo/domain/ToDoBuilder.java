/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.todo.domain;

/**
 *
 * @author LENOVO
 */
public class ToDoBuilder {
      private static ToDoBuilder instance=new ToDoBuilder();
      private String id=null;
      private String description = "";
      
      private ToDoBuilder(){
          
      }
      
      public static ToDoBuilder create(){
          return instance;
      }
      
      public ToDoBuilder withDescription(String description){
          this.description =description;
          return instance;
      }
      
      public ToDoBuilder withId(String id){
          this.id=id;
          return instance;
      }
      
      public ToDo build(){
          ToDo result=new ToDo(this.description);
          if(id != null){
          result.setId(id);
      }
          
        return result;  
      }
}
