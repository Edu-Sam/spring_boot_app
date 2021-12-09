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
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
public class ToDoValidationErrorBuilder {
    
    public static ToDoValidationError fromBindingErrors(Errors errors){
        ToDoValidationError error=new ToDoValidationError("Validation failed. " + errors.getErrorCount()
        + "error(s)");
        for(ObjectError objectError: errors.getAllErrors()){
            error.addValidationError(objectError.getDefaultMessage());
        }
        
        return error;
    }
    
}
