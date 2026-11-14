package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import defpackage.tgh;
import kotlin.Metadata;
import kotlin.text.c;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/PreviewUnderExposureQuirk;", "Ltgh;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
/* loaded from: classes.dex */
public final class PreviewUnderExposureQuirk implements tgh {
    public static final PreviewUnderExposureQuirk a = new PreviewUnderExposureQuirk();
    public static final boolean b = c.m(Build.BRAND, "TCL", true);
}
