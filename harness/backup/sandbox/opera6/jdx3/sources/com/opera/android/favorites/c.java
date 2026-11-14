package com.opera.android.favorites;

import J.N;
import android.content.SharedPreferences;
import com.opera.android.favorites.FavoritesBridge;
import defpackage.e84;
import defpackage.hq8;
import defpackage.i7f;
import defpackage.jp5;
import defpackage.np6;
import defpackage.nr8;
import defpackage.pp6;
import defpackage.qfb;
import defpackage.td2;
import defpackage.tq8;
import defpackage.us8;
import defpackage.vzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class c implements us8 {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final void g() {
        int i;
        i7f i7fVar = FavoritesBridge.a;
        if (i7fVar.c(this) && i7fVar.c == 0) {
            N.MhTUjhtv();
        }
        FavoritesBridge.Folder folder = (FavoritesBridge.Folder) N.M6CPNhwN();
        e eVar = this.a;
        b bVar = new b(folder, eVar);
        eVar.g = bVar;
        eVar.f = (b) bVar.v(N.Mvi8cy50(((FavoritesBridge.Folder) N.MucQ9eao()).a));
        d dVar = new d(eVar);
        eVar.h = dVar;
        FavoritesBridge.a(dVar);
        vzk vzkVar = eVar.d;
        e84 e84Var = (e84) vzkVar.a;
        qfb qfbVar = new qfb(eVar, (byte) 12);
        vzkVar.d = qfbVar;
        Set setO = w1h.o((SharedPreferences) e84Var.a.get(), "guids", (Set) null);
        List listK0 = setO != null ? CollectionsKt.k0(setO) : null;
        if (listK0 == null) {
            listK0 = l08.a;
        }
        Iterator it = listK0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            hq8 hq8VarG = nr8.g(new jp5(str, (byte) 8), ((e) qfbVar.b).f);
            if (hq8VarG == null) {
                e84Var.b(str);
            } else {
                String strG = hq8VarG.g();
                new np6(e84Var, (td2) vzkVar.b, (pp6) vzkVar.c, qfbVar, hq8VarG).b(((strG == null || strG.length() == 0) ? 1 : 0) ^ 1);
            }
        }
        ArrayList arrayList = eVar.g.e;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hq8 hq8Var = (hq8) obj;
            if (hq8Var.j() && hq8Var != eVar.f) {
                eVar.e.b((tq8) hq8Var);
            }
        }
        eVar.a.K();
    }
}
