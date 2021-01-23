package com.keylines.lib;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * Keyline data object containing a set of Keylines that can be passed via intent
 */
public class KeylinesData implements Serializable {
    ArrayList<Keyline> keylines = new ArrayList<>();

    public KeylinesData() {

    }

    /**
     * Add a Keyline to the set
     *
     * @param kl keyline to add
     */
    public void addKeyline(Keyline kl) {
        keylines.add(kl);
    }

    /**
     * Adds a Keyline to the set
     *
     * @param positionInDP Add a keyline by position (DP)
     */
    public void addKeyline(float positionInDP) {
        keylines.add(new Keyline(positionInDP));
    }

    /**
     * Add a keyline area to the set
     *
     * @param positionInDP x position of the area in DP
     * @param widthInDP    width of the area in DP
     */
    public void addKeylineArea(float positionInDP, float widthInDP) {
        keylines.add(new KeylineArea(positionInDP, widthInDP));
    }

    /**
     * Remove a keyline from the set
     *
     * @param kl the Keyline to remove
     */
    public void removeKeyline(Keyline kl) {
        keylines.remove(kl);
    }

    /**
     * Get a Keyline by index
     *
     * @param index the Keyline to retrieve from the set
     * @return Keyline
     */
    public Keyline getKeyline(int index) {
        return keylines.get(index);
    }

    /**
     * @return the set of Keylines
     */
    public ArrayList<Keyline> getKeylines() {
        return keylines;
    }

    /**
     * Describes a keyline (position)
     */
    public static class Keyline implements Serializable {
        private float positionInDP;

        public Keyline(float positionInDP) {
            this.positionInDP = positionInDP;
        }

        public float getPosition() {
            return positionInDP;
        }
    }

    /**
     * Describes a keyline area (position + width)
     */
    public static class KeylineArea extends Keyline {
        private float widthInDP;

        public KeylineArea(float positionInDP, float widthInDP) {
            super(positionInDP);
            this.widthInDP = widthInDP;
        }

        public float getWidth() {
            return widthInDP;
        }
    }
}
