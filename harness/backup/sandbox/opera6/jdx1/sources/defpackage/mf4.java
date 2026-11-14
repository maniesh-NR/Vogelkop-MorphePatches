package defpackage;

import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mf4 {
    public final Object a = new Object();
    public final ua7 b = new ua7((byte) 20);
    public final ode c = new ode();
    public nd4 d;
    public yd4 e;
    public vm2 f;
    public boolean g;
    public final LinkedHashMap h;

    public mf4() {
        yd4 yd4Var = yd4.c;
        this.e = yd4Var;
        this.h = new LinkedHashMap();
        c(yd4Var, null);
    }

    public final void a(nd4 nd4Var, n3a n3aVar) {
        lf4 lf4Var;
        if (!Intrinsics.a(nd4Var, this.d)) {
            if (gyg.G(3, "CXCP")) {
                Objects.toString(n3aVar);
                return;
            }
            return;
        }
        yd4 yd4Var = this.e;
        j3a j3aVar = j3a.b;
        j3a j3aVar2 = j3a.c;
        int iOrdinal = yd4Var.ordinal();
        lf4 lf4Var2 = null;
        yd4 yd4Var2 = yd4.g;
        yd4 yd4Var3 = yd4.f;
        if (iOrdinal != 2) {
            yd4 yd4Var4 = yd4.d;
            yd4 yd4Var5 = yd4.c;
            if (iOrdinal != 3) {
                k3a k3aVar = k3a.b;
                yd4 yd4Var6 = yd4.e;
                if (iOrdinal != 4) {
                    l3a l3aVar = l3a.b;
                    if (iOrdinal == 5) {
                        if (n3aVar.equals(j3aVar)) {
                            lf4Var = new lf4(yd4Var2, null);
                        } else if (n3aVar instanceof i3a) {
                            i3a i3aVar = (i3a) n3aVar;
                            byte b = i3aVar.b;
                            lf4Var2 = i3aVar.c ? new lf4(yd4Var3, x1p.W(b)) : x1p.E(b) ? new lf4(yd4Var4, x1p.W(b)) : new lf4(yd4Var6, x1p.W(b));
                        } else if (n3aVar.equals(l3aVar)) {
                            lf4Var = new lf4(yd4Var6, null);
                        } else if (n3aVar.equals(k3aVar)) {
                            lf4Var = new lf4(yd4Var5, null);
                        }
                        lf4Var2 = lf4Var;
                    } else if (iOrdinal == 6) {
                        if (n3aVar.equals(l3aVar)) {
                            lf4Var = new lf4(yd4Var6, null);
                        } else if (n3aVar.equals(k3aVar)) {
                            lf4Var = new lf4(yd4Var5, null);
                        } else if (n3aVar instanceof i3a) {
                            byte b2 = ((i3a) n3aVar).b;
                            lf4Var2 = x1p.E(b2) ? new lf4(yd4Var4, x1p.W(b2)) : new lf4(yd4Var5, x1p.W(b2));
                        }
                        lf4Var2 = lf4Var;
                    }
                } else {
                    if (n3aVar.equals(k3aVar)) {
                        lf4Var = new lf4(yd4Var5, null);
                    } else if (n3aVar.equals(j3aVar2)) {
                        lf4Var = new lf4(yd4Var3, null);
                    } else if (n3aVar instanceof i3a) {
                        lf4Var2 = new lf4(yd4Var6, x1p.W(((i3a) n3aVar).b));
                    }
                    lf4Var2 = lf4Var;
                }
            } else {
                if (n3aVar.equals(j3aVar2)) {
                    lf4Var = new lf4(yd4Var3, null);
                } else if (n3aVar.equals(j3aVar)) {
                    lf4Var = new lf4(yd4Var2, null);
                } else if (n3aVar instanceof i3a) {
                    byte b3 = ((i3a) n3aVar).b;
                    lf4Var2 = x1p.E(b3) ? new lf4(yd4Var4, x1p.W(b3)) : new lf4(yd4Var5, x1p.W(b3));
                }
                lf4Var2 = lf4Var;
            }
        } else {
            if (n3aVar.equals(j3aVar2)) {
                lf4Var = new lf4(yd4Var3, null);
            } else if (n3aVar.equals(j3aVar)) {
                lf4Var = new lf4(yd4Var2, null);
            }
            lf4Var2 = lf4Var;
        }
        if (lf4Var2 == null) {
            if (gyg.G(5, "CXCP")) {
                Objects.toString(this.e);
                Objects.toString(n3aVar);
                return;
            }
            return;
        }
        this.e = lf4Var2.a;
        this.f = lf4Var2.b;
        if (gyg.G(3, "CXCP")) {
            lf4Var2.toString();
        }
        c(this.e, this.f);
    }

    public final void b(nd4 nd4Var, n3a n3aVar) {
        synchronized (this.a) {
            if (!this.g) {
                if (gyg.G(3, "CXCP")) {
                    Objects.toString(n3aVar);
                }
                a(nd4Var, n3aVar);
            } else if (gyg.G(5, "CXCP")) {
                Objects.toString(n3aVar);
            }
        }
    }

    public final void c(yd4 yd4Var, vm2 vm2Var) {
        List<Map.Entry> listK0;
        ((ode) this.b.b).n(new gkc(yd4Var));
        int iOrdinal = yd4Var.ordinal();
        int i = 5;
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                i = 1;
            } else if (iOrdinal == 4) {
                i = 4;
            } else if (iOrdinal == 5) {
                i = 2;
            } else {
                if (iOrdinal != 6) {
                    s49.l(yd4Var, "Unexpected CameraInternal state: ");
                    return;
                }
                i = 3;
            }
        }
        um2 um2Var = new um2(i, vm2Var);
        ode odeVar = this.c;
        if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
            odeVar.r(um2Var);
        } else {
            odeVar.n(um2Var);
        }
        synchronized (this.a) {
            listK0 = CollectionsKt.k0(this.h.entrySet());
        }
        for (Map.Entry entry : listK0) {
            ((Executor) entry.getValue()).execute(new bi2((qp5) entry.getKey(), um2Var, (byte) 28));
        }
    }
}
