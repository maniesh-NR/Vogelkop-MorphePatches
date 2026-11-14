package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bz3 {
    public int a;
    public int b;
    public int c;
    public boolean d;
    public Object e;
    public Object f;
    public Object g;

    public final void a(int i) {
        int i2 = this.c - i;
        this.d = this.d || i2 < 0;
        if (i2 < 0) {
            i2 = 0;
        }
        this.c = i2;
    }

    public final boolean b(e6k e6kVar) {
        ArrayList arrayList = (ArrayList) this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((a6k) obj).a.a == e6kVar) {
                    return true;
                }
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f;
        if (!arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                if (((a6k) obj2).a.a == e6kVar) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (this.a == 0 && ((bvl) this.e) != null) {
            dtl dtlVar = (dtl) this.g;
            if (dtlVar.a > dtlVar.b) {
                return true;
            }
        }
        if (this.c != 0 || ((r22) this.f) == null) {
            return false;
        }
        dtl dtlVar2 = (dtl) this.g;
        return dtlVar2.e > dtlVar2.d;
    }

    public final void d(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            bvl bvlVar = (bvl) this.e;
            i = -(bvlVar != null ? ((avl) bvlVar.getState().g()).d : 0);
        }
        e(i, z ? ((dtl) this.g).a : 0);
        this.c = z ? 0 : ((dtl) this.g).e;
        f();
    }

    public final void e(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (((bvl) this.e) == null) {
            return;
        }
        int iMax = Math.max(0, ((dtl) this.g).a);
        int iMin = this.d ? Math.min(this.a, 0) : 0;
        if (this.d) {
            iMax = Math.min(this.b, iMax);
        }
        ((bvl) this.e).D(new zul(iMin, iMax));
    }

    public final void f() {
        r22 r22Var = (r22) this.f;
        if (r22Var == null) {
            return;
        }
        r22Var.M(this.d ? Math.max(this.c, 0) : 0);
    }
}
