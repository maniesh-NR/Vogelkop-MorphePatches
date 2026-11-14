package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.mo2;
import defpackage.xd4;

/* loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean c(xd4 xd4Var, mo2 mo2Var) {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL) && xd4Var.j() == 0 && mo2Var == mo2.e;
    }
}
