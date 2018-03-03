package com.notebook.idealabs.myspace.Utils;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Admin on 11-01-2018.
 */

public class bottomnavviewhelper {

    public static void setupbottomnavview(BottomNavigationViewEx bottomNavigationViewEx){
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
}
