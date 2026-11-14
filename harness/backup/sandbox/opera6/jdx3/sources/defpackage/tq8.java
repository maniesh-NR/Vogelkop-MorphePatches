package defpackage;

import com.opera.android.favorites.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class tq8 extends hq8 implements Iterable, w6f {
    public final ArrayList e = new ArrayList();
    public final HashSet f = new HashSet();
    public final j1d g = new j1d((Object) null);

    public final void A(hq8 hq8Var) {
        int i = hq8Var.b != this ? -1 : hq8Var.c;
        hq8Var.b = null;
        this.e.remove(hq8Var);
        this.g.i(hq8Var.e());
        C(hq8Var.c);
        hq8Var.c = -1;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((sq8) it.next()).B(i, hq8Var);
        }
        tq8 tq8Var = this.b;
        if (tq8Var != null) {
            tq8Var.n(2, this);
        }
    }

    @Override // defpackage.w6f
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void H(sq8 sq8Var) {
        this.f.remove(sq8Var);
    }

    public final void C(int i) {
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return;
            }
            ((hq8) arrayList.get(i)).c = i;
            i++;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.e.iterator();
    }

    @Override // defpackage.hq8
    public final boolean j() {
        return true;
    }

    @Override // defpackage.hq8
    public final void r() {
        n(4, this);
        tq8 tq8Var = this.b;
        if (tq8Var != null) {
            tq8Var.n(4, this);
        }
    }

    public final void s(int i, hq8 hq8Var) {
        x(i, hq8Var);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((sq8) it.next()).w(hq8Var);
        }
        tq8 tq8Var = this.b;
        if (tq8Var != null) {
            tq8Var.n(1, this);
        }
    }

    @Override // defpackage.w6f
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void F(sq8 sq8Var) {
        this.f.add(sq8Var);
    }

    public final hq8 u(int i) {
        return (hq8) this.e.get(i);
    }

    public final hq8 v(long j) {
        return (hq8) this.g.c(j);
    }

    public final void x(int i, hq8 hq8Var) {
        ArrayList arrayList = this.e;
        if (i >= 0) {
            arrayList.add(i, hq8Var);
            C(i);
        } else {
            arrayList.add(hq8Var);
            C(arrayList.size() - 1);
        }
        this.g.g(hq8Var.e(), hq8Var);
        hq8Var.b = this;
    }

    public boolean y() {
        return this instanceof f;
    }

    public Date z() {
        throw new UnsupportedOperationException();
    }
}
