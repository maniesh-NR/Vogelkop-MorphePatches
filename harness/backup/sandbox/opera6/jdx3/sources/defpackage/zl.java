package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class zl implements lnf {
    public final /* synthetic */ byte a;
    public final BrowserActivity b;
    public final pde c;

    public /* synthetic */ zl(BrowserActivity browserActivity, pde pdeVar, byte b) {
        this.a = b;
        this.b = browserActivity;
        this.c = pdeVar;
    }

    @Override // defpackage.lnf
    public final knf a(Uri uri, boolean z, Parcelable parcelable) {
        byte b = this.a;
        pde pdeVar = this.c;
        BrowserActivity browserActivity = this.b;
        switch (b) {
            case 0:
                return new sl(browserActivity, pdeVar, uri.toString());
            case 1:
                return new tqh(browserActivity, pdeVar, uri.toString());
            default:
                String string = uri.toString();
                umi umiVar = vml.d;
                browserActivity.P0();
                return new lel(browserActivity, pdeVar, string, umiVar);
        }
    }
}
