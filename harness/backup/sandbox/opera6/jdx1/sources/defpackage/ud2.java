package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ud2 extends k1g {
    public final /* synthetic */ vd2 i;

    public ud2(vd2 vd2Var) {
        this.i = vd2Var;
    }

    @Override // defpackage.k1g
    public final int C() {
        return ((List) this.i.d).size();
    }

    @Override // defpackage.k1g
    public final int D() {
        return ((List) this.i.c).size();
    }

    @Override // defpackage.k1g
    public final boolean h(int i, int i2) {
        vd2 vd2Var = this.i;
        Object obj = ((List) vd2Var.c).get(i);
        Object obj2 = ((List) vd2Var.d).get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return ((gyg) ((xd2) vd2Var.f).b.b).i(obj, obj2);
            }
        } else if (obj2 == null) {
            return true;
        }
        t40.h();
        return false;
    }

    @Override // defpackage.k1g
    public final boolean i(int i, int i2) {
        vd2 vd2Var = this.i;
        Object obj = ((List) vd2Var.c).get(i);
        Object obj2 = ((List) vd2Var.d).get(i2);
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 != null) {
            return ((gyg) ((xd2) vd2Var.f).b.b).j(obj, obj2);
        }
        return false;
    }

    @Override // defpackage.k1g
    public final Object u(int i, int i2) {
        vd2 vd2Var = this.i;
        Object obj = ((List) vd2Var.c).get(i);
        Object obj2 = ((List) vd2Var.d).get(i2);
        if (obj != null && obj2 != null) {
            return ((gyg) ((xd2) vd2Var.f).b.b).x(obj, obj2);
        }
        t40.h();
        return null;
    }
}
