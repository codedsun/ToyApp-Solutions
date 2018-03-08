package com.example.android.background.sync;

// TOO (1) Create a class called ReminderTasks

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

public class ReminderTasks{

    public static String ACTION_INCREMENT_WATER_COUNT = "ACTION_INCREMENT_WATER_COUNT";

    public static void incrementWaterCount(Context context){
        PreferenceUtilities.incrementWaterCount(context);
    }

    public static void executeTask(Context context, String action){
        if (action.equals(ACTION_INCREMENT_WATER_COUNT)){
            incrementWaterCount(context);
        }
    }

}
// TOD (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT

// TOD (6) Create a public static void method called executeTask
// TOO (7) Add a Context called context and String parameter called action to the parameter list

// TDO (8) If the action equals ACTION_INCREMENT_WATER_COUNT, call this class's incrementWaterCount

// ODO (3) Create a private static void method called incrementWaterCount
// TDO (4) Add a Context called context to the argument list
// TDO (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update the water count