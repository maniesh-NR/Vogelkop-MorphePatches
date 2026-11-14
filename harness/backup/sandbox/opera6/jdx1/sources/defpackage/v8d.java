package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v8d {
    public final u8d a;
    public final lyi b;
    public final Integer c;

    public v8d(u8d u8dVar, lyi lyiVar, Integer num) {
        this.a = u8dVar;
        this.b = lyiVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8d)) {
            return false;
        }
        v8d v8dVar = (v8d) obj;
        return Intrinsics.a(this.a, v8dVar.a) && this.b == v8dVar.b && Intrinsics.a(this.c, v8dVar.c);
    }

    public final int hashCode() {
        u8d u8dVar = this.a;
        int iHashCode = (this.b.hashCode() + ((u8dVar == null ? 0 : u8dVar.hashCode()) * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
