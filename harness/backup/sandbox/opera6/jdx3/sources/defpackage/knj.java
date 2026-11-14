package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class knj {
    public final String a;
    public final lnj b;

    public knj(String str, lnj lnjVar) {
        this.a = str;
        this.b = lnjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knj)) {
            return false;
        }
        knj knjVar = (knj) obj;
        return Intrinsics.a(this.a, knjVar.a) && this.b.equals(knjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
