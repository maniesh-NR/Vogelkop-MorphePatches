package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wlk {
    public final String a;
    public final String b;
    public final o9g c;
    public final float d;

    public wlk(String str, String str2, o9g o9gVar, float f) {
        this.a = str;
        this.b = str2;
        this.c = o9gVar;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlk)) {
            return false;
        }
        wlk wlkVar = (wlk) obj;
        return Intrinsics.a(this.a, wlkVar.a) && Intrinsics.a(this.b, wlkVar.b) && this.c.equals(wlkVar.c) && Float.compare(this.d, wlkVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "";
    }
}
