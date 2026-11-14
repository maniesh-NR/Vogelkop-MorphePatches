package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e78 {
    public final String a;

    public e78(String str) {
        f78 f78Var = f78.a;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e78)) {
            return false;
        }
        f78 f78Var = f78.a;
        return Intrinsics.a(this.a, ((e78) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (f78.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
