package defpackage;

import android.widget.LinearLayout;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;

/* loaded from: classes.dex */
public abstract class p8n implements o8n, o5p {
    @Override // defpackage.o5p
    public final void a(AdActivity adActivity) {
        LinearLayout linearLayout = new LinearLayout(adActivity);
        adActivity.setContentView(linearLayout);
        a(adActivity, linearLayout);
    }

    public abstract void a(AdActivity adActivity, LinearLayout linearLayout);

    public void d() {
    }

    public void f() {
    }
}
