package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.tgh;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class CameraUseInconsistentTimebaseQuirk implements tgh {
    public static final HashSet a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));
    public static final HashSet b = new HashSet(Arrays.asList("sm4350", "sm6375", "sm7325"));
    public static final HashSet c = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 31) {
            if (b.contains(t14.b().toLowerCase())) {
                return true;
            }
        }
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND)) {
            if (a.contains(Build.HARDWARE.toLowerCase())) {
                return true;
            }
        }
        return c.contains(Build.MODEL.toLowerCase());
    }
}
