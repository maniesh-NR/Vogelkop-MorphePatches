package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class x4l {
    public final String a;
    public final String b;
    public final long c;
    public final int d;

    public x4l(String str, int i, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = i;
    }

    public final Uri a() {
        String str = this.b;
        if (str == null || StringsKt.N(str)) {
            return null;
        }
        return !c.q(str, "/", false) ? Uri.parse(str) : Uri.parse(this.a).buildUpon().path(str).build();
    }

    public final boolean b() {
        long j;
        gpk gpkVar = a5l.l;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.b != null) {
            j = a5l.k;
        } else {
            int i = this.d;
            j = (i & 1) != 0 ? a5l.h : (i & 2) != 0 ? a5l.i : a5l.j;
        }
        return jCurrentTimeMillis > pn7.f(j) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4l)) {
            return false;
        }
        x4l x4lVar = (x4l) obj;
        return Intrinsics.a(this.a, x4lVar.a) && Intrinsics.a(this.b, x4lVar.b) && this.c == x4lVar.c && this.d == x4lVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.d) + z1m.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
