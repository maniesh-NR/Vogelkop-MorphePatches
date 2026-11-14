package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fu7 extends w7d {
    public final String k;
    public final String l;

    public fu7(String str, String str2) {
        this.k = str;
        this.l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu7)) {
            return false;
        }
        fu7 fu7Var = (fu7) obj;
        return Intrinsics.a(this.k, fu7Var.k) && Intrinsics.a(this.l, fu7Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + (this.k.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
