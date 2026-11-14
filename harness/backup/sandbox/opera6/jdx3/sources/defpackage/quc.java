package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class quc {
    public final long a;
    public final String b;

    public quc(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quc)) {
            return false;
        }
        quc qucVar = (quc) obj;
        return this.a == qucVar.a && Intrinsics.a(this.b, qucVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
