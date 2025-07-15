package com.devsimwave.section02.functionalinterface.api.predicate.dto;

public class Players {
    private String name;
    private String team;
    private String position;
    private int age;

    public Players(String name, String team, String position, int age) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                '}';
    }
}
