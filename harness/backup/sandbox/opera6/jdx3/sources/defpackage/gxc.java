package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gxc {
    public final String a;
    public final String b;

    public gxc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxc)) {
            return false;
        }
        gxc gxcVar = (gxc) obj;
        return Intrinsics.a(this.a, gxcVar.a) && Intrinsics.a(this.b, gxcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
