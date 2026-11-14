package defpackage;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class i3d {
    public final dvb a;
    public final int b;
    public final int c;
    public final boolean d;

    public i3d(int i, int i2, String str, boolean z) {
        this.a = a(str);
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i3d(String str, int i) {
        this(i, 1, str, false);
        PointF pointF = k3d.a;
    }

    public static dvb a(String str) {
        return new dvb(new String[]{"**", str, "**"});
    }
}
