package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class q4p {

    @NotNull
    public static final p4p Companion = new p4p();
    public final Integer a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public q4p(int i, Integer num, String str, Integer num2, Integer num3) {
        if (2 != (i & 2)) {
            x7d.I(i, 2, o4p.b);
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = num;
        }
        this.b = str;
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4p)) {
            return false;
        }
        q4p q4pVar = (q4p) obj;
        return Intrinsics.a(this.a, q4pVar.a) && Intrinsics.a(this.b, q4pVar.b) && Intrinsics.a(this.c, q4pVar.c) && Intrinsics.a(this.d, q4pVar.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iF = z1m.f((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
        Integer num2 = this.c;
        int iHashCode = (iF + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "Image(type=" + this.a + ", url=" + this.b + ", w=" + this.c + ", h=" + this.d + ')';
    }
}
