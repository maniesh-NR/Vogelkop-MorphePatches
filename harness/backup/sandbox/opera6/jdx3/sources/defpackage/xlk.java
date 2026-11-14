package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xlk {
    public final wlk a;
    public final wlk b;
    public final wlk c;
    public final String d;
    public final String e;
    public final boolean f;

    public xlk(wlk wlkVar, wlk wlkVar2, wlk wlkVar3, String str, String str2, boolean z) {
        this.a = wlkVar;
        this.b = wlkVar2;
        this.c = wlkVar3;
        this.d = str;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xlk.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xlk xlkVar = (xlk) obj;
        return Intrinsics.a(this.a, xlkVar.a) && Intrinsics.a(this.b, xlkVar.b) && this.c.equals(xlkVar.c) && Intrinsics.a(this.d, xlkVar.d) && Intrinsics.a(this.e, xlkVar.e) && this.f == xlkVar.f;
    }

    public final int hashCode() {
        wlk wlkVar = this.a;
        int iHashCode = (wlkVar != null ? wlkVar.hashCode() : 0) * 31;
        wlk wlkVar2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (wlkVar2 != null ? wlkVar2.hashCode() : 0)) * 31)) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
