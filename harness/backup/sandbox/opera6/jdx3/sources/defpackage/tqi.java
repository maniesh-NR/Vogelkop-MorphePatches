package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tqi {
    public final int a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;

    public tqi(int i, Integer num, Integer num2, String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqi)) {
            return false;
        }
        tqi tqiVar = (tqi) obj;
        return this.a == tqiVar.a && Intrinsics.a(this.b, tqiVar.b) && Intrinsics.a(this.c, tqiVar.c) && this.d.equals(tqiVar.d) && this.e.equals(tqiVar.e) && Intrinsics.a(this.f, tqiVar.f) && this.g.equals(tqiVar.g) && this.h.equals(tqiVar.h);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return this.h.hashCode() + z1m.f(z1m.f(z1m.f(z1m.f((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "";
    }
}
