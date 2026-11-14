package defpackage;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class dxa extends ixa {
    public final PointF a;
    public final boolean b;

    public /* synthetic */ dxa(PointF pointF, int i) {
        this((i & 1) != 0 ? null : pointF, false);
    }

    public dxa(PointF pointF, boolean z) {
        this.a = pointF;
        this.b = z;
    }
}
