package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dwb {
    public final Float a;
    public vq7 b;

    public dwb(Float f, vq7 vq7Var) {
        this.a = f;
        this.b = vq7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dwb)) {
            return false;
        }
        dwb dwbVar = (dwb) obj;
        return dwbVar.a.equals(this.a) && Intrinsics.a(dwbVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }
}
