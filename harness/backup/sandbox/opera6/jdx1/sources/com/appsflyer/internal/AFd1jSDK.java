package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFd1jSDK {
    private final int getRevenue;

    public AFd1jSDK(int i) {
        this.getRevenue = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getMediationNetwork(java.net.HttpURLConnection r11) throws java.lang.Throwable {
        /*
            java.lang.String r1 = ""
            r2 = 0
            java.io.InputStream r11 = r11.getInputStream()     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> L64
            goto L26
        L8:
            r0 = move-exception
            r6 = r0
            java.io.InputStream r11 = r11.getErrorStream()     // Catch: java.lang.Throwable -> L64
            com.appsflyer.AFLogger r3 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L64
            com.appsflyer.internal.AFg1cSDK r4 = com.appsflyer.internal.AFg1cSDK.HTTP_CLIENT     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L1e
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L64
            r5 = r0
            goto L1f
        L1e:
            r5 = r1
        L1f:
            r9 = 0
            r10 = 0
            r7 = 0
            r8 = 0
            r3.e(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L64
        L26:
            if (r11 != 0) goto L29
            return r1
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r0.<init>()     // Catch: java.lang.Throwable -> L64
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L64
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L64
            r1.<init>(r11, r3)     // Catch: java.lang.Throwable -> L64
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L60
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L60
            r2 = 1
        L3d:
            java.lang.String r3 = r11.readLine()     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L4f
            if (r2 != 0) goto L4a
            r2 = 10
            r0.append(r2)     // Catch: java.lang.Throwable -> L5a
        L4a:
            r0.append(r3)     // Catch: java.lang.Throwable -> L5a
            r2 = 0
            goto L3d
        L4f:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5a
            r1.close()
            r11.close()
            return r0
        L5a:
            r0 = move-exception
            r2 = r0
            r0 = r11
            r11 = r2
        L5e:
            r2 = r1
            goto L67
        L60:
            r0 = move-exception
            r11 = r0
            r0 = r2
            goto L5e
        L64:
            r0 = move-exception
            r11 = r0
            r0 = r2
        L67:
            if (r2 == 0) goto L6c
            r2.close()
        L6c:
            if (r0 == 0) goto L71
            r0.close()
        L71:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1jSDK.getMediationNetwork(java.net.HttpURLConnection):java.lang.String");
    }

    public final AFd1aSDK<String> getMonetizationNetwork(AFd1cSDK aFd1cSDK) {
        Throwable th;
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            byte[] revenue = aFd1cSDK.getRevenue();
            StringBuilder sb = new StringBuilder();
            sb.append(aFd1cSDK.getRevenue);
            sb.append(":");
            sb.append(aFd1cSDK.getMonetizationNetwork);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            byte[] revenue2 = aFd1cSDK.getRevenue();
            if (aFd1cSDK.getCurrencyIso4217Code() && revenue2 != null) {
                String str = aFd1cSDK.AFAdRevenueData() ? "<encrypted>" : new String(revenue2, Charset.defaultCharset());
                sb2.append("\n payload: ");
                sb2.append(str);
            }
            for (Map.Entry<String, String> entry : aFd1cSDK.AFAdRevenueData.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
            StringBuilder sb3 = new StringBuilder("[");
            sb3.append(aFd1cSDK.hashCode());
            sb3.append("] ");
            sb3.append((Object) sb2);
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, sb3.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFd1cSDK.getMonetizationNetwork).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFd1cSDK.getRevenue);
                if (aFd1cSDK.getMonetizationNetwork()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1cSDK.component3()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                int i = this.getRevenue;
                int i2 = aFd1cSDK.component4;
                if (i2 != -1) {
                    i = i2;
                }
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.addRequestProperty("Content-Type", aFd1cSDK.AFAdRevenueData() ? "application/octet-stream" : "application/json");
                for (Map.Entry<String, String> entry2 : aFd1cSDK.AFAdRevenueData.entrySet()) {
                    httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                }
                if (revenue != null) {
                    httpURLConnection2.setDoOutput(true);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(revenue.length);
                    httpURLConnection2.setRequestProperty("Content-Length", sb4.toString());
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            bufferedOutputStream2.write(revenue);
                            bufferedOutputStream2.close();
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                boolean z = httpURLConnection2.getResponseCode() / 100 == 2;
                String mediationNetwork = aFd1cSDK.getMediationNetwork() ? getMediationNetwork(httpURLConnection2) : "";
                AFd1hSDK aFd1hSDK = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                StringBuilder sb5 = new StringBuilder("response code:");
                sb5.append(httpURLConnection2.getResponseCode());
                sb5.append(" ");
                sb5.append(httpURLConnection2.getResponseMessage());
                sb5.append("\n body:");
                sb5.append(mediationNetwork);
                sb5.append("\n took ");
                sb5.append(aFd1hSDK.getRevenue);
                sb5.append("ms");
                String string = sb5.toString();
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
                StringBuilder sb6 = new StringBuilder("[");
                sb6.append(aFd1cSDK.hashCode());
                sb6.append("] ");
                sb6.append(string);
                aFLogger.d(aFg1cSDK, sb6.toString());
                HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
                map.remove(null);
                AFd1aSDK<String> aFd1aSDK = new AFd1aSDK<>(mediationNetwork, httpURLConnection2.getResponseCode(), z, map, aFd1hSDK);
                httpURLConnection2.disconnect();
                return aFd1aSDK;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = httpURLConnection2;
                try {
                    AFd1hSDK aFd1hSDK2 = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb7 = new StringBuilder("error: ");
                    sb7.append(th);
                    sb7.append("\n took ");
                    sb7.append(aFd1hSDK2.getRevenue);
                    sb7.append("ms");
                    String string2 = sb7.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb8 = new StringBuilder("[");
                    sb8.append(aFd1cSDK.hashCode());
                    sb8.append("] ");
                    sb8.append(string2);
                    aFLogger2.e(aFg1cSDK2, sb8.toString(), th, false, false, false);
                    throw new HttpException(th, aFd1hSDK2);
                } catch (Throwable th5) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
