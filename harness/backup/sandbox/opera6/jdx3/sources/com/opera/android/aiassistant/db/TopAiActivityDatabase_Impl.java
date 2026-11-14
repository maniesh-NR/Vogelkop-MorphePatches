package com.opera.android.aiassistant.db;

import defpackage.mul;
import defpackage.p7l;
import defpackage.sv0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/aiassistant/db/TopAiActivityDatabase_Impl;", "Lcom/opera/android/aiassistant/db/TopAiActivityDatabase;", "<init>", "()V", "aiassistant"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TopAiActivityDatabase_Impl extends TopAiActivityDatabase {
    public final zyk l = z4c.b(new p7l((Object) this, (byte) 17));

    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final pjb e() {
        return new pjb(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"activity"});
    }

    public final c6i f() {
        return new sv0(this);
    }

    public final Set j() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(uqh.a(mul.class), l08.a);
        return linkedHashMap;
    }

    @Override // com.opera.android.aiassistant.db.TopAiActivityDatabase
    public final mul x() {
        return (mul) this.l.getValue();
    }
}
