package com.infernal93.singletontemplate;

import android.util.Log;

/**
 * Created by Armen Mkhitaryan on 27.10.2019.
 */
public class GameConfig {
    private static final String TAG = "GameConfig";
    private static GameConfig instance = null;
    private int latency = 1000;
    private int waitingGamers = 0;
    private int heroesPull = 100;
    private String title = "";

    private GameConfig() {
        // Empty constructor
    }

    public static GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }

    public void printConfig() {
        Log.e(TAG, "=============== START CONFIG ===============");
        Log.e(TAG, "current latency " + this.latency);
        Log.e(TAG, "current players waiting " + this.waitingGamers);
        Log.e(TAG, "current heroes pull " + this.heroesPull);
        Log.e(TAG, "current game title " + this.title);
        Log.e(TAG, "=============== END CONFIG ===============");
    }

    public static void setInstance(GameConfig instance) {
        GameConfig.instance = instance;
    }

    public void addWaitingGamers() {
        this.waitingGamers += 1;
        Log.e(TAG, "gamer added");
        Log.e(TAG, "current players waiting " + this.waitingGamers);
    }

    public int getLatency() {
        return latency;
    }

    public void setLatency(int latency) {
        this.latency = latency;
    }

    public int getWaitingGamers() {
        return waitingGamers;
    }

    public void setWaitingGamers(int waitingGamers) {
        this.waitingGamers = waitingGamers;
    }

    public int getHeroesPull() {
        return heroesPull;
    }

    public void setHeroesPull(int heroesPull) {
        this.heroesPull = heroesPull;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
