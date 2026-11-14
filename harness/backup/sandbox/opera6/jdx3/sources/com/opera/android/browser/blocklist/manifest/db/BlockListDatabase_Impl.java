package com.opera.android.browser.blocklist.manifest.db;

import defpackage.mi3;
import defpackage.oc2;
import defpackage.sv0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/browser/blocklist/manifest/db/BlockListDatabase_Impl;", "Lcom/opera/android/browser/blocklist/manifest/db/BlockListDatabase;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlockListDatabase_Impl extends BlockListDatabase {
    public final zyk l = z4c.b(new oc2(this, 11));

    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final pjb e() {
        return new pjb(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"active_block_lists"});
    }

    public final c6i f() {
        return new sv0(this);
    }

    public final Set j() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(uqh.a(mi3.class), l08.a);
        return linkedHashMap;
    }

    @Override // com.opera.android.browser.blocklist.manifest.db.BlockListDatabase
    public final mi3 x() {
        return (mi3) this.l.getValue();
    }
}
