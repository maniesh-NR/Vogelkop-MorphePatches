package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class ax6 extends myl {
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public ax6() {
        this.Q = new SparseArray();
        this.R = new SparseBooleanArray();
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
    }

    public ax6(bx6 bx6Var) {
        e(bx6Var);
        this.J = bx6Var.x0;
        this.K = bx6Var.y0;
        this.L = bx6Var.z0;
        this.M = bx6Var.A0;
        this.N = bx6Var.B0;
        this.O = bx6Var.C0;
        this.P = bx6Var.D0;
        SparseArray sparseArray = bx6Var.E0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.Q = sparseArray2;
        this.R = bx6Var.F0.clone();
    }

    @Override // defpackage.myl
    public final void a(kyl kylVar) {
        this.H.put(kylVar.a, kylVar);
    }

    @Override // defpackage.myl
    public final nyl b() {
        return new bx6(this);
    }

    @Override // defpackage.myl
    public final myl c() {
        super.c();
        return this;
    }

    @Override // defpackage.myl
    public final myl d(int i) {
        super.d(i);
        return this;
    }

    @Override // defpackage.myl
    public final myl g() {
        this.C = -3;
        return this;
    }

    @Override // defpackage.myl
    public final myl h(kyl kylVar) {
        super.h(kylVar);
        return this;
    }

    @Override // defpackage.myl
    public final myl i(String str) {
        super.i(null);
        return this;
    }

    @Override // defpackage.myl
    public final myl j(String[] strArr) {
        super.j(strArr);
        return this;
    }

    @Override // defpackage.myl
    public final myl k() {
        super.k();
        return this;
    }

    @Override // defpackage.myl
    public final myl l(int i, boolean z) {
        super.l(i, z);
        return this;
    }

    public final void m(Set set) {
        this.I.clear();
        this.I.addAll(set);
    }

    public final void n(String str) {
        super.i(str);
    }

    public final void o(int i, fyl fylVar, cx6 cx6Var) {
        SparseArray sparseArray = this.Q;
        Map map = (Map) sparseArray.get(i);
        if (map == null) {
            map = new HashMap();
            sparseArray.put(i, map);
        }
        if (map.containsKey(fylVar) && Objects.equals(map.get(fylVar), cx6Var)) {
            return;
        }
        map.put(fylVar, cx6Var);
    }
}
