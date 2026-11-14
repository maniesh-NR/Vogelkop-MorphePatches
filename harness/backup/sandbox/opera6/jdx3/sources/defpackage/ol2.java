package defpackage;

import android.view.ViewTreeObserver;
import com.opera.android.BrowserActivity;
import com.opera.android.RootView;

/* loaded from: classes.dex */
public final /* synthetic */ class ol2 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ol2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ql2) obj).g = false;
                break;
            case 1:
                z43 z43Var = (z43) obj;
                z43Var.a = true;
                ((gbf) z43Var.i).j.F = true;
                break;
            case 2:
                igi igiVar = (igi) obj;
                oz3 oz3Var = ((ft3) igiVar.f).b.g;
                if (oz3Var != null) {
                    ru9 ru9Var = (ru9) igiVar.e;
                    if (!ru9Var.a.getBoolean("browser_actions_unused_button_hint_shown", false) && !ru9Var.a.getBoolean("customize_toolbar_ui_shown", false)) {
                        oz3Var.b(new kt3(igiVar, b2), ijm.b);
                        break;
                    }
                }
                break;
            case 3:
                BrowserActivity browserActivity = (BrowserActivity) obj;
                RootView rootView = browserActivity.Q;
                if (rootView == null) {
                    rootView = null;
                }
                rootView.postDelayed(new qt3(browserActivity, (byte) 8), 200L);
                break;
            default:
                ((ev4) obj).c = true;
                break;
        }
    }
}
