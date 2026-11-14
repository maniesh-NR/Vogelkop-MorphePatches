package defpackage;

import android.view.View;
import com.opera.android.BrowserActivity;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class jvj {
    public final h7f a = new h7f();
    public final BrowserActivity b;
    public final float c;
    public boolean d;

    public jvj(View view, BrowserActivity browserActivity) {
        this.b = browserActivity;
        this.c = fan.a(100.0f, browserActivity.getResources());
        lld lldVar = new lld((Object) this, (byte) 28);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(view, lldVar);
        view.addOnAttachStateChangeListener(new tm9(view, (byte) 1));
    }

    public final void a(boolean z) {
        h7f h7fVar = this.a;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ivj ivjVar = (ivj) g7fVarH.next();
            if (z) {
                ivjVar.b();
            } else {
                ivjVar.a();
            }
        }
    }
}
