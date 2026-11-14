package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import defpackage.tgh;
import kotlin.Metadata;
import kotlin.text.c;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;", "Ltgh;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
/* loaded from: classes.dex */
public final class DisableAbortCapturesOnStopQuirk implements tgh {
    public static final boolean a;
    public static final boolean b;

    static {
        String str = Build.MANUFACTURER;
        a = (c.m(str, "Samsung", true) || c.m(Build.BRAND, "Samsung", true)) && "d2q".equalsIgnoreCase(Build.DEVICE);
        b = (c.m(str, "Poco", true) || c.m(Build.BRAND, "Poco", true)) && "M2102J20SG".equalsIgnoreCase(Build.MODEL);
    }
}
