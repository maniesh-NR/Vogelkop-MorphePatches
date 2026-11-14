package com.opera.android.favorites;

import J.N;
import com.opera.android.favorites.FavoritesBridge;
import defpackage.p6l;
import defpackage.tq8;
import java.util.Date;

/* loaded from: classes.dex */
public class b extends tq8 {
    public final e h;
    public FavoritesBridge.Folder i;

    public b(FavoritesBridge.Folder folder, e eVar) {
        this.i = folder;
        this.h = eVar;
        for (int i = 0; i < N.MuqmbcLE(this.i.a); i++) {
            x(i, this.h.n((FavoritesBridge.Favorite) N.MaBjvgQV(this.i.a, i)));
        }
    }

    @Override // defpackage.hq8
    public final String c() {
        FavoritesBridge.Folder folder = this.i;
        if (folder == null) {
            return "";
        }
        String str = (String) N.MklSMFzA(folder.a);
        return !str.isEmpty() ? str : String.valueOf(N.Mvi8cy50(this.i.a));
    }

    @Override // defpackage.hq8
    public final long e() {
        FavoritesBridge.Folder folder = this.i;
        if (folder != null) {
            return N.Mvi8cy50(folder.a);
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (this.i == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.i != null && bVar.e() == e();
    }

    @Override // defpackage.hq8
    public final String g() {
        FavoritesBridge.Folder folder = this.i;
        if (folder != null) {
            return (String) N.M6rFvEWY(folder.a);
        }
        return null;
    }

    @Override // defpackage.hq8
    public final String h() {
        FavoritesBridge.Folder folder = this.i;
        return folder != null ? (String) N.MLPfGs3T(folder.a) : "";
    }

    public final int hashCode() {
        if (this.i == null) {
            return 0;
        }
        return Long.hashCode(e());
    }

    @Override // defpackage.hq8
    public final String i(p6l p6lVar) {
        FavoritesBridge.Folder folder = this.i;
        return folder != null ? (String) N.MBjUu$zl(folder.a) : "";
    }

    @Override // defpackage.hq8
    public final void p() {
        this.i = null;
        super.p();
    }

    @Override // defpackage.hq8
    public final void q(String str) {
        FavoritesBridge.Folder folder = this.i;
        if (folder != null) {
            N.MGNrMcnR(folder.a, str);
        }
    }

    @Override // defpackage.tq8
    public final Date z() {
        return this.i != null ? new Date(N.MLt8qqHG(this.i.a)) : new Date(0L);
    }
}
