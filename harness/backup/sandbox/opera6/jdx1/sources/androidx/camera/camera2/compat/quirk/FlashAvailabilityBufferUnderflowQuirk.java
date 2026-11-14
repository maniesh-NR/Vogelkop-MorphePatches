package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import defpackage.h79;
import defpackage.tgh;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;", "Ltgh;", "h79", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
/* loaded from: classes.dex */
public final class FlashAvailabilityBufferUnderflowQuirk implements tgh {
    public static final Set a;

    static {
        Locale locale = Locale.US;
        a = e82.E(new h79[]{new h79("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)), new h79("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale))});
    }
}
