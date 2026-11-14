package com.opera.android.tabui2.siteimages;

import defpackage.al7;
import defpackage.e58;
import defpackage.sv0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/tabui2/siteimages/ImageUrlRepDatabase_Impl;", "Lcom/opera/android/tabui2/siteimages/ImageUrlRepDatabase;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageUrlRepDatabase_Impl extends ImageUrlRepDatabase {
    public final zyk l = z4c.b(new al7((Object) this, (byte) 27));

    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final pjb e() {
        return new pjb(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"Entry"});
    }

    public final c6i f() {
        return new sv0(this);
    }

    public final Set j() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(uqh.a(e58.class), l08.a);
        return linkedHashMap;
    }

    @Override // com.opera.android.tabui2.siteimages.ImageUrlRepDatabase
    public final e58 x() {
        return (e58) this.l.getValue();
    }
}
