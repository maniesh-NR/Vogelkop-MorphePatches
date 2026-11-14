package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ld2 implements nd2 {
    public final hyf a;

    public ld2(hyf hyfVar) {
        this.a = hyfVar;
    }

    @Override // defpackage.nd2
    public final hyf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld2) && Intrinsics.a(this.a, ((ld2) obj).a);
    }

    public final int hashCode() {
        hyf hyfVar = this.a;
        if (hyfVar == null) {
            return 0;
        }
        return hyfVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ")";
    }
}
