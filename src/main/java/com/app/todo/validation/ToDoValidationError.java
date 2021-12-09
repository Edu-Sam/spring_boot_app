/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.todo.validation;

/**
 *
 * @author LENOVO
 */
 import com.fasterxml.jackson.annotation.JsonInclude;
 import java.util.ArrayList;
 import java.util.List;

public class ToDoValidationError {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> errors=new ArrayList<>(); 
    
    private final String errorMessage;
    
    public ToDoValidationError(String errorMessage){
        this.errorMessage =errorMessage;
    }
    
    public void addValidationError(String error){
        errors.add(error);
    }
    
    public List<String> getErrors(){
        return errors;
    }
    
    public String getErrorMessage(){
        return errorMessage;
    }
}
