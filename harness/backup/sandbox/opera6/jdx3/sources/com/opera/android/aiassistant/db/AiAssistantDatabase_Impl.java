package com.opera.android.aiassistant.db;

import defpackage.pa;
import defpackage.rv0;
import defpackage.sv0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/aiassistant/db/AiAssistantDatabase_Impl;", "Lcom/opera/android/aiassistant/db/AiAssistantDatabase;", "<init>", "()V", "aiassistant"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AiAssistantDatabase_Impl extends AiAssistantDatabase {
    public final zyk n = z4c.b(new pa((Object) this, (byte) 15));

    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final pjb e() {
        return new pjb(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"chat", "chat_message"});
    }

    public final c6i f() {
        return new sv0(this);
    }

    public final Set j() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(uqh.a(rv0.class), l08.a);
        return linkedHashMap;
    }

    @Override // com.opera.android.aiassistant.db.AiAssistantDatabase
    public final rv0 x() {
        return (rv0) this.n.getValue();
    }
}
