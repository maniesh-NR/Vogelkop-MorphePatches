package defpackage;

import android.webkit.ValueCallback;
import com.opera.ad.mraid.MRAIDView;

/* loaded from: classes.dex */
public final /* synthetic */ class z4d implements ValueCallback {
    public final /* synthetic */ byte a;

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                int i = MRAIDView.e0;
                return;
            case 1:
                throw null;
            case 2:
                new lv0("Prerender operation failed", (Throwable) obj);
                throw null;
            case 3:
                throw null;
            case 4:
                new lv0("Prerender operation failed", (Throwable) obj);
                throw null;
            case 5:
                ito[] itoVarArr = ito.a;
                return;
            default:
                int i2 = y9p.v;
                return;
        }
    }
}
