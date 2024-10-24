package org.shiro.analysis.level1_kiwi;

import android.content.Context;

public class s {
    public static boolean a(Context arg0) {
        if((arg0.getApplicationContext().getApplicationInfo().flags & 2) != 0) {

            return true;
        }

        return false;
    }
}