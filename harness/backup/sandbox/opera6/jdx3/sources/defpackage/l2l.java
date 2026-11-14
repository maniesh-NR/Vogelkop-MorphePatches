package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l2l implements m2l, t2l {
    public final List a;
    public final int b;
    public final long c;

    public l2l(List list, int i) {
        this.a = list;
        this.b = i;
        cgm cgmVar = dgm.b;
        igm igmVar = jgm.b;
        this.c = (i & 4294967295L) | 17179869184L;
    }

    @Override // defpackage.t2l
    public final List a() {
        return this.a;
    }

    @Override // defpackage.e4a
    public final a26 b() {
        return g4a.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2l)) {
            return false;
        }
        l2l l2lVar = (l2l) obj;
        return Intrinsics.a(this.a, l2lVar.a) && this.b == l2lVar.b;
    }

    @Override // defpackage.m2l
    public final long getId() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
