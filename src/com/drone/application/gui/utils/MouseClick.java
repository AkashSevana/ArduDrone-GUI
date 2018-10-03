package com.drone.application.gui.utils;

import com.lynden.gmapsfx.javascript.event.GMapMouseEvent;
import com.lynden.gmapsfx.javascript.event.MouseEventHandler;

/**
 *
 * @author akash
 */
public class MouseClick implements MouseEventHandler {

    @Override
    public void handle(GMapMouseEvent gmme) {
        System.out.println(gmme.getLatLong());
    }
    
}
