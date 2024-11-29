package com.example.oop.demo04;

public class Student extends Person{
    // 不要重复name和age字段/方法,
    // 只需要定义新增score字段/方法:
    private int score;

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
