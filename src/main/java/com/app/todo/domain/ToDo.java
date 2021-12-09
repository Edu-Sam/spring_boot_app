/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.todo.domain;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ToDo {
    
    @NotNull
    private String id;
    @NotNull
    @NotBlank
    private String description;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean completed;
    
    public ToDo(){
        LocalDateTime date=LocalDateTime.now();
        this.id=UUID.randomUUID().toString();
        this.created=date;
        this.modified=date;
        
        }
    
    public ToDo(String description){
        this();
        this.description=description;
    }
}
