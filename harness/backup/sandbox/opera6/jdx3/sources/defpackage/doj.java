package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class doj {
    public final String a;
    public final p6l b;

    public doj(String str, p6l p6lVar) {
        this.a = str;
        this.b = p6lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doj)) {
            return false;
        }
        doj dojVar = (doj) obj;
        return Intrinsics.a(this.a, dojVar.a) && this.b == dojVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
