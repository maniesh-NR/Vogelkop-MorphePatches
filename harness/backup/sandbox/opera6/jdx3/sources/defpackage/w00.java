package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* loaded from: classes.dex */
public final class w00 extends y55 {
    public final Context l;
    public boolean m;

    public w00(Context context) {
        this.l = context;
    }

    @Override // defpackage.y55, defpackage.bl
    public final boolean k(String str) {
        if (!this.m) {
            super.k(str);
            return true;
        }
        Intent intent = new Intent();
        intent.setAction("com.opera.android.ACTION_START_WEBAPP");
        intent.putExtra("com.opera.android.webapp.extra_id", Long.toHexString(str.hashCode()));
        intent.putExtra("org.opera.browser.webapp_display_mode", 9);
        intent.putExtra("org.opera.browser.webapp_url", str);
        Context context = this.l;
        intent.putExtra("org.opera.browser.background_color", f03.t(2130969325, context, 2131101243));
        intent.putExtra("org.opera.browser.allow_incognito", false);
        byte[] bArrE = w7d.E(str, (String) null);
        if (bArrE != null) {
            intent.putExtra("org.opera.browser.webapp_mac", Base64.encodeToString(bArrE, 2));
        }
        intent.setPackage(context.getPackageName());
        context.startActivity(intent);
        return true;
    }
}
