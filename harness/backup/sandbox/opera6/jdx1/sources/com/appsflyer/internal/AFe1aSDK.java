package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import defpackage.p3p;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFe1aSDK extends AFe1sSDK<Map<String, Object>> {
    private static final int areAllFieldsValid = 2000;
    private final AFa1oSDK component1;
    private final AFa1jSDK component2;
    private Map<String, Object> component3;
    private final Uri component4;
    private final List<String> hashCode;

    public AFe1aSDK(AFa1oSDK aFa1oSDK, @NonNull AFa1jSDK aFa1jSDK, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFe1mSDK.RESOLVE_ESP, new AFe1mSDK[]{AFe1mSDK.RC_CDN}, "ResolveEsp");
        this.component1 = aFa1oSDK;
        this.component2 = aFa1jSDK;
        this.component4 = uri;
        this.hashCode = list;
    }

    private boolean getMediationNetwork(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sbS = p3p.s("Validate if link ", str, " belongs to ESP domains: ");
        sbS.append(this.hashCode);
        AFLogger.afRDLog(sbS.toString());
        try {
            return this.hashCode.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }

    private static Map<String, Object> r_(Uri uri) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
            sb.append(uri.toString());
            AFLogger.afDebugLog(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = areAllFieldsValid;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.17.0");
            int responseCode = httpURLConnection.getResponseCode();
            map.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return map;
        } catch (Throwable th) {
            map.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
            return map;
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @NonNull
    public final AFe1rSDK getCurrencyIso4217Code() {
        Integer num = null;
        if (!getMediationNetwork(this.component4.toString())) {
            this.component1.i_(this.component2, this.component4, null);
            return AFe1rSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.component4.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> mapR_ = r_(Uri.parse(string));
            String str2 = (String) mapR_.get("res");
            Integer num2 = (Integer) mapR_.get(NotificationCompat.CATEGORY_STATUS);
            String str3 = (String) mapR_.get("error");
            if (str2 == null || !getMediationNetwork(str2)) {
                str = str3;
                string = str2;
                num = num2;
                break;
            }
            if (i < 4) {
                arrayList.add(str2);
            }
            i++;
            str = str3;
            string = str2;
            num = num2;
        }
        HashMap map = new HashMap();
        map.put("res", string != null ? string : "");
        map.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.component2) {
            this.component2.getCurrencyIso4217Code("af_deeplink_r", map);
            this.component2.getCurrencyIso4217Code("af_deeplink", this.component4.toString());
        }
        this.component1.i_(this.component2, string != null ? Uri.parse(string) : this.component4, this.component4);
        this.component3 = map;
        return AFe1rSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return 60000L;
    }
}
