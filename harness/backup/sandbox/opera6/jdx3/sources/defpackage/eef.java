package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class eef {
    public final aln a;
    public final g7j b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ eef(aln alnVar) {
        g7j g7jVarB = alnVar.b();
        this(alnVar, g7jVarB == null ? g7j.h : g7jVarB);
    }

    public eef(aln alnVar, g7j g7jVar) {
        this.a = alnVar;
        this.b = g7jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eef)) {
            return false;
        }
        eef eefVar = (eef) obj;
        return Intrinsics.a(this.a, eefVar.a) && this.b == eefVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
