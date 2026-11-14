package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u8d {
    public final byte a;
    public final boolean b;
    public final double c;
    public final o9g d;
    public final String e;
    public final Date f;
    public final Date g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public u8d(int i, boolean z, double d, o9g o9gVar, String str, Date date, Date date2, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = d;
        this.d = o9gVar;
        this.e = str;
        this.f = date;
        this.g = date2;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8d)) {
            return false;
        }
        u8d u8dVar = (u8d) obj;
        return this.a == u8dVar.a && this.b == u8dVar.b && Double.compare(this.c, u8dVar.c) == 0 && Intrinsics.a(this.d, u8dVar.d) && Intrinsics.a(this.e, u8dVar.e) && Intrinsics.a(this.f, u8dVar.f) && Intrinsics.a(this.g, u8dVar.g) && this.h == u8dVar.h && this.i == u8dVar.i && this.j == u8dVar.j;
    }

    public final int hashCode() {
        int iF = z1m.f((this.d.hashCode() + ((Double.hashCode(this.c) + fki.k(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        Date date = this.f;
        int iHashCode = (iF + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.g;
        return Boolean.hashCode(this.j) + fki.k(fki.k((iHashCode + (date2 != null ? date2.hashCode() : 0)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        return "";
    }
}
