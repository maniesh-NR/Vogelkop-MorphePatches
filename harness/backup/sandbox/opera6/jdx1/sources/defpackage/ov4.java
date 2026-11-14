package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ov4 extends pv4 {
    public final Object a;
    public final String b;

    public ov4(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    @Override // defpackage.pv4
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov4)) {
            return false;
        }
        ov4 ov4Var = (ov4) obj;
        return Intrinsics.a(this.a, ov4Var.a) && Intrinsics.a(this.b, ov4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Destroyed(configuration=");
        sb.append(this.a);
        sb.append(", key=");
        return o18.p(sb, this.b, ')');
    }
}
