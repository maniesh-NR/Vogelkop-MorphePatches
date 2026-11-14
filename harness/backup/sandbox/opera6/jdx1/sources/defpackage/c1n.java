package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c1n {
    public final if1 a;
    public final vq7 b;

    public c1n(if1 if1Var, vq7 vq7Var) {
        this.a = if1Var;
        this.b = vq7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1n)) {
            return false;
        }
        c1n c1nVar = (c1n) obj;
        return Intrinsics.a(this.a, c1nVar.a) && Intrinsics.a(this.b, c1nVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
