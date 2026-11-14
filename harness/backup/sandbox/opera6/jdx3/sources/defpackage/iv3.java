package defpackage;

import android.view.ViewTreeObserver;
import com.opera.android.BrowserActivity;
import com.opera.android.RootView;

/* loaded from: classes.dex */
public final class iv3 implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ BrowserActivity a;
    public final /* synthetic */ bsi b;
    public final /* synthetic */ boolean c;

    public iv3(BrowserActivity browserActivity, bsi bsiVar, boolean z) {
        this.a = browserActivity;
        this.b = bsiVar;
        this.c = z;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        BrowserActivity browserActivity = this.a;
        RootView rootView = browserActivity.Q;
        if (rootView == null) {
            rootView = null;
        }
        rootView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        if (z) {
            gbf gbfVar = browserActivity.M;
            if (gbfVar == null) {
                gbfVar = null;
            }
            gbfVar.l(this.b, hbf.d);
            if (this.c) {
                return;
            }
            z43 z43Var = browserActivity.z;
            (z43Var != null ? z43Var : null).d();
        }
    }
}
