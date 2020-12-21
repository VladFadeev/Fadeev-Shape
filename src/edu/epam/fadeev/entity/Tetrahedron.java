package edu.epam.fadeev.entity;

import java.util.Collections;
import java.util.List;

public class Tetrahedron extends AbstractShape {
    private int tetrahedronId;
    private List<Point> points;

    public Tetrahedron(Point... points) {
        Collections.addAll(this.points, points);
    }

    public Tetrahedron(int... coordinate) {
        for (int i = 0; i < coordinate.length; i += 3) {
            points.add(new Point(coordinate[i], coordinate[i + 1], coordinate[i + 2]));
        }
    }

    public Point getPointByIndex(int index) {
        return points.get(index);
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void setPointById(int index, Point point) {
        points.remove(index);
        points.add(index, point);
    }

    public int getTetrahedronId() {
        return tetrahedronId;
    }

    public void setTetrahedronId(int tetrahedronId) {
        this.tetrahedronId = tetrahedronId;
    }
}
