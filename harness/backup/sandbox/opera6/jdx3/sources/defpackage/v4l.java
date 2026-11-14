package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v4l {
    public static final v4l d = new v4l(null, false, false);
    public final String a;
    public final boolean b;
    public final boolean c;

    public v4l(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4l)) {
            return false;
        }
        v4l v4lVar = (v4l) obj;
        return Intrinsics.a(this.a, v4lVar.a) && this.b == v4lVar.b && this.c == v4lVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + fki.k((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
