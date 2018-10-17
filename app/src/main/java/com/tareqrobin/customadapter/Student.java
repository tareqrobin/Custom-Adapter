package com.tareqrobin.customadapter;

public class Student {
    int image;
    String name;
    int sound;

    public Student(int image, String name, int sound) {
        this.image=image;
        this.name = name;
        this.sound = sound;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getSound() {
        return sound;
    }

}
