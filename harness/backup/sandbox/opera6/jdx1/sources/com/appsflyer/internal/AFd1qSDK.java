package com.appsflyer.internal;

import defpackage.wf8;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1qSDK {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StackTraceElement;", "p0", "", "AFAdRevenueData", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1qSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends ozb implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass5 getMediationNetwork = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @NotNull
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull StackTraceElement stackTraceElement) {
            return "at " + stackTraceElement;
        }
    }

    @NotNull
    public static final AFc1cSDK getCurrencyIso4217Code(@NotNull Throwable th, @NotNull String str) {
        return new AFc1cSDK(sko.k(th.getClass().getName(), ": ", str), getMediationNetwork(th), wf8.b(th), 0, 8, null);
    }

    @NotNull
    private static String getMediationNetwork(@NotNull Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!kotlin.text.c.q(stackTraceElement.getClassName(), "com.appsflyer", false)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return AFd1rSDK.getCurrencyIso4217Code(th + "\n" + CollectionsKt.P(arrayList, "\n", (CharSequence) null, (String) null, 0, AnonymousClass5.getMediationNetwork, 30), "SHA-256");
    }
}
