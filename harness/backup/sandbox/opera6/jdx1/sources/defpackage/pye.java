package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class pye extends cze {
    public final b8e c;
    public final j0d d;
    public final j1d e;
    public wye f;
    public fmg g;
    public boolean h;
    public boolean i;
    public boolean j;

    public pye(b8e b8eVar) {
        this.c = b8eVar;
        j0d j0dVar = new j0d();
        j0dVar.c = new long[2];
        this.d = j0dVar;
        this.e = new j1d(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d2 A[EDGE_INSN: B:142:0x02d2->B:143:0x02d4 BREAK  A[LOOP:8: B:137:0x02b5->B:140:0x02cd]] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [b8e] */
    /* JADX WARN: Type inference failed for: r5v1, types: [b8e] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [b8e] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [dfe] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [dfe] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // defpackage.cze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.j1d r56, defpackage.b2c r57, rn9 r58, boolean r59) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pye.a(j1d, b2c, rn9, boolean):boolean");
    }

    @Override // defpackage.cze
    public final void b(rn9 rn9Var) {
        super.b(rn9Var);
        fmg fmgVar = this.g;
        if (fmgVar == null) {
            return;
        }
        this.h = this.i;
        List list = fmgVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lmg lmgVar = (lmg) list.get(i);
            boolean z = lmgVar.d;
            long j = lmgVar.a;
            boolean zF = rn9Var.f(j);
            boolean z2 = this.i;
            if (!z && (!zF || !z2)) {
                this.d.e(j);
            }
        }
        this.i = false;
        this.j = fmgVar.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [dfe] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [dfe] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [b8e] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [b8e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [b8e] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        dfe dfeVar = this.a;
        Object[] objArr = dfeVar.a;
        int i = dfeVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((pye) objArr[i2]).c();
        }
        i17 i17VarU = this.c;
        ?? dfeVar2 = 0;
        while (i17VarU != 0) {
            if (i17VarU instanceof omg) {
                ((omg) i17VarU).g0();
            } else if ((i17VarU.c & 16) != 0 && (i17VarU instanceof i17)) {
                b8e b8eVar = i17VarU.p;
                int i3 = 0;
                dfeVar2 = dfeVar2;
                i17VarU = i17VarU;
                while (b8eVar != null) {
                    if ((b8eVar.c & 16) != 0) {
                        i3++;
                        dfeVar2 = dfeVar2;
                        if (i3 == 1) {
                            i17VarU = b8eVar;
                        } else {
                            if (dfeVar2 == 0) {
                                dfeVar2 = new dfe(new b8e[16]);
                            }
                            if (i17VarU != 0) {
                                dfeVar2.c(i17VarU);
                                i17VarU = 0;
                            }
                            dfeVar2.c(b8eVar);
                        }
                    }
                    b8eVar = b8eVar.f;
                    dfeVar2 = dfeVar2;
                    i17VarU = i17VarU;
                }
                if (i3 != 1) {
                }
            }
            i17VarU = ui6.U(dfeVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [b8e] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [b8e] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(rn9 rn9Var) {
        m3c m3cVar;
        j1d j1dVar = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (j1dVar.j() != 0) {
            b8e b8eVar = this.c;
            if (b8eVar.n) {
                wye wyeVar = b8eVar.h;
                if ((wyeVar == null || (m3cVar = wyeVar.u) == null) ? false : m3cVar.I()) {
                    fmg fmgVar = this.g;
                    long j = this.f.c;
                    i17 i17VarU = b8eVar;
                    ?? dfeVar = 0;
                    while (i17VarU != 0) {
                        if (i17VarU instanceof omg) {
                            ((omg) i17VarU).n(fmgVar, gmg.c, j);
                        } else if ((i17VarU.c & 16) != 0 && (i17VarU instanceof i17)) {
                            b8e b8eVar2 = i17VarU.p;
                            int i = 0;
                            i17VarU = i17VarU;
                            dfeVar = dfeVar;
                            while (b8eVar2 != null) {
                                if ((b8eVar2.c & 16) != 0) {
                                    i++;
                                    dfeVar = dfeVar;
                                    if (i == 1) {
                                        i17VarU = b8eVar2;
                                    } else {
                                        if (dfeVar == 0) {
                                            dfeVar = new dfe(new b8e[16]);
                                        }
                                        if (i17VarU != 0) {
                                            dfeVar.c(i17VarU);
                                            i17VarU = 0;
                                        }
                                        dfeVar.c(b8eVar2);
                                    }
                                }
                                b8eVar2 = b8eVar2.f;
                                i17VarU = i17VarU;
                                dfeVar = dfeVar;
                            }
                            if (i != 1) {
                            }
                        }
                        i17VarU = ui6.U(dfeVar);
                    }
                    if (b8eVar.n) {
                        dfe dfeVar2 = this.a;
                        Object[] objArr = dfeVar2.a;
                        int i2 = dfeVar2.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((pye) objArr[i3]).d(rn9Var);
                        }
                    }
                    z = true;
                }
            }
        }
        b(rn9Var);
        j1dVar.b();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [b8e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [b8e] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [b8e] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [dfe] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [dfe] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [b8e] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [b8e] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [dfe] */
    public final boolean e(rn9 rn9Var, boolean z) {
        m3c m3cVar;
        if (this.e.j() == 0) {
            return false;
        }
        i17 i17VarU = this.c;
        if (i17VarU.n) {
            wye wyeVar = i17VarU.h;
            if ((wyeVar == null || (m3cVar = wyeVar.u) == null) ? false : m3cVar.I()) {
                fmg fmgVar = this.g;
                long j = this.f.c;
                i17 i17VarU2 = i17VarU;
                ?? dfeVar = 0;
                while (i17VarU2 != 0) {
                    if (i17VarU2 instanceof omg) {
                        ((omg) i17VarU2).n(fmgVar, gmg.a, j);
                    } else if ((i17VarU2.c & 16) != 0 && (i17VarU2 instanceof i17)) {
                        b8e b8eVar = i17VarU2.p;
                        int i = 0;
                        i17VarU2 = i17VarU2;
                        dfeVar = dfeVar;
                        while (b8eVar != null) {
                            if ((b8eVar.c & 16) != 0) {
                                i++;
                                dfeVar = dfeVar;
                                if (i == 1) {
                                    i17VarU2 = b8eVar;
                                } else {
                                    if (dfeVar == 0) {
                                        dfeVar = new dfe(new b8e[16]);
                                    }
                                    if (i17VarU2 != 0) {
                                        dfeVar.c(i17VarU2);
                                        i17VarU2 = 0;
                                    }
                                    dfeVar.c(b8eVar);
                                }
                            }
                            b8eVar = b8eVar.f;
                            i17VarU2 = i17VarU2;
                            dfeVar = dfeVar;
                        }
                        if (i != 1) {
                        }
                    }
                    i17VarU2 = ui6.U(dfeVar);
                }
                if (i17VarU.n) {
                    dfe dfeVar2 = this.a;
                    Object[] objArr = dfeVar2.a;
                    int i2 = dfeVar2.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((pye) objArr[i3]).e(rn9Var, z);
                    }
                }
                if (i17VarU.n) {
                    ?? dfeVar3 = 0;
                    while (i17VarU != 0) {
                        if (i17VarU instanceof omg) {
                            ((omg) i17VarU).n(fmgVar, gmg.b, j);
                        } else if ((i17VarU.c & 16) != 0 && (i17VarU instanceof i17)) {
                            b8e b8eVar2 = i17VarU.p;
                            int i4 = 0;
                            i17VarU = i17VarU;
                            dfeVar3 = dfeVar3;
                            while (b8eVar2 != null) {
                                if ((b8eVar2.c & 16) != 0) {
                                    i4++;
                                    dfeVar3 = dfeVar3;
                                    if (i4 == 1) {
                                        i17VarU = b8eVar2;
                                    } else {
                                        if (dfeVar3 == 0) {
                                            dfeVar3 = new dfe(new b8e[16]);
                                        }
                                        if (i17VarU != 0) {
                                            dfeVar3.c(i17VarU);
                                            i17VarU = 0;
                                        }
                                        dfeVar3.c(b8eVar2);
                                    }
                                }
                                b8eVar2 = b8eVar2.f;
                                i17VarU = i17VarU;
                                dfeVar3 = dfeVar3;
                            }
                            if (i4 != 1) {
                            }
                        }
                        i17VarU = ui6.U(dfeVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, dee deeVar) {
        j0d j0dVar = this.d;
        if (j0dVar.c(j) && !deeVar.e(this)) {
            j0dVar.e(j);
            this.e.i(j);
        }
        dfe dfeVar = this.a;
        Object[] objArr = dfeVar.a;
        int i = dfeVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((pye) objArr[i2]).f(j, deeVar);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
