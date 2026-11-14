package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class fe4 {
    public static final /* synthetic */ fe4 a = new fe4();
    public static final int[] b;

    static {
        HashMap map = kxd.c;
        y9m.w(uqh.a(dg4.class), "androidx.camera.camera2.pipe.scalar.streamConfigurationMap");
        y9m.w(uqh.a(je4.class), "androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap");
        y9m.w(uqh.a(bc4.class), "androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap");
        b = new int[0];
    }

    public static boolean a(ge4 ge4Var) {
        ma4 ma4Var = (ma4) ge4Var;
        Float f = (Float) ma4Var.c(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f == null) {
            int[] iArr = (int[]) ma4Var.c(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr == null) {
                return false;
            }
            if (e82.t(1, iArr) < 0 && e82.t(2, iArr) < 0 && e82.t(4, iArr) < 0 && e82.t(3, iArr) < 0) {
                return false;
            }
        } else if (f.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public static boolean b(ge4 ge4Var) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ge4.Oo.getClass();
        int[] iArr = (int[]) ((ma4) ge4Var).c(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr == null) {
            iArr = b;
        }
        return e82.n(iArr, 2);
    }

    public static boolean c(ge4 ge4Var) {
        Integer num = (Integer) ((ma4) ge4Var).c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
