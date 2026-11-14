package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class c5l extends k56 {
    public final RecyclerView t;
    public boolean u;
    public boolean v;
    public final LinkedHashSet w = new LinkedHashSet();
    public final pde x = new pde(v08.a);

    public c5l(RecyclerView recyclerView) {
        this.t = recyclerView;
        this.g = false;
        this.h = lf1.c;
        ((e) this).c = 120L;
        ((e) this).d = 120L;
        ((e) this).e = 250L;
        ((e) this).f = (short) 250;
    }

    @Override // defpackage.k56
    public final long A(long j) {
        return 0L;
    }

    @Override // defpackage.k56, defpackage.xkj
    public final boolean k(i iVar) {
        if (!this.u) {
            super.k(iVar);
            return true;
        }
        c(iVar);
        if (this.v) {
            return false;
        }
        this.v = true;
        this.t.postOnAnimation(new qlk(this, (byte) 26));
        return false;
    }

    @Override // defpackage.k56, defpackage.xkj
    public final boolean m(i iVar, int i, int i2, int i3, int i4) {
        LinkedHashSet linkedHashSet = this.w;
        linkedHashSet.add(iVar);
        this.x.r(linkedHashSet);
        return super.m(iVar, i, i2, i3, i4);
    }

    @Override // defpackage.xkj
    public final void q(i iVar) {
        LinkedHashSet linkedHashSet = this.w;
        linkedHashSet.remove(iVar);
        this.x.r(linkedHashSet);
    }

    @Override // defpackage.k56
    public final long z(long j, long j2, long j3) {
        return (Math.max(j2, j3) + j) / 2;
    }
}
