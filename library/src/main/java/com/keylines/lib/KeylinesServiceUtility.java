package com.keylines.lib;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/**
 * Utility class to send messages to the Keylines app
 */
public class KeylinesServiceUtility {
    private static final String ACTION_UPDATE_KEYLINES = "com.keylines.lib.action.UPDATE_KEYLINES";
    private static final String DATA_KEYLINES = "data_keylines";

    /**
     * Send a message to the Keylines service to update the keylines shown. This will start the service
     * if it is not already running
     *
     * @param data a {@link KeylinesData} object containing the desired keylines
     */
    public static Intent updateKeylines(KeylinesData data) {
        Intent newIntent = new Intent();
        newIntent.setComponent(new ComponentName("com.keylines.app", "com.keylines.app.KeylinesBroadcastReceiver"));
        newIntent.putExtra(DATA_KEYLINES, data);
        newIntent.setAction(ACTION_UPDATE_KEYLINES);

        return newIntent;
    }
}
