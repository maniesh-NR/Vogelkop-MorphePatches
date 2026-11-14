package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class l0n implements q8j {
    public final t7j a;
    public final g77 b;
    public j92 c;
    public vz5 d;
    public vz5 e;
    public boolean f;
    public boolean g;
    public Object h;

    public l0n(t7j t7jVar, g77 g77Var) {
        this.a = t7jVar;
        this.b = g77Var;
        e();
    }

    @Override // defpackage.q8j
    public final void a() {
        if (this.h == null || this.d == null) {
            f();
            return;
        }
        this.g = false;
        j92 j92Var = this.c;
        if (j92Var == null || !j92Var.h()) {
            return;
        }
        e();
    }

    public final za9 b() {
        za9 za9Var = new za9();
        for (cdg cdgVar : this.c.b()) {
            za9Var.a |= cdgVar.a.b;
            za9Var.b |= cdgVar.b.b || cdgVar.c.b;
        }
        return za9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // defpackage.q8j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r9) {
        /*
            r8 = this;
            vz5 r0 = r8.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L52
            if (r9 == 0) goto L4f
            r3 = r9
            z05 r3 = (defpackage.z05) r3
            java.lang.Object r0 = r0.e
            z05 r0 = (defpackage.z05) r0
            bre r4 = r0.i
            bre r5 = r3.i
            if (r4 != 0) goto L1b
            if (r5 != 0) goto L19
            r4 = r2
            goto L1f
        L19:
            r4 = r1
            goto L1f
        L1b:
            boolean r4 = r4.equals(r5)
        L1f:
            if (r4 == 0) goto L4f
            boolean r4 = r0.k
            boolean r5 = r3.k
            if (r4 != r5) goto L4f
            java.lang.String r4 = r0.d
            java.lang.String r5 = r3.d
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L4f
            yla r4 = r0.a
            java.net.URL r4 = r4.a
            java.lang.String r4 = r4.toString()
            yla r5 = r3.a
            java.net.URL r5 = r5.a
            java.lang.String r5 = r5.toString()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4f
            long r4 = r0.b
            long r6 = r3.b
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L52
        L4f:
            r8.f()
        L52:
            r8.f = r1
            r8.h = r9
            r8.g = r2
            j92 r9 = r8.c
            if (r9 != 0) goto L5d
            return
        L5d:
            za9 r9 = r8.b()
            boolean r0 = r9.a
            if (r0 != 0) goto L6a
            boolean r9 = r9.b
            if (r9 != 0) goto L6a
            return
        L6a:
            java.lang.Object r9 = r8.h
            if (r9 == 0) goto L7c
            vz5 r9 = r8.e
            if (r9 == 0) goto L78
            r9.a()
            r9 = 0
            r8.e = r9
        L78:
            r8.d(r2)
            return
        L7c:
            j92 r8 = r8.c
            r8.onFailure()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0n.c(java.lang.Object):void");
    }

    public final void d(boolean z) {
        z05 z05Var = (z05) this.h;
        g77 g77Var = this.b;
        this.e = new vz5(z05Var, (qre) g77Var.b, (s9i) g77Var.a, (x5f) g77Var.c);
        List listF = z ? Collections.EMPTY_LIST : this.c.f();
        vz5 vz5Var = this.e;
        qt6 qt6Var = new qt6();
        qt6Var.f = this;
        qt6Var.c = new ArrayList();
        qt6Var.d = new ArrayList();
        ArrayList arrayList = new ArrayList();
        qt6Var.e = arrayList;
        arrayList.addAll(listF);
        vz5Var.i = qt6Var;
        vz5 vz5Var2 = this.d;
        if (vz5Var2 != null) {
            vz5Var2.a();
        }
        this.e.c(null);
    }

    public final void e() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.a.b(this);
    }

    public final void f() {
        this.g = false;
        this.h = null;
        vz5 vz5Var = this.d;
        if (vz5Var != null) {
            vz5Var.a();
            this.d = null;
        }
        vz5 vz5Var2 = this.e;
        if (vz5Var2 != null) {
            vz5Var2.a();
            this.e = null;
        }
        j92 j92Var = this.c;
        if (j92Var == null || !j92Var.h()) {
            return;
        }
        this.c.a();
        za9 za9VarB = b();
        if (za9VarB.a || za9VarB.b) {
            e();
        }
    }
}
