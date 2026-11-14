package defpackage;

/* loaded from: classes.dex */
public final class uye implements vye {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [b8e] */
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
    @Override // defpackage.vye
    public final boolean b(b8e b8eVar) {
        ?? dfeVar = 0;
        while (true) {
            int i = 0;
            if (b8eVar == 0) {
                return false;
            }
            if (b8eVar instanceof omg) {
                ((omg) b8eVar).w();
            } else if ((b8eVar.c & 16) != 0 && (b8eVar instanceof i17)) {
                b8e b8eVar2 = b8eVar.p;
                dfeVar = dfeVar;
                b8eVar = b8eVar;
                while (b8eVar2 != null) {
                    if ((b8eVar2.c & 16) != 0) {
                        i++;
                        dfeVar = dfeVar;
                        if (i == 1) {
                            b8eVar = b8eVar2;
                        } else {
                            if (dfeVar == 0) {
                                dfeVar = new dfe(new b8e[16]);
                            }
                            if (b8eVar != 0) {
                                dfeVar.c(b8eVar);
                                b8eVar = 0;
                            }
                            dfeVar.c(b8eVar2);
                        }
                    }
                    b8eVar2 = b8eVar2.f;
                    dfeVar = dfeVar;
                    b8eVar = b8eVar;
                }
                if (i != 1) {
                }
            }
            b8eVar = ui6.U(dfeVar);
        }
    }

    @Override // defpackage.vye
    public final int c() {
        return 16;
    }

    @Override // defpackage.vye
    public final void p(m3c m3cVar, long j, oea oeaVar, int i, boolean z) {
        m3cVar.A(j, oeaVar, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [b8e] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [b8e] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.vye
    public final boolean q(oea oeaVar, m3c m3cVar) {
        wye wyeVar = (wye) m3cVar.F.e;
        wyeVar.getClass();
        b8e b8eVarC1 = wyeVar.c1(xye.g(16));
        if (b8eVarC1 != null && b8eVarC1.n) {
            if (!b8eVarC1.a.n) {
                a8b.b("visitLocalDescendants called on an unattached node");
            }
            b8e b8eVar = b8eVarC1.a;
            if ((b8eVar.d & 16) != 0) {
                while (b8eVar != null) {
                    if ((b8eVar.c & 16) != 0) {
                        i17 i17VarU = b8eVar;
                        ?? dfeVar = 0;
                        while (i17VarU != 0) {
                            if (i17VarU instanceof omg) {
                                if (((omg) i17VarU).x0()) {
                                    oeaVar.c = oeaVar.a.b - 1;
                                    return true;
                                }
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
                    }
                    b8eVar = b8eVar.f;
                }
            }
        }
        return false;
    }

    @Override // defpackage.vye
    public final boolean u(m3c m3cVar) {
        return true;
    }
}
