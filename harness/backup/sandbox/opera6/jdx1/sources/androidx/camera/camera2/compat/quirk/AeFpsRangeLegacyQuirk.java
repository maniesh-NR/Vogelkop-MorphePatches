package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import defpackage.ge4;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;", "Landroidx/camera/core/internal/compat/quirk/AeFpsRangeQuirk;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
/* loaded from: classes.dex */
public final class AeFpsRangeLegacyQuirk implements AeFpsRangeQuirk {
    public final zyk a;

    public AeFpsRangeLegacyQuirk(ge4 ge4Var) {
        this.a = z4c.b(new pa(ge4Var, this));
    }
}
