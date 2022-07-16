package com.example.demo.solid.single_response;

public class FileStore implements IStore {
    @Override
    public void save() {
        System.out.println("Saved to file");
    }
}
