package androidx.camera.camera2.compat.quirk;

import android.util.Range;
import android.util.Size;
import defpackage.htk;
import defpackage.nb6;
import defpackage.tgh;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "Ltgh;", "nb6", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExtraCroppingQuirk implements tgh {
    public static final LinkedHashMap a = rbd.d(new Pair[]{new Pair("SM-T580", (Object) null), new Pair("SM-J710MN", new Range(21, 26)), new Pair("SM-A320FL", (Object) null), new Pair("SM-G570M", (Object) null), new Pair("SM-G610F", (Object) null), new Pair("SM-G610M", new Range(21, 26))});

    public static Size e(htk htkVar) {
        if (!nb6.G()) {
            return null;
        }
        int iOrdinal = htkVar.ordinal();
        if (iOrdinal == 0) {
            return new Size(1920, 1080);
        }
        if (iOrdinal == 1) {
            return new Size(1280, 720);
        }
        if (iOrdinal == 2) {
            return new Size(3264, 1836);
        }
        return null;
    }
}
