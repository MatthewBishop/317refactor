package com.jagex.runescape;

import java.awt.Color;
import java.awt.Polygon;

import com.jagex.runescape.collection.Cacheable;

public class Animable extends Cacheable {
    public VertexNormal[] vertexNormals;
    public int modelHeight;

    Animable() {
        this.modelHeight = 1000;
    }

    Model getRotatedModel() {
        return null;
    }

    public void renderAtPoint(final int i, final int j, final int k, final int l, final int i1, final int j1, final int z, final int y, final int uid) {
        final Model model = this.getRotatedModel();
        if (model != null) {
            this.modelHeight = model.modelHeight;
            model.renderAtPoint(i, j, k, l, i1, j1, z, y, uid);
        }
        if (this instanceof NPC) {
        	NPC npc = (NPC) this;
        	Polygon poly = npc.getCanvasTilePoly(npc.boundaryDimension);
        	if (poly != null) {
        		DrawingArea.renderPolygon(poly, Color.cyan);
        	}
        }
        	
    }
}