package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sgj {
    public final int a;
    public final String b;

    public sgj(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgj)) {
            return false;
        }
        sgj sgjVar = (sgj) obj;
        return this.a == sgjVar.a && Intrinsics.a(this.b, sgjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
