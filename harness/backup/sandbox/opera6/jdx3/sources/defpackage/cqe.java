package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cqe {
    public final l0c a;
    public final boolean b;

    public cqe(l0c l0cVar, boolean z) {
        this.a = l0cVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqe)) {
            return false;
        }
        cqe cqeVar = (cqe) obj;
        return Intrinsics.a(this.a, cqeVar.a) && this.b == cqeVar.b;
    }

    public final int hashCode() {
        l0c l0cVar = this.a;
        return Boolean.hashCode(this.b) + ((l0cVar == null ? 0 : l0cVar.hashCode()) * 31);
    }

    public final String toString() {
        return "";
    }
}
