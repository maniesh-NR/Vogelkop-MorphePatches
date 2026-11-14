package com.opera.android.translate_web_pages;

import defpackage.o3m;
import defpackage.p7l;
import defpackage.sv0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/translate_web_pages/TranslateWebPagesDatabase_Impl;", "Lcom/opera/android/translate_web_pages/TranslateWebPagesDatabase;", "<init>", "()V", "translate_web_pages"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TranslateWebPagesDatabase_Impl extends TranslateWebPagesDatabase {
    public final zyk l = z4c.b(new p7l((Object) this, (byte) 21));

    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final pjb e() {
        return new pjb(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"excluded_sites", "language_prefs"});
    }

    public final c6i f() {
        return new sv0(this);
    }

    public final Set j() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(uqh.a(o3m.class), l08.a);
        return linkedHashMap;
    }

    @Override // com.opera.android.translate_web_pages.TranslateWebPagesDatabase
    public final o3m x() {
        return (o3m) this.l.getValue();
    }
}
