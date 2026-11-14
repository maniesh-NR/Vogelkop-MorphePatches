package com.leanplum.internal;

import defpackage.h1a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = 3, mv = {1, h1a.ERROR_PRIVATE_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
final class PushActionPersistenceKt$records$2 extends ozb implements Function0<Map<String, Long>> {
    public static final PushActionPersistenceKt$records$2 INSTANCE = new PushActionPersistenceKt$records$2();

    public PushActionPersistenceKt$records$2() {
        super(0);
    }

    @NotNull
    public final Map<String, Long> invoke() {
        Map mapLoad = PushActionPersistenceKt.load();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapLoad.entrySet()) {
            if (Clock.getInstance().lessThanMonthAgo(((Number) entry.getValue()).longValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.size() < mapLoad.size()) {
            PushActionPersistenceKt.save(linkedHashMap);
        }
        return y9m.r(linkedHashMap);
    }
}
