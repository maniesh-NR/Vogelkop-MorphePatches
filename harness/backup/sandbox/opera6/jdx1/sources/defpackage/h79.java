package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h79 {
    public final String a;
    public final String b;

    public h79(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h79)) {
            return false;
        }
        h79 h79Var = (h79) obj;
        return Intrinsics.a(this.a, h79Var.a) && Intrinsics.a(this.b, h79Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceInfo(manufacturer=");
        sb.append(this.a);
        sb.append(", model=");
        return o18.p(sb, this.b, ')');
    }
}
