package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class hak implements trm, xsm {
    public final pe4 a;
    public final zl2 b;
    public final ctm c;
    public zrm e;
    public long g;
    public boolean j;
    public Integer k;
    public Integer l;
    public final Object d = new Object();
    public final ArrayList f = new ArrayList();
    public int h = 2;
    public int i = 1;

    public hak(pe4 pe4Var, zl2 zl2Var, ctm ctmVar) {
        this.a = pe4Var;
        this.b = zl2Var;
        this.c = ctmVar;
    }

    @Override // defpackage.xsm
    public final void a(LinkedHashSet linkedHashSet) {
        na2.B(this.c.f, null, null, new udj((mt5) null, CollectionsKt.n0(linkedHashSet), this), 3);
    }

    @Override // defpackage.trm
    public final void b(zrm zrmVar) {
        this.e = zrmVar;
        f();
    }

    public final void c(Exception exc) {
        List listK0;
        synchronized (this.d) {
            listK0 = CollectionsKt.k0(this.f);
            this.f.clear();
        }
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            ((bd5) it.next()).B0(exc);
        }
    }

    public final int d(int i, boolean z, Integer num) {
        int iIntValue = num != null ? num.intValue() : i != 0 ? i != 1 ? 1 : 3 : this.b.d();
        if (z && z4o.W(this.a.b, 5) == 5) {
            return 5;
        }
        return iIntValue;
    }

    public final int e() {
        int iW;
        synchronized (this.d) {
            iW = z4o.W(this.a.b, d(this.h, this.j, this.k));
        }
        return iW;
    }

    public final cd5 f() {
        cd5 cd5Var = new cd5();
        oqh oqhVar = new oqh();
        synchronized (this.d) {
            this.f.add(cd5Var);
            long j = this.g + 1;
            this.g = j;
            oqhVar.a = j;
        }
        na2.B(this.c.f, null, null, new udj((mt5) null, (Object) this, (Object) oqhVar, (byte) 6), 3);
        return cd5Var;
    }

    @Override // defpackage.trm
    public final void reset() {
        synchronized (this.d) {
            this.j = false;
            this.k = null;
            this.l = null;
            this.h = 2;
            this.i = 1;
        }
        f();
    }
}
