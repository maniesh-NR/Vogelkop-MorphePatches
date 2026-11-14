package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zmh implements smh {
    public final enh a;
    public final long b;

    public zmh(enh enhVar) {
        this.a = enhVar;
        int i = enhVar.c;
        cgm cgmVar = dgm.b;
        this.b = i & 4294967295L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmh) && Intrinsics.a(this.a, ((zmh) obj).a);
    }

    @Override // defpackage.smh
    public final long getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
