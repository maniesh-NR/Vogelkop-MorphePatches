package defpackage;

import java.util.HashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class jxl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sa4 b;

    public /* synthetic */ jxl(sa4 sa4Var, byte b) {
        this.a = b;
        this.b = sa4Var;
    }

    public final void a(myf myfVar, boolean z, int i) {
        bxl bxlVar;
        byte b = this.a;
        sa4 sa4Var = this.b;
        switch (b) {
            case 0:
                HashSet hashSet = (HashSet) sa4Var.h;
                hashSet.remove(myfVar);
                sa4Var.d |= i;
                if (!z) {
                    sa4Var.f();
                    break;
                } else if (hashSet.isEmpty()) {
                    sa4Var.c = true;
                    ((q65) sa4Var.i).S();
                    x77 x77Var = (x77) sa4Var.l;
                    if (x77Var != null) {
                        int i2 = sa4Var.d;
                        sa4Var.l = null;
                        sa4Var.b(new kxl(x77Var, i2));
                        break;
                    }
                }
                break;
            default:
                HashSet hashSet2 = (HashSet) sa4Var.g;
                if (hashSet2.remove(myfVar)) {
                    sa4Var.d |= i;
                    if (!z) {
                        sa4Var.f();
                        break;
                    } else {
                        ((HashSet) sa4Var.h).add(myfVar);
                        if (hashSet2.isEmpty()) {
                            bf9 bf9Var = (bf9) sa4Var.e;
                            String str = (String) sa4Var.f;
                            zzh zzhVar = new zzh(sa4Var, (byte) 28);
                            mgh mghVar = bf9Var.p;
                            ixl ixlVar = ixl.b;
                            if (mghVar != null) {
                                mghVar.e(ixlVar);
                                bf9Var.p = null;
                            }
                            zd2 zd2Var = bf9Var.r;
                            if (zd2Var != null) {
                                zd2Var.cancel();
                                bf9Var.r = null;
                            }
                            String[] strArrSplit = str.split("\\$");
                            byte b2 = 0;
                            vz vzVar = strArrSplit.length == 2 ? new vz(strArrSplit[0], strArrSplit[1]) : null;
                            if (vzVar == null) {
                                zzhVar.run(ixlVar);
                                bxlVar = bf9.A;
                            } else if (bf9Var.r() < 1 || bf9Var.n != null) {
                                exl exlVar = new exl(new zwl(bf9Var, vzVar, zzhVar, b2), zzhVar);
                                bf9Var.p = exlVar;
                                bf9Var.g.add(exlVar);
                                bf9Var.C();
                                bxlVar = bf9Var.p;
                            } else {
                                bxl bxlVarI = bf9Var.I(vzVar, zzhVar, true);
                                bf9Var.p = bxlVarI;
                                bxlVar = bxlVarI;
                            }
                            sa4Var.m = bxlVar;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
