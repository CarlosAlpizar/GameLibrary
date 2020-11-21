/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.utils;

import java.util.List;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Dario
 */
public class SpriteSheet {

    private final List<BufferedImage> sprites;

    public SpriteSheet(List<BufferedImage> sprites) {
        this.sprites = new ArrayList<>(sprites);
    }

    public int count() {
        return sprites.size();
    }

    public BufferedImage getSprite(int frame) {
        return sprites.get(frame);
    }

}
