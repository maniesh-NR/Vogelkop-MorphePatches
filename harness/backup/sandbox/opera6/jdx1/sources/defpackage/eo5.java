package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class eo5 {
    public int b;
    public boolean c;
    public final uo5 d;
    public final int e;
    public eo5 f;
    public pvj i;
    public HashSet a = null;
    public int g = 0;
    public int h = LinearLayoutManager.INVALID_OFFSET;

    public eo5(uo5 uo5Var, int i) {
        this.d = uo5Var;
        this.e = i;
    }

    public final void a(eo5 eo5Var, int i) {
        b(eo5Var, i, LinearLayoutManager.INVALID_OFFSET, false);
    }

    public final boolean b(eo5 eo5Var, int i, int i2, boolean z) {
        if (eo5Var == null) {
            j();
            return true;
        }
        if (!z && !i(eo5Var)) {
            return false;
        }
        this.f = eo5Var;
        if (eo5Var.a == null) {
            eo5Var.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, e1o e1oVar, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                p37.D(((eo5) it.next()).d, i, arrayList, e1oVar);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        eo5 eo5Var;
        if (this.d.f0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (eo5Var = this.f) == null || eo5Var.d.f0 != 8) ? this.g : i;
    }

    public final eo5 f() {
        int i = this.e;
        int iA = vep.A(i);
        uo5 uo5Var = this.d;
        switch (iA) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return uo5Var.J;
            case 2:
                return uo5Var.K;
            case 3:
                return uo5Var.H;
            case 4:
                return uo5Var.I;
            default:
                qp2.g(u35.u(i));
                return null;
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((eo5) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(defpackage.eo5 r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L5f
            uo5 r1 = r10.d
            int r10 = r10.e
            r2 = 6
            int r3 = r9.e
            r4 = 1
            if (r10 != r3) goto L1a
            if (r3 != r2) goto L5d
            boolean r10 = r1.D
            if (r10 == 0) goto L5f
            uo5 r9 = r9.d
            boolean r9 = r9.D
            if (r9 != 0) goto L5d
            goto L5f
        L1a:
            int r9 = vep.A(r3)
            r5 = 4
            r6 = 2
            r7 = 9
            r8 = 8
            switch(r9) {
                case 0: goto L5f;
                case 1: goto L4e;
                case 2: goto L3b;
                case 3: goto L4e;
                case 4: goto L3b;
                case 5: goto L36;
                case 6: goto L2f;
                case 7: goto L5f;
                case 8: goto L5f;
                default: goto L27;
            }
        L27:
            java.lang.String r9 = u35.u(r3)
            qp2.g(r9)
            return r0
        L2f:
            if (r10 == r2) goto L5f
            if (r10 == r8) goto L5f
            if (r10 == r7) goto L5f
            goto L5d
        L36:
            if (r10 == r6) goto L5f
            if (r10 != r5) goto L5d
            goto L5f
        L3b:
            r9 = 3
            if (r10 == r9) goto L43
            r9 = 5
            if (r10 == r9) goto L43
            r9 = r0
            goto L44
        L43:
            r9 = r4
        L44:
            boolean r1 = r1 instanceof defpackage.r5a
            if (r1 == 0) goto L4d
            if (r9 != 0) goto L5d
            if (r10 != r7) goto L5f
            goto L5d
        L4d:
            return r9
        L4e:
            if (r10 == r6) goto L54
            if (r10 == r5) goto L54
            r9 = r0
            goto L55
        L54:
            r9 = r4
        L55:
            boolean r1 = r1 instanceof defpackage.r5a
            if (r1 == 0) goto L5e
            if (r9 != 0) goto L5d
            if (r10 != r8) goto L5f
        L5d:
            return r4
        L5e:
            return r9
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo5.i(eo5):boolean");
    }

    public final void j() {
        HashSet hashSet;
        eo5 eo5Var = this.f;
        if (eo5Var != null && (hashSet = eo5Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = LinearLayoutManager.INVALID_OFFSET;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        pvj pvjVar = this.i;
        if (pvjVar == null) {
            this.i = new pvj(1);
        } else {
            pvjVar.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.g0 + ":" + u35.u(this.e);
    }
}
