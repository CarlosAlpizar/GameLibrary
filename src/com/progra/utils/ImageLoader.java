/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.utils;

import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author Dario
 */
public class ImageLoader {
    public  Image getImage(URL location){
        return Toolkit.getDefaultToolkit().getImage(location);
    }
}
