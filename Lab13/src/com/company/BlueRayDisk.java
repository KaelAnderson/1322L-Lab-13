package com.company;

public class BlueRayDisk {
    public String title;
    public String director;
    public int YOR;
    public double cost;
    BlueRayDisk(String inputTitle, String inputDirector, int inputYOR, double inputCost){
        title = inputTitle;
        director = inputDirector;
        YOR = inputYOR;
        cost = inputCost;
    }

    @Override
    public String toString() {
        return ("$" + cost + " " + YOR + " " + title + ", " + director);
    }
}
