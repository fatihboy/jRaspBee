/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
package com.enterprisecoding.jraspbee;

public class State {
    private boolean on;
    private int bri;
    private int hue;
    private int sat;
    private float[] xy;
    private int ct;
    private String alert;
    private String effect;
    private String colormode;
    private boolean reachable;

    State() {
    }

    /**
     * Color modes of a light.
     */
    public enum ColorMode {
        /**
         * CIE color space coordinates
         */
        XY,

        /**
         * Hue and saturation
         */
        HS,

        /**
         * Color temperature in mirek
         */
        CT;
    }

    /**
     * Alert modes of a light.
     */
    public enum AlertMode {
        /**
         * Light is not performing alert effect
         */
        NONE,

        /**
         * Light is performing one breathe cycle
         */
        SELECT,

        /**
         * Light is performing breathe cycles for 30 seconds (unless cancelled)
         */
        LSELECT
    }

    /**
     * Effects possible for a light.
     */
    public enum Effect {
        /**
         * No effect
         */
        NONE,

        /**
         * Cycle through all hues with current saturation and brightness
         */
        COLORLOOP
    }

    /**
     * Returns the on state.
     *
     * @return true if the light is on, false if it isn't
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Returns the brightness.
     *
     * @return brightness
     */
    public int getBrightness() {
        return bri;
    }

    /**
     * Returns the hue.
     *
     * @return hue
     */
    public int getHue() {
        return hue;
    }

    /**
     * Returns the saturation.
     *
     * @return saturation
     */
    public int getSaturation() {
        return sat;
    }

    /**
     * Returns the coordinates in CIE color space.
     *
     * @return cie color spaces coordinates
     */
    public float[] getXY() {
        return xy;
    }

    /**
     * Returns the color temperature.
     *
     * @return color temperature
     */
    public int getColorTemperature() {
        return ct;
    }

    /**
     * Returns the last alert mode set.
     * Future firmware updates may change this to actually report the current alert mode.
     *
     * @return last alert mode
     */
    public AlertMode getAlertMode() {
        return AlertMode.valueOf(alert.toUpperCase());
    }

    /**
     * Returns the current color mode.
     *
     * @return current color mode
     */
    public ColorMode getColorMode() {
        return ColorMode.valueOf(colormode.toUpperCase());
    }

    /**
     * Returns the current active effect.
     *
     * @return current active effect
     */
    public Effect getEffect() {
        return Effect.valueOf(effect.toUpperCase());
    }

    /**
     * Returns reachability.
     *
     * @return true if reachable, false if it isn't
     */
    public boolean isReachable() {
        return reachable;
    }
}