package com.opera.android.favorites;

import J.N;
import com.opera.android.favorites.FavoritesBridge;
import defpackage.bul;
import defpackage.cul;
import defpackage.hq8;
import defpackage.i7f;
import defpackage.sq8;
import defpackage.tq8;
import defpackage.us8;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements us8 {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.us8
    public final void a(int i, long j, long j2, long j3) {
        hq8 hq8VarV;
        e eVar = this.a;
        tq8 tq8VarM = eVar.m(j2);
        tq8 tq8VarM2 = eVar.m(j3);
        if (tq8VarM != null) {
            if (tq8VarM != tq8VarM2) {
                if (tq8VarM2 == null || (hq8VarV = tq8VarM.v(j)) == null) {
                    return;
                }
                tq8VarM.A(hq8VarV);
                tq8VarM2.s(i, hq8VarV);
                return;
            }
            hq8 hq8VarV2 = tq8VarM.v(j);
            if (tq8VarM == eVar.g) {
                i7f i7fVar = FavoritesBridge.a;
                if (i > N.MeT67pAE(((FavoritesBridge.Folder) N.M6CPNhwN()).a, N.Mvi8cy50(((FavoritesBridge.Folder) N.MucQ9eao()).a))) {
                    i--;
                }
            }
            if (hq8VarV2 != null) {
                int i2 = hq8VarV2.b != tq8VarM ? -1 : hq8VarV2.c;
                if (i2 != i) {
                    hq8VarV2.b = null;
                    tq8VarM.e.remove(hq8VarV2);
                    tq8VarM.g.i(hq8VarV2.e());
                    tq8VarM.C(hq8VarV2.c);
                    hq8VarV2.c = -1;
                    tq8VarM.x(i, hq8VarV2);
                    Iterator it = tq8VarM.f.iterator();
                    while (it.hasNext()) {
                        ((sq8) it.next()).u(i2, hq8VarV2);
                    }
                    tq8 tq8Var = tq8VarM.b;
                    if (tq8Var != null) {
                        tq8Var.n(3, tq8VarM);
                    }
                }
            }
        }
    }

    @Override // defpackage.us8
    public final void b(long j, long j2, int i) {
        e eVar = this.a;
        tq8 tq8VarM = eVar.m(j2);
        if (tq8VarM == null || tq8VarM.v(j) != null) {
            return;
        }
        i7f i7fVar = FavoritesBridge.a;
        hq8 hq8VarN = eVar.n((FavoritesBridge.Favorite) N.MlC86rB6(j));
        tq8VarM.s(i, hq8VarN);
        if (!(hq8VarN instanceof h)) {
            cul culVar = eVar.c;
            culVar.getClass();
            if (!hq8VarN.j()) {
                String strC = hq8VarN.c();
                bul bulVar = (bul) culVar.c.get(strC);
                if (!culVar.b.contains(strC)) {
                    if (culVar.a(bulVar != null ? bulVar.b.get() : 0, strC)) {
                        culVar.b();
                    }
                }
            }
        }
        if (tq8VarM == eVar.g && hq8VarN.j() && hq8VarN != eVar.f) {
            eVar.e.b((tq8) hq8VarN);
        }
    }

    @Override // defpackage.us8
    public final void d(long j, long j2, long j3) {
        tq8 tq8VarM = this.a.m(j2);
        if (tq8VarM != null) {
            hq8 hq8VarV = tq8VarM.v(j);
            if ((1 & j3) != 0) {
                hq8VarV.r();
            }
            if (!hq8VarV.j() && (2 & j3) != 0) {
                hq8VarV.n(5, hq8VarV);
            }
            if ((j3 & 4) != 0) {
                hq8VarV.n(7, hq8VarV);
            }
        }
    }

    @Override // defpackage.us8
    public final void e(long j, long j2) {
        hq8 hq8VarV;
        e eVar = this.a;
        tq8 tq8VarM = eVar.m(j2);
        if (tq8VarM == null || (hq8VarV = tq8VarM.v(j)) == null) {
            return;
        }
        if (!(hq8VarV instanceof h)) {
            cul culVar = eVar.c;
            HashMap map = culVar.c;
            if (!hq8VarV.j()) {
                String strC = hq8VarV.c();
                if (map.get(strC) != null) {
                    map.remove(strC);
                    culVar.d();
                }
                if (!culVar.d) {
                    HashSet hashSet = culVar.e;
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        culVar.e = hashSet;
                    }
                    hashSet.add(strC);
                }
                if (culVar.b.contains(strC)) {
                    culVar.e();
                }
            }
        }
        tq8VarM.A(hq8VarV);
        hq8VarV.p();
    }

    @Override // defpackage.us8
    public final void f() {
    }
}
