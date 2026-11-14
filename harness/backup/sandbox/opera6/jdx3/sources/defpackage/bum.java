package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bum {
    public final String a;
    public final String b;

    public bum(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bum)) {
            return false;
        }
        bum bumVar = (bum) obj;
        return Intrinsics.a(this.a, bumVar.a) && Intrinsics.a(this.b, bumVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
