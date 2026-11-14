package defpackage;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fq {
    public static final fq g = new fq(320, 50, 56, "320x50_mb");
    public static final fq h;
    public static final fq i;
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    static {
        new fq(468, 60);
        new fq(320, 100);
        new fq(728, 90);
        h = new fq(300, 250);
        i = new fq(-3, -4, 56, "320x50_mb");
    }

    public fq(int i2, int i3) {
        this(i2, i3, 56, null);
    }

    public fq(int i2, int i3, int i4, String str) {
        str = (i4 & 4) != 0 ? null : str;
        boolean z = (i4 & 8) == 0;
        boolean z2 = (i4 & 16) == 0;
        boolean z3 = (i4 & 32) == 0;
        this.a = i2;
        this.b = i3;
        this.c = z;
        this.d = z2;
        this.e = z3;
        if (str == null) {
            str = i2 + "x" + i3 + "_as";
        }
        this.f = str;
        if (i2 < 0 && i2 != -3) {
            bxl.d(sko.i(i2, "Invalid width for AdSize: "));
            throw null;
        }
        if (i3 < 0 && i3 != -4) {
            bxl.d(sko.i(i3, "Invalid height for AdSize: "));
            throw null;
        }
        if (z2) {
            if (z) {
                qp2.o("AdSize cannot be both inline and anchored adaptive");
                throw null;
            }
            if (z3) {
                qp2.o("AdSize cannot be both inline and large anchored adaptive");
                throw null;
            }
        }
        if (z && z3) {
            qp2.o("AdSize cannot be both anchored and large anchored adaptive");
            throw null;
        }
        if (!z2 || i3 >= 1) {
            return;
        }
        qp2.o("An inline AdSize must have a positive height");
        throw null;
    }

    public final boolean a() {
        return this.a == -3 && this.b == -4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fq)) {
            return false;
        }
        fq fqVar = (fq) obj;
        return this.a == fqVar.a && this.b == fqVar.b && Intrinsics.a(this.f, fqVar.f);
    }

    public final int hashCode() {
        return Objects.hash(this.f, Boolean.valueOf(a()));
    }

    public final String toString() {
        return sko.v(this.f, " ", a() ? "fluid" : "");
    }
}
