package com.example.timconverse.arrayadapterexpirement;

/**
 * Created by timconverse on 11/19/15.
 */
public class Weather {
    public int icon;
    public String title;

    public Weather(){
        super();
    }

    public Weather(int icon, String title) {
        super();
        this.icon = icon;
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }

    public String getTitle() {
        return this.title;
    }
}
