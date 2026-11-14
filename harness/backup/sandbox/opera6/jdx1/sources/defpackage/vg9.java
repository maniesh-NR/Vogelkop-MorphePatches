package defpackage;

import android.os.Trace;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vg9 extends b8e implements hi5, j7f, e8e, smm, f17 {
    public final boolean o;
    public final Function2 p;
    public boolean q;
    public boolean r;
    public final int s;
    public p8f t;

    public vg9(int i, Function2 function2, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        function2 = (i2 & 4) != 0 ? null : function2;
        this.o = z;
        this.p = function2;
        this.s = i;
    }

    public static boolean b1(vg9 vg9Var) {
        return vg9Var.a1(7);
    }

    @Override // defpackage.smm
    public final void G0() {
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    public final void J() {
        Z0();
    }

    @Override // defpackage.b8e
    public final void L0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    @Override // defpackage.b8e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0() {
        /*
            r4 = this;
            qg9 r0 = r4.Y0()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 == r1) goto L17
            r2 = 2
            if (r0 == r2) goto L32
            r1 = 3
            if (r0 == r1) goto L4c
            h9o.p()
            return
        L17:
            v31 r0 = defpackage.ui6.f0(r4)
            gg9 r0 = r0.l
            vg9 r2 = defpackage.gyg.r(r4)
            if (r2 == 0) goto L4c
            boolean r2 = r2.o
            if (r2 != r1) goto L4c
            v31 r1 = r0.a
            r1.K()
            bg9 r0 = r0.d
            r0.a()
            goto L4c
        L32:
            v31 r0 = defpackage.ui6.f0(r4)
            gg9 r0 = r0.l
            r2 = 0
            r3 = 8
            r0.b(r3, r1, r2)
            boolean r1 = r4.o
            if (r1 == 0) goto L47
            v31 r1 = r0.a
            r1.K()
        L47:
            bg9 r0 = r0.d
            r0.a()
        L4c:
            p8f r0 = r4.t
            if (r0 == 0) goto L53
            r0.K()
        L53:
            r0 = 0
            r4.t = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg9.M0():void");
    }

    @Override // defpackage.b8e
    public final void N0() {
        if (Y0().g()) {
            ui6.f0(this).l.b(8, true, true);
        }
    }

    public final boolean T0(int i) {
        int iOrdinal = k1g.V(this, i).ordinal();
        if (iOrdinal == 0) {
            return k1g.W(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        h9o.p();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [b8e] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [b8e] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [dfe] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [dfe] */
    public final void U0(qg9 qg9Var, qg9 qg9Var2) {
        tah tahVar;
        Function2 function2;
        gg9 gg9Var = ui6.f0(this).l;
        vg9 vg9VarF = gg9Var.f();
        if (!qg9Var.equals(qg9Var2) && (function2 = this.p) != null) {
            function2.invoke(qg9Var, qg9Var2);
        }
        b8e b8eVar = this.a;
        if (!b8eVar.n) {
            a8b.b("visitAncestors called on an unattached node");
        }
        b8e b8eVar2 = this.a;
        m3c m3cVarE0 = ui6.e0(this);
        while (m3cVarE0 != null) {
            if ((((b8e) m3cVarE0.F.g).d & 5120) != 0) {
                while (b8eVar2 != null) {
                    int i = b8eVar2.c;
                    if ((i & 5120) != 0) {
                        if (b8eVar2 != b8eVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            i17 i17VarU = b8eVar2;
                            ?? dfeVar = 0;
                            while (i17VarU != 0) {
                                if (i17VarU instanceof nf9) {
                                    nf9 nf9Var = (nf9) i17VarU;
                                    if (vg9VarF == gg9Var.f()) {
                                        nf9Var.r(qg9Var2);
                                    }
                                } else if ((i17VarU.c & 4096) != 0 && (i17VarU instanceof i17)) {
                                    b8e b8eVar3 = i17VarU.p;
                                    int i2 = 0;
                                    i17VarU = i17VarU;
                                    dfeVar = dfeVar;
                                    while (b8eVar3 != null) {
                                        if ((b8eVar3.c & 4096) != 0) {
                                            i2++;
                                            dfeVar = dfeVar;
                                            if (i2 == 1) {
                                                i17VarU = b8eVar3;
                                            } else {
                                                if (dfeVar == 0) {
                                                    dfeVar = new dfe(new b8e[16]);
                                                }
                                                if (i17VarU != 0) {
                                                    dfeVar.c(i17VarU);
                                                    i17VarU = 0;
                                                }
                                                dfeVar.c(b8eVar3);
                                            }
                                        }
                                        b8eVar3 = b8eVar3.f;
                                        i17VarU = i17VarU;
                                        dfeVar = dfeVar;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                i17VarU = ui6.U(dfeVar);
                            }
                        }
                    }
                    b8eVar2 = b8eVar2.e;
                }
            }
            m3cVarE0 = m3cVarE0.u();
            b8eVar2 = (m3cVarE0 == null || (tahVar = m3cVarE0.F) == null) ? null : (lbl) tahVar.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [b8e] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [b8e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [dfe] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [dfe] */
    public final ig9 V0() {
        boolean z;
        tah tahVar;
        ig9 ig9Var = new ig9();
        ig9Var.a = true;
        kg9 kg9Var = kg9.b;
        ig9Var.b = kg9Var;
        ig9Var.c = kg9Var;
        ig9Var.d = kg9Var;
        ig9Var.e = kg9Var;
        ig9Var.f = kg9Var;
        ig9Var.g = kg9Var;
        ig9Var.h = kg9Var;
        ig9Var.i = kg9Var;
        ig9Var.j = new d58((byte) 21);
        ig9Var.k = new d58((byte) 22);
        ig9Var.l = ujp.j;
        int i = this.s;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((b9b) ((c9b) z4o.N(this, mi5.m)).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                qp2.n("Unknown Focusability");
                return null;
            }
            z = false;
        }
        ig9Var.a = z;
        b8e b8eVar = this.a;
        if (!b8eVar.n) {
            a8b.b("visitAncestors called on an unattached node");
        }
        b8e b8eVar2 = this.a;
        m3c m3cVarE0 = ui6.e0(this);
        loop0: while (m3cVarE0 != null) {
            if ((((b8e) m3cVarE0.F.g).d & 3072) != 0) {
                while (b8eVar2 != null) {
                    int i2 = b8eVar2.c;
                    if ((i2 & 3072) != 0) {
                        if (b8eVar2 != b8eVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? dfeVar = 0;
                            i17 i17VarU = b8eVar2;
                            while (i17VarU != 0) {
                                if (i17VarU instanceof jg9) {
                                    ((jg9) i17VarU).p(ig9Var);
                                } else if ((i17VarU.c & 2048) != 0 && (i17VarU instanceof i17)) {
                                    b8e b8eVar3 = i17VarU.p;
                                    int i3 = 0;
                                    i17VarU = i17VarU;
                                    dfeVar = dfeVar;
                                    while (b8eVar3 != null) {
                                        if ((b8eVar3.c & 2048) != 0) {
                                            i3++;
                                            dfeVar = dfeVar;
                                            if (i3 == 1) {
                                                i17VarU = b8eVar3;
                                            } else {
                                                if (dfeVar == 0) {
                                                    dfeVar = new dfe(new b8e[16]);
                                                }
                                                if (i17VarU != 0) {
                                                    dfeVar.c(i17VarU);
                                                    i17VarU = 0;
                                                }
                                                dfeVar.c(b8eVar3);
                                            }
                                        }
                                        b8eVar3 = b8eVar3.f;
                                        i17VarU = i17VarU;
                                        dfeVar = dfeVar;
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                                i17VarU = ui6.U(dfeVar);
                            }
                        }
                    }
                    b8eVar2 = b8eVar2.e;
                }
            }
            m3cVarE0 = m3cVarE0.u();
            b8eVar2 = (m3cVarE0 == null || (tahVar = m3cVarE0.F) == null) ? null : (lbl) tahVar.f;
        }
        return ig9Var;
    }

    public final voh W0(b2c b2cVar) {
        voh vohVar = V0().l;
        return vohVar != ujp.j ? b2cVar == null ? vohVar : vohVar.i(b2cVar.x(ui6.d0(this), 0L)) : b2cVar != null ? b2cVar.y(ui6.d0(this), false) : bwg.a(0L, fr3.g0(ui6.d0(this).c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.e5c X0() throws pxb {
        /*
            r6 = this;
            b8e r0 = r6.a
            boolean r0 = r0.n
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.a8b.b(r0)
        Lb:
            b8e r0 = r6.a
            b8e r0 = r0.e
            m3c r6 = defpackage.ui6.e0(r6)
        L13:
            r1 = 0
            if (r6 == 0) goto L9e
            tah r2 = r6.F
            java.lang.Object r2 = r2.g
            b8e r2 = (defpackage.b8e) r2
            int r2 = r2.d
            r3 = 8388640(0x800020, float:1.1754988E-38)
            r2 = r2 & r3
            if (r2 == 0) goto L8b
        L24:
            if (r0 == 0) goto L8b
            int r2 = r0.c
            r4 = r2 & r3
            if (r4 == 0) goto L88
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r4 = r4 & r2
            if (r4 == 0) goto L4e
            boolean r6 = r0 instanceof defpackage.e5c
            if (r6 != 0) goto L49
            boolean r6 = r0 instanceof defpackage.i17
            if (r6 == 0) goto L48
            i17 r0 = (defpackage.i17) r0
            b8e r6 = r0.p
            r0 = r1
        L3e:
            if (r6 == 0) goto L49
            boolean r2 = r6 instanceof defpackage.e5c
            if (r2 == 0) goto L45
            r0 = r6
        L45:
            b8e r6 = r6.f
            goto L3e
        L48:
            r0 = r1
        L49:
            e5c r0 = (defpackage.e5c) r0
            if (r0 == 0) goto L9e
            return r0
        L4e:
            r2 = r2 & 32
            if (r2 == 0) goto L88
            boolean r2 = r0 instanceof defpackage.e8e
            if (r2 == 0) goto L58
            r4 = r0
            goto L6d
        L58:
            boolean r2 = r0 instanceof defpackage.i17
            if (r2 == 0) goto L6c
            r2 = r0
            i17 r2 = (defpackage.i17) r2
            b8e r2 = r2.p
            r4 = r1
        L62:
            if (r2 == 0) goto L6d
            boolean r5 = r2 instanceof defpackage.e8e
            if (r5 == 0) goto L69
            r4 = r2
        L69:
            b8e r2 = r2.f
            goto L62
        L6c:
            r4 = r1
        L6d:
            e8e r4 = (defpackage.e8e) r4
            if (r4 == 0) goto L88
            j14 r2 = r4.B()
            h7h r5 = defpackage.mkh.a
            boolean r2 = r2.x(r5)
            if (r2 == 0) goto L88
            j14 r6 = r4.B()
            java.lang.Object r6 = r6.I()
            e5c r6 = (defpackage.e5c) r6
            return r6
        L88:
            b8e r0 = r0.e
            goto L24
        L8b:
            m3c r6 = r6.u()
            if (r6 == 0) goto L9b
            tah r0 = r6.F
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r0.f
            lbl r0 = (defpackage.lbl) r0
            goto L13
        L9b:
            r0 = r1
            goto L13
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg9.X0():e5c");
    }

    public final qg9 Y0() {
        vg9 vg9VarF;
        tah tahVar;
        if (this.n && (vg9VarF = ui6.f0(this).l.f()) != null) {
            if (this == vg9VarF) {
                return qg9.a;
            }
            if (vg9VarF.n) {
                if (!vg9VarF.a.n) {
                    a8b.b("visitAncestors called on an unattached node");
                }
                b8e b8eVar = vg9VarF.a.e;
                m3c m3cVarE0 = ui6.e0(vg9VarF);
                while (m3cVarE0 != null) {
                    if ((((b8e) m3cVarE0.F.g).d & 1024) != 0) {
                        while (b8eVar != null) {
                            if ((b8eVar.c & 1024) != 0) {
                                b8e b8eVarU = b8eVar;
                                dfe dfeVar = null;
                                while (b8eVarU != null) {
                                    if (b8eVarU instanceof vg9) {
                                        if (this == ((vg9) b8eVarU)) {
                                            return qg9.b;
                                        }
                                    } else if ((b8eVarU.c & 1024) != 0 && (b8eVarU instanceof i17)) {
                                        int i = 0;
                                        for (b8e b8eVar2 = ((i17) b8eVarU).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                                            if ((b8eVar2.c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    b8eVarU = b8eVar2;
                                                } else {
                                                    if (dfeVar == null) {
                                                        dfeVar = new dfe(new b8e[16]);
                                                    }
                                                    if (b8eVarU != null) {
                                                        dfeVar.c(b8eVarU);
                                                        b8eVarU = null;
                                                    }
                                                    dfeVar.c(b8eVar2);
                                                }
                                            }
                                        }
                                        if (i != 1) {
                                        }
                                    }
                                    b8eVarU = ui6.U(dfeVar);
                                }
                            }
                            b8eVar = b8eVar.e;
                        }
                    }
                    m3cVarE0 = m3cVarE0.u();
                    b8eVar = (m3cVarE0 == null || (tahVar = m3cVarE0.F) == null) ? null : (lbl) tahVar.f;
                }
            }
            return qg9.c;
        }
        return qg9.c;
    }

    public final void Z0() {
        int iOrdinal = Y0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    h9o.p();
                    return;
                }
                return;
            }
        }
        pqh pqhVar = new pqh();
        x7d.y(this, new gv8(pqhVar, this, (byte) 3));
        Object obj = pqhVar.a;
        if ((obj == null ? null : (hg9) obj).d()) {
            return;
        }
        ui6.f0(this).l.b(8, true, true);
    }

    public final boolean a1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return V0().a ? T0(i) : xgh.k(this, i, new r95((byte) 2, i));
        } finally {
            Trace.endSection();
        }
    }
}
