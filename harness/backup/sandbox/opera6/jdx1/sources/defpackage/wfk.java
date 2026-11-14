package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class wfk {
    public final int a;
    public final Size b;
    public final int c;
    public final String d;
    public final tuf e;
    public final suf f;
    public final uuf g;
    public final qii h;
    public final vuf i;
    public cg4 j;

    public wfk(int i, int i2, suf sufVar, tuf tufVar, uuf uufVar, vuf vufVar, qii qiiVar, Size size, String str) {
        this.a = i;
        this.b = size;
        this.c = i2;
        this.d = str;
        this.e = tufVar;
        this.f = sufVar;
        this.g = uufVar;
        this.h = qiiVar;
        this.i = vufVar;
    }

    public final boolean a() {
        vuf vufVar;
        uuf uufVar = this.g;
        if (uufVar == null) {
            return true;
        }
        long j = uufVar.a;
        if (uuf.a(j, 0L) || uuf.a(j, 1L) || uuf.a(j, 3L) || (vufVar = this.i) == null) {
            return true;
        }
        long j2 = vufVar.a;
        return vuf.a(j2, 0L) || vuf.a(j2, 1L);
    }

    public final String toString() {
        return fuf.a(this.a);
    }
}
