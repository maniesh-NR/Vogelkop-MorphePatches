package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w4o {
    public final String a;
    public final int b;

    public w4o(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4o)) {
            return false;
        }
        w4o w4oVar = (w4o) obj;
        return Intrinsics.a(this.a, w4oVar.a) && this.b == w4oVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return fki.s(sb, this.b, ')');
    }
}
