package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class AFd1tSDK {
    @NotNull
    public static final JSONArray getCurrencyIso4217Code(@NotNull List<AFc1cSDK> list) {
        List<AFc1cSDK> list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFc1cSDK) it.next()).getRevenue());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean getRevenue(@NotNull HttpURLConnection httpURLConnection) {
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}
