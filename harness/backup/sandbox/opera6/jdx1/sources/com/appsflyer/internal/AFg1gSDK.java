package com.appsflyer.internal;

import androidx.core.app.NotificationCompat;
import defpackage.p3p;
import defpackage.t3p;
import defpackage.z1m;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\b'\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFg1cSDK;", "tag", "", NotificationCompat.CATEGORY_MESSAGE, "", "shouldRemoteDebug", "", "d", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "", "throwable", "printMsg", "printThrowable", "shouldReportToExManager", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "getRevenue", "(Ljava/lang/String;Lcom/appsflyer/internal/AFg1cSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "shouldExtendMsg", "Z", "getShouldExtendMsg", "()Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFg1gSDK {
    public static long getCurrencyIso4217Code = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    public static /* synthetic */ void d$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            t3p.o();
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFg1gSDK.d(aFg1cSDK, str, z);
    }

    public static /* synthetic */ void e$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if (obj != null) {
            t3p.o();
            return;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 32) != 0) {
            z3 = true;
        }
        if ((i & 64) != 0) {
            z4 = true;
        }
        aFg1gSDK.e(aFg1cSDK, str, th, z, z2, z3, z4);
    }

    public static /* synthetic */ void i$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            t3p.o();
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFg1gSDK.i(aFg1cSDK, str, z);
    }

    public static /* synthetic */ void v$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            t3p.o();
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFg1gSDK.v(aFg1cSDK, str, z);
    }

    public static /* synthetic */ void w$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            t3p.o();
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFg1gSDK.w(aFg1cSDK, str, z);
    }

    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        d$default(this, aFg1cSDK, str, false, 4, null);
    }

    public void d(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
    }

    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th) {
        e$default(this, aFg1cSDK, str, th, false, false, false, false, 120, null);
    }

    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z) {
        e$default(this, aFg1cSDK, str, th, z, false, false, false, 112, null);
    }

    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2) {
        e$default(this, aFg1cSDK, str, th, z, z2, false, false, 96, null);
    }

    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3) {
        e$default(this, aFg1cSDK, str, th, z, z2, z3, false, 64, null);
    }

    public void e(@NotNull AFg1cSDK tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
    }

    public void force(@NotNull AFg1cSDK tag, @NotNull String msg) {
    }

    @NotNull
    public final String getRevenue(String str, @NotNull AFg1cSDK aFg1cSDK) {
        if (str == null || StringsKt.N(str)) {
            str = "null";
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1cSDK);
        return getShouldExtendMsg() ? z1m.l(sko.q(System.currentTimeMillis() - getCurrencyIso4217Code, "(", ") [", Thread.currentThread().getName()), "] ", strWithTag$SDK_prodRelease) : strWithTag$SDK_prodRelease;
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        i$default(this, aFg1cSDK, str, false, 4, null);
    }

    public void i(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
    }

    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        v$default(this, aFg1cSDK, str, false, 4, null);
    }

    public void v(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
    }

    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        w$default(this, aFg1cSDK, str, false, 4, null);
    }

    public void w(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFg1cSDK aFg1cSDK) {
        return p3p.w("[", aFg1cSDK.getMonetizationNetwork, "] ", str);
    }
}
