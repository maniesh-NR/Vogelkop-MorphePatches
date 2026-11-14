package defpackage;

import android.os.Bundle;
import androidx.fragment.app.w;
import com.opera.android.BrowserActivity;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class kxk implements hxk {
    public final ji a;
    public final wv1 b;
    public final j4c c;
    public final wv1 d;
    public final BrowserActivity e;
    public final w f;
    public final du3 g;

    public kxk(ji jiVar, wv1 wv1Var, j4c j4cVar, wv1 wv1Var2, BrowserActivity browserActivity, w wVar, du3 du3Var) {
        this.a = jiVar;
        this.b = wv1Var;
        this.c = j4cVar;
        this.d = wv1Var2;
        this.e = browserActivity;
        this.f = wVar;
        this.g = du3Var;
    }

    public final void a(int... iArr) {
        w wVar = this.f;
        if (wVar.F("SyncSettingsFragment") != null) {
            wVar.V(1, "SyncSettingsFragment");
        }
        Bundle bundleN = s16.n(iArr);
        new zhj(new wzg(null, uxk.class, (byte) 4), bundleN != null ? bundleN : null, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(this.e);
    }

    public final void b(int i, int i2) {
        ysj ysjVar = ((qim) this.g.get()).e;
        ysjVar.b(am2.i(i, i2, ysjVar), ijm.b);
    }
}
