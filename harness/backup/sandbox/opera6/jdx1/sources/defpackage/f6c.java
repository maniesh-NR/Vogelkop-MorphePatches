package defpackage;

import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class f6c implements f5c {
    public final u6c a;

    public f6c(u6c u6cVar) {
        this.a = u6cVar;
    }

    public final int a() {
        int i;
        u6c u6cVar = this.a;
        if (u6cVar.j().l.isEmpty()) {
            return 0;
        }
        m6c m6cVarJ = u6cVar.j();
        int iG = (int) (m6cVarJ.p == fsf.a ? m6cVarJ.g() & 4294967295L : m6cVarJ.g() >> 32);
        int iZ = gyg.Z(u6cVar.j());
        if (iZ == 0 || (i = iG / iZ) < 1) {
            return 1;
        }
        return i;
    }

    public final boolean b() {
        return !this.a.j().l.isEmpty();
    }

    public final int c() {
        return Math.max(0, this.a.h());
    }

    public final int d() {
        return Math.min(getItemCount() - 1, ((n6c) CollectionsKt.Q(this.a.j().l)).a);
    }

    public final int getItemCount() {
        return this.a.j().o;
    }
}
