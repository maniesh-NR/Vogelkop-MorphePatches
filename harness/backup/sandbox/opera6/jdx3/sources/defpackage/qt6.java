package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class qt6 implements hgd, j92 {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    @Override // defpackage.j92
    public final void a() {
        j(Collections.EMPTY_LIST);
        this.b = true;
    }

    @Override // defpackage.j92
    public final Collection b() {
        return ((l0n) this.f).c.b();
    }

    @Override // defpackage.hgd
    public final void c(thg thgVar) {
        hgd hgdVar = (hgd) this.f;
        if (hgdVar != null) {
            hgdVar.c(thgVar);
            thgVar = ((hgd) this.f).getPlaybackParameters();
        }
        ((e3k) this.c).c(thgVar);
    }

    @Override // defpackage.j92
    public final void d(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) this.e;
        this.a = arrayList2.isEmpty();
        arrayList2.addAll(0, arrayList);
        ((ArrayList) this.c).addAll(0, arrayList);
    }

    @Override // defpackage.hgd
    public final boolean e() {
        if (this.a) {
            return false;
        }
        hgd hgdVar = (hgd) this.f;
        hgdVar.getClass();
        return hgdVar.e();
    }

    @Override // defpackage.j92
    public final List f() {
        return Collections.unmodifiableList((ArrayList) this.e);
    }

    @Override // defpackage.j92
    public final void g(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) this.e;
        this.a = arrayList2.isEmpty();
        arrayList2.addAll(arrayList);
        ((ArrayList) this.d).addAll(arrayList);
    }

    @Override // defpackage.hgd
    public final thg getPlaybackParameters() {
        hgd hgdVar = (hgd) this.f;
        return hgdVar != null ? hgdVar.getPlaybackParameters() : ((e3k) this.c).d;
    }

    @Override // defpackage.hgd
    public final long getPositionUs() {
        if (this.a) {
            return ((e3k) this.c).getPositionUs();
        }
        hgd hgdVar = (hgd) this.f;
        hgdVar.getClass();
        return hgdVar.getPositionUs();
    }

    @Override // defpackage.j92
    public final boolean h() {
        return ((l0n) this.f).c.h();
    }

    @Override // defpackage.j92
    public final void i(boolean z) {
        ArrayList arrayList = (ArrayList) this.e;
        l0n l0nVar = (l0n) this.f;
        vz5 vz5Var = l0nVar.e;
        l0nVar.d = vz5Var;
        if (vz5Var == null) {
            return;
        }
        j92 j92Var = l0nVar.c;
        vz5Var.i = j92Var;
        l0nVar.e = null;
        if (this.b) {
            j92Var.a();
        }
        if (!this.a) {
            l0nVar.c.d((ArrayList) this.c);
            l0nVar.c.g((ArrayList) this.d);
        } else if (!arrayList.isEmpty() || !this.b) {
            l0nVar.c.j(arrayList);
        }
        l0nVar.c.i(z);
    }

    @Override // defpackage.j92
    public final void j(List list) {
        ArrayList arrayList = (ArrayList) this.e;
        arrayList.clear();
        arrayList.addAll(list);
        ((ArrayList) this.d).clear();
        ((ArrayList) this.c).clear();
        this.a = true;
    }

    public final boolean k() {
        return this.b || this.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: zh8 */
    public final void l(q83 q83Var) throws zh8 {
        kgd kgdVar;
        kgd kgdVarJ = q83Var.j();
        if (kgdVarJ == null || kgdVarJ == (kgdVar = (hgd) this.f)) {
            return;
        }
        if (kgdVar != null) {
            throw zh8.h(1000, new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f = kgdVarJ;
        this.e = q83Var;
        kgdVarJ.c(((e3k) this.c).d);
    }

    public final void m() {
        jrk jrkVar = (jrk) this.e;
        mrk mrkVar = (mrk) this.f;
        boolean z = mrkVar.w;
        if (z) {
            return;
        }
        ywj ywjVar = mrkVar.G.n.l.x;
        if (ywjVar != null && ywjVar.j > 0) {
            vml.a(jrkVar);
            vml.d(jrkVar, 100L);
        } else {
            if (z) {
                return;
            }
            mrkVar.w = true;
            ((brk) this.c).invoke();
        }
    }

    @Override // defpackage.j92
    public final void onFailure() {
        l0n l0nVar = (l0n) this.f;
        l0nVar.e = null;
        vz5 vz5Var = l0nVar.d;
        if (vz5Var != null) {
            vz5Var.a();
        }
        l0nVar.c.onFailure();
    }
}
