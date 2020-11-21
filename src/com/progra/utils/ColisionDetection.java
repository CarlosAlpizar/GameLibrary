package com.progra.utils;

import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;

/**
 *
 * @author Carlos Alpizar <carlosalpizarg@hotmail.com>
 */
public class ColisionDetection {

    private Rectangle imagen1Bounds;
    private Rectangle imagen2Bounds;
    private Rectangle colision;

    /**
     * @return the imagen1Bounds
     */
    public Rectangle getImagen1Bounds() {
        return imagen1Bounds;
    }

    /**
     * @param imagen1Bounds the imagen1Bounds to set
     */
    public void setImagen1Bounds(Rectangle imagen1Bounds) {
        this.imagen1Bounds = imagen1Bounds;
    }

    /**
     * @return the imagen2Bounds
     */
    public Rectangle getImagen2Bounds() {
        return imagen2Bounds;
    }

    /**
     * @param imagen2Bounds the imagen2Bounds to set
     */
    public void setImagen2Bounds(Rectangle imagen2Bounds) {
        this.imagen2Bounds = imagen2Bounds;
    }

    public Rectangle crearRectangle(BufferedImage image, int x, int y) {

        return new Rectangle(x, y, image.getWidth(), image.getHeight());
    }

    public Rectangle detecCollision() {
        colision = null;
        if (imagen1Bounds.intersects(imagen2Bounds)) {
            colision = getCollision(imagen1Bounds, imagen2Bounds);
            if (!colision.isEmpty()) {
                return colision;
            }
        }
        return null;
    }

    private Rectangle getCollision(Rectangle imagen1Bounds, Rectangle imagen2Bounds) {

        Area a1 = new Area(imagen1Bounds);
        Area a2 = new Area(imagen2Bounds);
        a1.intersect(a2);
        return a1.getBounds();
    }

}
