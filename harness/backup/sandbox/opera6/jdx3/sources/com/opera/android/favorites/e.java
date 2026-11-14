package com.opera.android.favorites;

import J.N;
import com.opera.android.favorites.FavoritesBridge;
import defpackage.cul;
import defpackage.g6e;
import defpackage.hq8;
import defpackage.i7f;
import defpackage.lr8;
import defpackage.nr8;
import defpackage.p6l;
import defpackage.tq8;
import defpackage.us8;
import defpackage.vzk;
import defpackage.wqm;
import defpackage.zzj;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends nr8 {
    public final cul c;
    public final vzk d;
    public final zzj e;
    public b f;
    public b g;
    public us8 h;
    public final g6e i = new g6e(this, (byte) 0);

    public e(cul culVar, vzk vzkVar, zzj zzjVar) {
        this.c = culVar;
        this.d = vzkVar;
        this.e = zzjVar;
    }

    public static void i(ArrayList arrayList, tq8 tq8Var) {
        ArrayList arrayList2 = tq8Var.e;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            hq8 hq8Var = (hq8) obj;
            if (hq8Var.j()) {
                i(arrayList, (tq8) hq8Var);
            } else {
                arrayList.add(Long.valueOf(hq8Var.e()));
            }
        }
    }

    public static tq8 l(tq8 tq8Var, long j) {
        tq8 tq8VarL = (tq8) tq8Var.v(j);
        if (tq8VarL != null) {
            return tq8VarL;
        }
        ArrayList arrayList = tq8Var.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hq8 hq8Var = (hq8) obj;
            if (hq8Var.j() && (tq8VarL = l((tq8) hq8Var, j)) != null) {
                break;
            }
        }
        return tq8VarL;
    }

    @Override // defpackage.nr8
    public final long b(String str, String str2) {
        boolean zMryibIhv = N.MryibIhv(wqm.b("https://", wqm.C(str2)).g());
        FavoritesBridge.Folder folder = this.f.i;
        int iMuqmbcLE = N.MuqmbcLE(folder.a);
        String strG = wqm.b("https://", wqm.C(str2)).g();
        i7f i7fVar = FavoritesBridge.a;
        FavoritesBridge.Favorite favorite = (FavoritesBridge.Favorite) N.MpkDBxXp(folder.a, iMuqmbcLE, str, strG);
        this.d.w(new a(favorite, this), zMryibIhv);
        return N.Mvi8cy50(favorite.a);
    }

    public final void j(tq8 tq8Var, lr8 lr8Var) {
        int iMuqmbcLE = N.MuqmbcLE(this.f.i.a);
        String strH = tq8Var.h();
        i7f i7fVar = FavoritesBridge.a;
        b bVar = (b) this.f.u(N.MuqmbcLE(r0.i.a) - 1);
        ArrayList arrayList = tq8Var.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hq8 hq8Var = (hq8) obj;
            p6l p6lVar = p6l.a;
            boolean zMryibIhv = N.MryibIhv(wqm.b("https://", wqm.C(hq8Var.i(p6lVar))).g());
            if (!lr8Var.a(hq8Var.i(p6lVar))) {
                FavoritesBridge.Folder folder = bVar.i;
                this.d.w(new a((FavoritesBridge.Favorite) N.MpkDBxXp(folder.a, N.MuqmbcLE(folder.a), hq8Var.h(), wqm.b("https://", wqm.C(hq8Var.i(p6lVar))).g()), this), zMryibIhv);
            }
        }
    }

    public final void k(hq8 hq8Var) {
        if ((hq8Var instanceof h) || hq8Var.j()) {
            return;
        }
        this.c.c(hq8Var);
    }

    public final tq8 m(long j) {
        if (j == 0) {
            return this.g;
        }
        long jE = this.f.e();
        tq8 tq8Var = this.f;
        if (j != jE) {
            tq8Var = (tq8) tq8Var.v(j);
        }
        return tq8Var != null ? tq8Var : l(this.g, j);
    }

    public final hq8 n(FavoritesBridge.Favorite favorite) {
        if (favorite instanceof FavoritesBridge.Folder) {
            return N.MpTjmNUR(favorite.a) == 0 ? new f((FavoritesBridge.Folder) favorite, this) : new b((FavoritesBridge.Folder) favorite, this);
        }
        if (favorite instanceof FavoritesBridge.SavedPage) {
            return new g((FavoritesBridge.SavedPage) favorite, this);
        }
        long jMpTjmNUR = N.MpTjmNUR(favorite.a);
        i7f i7fVar = FavoritesBridge.a;
        return N.M0FjBMi_(jMpTjmNUR) ? new a(favorite, this) : new h(favorite, this);
    }
}
