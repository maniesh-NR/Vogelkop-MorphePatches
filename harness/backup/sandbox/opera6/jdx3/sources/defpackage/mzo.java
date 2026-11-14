package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mzo {
    public final String a;
    public final String b;
    public final String c;

    public mzo(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzo)) {
            return false;
        }
        mzo mzoVar = (mzo) obj;
        return Intrinsics.a(this.a, mzoVar.a) && Intrinsics.a(this.b, mzoVar.b) && Intrinsics.a(this.c, mzoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OmIdParams(vendorKey=");
        sb.append(this.a);
        sb.append(", verificationParameters=");
        sb.append(this.b);
        sb.append(", verificationUrl=");
        return o18.p(sb, this.c, ')');
    }
}
