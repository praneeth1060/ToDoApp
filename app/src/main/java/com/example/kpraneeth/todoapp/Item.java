package com.example.kpraneeth.todoapp;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by kpraneeth on 9/29/15.
 */
@Table(name = "Items")
public class Item extends Model {
    @Column(name = "Task")
    public String task;

    @Column(name = "Priority")
    public Integer priority;

    public Item(){
        super();
    }

    public Item(String task, Integer priority){
        super();
        this.task = task;
    }
}