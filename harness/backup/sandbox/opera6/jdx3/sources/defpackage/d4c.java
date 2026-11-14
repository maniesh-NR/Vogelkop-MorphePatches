package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class d4c {
    public final fpj a;
    public final int b;
    public final boolean c;
    public final float d;
    public final int e;
    public final int f;
    public final int g;

    public d4c(fpj fpjVar, int i, boolean z, float f, int i2, int i3, int i4) {
        this.a = fpjVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public static final d4c a(Context context) {
        boolean z;
        int i;
        int iH;
        int iH2;
        int iH3;
        Resources resources = context.getResources();
        int i2 = resources.getConfiguration().orientation;
        fpj.a.getClass();
        fpj fpjVarK = dpj.k(context);
        int iOrdinal = fpjVarK.ordinal();
        boolean z2 = false;
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            z = false;
        } else {
            if (iOrdinal != 3 && iOrdinal != 4) {
                h9o.p();
                return null;
            }
            z = true;
        }
        if (z && i2 != 1) {
            if (resources.getDimensionPixelSize(2131166676) + resources.getDimensionPixelSize(2131166675) < r9n.j(context).width()) {
                z2 = true;
            }
        }
        float f = z ? z2 ? 0.78f : 0.59f : 0.45f;
        int iOrdinal2 = fpjVarK.ordinal();
        if (iOrdinal2 == 0) {
            i = 2131559045;
        } else {
            if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3 && iOrdinal2 != 4) {
                h9o.p();
                return null;
            }
            i = 2131559044;
        }
        int iOrdinal3 = fpjVarK.ordinal();
        if (iOrdinal3 == 0 || iOrdinal3 == 1) {
            iH = z7h.h(context, 0.0f);
        } else if (iOrdinal3 != 2) {
            if (iOrdinal3 != 3 && iOrdinal3 != 4) {
                h9o.p();
                return null;
            }
            iH = z7h.h(context, 0.0f);
        } else {
            iH = z7h.h(context, 64.0f);
        }
        int iOrdinal4 = fpjVarK.ordinal();
        if (iOrdinal4 == 0 || iOrdinal4 == 1) {
            iH2 = z7h.h(context, 8.0f);
        } else {
            if (iOrdinal4 != 2 && iOrdinal4 != 3 && iOrdinal4 != 4) {
                h9o.p();
                return null;
            }
            iH2 = z7h.h(context, 16.0f);
        }
        int iOrdinal5 = fpjVarK.ordinal();
        if (iOrdinal5 == 0) {
            iH3 = z7h.h(context, 16.0f);
        } else {
            if (iOrdinal5 != 1 && iOrdinal5 != 2 && iOrdinal5 != 3 && iOrdinal5 != 4) {
                h9o.p();
                return null;
            }
            iH3 = z7h.h(context, 24.0f);
        }
        return new d4c(fpjVarK, i, z2, f, iH, iH2, iH3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4c)) {
            return false;
        }
        d4c d4cVar = (d4c) obj;
        return this.a == d4cVar.a && this.b == d4cVar.b && this.c == d4cVar.c && Float.compare(this.d, d4cVar.d) == 0 && this.e == d4cVar.e && this.f == d4cVar.f && this.g == d4cVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + rfp.c(this.f, rfp.c(this.e, sko.d(this.d, fki.k(rfp.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
