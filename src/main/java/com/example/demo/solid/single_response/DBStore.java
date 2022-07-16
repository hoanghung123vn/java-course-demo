package com.example.demo.solid.single_response;

public class DBStore implements IStore{
    @Override
    public void save() {
        System.out.println("Saved to database");
    }
}
