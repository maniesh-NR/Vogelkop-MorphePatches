package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class azo {

    @NotNull
    public static final zyo Companion = new zyo();
    public final Float a;
    public final Float b;
    public final Integer c;
    public final String d;
    public final Integer e;

    public azo(int i, Float f, Float f2, Integer num, String str, Integer num2) {
        if (23 != (i & 23)) {
            x7d.I(i, 23, yyo.b);
            throw null;
        }
        this.a = f;
        this.b = f2;
        this.c = num;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        this.e = num2;
    }

    public azo(Float f, Float f2, Integer num, String str, Integer num2) {
        this.a = f;
        this.b = f2;
        this.c = num;
        this.d = str;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azo)) {
            return false;
        }
        azo azoVar = (azo) obj;
        return Intrinsics.a(this.a, azoVar.a) && Intrinsics.a(this.b, azoVar.b) && Intrinsics.a(this.c, azoVar.c) && Intrinsics.a(this.d, azoVar.d) && Intrinsics.a(this.e, azoVar.e);
    }

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.b;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Geo(latitude=" + this.a + ", longitude=" + this.b + ", locationType=" + this.c + ", country=" + this.d + ", utcOffset=" + this.e + ')';
    }
}
