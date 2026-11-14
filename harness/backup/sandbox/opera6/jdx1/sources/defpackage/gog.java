package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class gog {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final short f;

    /* JADX WARN: Illegal instructions before constructor call */
    public gog(int i) {
        boolean z = (i & 1) == 0;
        cwi cwiVar = cwi.a;
        this(z, true, 0);
    }

    public gog(int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = (short) 1002;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gog(boolean z, boolean z2) {
        this(z, z2, 0);
        cwi cwiVar = cwi.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gog(boolean z, boolean z2, int i) {
        cwi cwiVar = cwi.a;
        hp7 hp7Var = w91.a;
        int i2 = !z ? 262152 : 262144;
        cwi cwiVar2 = cwi.a;
        this(z2 ? i2 : i2 | NotificationCompat.FLAG_GROUP_SUMMARY, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gog)) {
            return false;
        }
        gog gogVar = (gog) obj;
        return this.a == gogVar.a && this.b == gogVar.b && this.c == gogVar.c && this.d == gogVar.d && this.e == gogVar.e && this.f == gogVar.f;
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.e) + fki.k(fki.k(fki.k(this.a * 31, 31, this.b), 31, this.c), 31, this.d)) * 31) + 1237) * 31) + this.f) * 31;
    }
}
