package defpackage;

import android.util.Range;

/* loaded from: classes.dex */
public final class mk9 extends h5a {
    public static final Range d = new Range(30, 30);
    public final byte a = 60;
    public final byte b = 60;
    public final vt8 c = vt8.b;

    @Override // defpackage.h5a
    public final vt8 a() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FpsRangeFeature(minFps=");
        sb.append((int) this.a);
        sb.append(", maxFps=");
        return fki.s(sb, this.b, ')');
    }
}
