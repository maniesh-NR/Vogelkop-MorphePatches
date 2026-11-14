package com.appsflyer.internal;

import com.appsflyer.internal.AFa1tSDK;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((AFa1tSDK.AFa1vSDK) obj).getRevenue();
            default:
                return ((AFc1eSDK) obj).m_();
        }
    }
}
