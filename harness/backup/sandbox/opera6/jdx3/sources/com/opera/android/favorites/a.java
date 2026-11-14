package com.opera.android.favorites;

import J.N;
import com.opera.android.favorites.FavoritesBridge;
import defpackage.hq8;
import defpackage.p6l;

/* loaded from: classes.dex */
public class a extends hq8 {
    public final e e;
    public FavoritesBridge.Favorite f;

    public a(FavoritesBridge.Favorite favorite, e eVar) {
        this.f = favorite;
        this.e = eVar;
    }

    @Override // defpackage.hq8
    public final String c() {
        FavoritesBridge.Favorite favorite = this.f;
        if (favorite == null) {
            return "";
        }
        String str = (String) N.MklSMFzA(favorite.a);
        return !str.isEmpty() ? str : String.valueOf(N.Mvi8cy50(this.f.a));
    }

    @Override // defpackage.hq8
    public final long e() {
        FavoritesBridge.Favorite favorite = this.f;
        if (favorite != null) {
            return N.Mvi8cy50(favorite.a);
        }
        return -1L;
    }

    @Override // defpackage.hq8
    public final String g() {
        FavoritesBridge.Favorite favorite = this.f;
        return favorite != null ? (String) N.M6rFvEWY(favorite.a) : "";
    }

    @Override // defpackage.hq8
    public final String h() {
        FavoritesBridge.Favorite favorite = this.f;
        return favorite != null ? (String) N.MLPfGs3T(favorite.a) : "";
    }

    @Override // defpackage.hq8
    public final String i(p6l p6lVar) {
        FavoritesBridge.Favorite favorite = this.f;
        return favorite != null ? (String) N.MBjUu$zl(favorite.a) : "";
    }

    @Override // defpackage.hq8
    public final void p() {
        super.p();
        this.f = null;
    }

    @Override // defpackage.hq8
    public final void q(String str) {
        FavoritesBridge.Favorite favorite = this.f;
        if (favorite != null) {
            N.MGNrMcnR(favorite.a, str);
        }
    }
}
