package com.ce.datosi.Tron.com.ce.datosi.gameFramework;

import com.ce.datosi.Tron.com.ce.datosi.gameFramework.Graphics.ImageFormat;
/**
 * Created by erick on 9/28/2016.
 */


public interface Image {
    public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}