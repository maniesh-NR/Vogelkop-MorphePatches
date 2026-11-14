package com.appsflyer.internal;

import androidx.annotation.Nullable;
import java.util.HashMap;

/* loaded from: classes.dex */
public class AFa1nSDK extends HashMap<Integer, String> {
    private static AFa1nSDK getMonetizationNetwork;
    private final Object getRevenue = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        AFa1nSDK aFa1nSDK;
        aFa1nSDK = getMonetizationNetwork;
        if (aFa1nSDK == null) {
            aFa1nSDK = new AFa1nSDK();
            getMonetizationNetwork = aFa1nSDK;
        }
        return aFa1nSDK;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.getRevenue) {
            str2 = (String) super.put((AFa1nSDK) num, (Integer) str);
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(@Nullable Object obj) {
        String str;
        synchronized (this.getRevenue) {
            str = (String) super.remove(obj);
        }
        return str;
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(@Nullable Object obj, @Nullable Object obj2) {
        boolean zRemove;
        synchronized (this.getRevenue) {
            zRemove = super.remove(obj, obj2);
        }
        return zRemove;
    }
}
