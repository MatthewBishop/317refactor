package com.jagex.runescape;
public class LocalPoint {

    private final int x;
    private final int y;

    public LocalPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSceneX() {
        return x >>> 7;
    }

    public int getSceneY() {
        return y >>> 7;
    }
}