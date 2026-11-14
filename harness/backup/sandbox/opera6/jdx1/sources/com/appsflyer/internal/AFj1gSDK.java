package com.appsflyer.internal;

import defpackage.a14;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1gSDK implements AFj1hSDK {
    @Override // com.appsflyer.internal.AFj1hSDK
    @NotNull
    public final String getRevenue() {
        String q0iVar;
        try {
            p0i p0iVar = t0i.b;
            Field declaredField = a14.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            q0iVar = (String) declaredField.get(null);
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        if (q0iVar instanceof q0i) {
            q0iVar = "";
        }
        return q0iVar;
    }
}
