package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wjc implements akc {
    public final String a;
    public final String b;

    public wjc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjc)) {
            return false;
        }
        wjc wjcVar = (wjc) obj;
        return Intrinsics.a(this.a, wjcVar.a) && this.b.equals(wjcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }

    public final String toString() {
        return "";
    }
}
