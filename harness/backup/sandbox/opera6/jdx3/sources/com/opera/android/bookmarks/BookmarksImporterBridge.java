package com.opera.android.bookmarks;

import defpackage.km3;
import defpackage.nl3;

/* loaded from: classes.dex */
public final class BookmarksImporterBridge {
    public final km3 a;

    public BookmarksImporterBridge(km3 km3Var) {
        this.a = km3Var;
    }

    public final void importCallback(int i, long j) {
        km3 km3Var = this.a;
        if (i == 1) {
            km3Var.e(j);
        } else if (i == 2) {
            km3Var.a(nl3.e.a);
        }
    }
}
