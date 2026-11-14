package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public abstract class g53 extends rz4 {
    public f53 O;

    public Uri F0() {
        return dgh.h().buildUpon().appendEncodedPath(vep.h(10)).build();
    }

    public String G0() {
        return getResources().getString(2132017269);
    }

    public View H0() {
        return findViewById(2131361903).findViewById(2131364794);
    }

    public void I0() {
    }

    public void J0() {
    }

    public void K0() {
    }

    public void L0(View view) {
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final String h0() {
        return "android.intent.action.VIEW";
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final Uri k0() {
        return F0();
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final Drawable l0(Context context) {
        return sgb.F(2131232034, context);
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final CharSequence m0() {
        return G0();
    }

    @Override // com.opera.android.FullscreenWebActivity, defpackage.dx3, defpackage.hjf
    public void onDestroy() {
        this.O.c((WebContents) null);
        super.onDestroy();
    }

    @Override // com.opera.android.FullscreenWebActivity
    public void v0() {
        super.v0();
        this.O = new f53(this, this.v.e(), (byte) 0);
        q9n.f(H0(), new u7(this, (byte) 14));
    }
}
