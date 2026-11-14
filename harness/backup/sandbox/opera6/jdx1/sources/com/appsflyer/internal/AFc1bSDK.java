package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1cSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFc1bSDK implements AFc1aSDK {

    @NotNull
    private final AFc1iSDK AFAdRevenueData;

    public AFc1bSDK(@NotNull AFc1iSDK aFc1iSDK) {
        this.AFAdRevenueData = aFc1iSDK;
    }

    private final File getRevenue() {
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final String AFAdRevenueData(@NotNull Throwable th, @NotNull String str) {
        String str2;
        File file;
        synchronized (this) {
            File revenue = getRevenue();
            str2 = null;
            if (revenue != null) {
                file = new File(revenue, "6.17.0");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1cSDK currencyIso4217Code = AFd1qSDK.getCurrencyIso4217Code(th, str);
                    String str3 = currencyIso4217Code.getMonetizationNetwork;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1cSDK.Companion companion = AFc1cSDK.INSTANCE;
                        AFc1cSDK revenue2 = AFc1cSDK.Companion.getRevenue(x29.c(file2));
                        if (revenue2 != null) {
                            revenue2.getMediationNetwork++;
                            currencyIso4217Code = revenue2;
                        }
                    }
                    x29.d(file2, currencyIso4217Code.AFAdRevenueData());
                    str2 = str3;
                } catch (Exception e) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final void AFAdRevenueData(int i, int i2) {
        File[] fileArrListFiles;
        synchronized (this) {
            File revenue = getRevenue();
            if (revenue != null && (fileArrListFiles = revenue.listFiles()) != null) {
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                for (File file : fileArrListFiles) {
                    int monetizationNetwork = AFj1aSDK.getMonetizationNetwork(file.getName());
                    if (i > monetizationNetwork || monetizationNetwork > i2) {
                        arrayList.add(file);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    arrayList2.add(Boolean.valueOf(z29.h((File) obj)));
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final int getCurrencyIso4217Code() {
        Iterator<T> it = getMediationNetwork().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFc1cSDK) it.next()).getMediationNetwork;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0018, B:22:0x0060, B:23:0x0063, B:19:0x003e, B:24:0x0066, B:26:0x006c, B:10:0x001a, B:12:0x0020, B:14:0x0029, B:16:0x0037), top: B:32:0x0001, inners: #1 }] */
    @Override // com.appsflyer.internal.AFc1aSDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.appsflyer.internal.AFc1cSDK> getMediationNetwork() {
        /*
            r13 = this;
            monitor-enter(r13)
            java.io.File r0 = r13.getRevenue()     // Catch: java.lang.Throwable -> L70
            r1 = 0
            if (r0 == 0) goto L6a
            java.io.File[] r2 = r0.listFiles()     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L6a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L70
            r3.<init>()     // Catch: java.lang.Throwable -> L70
            int r4 = r2.length     // Catch: java.lang.Throwable -> L70
            r5 = 0
            r6 = r5
        L16:
            if (r6 >= r4) goto L66
            r0 = r2[r6]     // Catch: java.lang.Throwable -> L70
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L5d
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d
            r7.<init>()     // Catch: java.lang.Throwable -> L3d
            int r8 = r0.length     // Catch: java.lang.Throwable -> L3d
            r9 = r5
        L27:
            if (r9 >= r8) goto L5e
            r10 = r0[r9]     // Catch: java.lang.Throwable -> L3d
            com.appsflyer.internal.AFc1cSDK$AFa1ySDK r11 = com.appsflyer.internal.AFc1cSDK.INSTANCE     // Catch: java.lang.Throwable -> L3d
            java.lang.String r10 = x29.c(r10)     // Catch: java.lang.Throwable -> L3d
            com.appsflyer.internal.AFc1cSDK r10 = com.appsflyer.internal.AFc1cSDK.Companion.getRevenue(r10)     // Catch: java.lang.Throwable -> L3d
            if (r10 == 0) goto L3a
            r7.add(r10)     // Catch: java.lang.Throwable -> L3d
        L3a:
            int r9 = r9 + 1
            goto L27
        L3d:
            r0 = move-exception
            com.appsflyer.AFLogger r7 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L70
            com.appsflyer.internal.AFg1cSDK r8 = com.appsflyer.internal.AFg1cSDK.EXCEPTION_MANAGER     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r9.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r10 = "Could not get stored exceptions\n "
            r9.append(r10)     // Catch: java.lang.Throwable -> L70
            r9.append(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L70
            r11 = 4
            r12 = 0
            r10 = 0
            com.appsflyer.internal.AFg1gSDK.v$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L70
        L5d:
            r7 = r1
        L5e:
            if (r7 == 0) goto L63
            r3.add(r7)     // Catch: java.lang.Throwable -> L70
        L63:
            int r6 = r6 + 1
            goto L16
        L66:
            java.util.ArrayList r1 = k95.p(r3)     // Catch: java.lang.Throwable -> L70
        L6a:
            if (r1 != 0) goto L6e
            l08 r1 = l08.a     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r13)
            return r1
        L70:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1bSDK.getMediationNetwork():java.util.List");
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean getMonetizationNetwork() {
        return getRevenue(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean getRevenue(@NotNull String... strArr) {
        boolean zH;
        synchronized (this) {
            File revenue = getRevenue();
            zH = true;
            if (revenue != null) {
                if (strArr.length == 0) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                    zH = z29.h(revenue);
                } else {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: ".concat(e82.x(strArr, ", ", (String) null, (String) null, (tb6) null, 62)), false, 4, null);
                    File[] fileArrListFiles = revenue.listFiles();
                    if (fileArrListFiles != null) {
                        ArrayList arrayList = new ArrayList();
                        for (File file : fileArrListFiles) {
                            if (e82.u(file.getName(), strArr) < 0) {
                                arrayList.add(file);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            arrayList2.add(Boolean.valueOf(z29.h((File) obj)));
                        }
                        Set setN0 = CollectionsKt.n0(arrayList2);
                        if (setN0.isEmpty()) {
                            setN0 = Collections.singleton(Boolean.TRUE);
                        }
                        Set set = setN0;
                        if (set.size() != 1 || !((Boolean) CollectionsKt.J(set)).booleanValue()) {
                            zH = false;
                        }
                    }
                }
            }
        }
        return zH;
    }
}
