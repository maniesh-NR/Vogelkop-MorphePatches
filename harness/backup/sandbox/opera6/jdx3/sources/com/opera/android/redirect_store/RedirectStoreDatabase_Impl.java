package com.opera.android.redirect_store;

import defpackage.jqh;
import defpackage.sv0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class RedirectStoreDatabase_Impl extends RedirectStoreDatabase {
    public volatile jqh l;

    public final pjb e() {
        return new pjb(this, new HashMap(0), new HashMap(0), new String[]{"redirects"});
    }

    public final c6i f() {
        return new sv0(this);
    }

    public final List h() {
        return new ArrayList();
    }

    public final Set k() {
        return new HashSet();
    }

    public final Map m() {
        HashMap map = new HashMap();
        map.put(jqh.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.opera.android.redirect_store.RedirectStoreDatabase
    public final jqh x() {
        jqh jqhVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new jqh(this);
            }
            jqhVar = this.l;
        }
        return jqhVar;
    }
}
