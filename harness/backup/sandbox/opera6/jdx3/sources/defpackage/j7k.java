package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;

/* loaded from: classes.dex */
public final class j7k {
    public final int a;
    public final int b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public j7k(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = (i & 2) != 0;
        this.e = (i & 64) != 0;
        this.f = (i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0;
        this.g = (i & Constants.Crypt.KEY_LENGTH) != 0;
        this.h = (i & 512) != 0;
        this.i = (i & 1024) != 0;
        this.j = (i & 2048) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7k)) {
            return false;
        }
        j7k j7kVar = (j7k) obj;
        return this.a == j7kVar.a && this.b == j7kVar.b && pn7.e(this.c, j7kVar.c);
    }

    public final int hashCode() {
        int iC = rfp.c(this.b, Integer.hashCode(this.a) * 31, 31);
        on7 on7Var = pn7.b;
        return Long.hashCode(this.c) + iC;
    }

    public final String toString() {
        return "";
    }
}
