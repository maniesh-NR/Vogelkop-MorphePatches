package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class xgf extends ic4 {
    public final String l;
    public lqm m = lqm.d;
    public boolean n;
    public boolean o;
    public boolean p;

    public xgf(String str) {
        this.l = str;
    }

    public final void q(Intent intent) {
        intent.setData(Uri.parse(this.l));
        intent.putExtra("org.opera.browser.new_tab_referrer", (Parcelable) null);
        intent.putExtra("org.opera.browser.new_tab_origin", this.m.ordinal());
        intent.putExtra("org.opera.browser.new_tab_disposition", this.n);
        intent.putExtra("org.opera.browser.new_tab_incognito", this.o);
        intent.putExtra("org.opera.browser.in_active_mode", false);
        intent.putExtra("org.opera.browser.new_tab_placement", Integer.MIN_VALUE);
        intent.putExtra("org.opera.browser.reuse_existing_tab", this.p);
    }
}
