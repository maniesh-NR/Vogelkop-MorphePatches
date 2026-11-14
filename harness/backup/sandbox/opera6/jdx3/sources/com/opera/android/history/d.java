package com.opera.android.history;

import com.opera.android.history.HistoryManager;
import defpackage.h42;
import defpackage.orm;
import defpackage.shf;
import defpackage.x5f;
import defpackage.xda;
import defpackage.yda;
import defpackage.zda;
import defpackage.zsi;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d extends zsi {
    public final e l;
    public final shf m;
    public final orm n;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(e eVar, orm ormVar) {
        xda xdaVar = xda.e;
        super(eVar, xdaVar, Locale.getDefault());
        this.l = eVar;
        this.m = xdaVar;
        this.n = ormVar;
    }

    @Override // defpackage.oy
    public final List d(Object obj) {
        zda zdaVar = (zda) obj;
        if (zdaVar != null) {
            if (zdaVar instanceof c) {
                HistoryManager.NativeHistoryEntry nativeHistoryEntry = ((c) zdaVar).a;
                return Arrays.asList(nativeHistoryEntry.getTitle(), nativeHistoryEntry.getUrl());
            }
            if (zdaVar instanceof yda) {
                return Collections.singletonList(((yda) zdaVar).a.c);
            }
        }
        h9o.p();
        return null;
    }

    @Override // defpackage.oy
    public final void f() {
        Collection collection = (Collection) ((h42) this.f).g();
        if (collection == null || collection.isEmpty()) {
            this.m.S(null);
        }
        super.f();
    }

    @Override // defpackage.oy
    public final void h() {
        ((x5f) this.n).S(2);
    }
}
