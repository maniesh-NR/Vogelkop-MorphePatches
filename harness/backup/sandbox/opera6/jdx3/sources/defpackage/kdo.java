package defpackage;

import android.util.LongSparseArray;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.settings.SettingsManager;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class kdo extends y08 {
    public final ru9 a;
    public final SettingsManager b;
    public final k6l c;
    public final du3 d;
    public final oz3 e;
    public final kwf f;
    public final swf g;
    public final du3 h;
    public final qt3 i;
    public final x5f j;
    public f6l k;
    public GestureListenerManagerImpl l;
    public final tz4 m = new tz4(this, 4);

    public kdo(ru9 ru9Var, SettingsManager settingsManager, k6l k6lVar, du3 du3Var, oz3 oz3Var, kwf kwfVar, swf swfVar, du3 du3Var2, qt3 qt3Var, x5f x5fVar) {
        this.a = ru9Var;
        this.b = settingsManager;
        this.c = k6lVar;
        this.d = du3Var;
        this.e = oz3Var;
        this.f = kwfVar;
        this.g = swfVar;
        this.h = du3Var2;
        this.i = qt3Var;
        this.j = x5fVar;
        if (ru9Var.a.getBoolean("default_zoom.page_menu_hint.shown", false)) {
            return;
        }
        this.k = k6lVar.a(this);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        if (navigationHandle.c || navigationHandle.i) {
            return;
        }
        W(b2lVar);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void G(b2l b2lVar) {
        W(b2lVar);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void R(d7l d7lVar) {
        X();
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void S(d7l d7lVar) {
        X();
    }

    public final void W(b2l b2lVar) {
        WebContents webContentsF;
        X();
        ChromiumContent chromiumContentH = uy3.H(b2lVar);
        if (chromiumContentH == null || (webContentsF = chromiumContentH.f()) == null) {
            return;
        }
        LongSparseArray longSparseArray = GestureListenerManagerImpl.n;
        GestureListenerManagerImpl gestureListenerManagerImplX = webContentsF.X(GestureListenerManagerImpl.class, mkh.d);
        this.l = gestureListenerManagerImplX;
        gestureListenerManagerImplX.b(this.m, 2);
    }

    public final void X() {
        GestureListenerManagerImpl gestureListenerManagerImpl = this.l;
        if (gestureListenerManagerImpl != null) {
            gestureListenerManagerImpl.h(this.m);
        }
        this.l = null;
    }
}
