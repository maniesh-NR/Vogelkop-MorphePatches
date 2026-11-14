package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ay9 implements dy9 {
    public final int a;
    public final String b;

    public ay9(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay9)) {
            return false;
        }
        ay9 ay9Var = (ay9) obj;
        return this.a == ay9Var.a && Intrinsics.a(this.b, ay9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
