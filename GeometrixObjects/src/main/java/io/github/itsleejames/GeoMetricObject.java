package io.github.itsleejames;

import java.awt.*;
import java.time.LocalDate;

public class GeoMetricObject {

    private Color color;
    private boolean filled = false;
    private final LocalDate dateCreated = LocalDate.now();

    public GeoMetricObject() {
        this.color = Color.RED;

    }
    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
