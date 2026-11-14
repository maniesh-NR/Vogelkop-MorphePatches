package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class id3 {

    @NotNull
    public static final hd3 Companion = new hd3();
    public final String a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final int f;
    public final String g;

    public /* synthetic */ id3(int i, String str, String str2, String str3, double d, double d2, int i2, String str4) {
        if (59 != (i & 59)) {
            x7d.I(i, 59, gd3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = d;
        this.e = d2;
        this.f = i2;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id3)) {
            return false;
        }
        id3 id3Var = (id3) obj;
        return Intrinsics.a(this.a, id3Var.a) && Intrinsics.a(this.b, id3Var.b) && Intrinsics.a(this.c, id3Var.c) && Double.compare(this.d, id3Var.d) == 0 && Double.compare(this.e, id3Var.e) == 0 && this.f == id3Var.f && Intrinsics.a(this.g, id3Var.g);
    }

    public final int hashCode() {
        int iF = z1m.f(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iC = rfp.c(this.f, (Double.hashCode(this.e) + ((Double.hashCode(this.d) + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31);
        String str2 = this.g;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
