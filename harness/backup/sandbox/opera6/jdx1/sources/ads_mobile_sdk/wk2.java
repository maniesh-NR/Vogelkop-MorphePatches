package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;
import defpackage.cs5;
import defpackage.jym;
import defpackage.mip;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class wk2 extends rg3 {
    public final w8 g;
    public final mip h;
    public final ah3 i;
    public wk2 j;
    public final ub2 k;

    /* JADX WARN: Illegal instructions before constructor call */
    public wk2(fw0 fw0Var, List list, UUID uuid, kh3 kh3Var, w8 w8Var, mip mipVar, ah3 ah3Var, int i, wk2 wk2Var, boolean z, int i2) {
        wk2 wk2Var2 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : wk2Var;
        int i3 = (i2 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? -1 : 0;
        p22 p22Var = nw.f2a;
        Boolean boolValueOf = p22Var != null ? Boolean.valueOf(p22Var.l.get()) : null;
        mipVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        super(fw0Var, kh3Var, wk2Var2, jCurrentTimeMillis);
        this.g = w8Var;
        this.h = mipVar;
        this.i = ah3Var;
        int i4 = wk2Var2 != null ? wk2Var2.k.a : -1;
        long j = jCurrentTimeMillis - jym.b;
        long j2 = jym.c;
        long j3 = j2 < 0 ? -1L : jCurrentTimeMillis - j2;
        p22 p22Var2 = nw.f2a;
        Integer numValueOf = p22Var2 != null ? Integer.valueOf(p22Var2.m.get()) : null;
        p22 p22Var3 = nw.f2a;
        this.k = new ub2(i3, kh3Var, fw0Var, list, uuid, i4, i, jCurrentTimeMillis, j, j3, z, boolValueOf, numValueOf, p22Var3 != null ? Integer.valueOf(p22Var3.n.get()) : null, Integer.valueOf(rl1.b), 536868864);
    }

    @Override // ads_mobile_sdk.rg3
    public final rg3 a(fw0 fw0Var, List list, boolean z) {
        ub2 ub2Var = this.k;
        UUID uuid = ub2Var.e;
        kh3 kh3Var = this.a;
        int i = ub2Var.g + 1;
        w8 w8Var = this.g;
        wk2 wk2Var = new wk2(fw0Var, list, uuid, kh3Var, w8Var, this.h, this.i, i, this, z, 1536);
        int i2 = ub2Var.x;
        ub2 ub2Var2 = wk2Var.k;
        ub2Var2.x = i2;
        AtomicReference atomicReference = (AtomicReference) w8Var.a;
        while (true) {
            wk2 wk2Var2 = (wk2) atomicReference.get();
            int i3 = wk2Var2.k.a + 1;
            if (wk2Var.d.get()) {
                nw.a("This trace " + ub2Var2.c.name() + " has already finished");
            } else {
                ub2Var2.a = i3;
                wk2Var.j = wk2Var2;
            }
            while (!atomicReference.compareAndSet(wk2Var2, wk2Var)) {
                if (atomicReference.get() != wk2Var2) {
                    break;
                }
            }
            return wk2Var;
        }
    }

    @Override // ads_mobile_sdk.rg3
    public final void a$1() {
        ub2[] ub2VarArr;
        super.a$1();
        ub2 ub2Var = this.k;
        if (ub2Var.a == 0) {
            UUID uuid = ub2Var.e;
            wk2 wk2Var = (wk2) ((AtomicReference) this.g.a).get();
            if (wk2Var == null) {
                ub2VarArr = new ub2[0];
            } else {
                ub2[] ub2VarArr2 = new ub2[wk2Var.k.a + 1];
                while (wk2Var != null) {
                    ub2 ub2Var2 = wk2Var.k;
                    ub2VarArr2[ub2Var2.a] = ub2Var2;
                    wk2Var = wk2Var.j;
                }
                ub2VarArr = (ub2[]) ((ArrayList) e82.p(ub2VarArr2)).toArray(new ub2[0]);
            }
            ah3 ah3Var = this.i;
            ah3Var.getClass();
            ArrayList arrayList = new ArrayList();
            for (ub2 ub2Var3 : ub2VarArr) {
                Boolean bool = (Boolean) ah3Var.o.get(String.valueOf(ub2Var3.c.getNumber()));
                if (bool != null ? bool.booleanValue() : ah3Var.k) {
                    arrayList.add(ub2Var3);
                }
            }
            oh3 oh3Var = !arrayList.isEmpty() ? new oh3(uuid, (ub2[]) arrayList.toArray(new ub2[0])) : null;
            if (oh3Var != null) {
                ah3Var.d.a(oh3Var);
                if (ah3Var.n) {
                    for (ub2 ub2Var4 : oh3Var.b) {
                        Throwable th = ub2Var4.o;
                        if (th == null) {
                            th = ub2Var4.n;
                        }
                        Throwable th2 = th;
                        if (th2 != null) {
                            ah3Var.e.a(new ml0(th2, ub2Var4.c.name(), ub2Var4.b, true, ub2Var4.h, ub2Var4.O.intValue(), false));
                        }
                    }
                }
            }
        }
    }

    @Override // ads_mobile_sdk.rg3
    public final ub2 e() {
        return this.k;
    }

    @Override // ads_mobile_sdk.rg3
    public final void h() {
        on7 on7Var = pn7.b;
        this.h.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        un7 un7Var = un7.d;
        this.k.p = pn7.l(cs5.y0(jCurrentTimeMillis, un7Var), cs5.y0(this.c, un7Var));
    }
}
