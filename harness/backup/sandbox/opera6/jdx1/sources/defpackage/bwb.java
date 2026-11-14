package defpackage;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class bwb {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final z8b b = z8b.G("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final z8b c = z8b.G("x", "y");

    public static BaseInterpolator a(PointF pointF, PointF pointF2) {
        pointF.x = l1e.b(pointF.x, -1.0f, 1.0f);
        pointF.y = l1e.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = l1e.b(pointF2.x, -1.0f, 1.0f);
        float fB = l1e.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        f30 f30Var = dzm.a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e1  */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.BaseInterpolator] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.animation.BaseInterpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zvb b(defpackage.esb r25, defpackage.p2d r26, float r27, defpackage.j0n r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwb.b(esb, p2d, float, j0n, boolean, boolean):zvb");
    }
}
