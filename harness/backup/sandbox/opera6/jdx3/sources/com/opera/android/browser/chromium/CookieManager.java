package com.opera.android.browser.chromium;

import androidx.annotation.NonNull;
import com.opera.api.Callback;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.jv5;
import defpackage.q1a;
import defpackage.t1a;
import defpackage.v1a;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CookieManager {
    public final HashMap a = new HashMap();

    public static class ChangeListenerValue {
        public final h7f a = new h7f();
        public long b;
    }

    public static void addCookie(@NonNull List<jv5> list, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, boolean z, boolean z2) {
        list.add(new jv5(str, str2, str3, str4, z2));
    }

    public static void callCallback(@NonNull Callback callback, @NonNull List<jv5> list) {
        callback.run(list);
    }

    public static void changedCookie(@NonNull ChangeListenerValue changeListenerValue, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, boolean z, boolean z2) {
        g7f g7fVar = new g7f(changeListenerValue.a);
        while (g7fVar.hasNext()) {
            v1a v1aVar = ((q1a) g7fVar.next()).a;
            if (Intrinsics.a(str, "HSID") || Intrinsics.a(str, "SID")) {
                if (Intrinsics.a(str4, "/") && Intrinsics.a(str3, ".google.com")) {
                    d3k d3kVar = v1aVar.h;
                    mt5 mt5Var = null;
                    if (d3kVar != null) {
                        d3kVar.k((CancellationException) null);
                    }
                    v1aVar.h = na2.B(v1aVar.b, (CoroutineContext) null, (rx5) null, new t1a(v1aVar, mt5Var, (byte) 1), 3);
                }
            }
        }
    }
}
