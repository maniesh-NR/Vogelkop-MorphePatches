package defpackage;

import android.graphics.Rect;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class wv3 {
    public final /* synthetic */ BrowserActivity a;

    public wv3(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    public final int a(b2l b2lVar) {
        knf knfVar = b2lVar != null ? (knf) ((d7l) b2lVar).e.d : null;
        return knfVar != null ? ((mnf) knfVar.B().g()).a : this.a.M0().h();
    }

    public final Rect b() {
        BrowserActivity browserActivity = this.a;
        q8l q8lVar = (q8l) ((t8l) browserActivity.z1.get()).c.g();
        Rect rectT = q9n.t(browserActivity.findViewById(2131364681));
        rectT.top = a(browserActivity.w0()) + rectT.top;
        rectT.bottom -= q8lVar.a == p8l.a ? browserActivity.M0().g() : 0;
        return rectT;
    }
}
