package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h3h {
    public final String a;
    public final String b;

    public h3h(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3h)) {
            return false;
        }
        h3h h3hVar = (h3h) obj;
        return Intrinsics.a(this.a, h3hVar.a) && this.b.equals(h3hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
