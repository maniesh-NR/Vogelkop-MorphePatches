package defpackage;

import android.graphics.BlendModeColorFilter;

/* loaded from: classes.dex */
public final class kh3 {
    public final BlendModeColorFilter a;
    public final long b;
    public final int c;

    public kh3(long j, int i) {
        this.a = new BlendModeColorFilter(cs5.u0(j), alo.e0(i));
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh3)) {
            return false;
        }
        kh3 kh3Var = (kh3) obj;
        long j = kh3Var.b;
        int i = u95.h;
        return jgm.a(this.b, j) && this.c == kh3Var.c;
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return sko.l("BlendModeColorFilter(color=", u95.h(this.b), ", blendMode=", y9m.k0(this.c), ")");
    }
}
