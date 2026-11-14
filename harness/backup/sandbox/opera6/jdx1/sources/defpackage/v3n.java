package defpackage;

import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;

/* loaded from: classes.dex */
public final /* synthetic */ class v3n {
    public static u3n a(String str) {
        try {
            w3n w3nVar = new w3n(k75.a(str), str);
            return b77.a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) != null ? new x3n(w3nVar) : w3nVar;
        } catch (rib unused) {
            return null;
        }
    }
}
