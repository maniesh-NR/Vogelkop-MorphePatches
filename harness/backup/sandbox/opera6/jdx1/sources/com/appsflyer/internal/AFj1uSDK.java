package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import com.appsflyer.AFLogger;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1uSDK extends AFi1dSDK {

    @NotNull
    private final ExecutorService getMediationNetwork;

    public AFj1uSDK(@NotNull ExecutorService executorService, @NotNull AFc1pSDK aFc1pSDK, @NotNull Runnable runnable) {
        super("preload", "samsung", aFc1pSDK, runnable);
        this.getMediationNetwork = executorService;
    }

    private final boolean AFAdRevenueData(Context context) {
        if (!getRevenue()) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }

    private static boolean C_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea A[Catch: all -> 0x0101, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0101, blocks: (B:12:0x003f, B:14:0x0045, B:16:0x004b, B:18:0x0053, B:20:0x005b, B:22:0x0068, B:23:0x0077, B:25:0x0084, B:26:0x0089, B:28:0x0091, B:29:0x0096, B:31:0x009e, B:32:0x00a3, B:34:0x00ab, B:35:0x00b0, B:37:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00ea), top: B:66:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void getMonetizationNetwork(com.appsflyer.internal.AFj1uSDK r10, android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1uSDK.getMonetizationNetwork(com.appsflyer.internal.AFj1uSDK, android.content.Context):void");
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getMonetizationNetwork() {
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    @SuppressLint({"NewApi"})
    public final void getRevenue(@NotNull Context context) {
        if (AFAdRevenueData(context)) {
            this.getMediationNetwork.execute(new h(this, context, (byte) 2));
        }
    }
}
