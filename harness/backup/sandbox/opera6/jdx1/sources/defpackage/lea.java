package defpackage;

/* loaded from: classes.dex */
public final class lea {
    public final b2c a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final dee f = new dee();
    public final cze g = new cze();
    public final sde h = new sde(10);

    public lea(b2c b2cVar) {
        this.a = b2cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List r19, boolean r20, long r21) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lea.a(java.util.List, boolean, long):void");
    }

    public final boolean b(rn9 rn9Var, boolean z) {
        cze czeVar = this.g;
        dfe dfeVar = czeVar.a;
        if (!czeVar.a((j1d) rn9Var.c, this.a, rn9Var, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = dfeVar.a;
        int i = dfeVar.c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((pye) objArr[i2]).e(rn9Var, z) || z3;
        }
        Object[] objArr2 = dfeVar.a;
        int i3 = dfeVar.c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((pye) objArr2[i4]).d(rn9Var) || z4;
        }
        czeVar.b(rn9Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            dee deeVar = this.f;
            int i5 = deeVar.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((b8e) deeVar.g(i6));
            }
            deeVar.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            czeVar.a.h();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        cze czeVar = this.g;
        dfe dfeVar = czeVar.a;
        Object[] objArr = dfeVar.a;
        int i = dfeVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((pye) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            czeVar.a.h();
        }
    }

    public final void d(b8e b8eVar) {
        if (this.b) {
            this.e = true;
            this.f.a(b8eVar);
            return;
        }
        cze czeVar = this.g;
        dee deeVar = czeVar.b;
        deeVar.d();
        deeVar.a(czeVar);
        while (deeVar.j()) {
            cze czeVar2 = (cze) deeVar.l(deeVar.b - 1);
            int i = 0;
            while (true) {
                dfe dfeVar = czeVar2.a;
                if (i < dfeVar.c) {
                    pye pyeVar = (pye) dfeVar.a[i];
                    if (pyeVar.c.equals(b8eVar)) {
                        czeVar2.a.k(pyeVar);
                        pyeVar.c();
                    } else {
                        deeVar.a(pyeVar);
                        i++;
                    }
                }
            }
        }
    }
}
