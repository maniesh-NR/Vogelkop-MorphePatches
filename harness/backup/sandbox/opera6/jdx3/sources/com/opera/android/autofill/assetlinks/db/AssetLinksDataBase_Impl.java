package com.opera.android.autofill.assetlinks.db;

import defpackage.ob2;
import defpackage.pa;
import defpackage.sv0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/autofill/assetlinks/db/AssetLinksDataBase_Impl;", "Lcom/opera/android/autofill/assetlinks/db/AssetLinksDataBase;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AssetLinksDataBase_Impl extends AssetLinksDataBase {
    public final zyk m = z4c.b(new pa((Object) this, (byte) 29));

    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final pjb e() {
        return new pjb(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"asset_links", "whitelisted_domains"});
    }

    public final c6i f() {
        return new sv0(this);
    }

    public final Set j() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(uqh.a(ob2.class), l08.a);
        return linkedHashMap;
    }

    @Override // com.opera.android.autofill.assetlinks.db.AssetLinksDataBase
    public final ob2 x() {
        return (ob2) this.m.getValue();
    }
}
