package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yie {
    public final String a;
    public final qyn b;

    public yie(String str, qyn qynVar) {
        this.a = str;
        this.b = qynVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yie)) {
            return false;
        }
        yie yieVar = (yie) obj;
        return Intrinsics.a(this.a, yieVar.a) && this.b.equals(yieVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
