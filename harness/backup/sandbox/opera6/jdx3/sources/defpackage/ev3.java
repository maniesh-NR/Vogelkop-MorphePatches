package defpackage;

import android.text.TextUtils;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.BrowserUtils;
import java.util.Collections;
import java.util.Iterator;
import org.chromium.net.GURLUtils;

/* loaded from: classes.dex */
public final class ev3 implements gj, kx3 {
    public final /* synthetic */ BrowserActivity a;

    public ev3(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    @Override // defpackage.gj
    public final void a(int i, int i2, String str) {
        if (i2 != 0) {
            int i3 = i2 & i;
            k6l k6lVar = this.a.V;
            if (i3 != 0) {
                if (k6lVar == null) {
                    k6lVar = null;
                }
                Iterator it = Collections.unmodifiableList(k6lVar.b).iterator();
                while (it.hasNext()) {
                    d7l d7lVar = (d7l) ((b2l) it.next());
                    String externalUrlWithFallback = BrowserUtils.getExternalUrlWithFallback(d7lVar.i0());
                    i7f i7fVar = hj.a;
                    if (TextUtils.equals(wqm.q(externalUrlWithFallback), str)) {
                        d7lVar.b();
                    }
                }
                return;
            }
            if (k6lVar == null) {
                k6lVar = null;
            }
            Iterator it2 = Collections.unmodifiableList(k6lVar.b).iterator();
            while (it2.hasNext()) {
                d7l d7lVar2 = (d7l) ((b2l) it2.next());
                String externalUrlWithFallback2 = BrowserUtils.getExternalUrlWithFallback(d7lVar2.i0());
                i7f i7fVar2 = hj.a;
                if (TextUtils.equals(wqm.q(externalUrlWithFallback2), str)) {
                    d7lVar2.p();
                }
            }
        }
    }

    @Override // defpackage.kx3
    public final void b(String str) {
        if (str != null) {
            k6l k6lVar = this.a.V;
            if (k6lVar == null) {
                k6lVar = null;
            }
            Iterator it = Collections.unmodifiableList(k6lVar.b).iterator();
            while (it.hasNext()) {
                d7l d7lVar = (d7l) ((b2l) it.next());
                if (str.equals(GURLUtils.getOrigin(BrowserUtils.getExternalUrlWithFallback(d7lVar.i0())))) {
                    d7lVar.b();
                }
            }
        }
    }
}
