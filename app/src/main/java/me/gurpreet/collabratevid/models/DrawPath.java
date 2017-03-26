package me.gurpreet.collabratevid.models;

import io.realm.RealmList;
import io.realm.RealmObject;

public class DrawPath extends RealmObject {
    private boolean completed;
    private String color;
    private RealmList<DrawPoint> points;

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public RealmList<DrawPoint> getPoints() {
        return points;
    }

    public void setPoints(RealmList<DrawPoint> points) {
        this.points = points;
    }
}
