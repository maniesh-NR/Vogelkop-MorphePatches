package defpackage;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.text.TextUtils;
import android.util.Base64;
import com.opera.android.BrowserActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class syn {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a(BrowserActivity browserActivity, ru9 ru9Var, umi umiVar) {
        if (ru9Var.a.getBoolean("webapp_shortcut_migration_pending", false) && a.compareAndSet(false, true)) {
            umiVar.e(new roj(browserActivity, ru9Var, (byte) 18)).a(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(BrowserActivity browserActivity) {
        String stringExtra;
        CharSequence shortLabel;
        byte[] bArrE;
        List<ShortcutInfo> listK = m5h.k(browserActivity);
        ArrayList arrayList = new ArrayList();
        for (ShortcutInfo shortcutInfo : listK) {
            Intent intent = shortcutInfo.getIntent();
            nhj nhjVar = null;
            if (intent != null && Intrinsics.a(intent.getAction(), "com.opera.android.ACTION_START_WEBAPP") && intent.getStringExtra("org.opera.browser.webapp_mac") == null && (stringExtra = intent.getStringExtra("org.opera.browser.webapp_url")) != null && (shortLabel = shortcutInfo.getShortLabel()) != null && (bArrE = w7d.E(stringExtra, intent.getStringExtra("org.opera.browser.webapp_icon"))) != null) {
                Intent intentPutExtra = new Intent(intent).putExtra("org.opera.browser.webapp_mac", Base64.encodeToString(bArrE, 2));
                String id = shortcutInfo.getId();
                nhjVar = new nhj();
                nhjVar.a = browserActivity;
                nhjVar.b = id;
                nhjVar.e = shortLabel;
                nhjVar.c = new Intent[]{intentPutExtra};
                if (TextUtils.isEmpty(shortLabel)) {
                    qp2.o("Shortcut must have a non-empty label");
                    return false;
                }
                Intent[] intentArr = nhjVar.c;
                if (intentArr == null || intentArr.length == 0) {
                    qp2.o("Shortcut must have an intent");
                    return false;
                }
            }
            if (nhjVar != null) {
                arrayList.add(nhjVar);
            }
        }
        return arrayList.isEmpty() || phj.C0(browserActivity, arrayList);
    }
}
