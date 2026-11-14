package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class it1 {
    public final Context a;
    public final umi b;
    public boolean c;

    public it1(Context context, umi umiVar) {
        this.a = context;
        this.b = umiVar;
    }

    public static String a(ShortcutInfo shortcutInfo) {
        Intent intent;
        Intent intent2 = shortcutInfo.getIntent();
        String action = intent2 != null ? intent2.getAction() : null;
        if (Intrinsics.a(action, "android.intent.action.VIEW")) {
            Intent intent3 = shortcutInfo.getIntent();
            if (intent3 != null) {
                return intent3.getDataString();
            }
        } else if (Intrinsics.a(action, "com.opera.android.ACTION_START_WEBAPP") && (intent = shortcutInfo.getIntent()) != null) {
            return intent.getStringExtra("org.opera.browser.webapp_url");
        }
        return null;
    }
}
