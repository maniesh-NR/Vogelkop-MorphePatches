package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public abstract class xye {
    public static final zde a;

    static {
        zde zdeVar = n6f.a;
        a = new zde();
    }

    public static final void a(b8e b8eVar, int i, int i2) throws pxb {
        if (!(b8eVar instanceof i17)) {
            b(b8eVar, b8eVar.c & i, i2);
            return;
        }
        i17 i17Var = (i17) b8eVar;
        int i3 = i17Var.o;
        b(b8eVar, i3 & i, i2);
        int i4 = i & (~i3);
        for (b8e b8eVar2 = i17Var.p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
            a(b8eVar2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(b8e b8eVar, int i, int i2) throws pxb {
        if (i2 != 0 || b8eVar.I0()) {
            if ((i & 2) != 0 && (b8eVar instanceof e3c)) {
                nb6.F((e3c) b8eVar);
                if (i2 == 2) {
                    ui6.c0(b8eVar, 2).m1();
                }
            }
            if ((i & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 && i2 != 2) {
                ui6.e0(b8eVar).E();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                ui6.e0(b8eVar).U(false);
            }
            if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 && (b8eVar instanceof gz9)) {
                if (i2 == 1) {
                    m3c m3cVarE0 = ui6.e0(b8eVar);
                    m3cVarE0.b0(m3cVarE0.P + 1);
                } else if (i2 == 2) {
                    ui6.e0(b8eVar).b0(r0.P - 1);
                }
                if (i2 != 2) {
                    m3c m3cVarE02 = ui6.e0(b8eVar);
                    if (m3cVarE02.P != 0 && !m3cVarE02.p() && !m3cVarE02.q() && !m3cVarE02.O) {
                        v31 v31VarA = p3c.a(m3cVarE02);
                        s6h s6hVar = (s6h) v31VarA.P.e;
                        if (m3cVarE02.P > 0) {
                            ((dfe) s6hVar.a).c(m3cVarE02);
                            m3cVarE02.O = true;
                        }
                        v31VarA.M(null);
                    }
                }
            }
            if ((i & 4) != 0 && (b8eVar instanceof lk7)) {
                c26.y((lk7) b8eVar);
            }
            if ((i & 8) != 0 && (b8eVar instanceof i0j)) {
                ui6.e0(b8eVar).r = true;
            }
            if ((i & 64) != 0 && (b8eVar instanceof z0g)) {
                q3c q3cVar = ui6.e0((z0g) b8eVar).G;
                q3cVar.p.q = true;
                u1d u1dVar = q3cVar.q;
                if (u1dVar != null) {
                    u1dVar.w = true;
                }
            }
            if ((i & 2048) != 0 && (b8eVar instanceof jg9)) {
                jg9 jg9Var = (jg9) b8eVar;
                zg4.b = null;
                jg9Var.p(zg4.a);
                if (zg4.b != null) {
                    b8e b8eVar2 = (b8e) jg9Var;
                    if (!b8eVar2.a.n) {
                        a8b.b("visitChildren called on an unattached node");
                    }
                    dfe dfeVar = new dfe(new b8e[16]);
                    b8e b8eVar3 = b8eVar2.a;
                    b8e b8eVar4 = b8eVar3.f;
                    if (b8eVar4 == null) {
                        ui6.h(dfeVar, b8eVar3);
                    } else {
                        dfeVar.c(b8eVar4);
                    }
                    while (true) {
                        int i3 = dfeVar.c;
                        if (i3 == 0) {
                            break;
                        }
                        b8e b8eVarU = (b8e) dfeVar.l(i3 - 1);
                        if ((b8eVarU.d & 1024) == 0) {
                            ui6.h(dfeVar, b8eVarU);
                        } else {
                            while (true) {
                                if (b8eVarU == null) {
                                    break;
                                }
                                if ((b8eVarU.c & 1024) != 0) {
                                    dfe dfeVar2 = null;
                                    while (b8eVarU != null) {
                                        if (b8eVarU instanceof vg9) {
                                            vg9 vg9Var = (vg9) b8eVarU;
                                            bg9 bg9Var = ui6.f0(vg9Var).l.d;
                                            if (bg9Var.c.a(vg9Var)) {
                                                bg9Var.a();
                                            }
                                        } else if ((b8eVarU.c & 1024) != 0 && (b8eVarU instanceof i17)) {
                                            int i4 = 0;
                                            for (b8e b8eVar5 = ((i17) b8eVarU).p; b8eVar5 != null; b8eVar5 = b8eVar5.f) {
                                                if ((b8eVar5.c & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        b8eVarU = b8eVar5;
                                                    } else {
                                                        if (dfeVar2 == null) {
                                                            dfeVar2 = new dfe(new b8e[16]);
                                                        }
                                                        if (b8eVarU != null) {
                                                            dfeVar2.c(b8eVarU);
                                                            b8eVarU = null;
                                                        }
                                                        dfeVar2.c(b8eVar5);
                                                    }
                                                }
                                            }
                                            if (i4 != 1) {
                                            }
                                        }
                                        b8eVarU = ui6.U(dfeVar2);
                                    }
                                } else {
                                    b8eVarU = b8eVarU.f;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (b8eVar instanceof nf9)) {
                nf9 nf9Var = (nf9) b8eVar;
                bg9 bg9Var2 = ui6.f0(nf9Var).l.d;
                if (bg9Var2.d.a(nf9Var)) {
                    bg9Var2.a();
                }
            }
            if ((i & 2097152) != 0 && (b8eVar instanceof v6b) && i2 == 2) {
                ((v6b) b8eVar).q0();
            }
        }
    }

    public static final void c(b8e b8eVar) throws pxb {
        if (!b8eVar.n) {
            a8b.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(b8eVar, -1, 0);
    }

    public static final int d(a8e a8eVar) {
        int i = a8eVar instanceof c3c ? 3 : 1;
        if (a8eVar instanceof d6b) {
            i |= 4;
        }
        if (a8eVar instanceof g0j) {
            i |= 8;
        }
        if (a8eVar instanceof smg) {
            i |= 16;
        }
        if (a8eVar instanceof f8e) {
            i |= 32;
        }
        if (a8eVar instanceof y0g) {
            i |= 64;
        }
        return a8eVar instanceof ms3 ? i | 524288 : i;
    }

    public static final int e(b8e b8eVar) {
        int i = b8eVar.c;
        if (i != 0) {
            return i;
        }
        Class<?> cls = b8eVar.getClass();
        zde zdeVar = a;
        int iD = zdeVar.d(cls);
        if (iD >= 0) {
            return zdeVar.c[iD];
        }
        int i2 = b8eVar instanceof e3c ? 3 : 1;
        if (b8eVar instanceof lk7) {
            i2 |= 4;
        }
        if (b8eVar instanceof i0j) {
            i2 |= 8;
        }
        if (b8eVar instanceof omg) {
            i2 |= 16;
        }
        if (b8eVar instanceof e8e) {
            i2 |= 32;
        }
        if (b8eVar instanceof z0g) {
            i2 |= 64;
        }
        if (b8eVar instanceof z1c) {
            i2 |= 4194432;
        } else if (b8eVar instanceof xfd) {
            i2 |= NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (b8eVar instanceof gz9) {
            i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (b8eVar instanceof vg9) {
            i2 |= 1024;
        }
        if (b8eVar instanceof jg9) {
            i2 |= 2048;
        }
        if (b8eVar instanceof nf9) {
            i2 |= 4096;
        }
        if (b8eVar instanceof tub) {
            i2 |= 8192;
        }
        if (b8eVar instanceof p31) {
            i2 |= 16384;
        }
        if (b8eVar instanceof hi5) {
            i2 |= 32768;
        }
        if (b8eVar instanceof u5m) {
            i2 |= 262144;
        }
        if (b8eVar instanceof ms3) {
            i2 |= 524288;
        }
        if (b8eVar instanceof smm) {
            i2 |= 1048576;
        }
        if (b8eVar instanceof v6b) {
            i2 |= 2097152;
        }
        if (b8eVar instanceof e5c) {
            i2 |= 8388608;
        }
        zdeVar.g(i2, cls);
        return i2;
    }

    public static final int f(b8e b8eVar) {
        if (!(b8eVar instanceof i17)) {
            return e(b8eVar);
        }
        i17 i17Var = (i17) b8eVar;
        int iF = i17Var.o;
        for (b8e b8eVar2 = i17Var.p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
            iF |= f(b8eVar2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) | ((i & 4194304) != 0);
    }
}
