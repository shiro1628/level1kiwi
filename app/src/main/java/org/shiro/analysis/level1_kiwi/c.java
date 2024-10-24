package org.shiro.analysis.level1_kiwi;

import android.os.Build;

import java.io.File;

public class c {
    public static boolean a() {
        String[] v0 = System.getenv("PATH").split(":");
        int v1 = v0.length;
        int v3;
        for(v3 = 0; v3 < v1; ++v3) {
            if(new File(v0[v3], "su").exists()) {
                return true;
            }
        }

        return false;
    }

    public static boolean b() {
        String v0 = Build.TAGS;
        if(v0 != null && (v0.contains("test-keys"))) {
            return true;
        }

        return false;
    }

    public static boolean c() {
        String[] v0 = new String[]{"/data/data/eu.chainfire.supersu", "/system/xbin/daemonsu", "/system/etc/init.d/99SuperSUDaemon", "/system/bin/.ext/.su", "/system/etc/.has_su_daemon", "/system/etc/.installed_su_daemon", "/dev/com.koushikdutta.superuser.daemon/"};
        int v1 = v0.length;
        int v3;
        for(v3 = 0; v3 < v1; ++v3) {
            if(new File(v0[v3]).exists()) {
                return true;
            }
        }

        return false;
    }
}

