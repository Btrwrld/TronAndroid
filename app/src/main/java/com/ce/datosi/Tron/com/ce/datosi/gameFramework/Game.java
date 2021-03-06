package com.ce.datosi.Tron.com.ce.datosi.gameFramework;

/**
 * Created by erick on 9/28/2016.
 */

public interface Game {

    public Audio getAudio();

    public Input getInput();

    public FileIO getFileIO();

    public Graphics getGraphics();

    public void setScreen(Screen screen);

    public Screen getCurrentScreen();

    public Screen getInitScreen();
}
