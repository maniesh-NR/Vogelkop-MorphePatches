package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pwj {
    public final Object a;
    public final int b;
    public final int c;
    public final int d;

    public pwj(int i, int i2, int i3, Object obj) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwj)) {
            return false;
        }
        pwj pwjVar = (pwj) obj;
        return Intrinsics.a(this.a, pwjVar.a) && this.b == pwjVar.b && this.c == pwjVar.c && this.d == pwjVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rfp.c(this.c, rfp.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
