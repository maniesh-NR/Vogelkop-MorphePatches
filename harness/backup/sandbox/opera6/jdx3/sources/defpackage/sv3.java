package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.RootView;
import com.opera.android.browser.BrowserContainer;
import com.opera.android.browser.BrowserFragment;

/* loaded from: classes.dex */
public final class sv3 implements iq9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sv3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(boolean z) {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    @Override // defpackage.iq9
    public final void F(boolean z, boolean z2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                BrowserContainer browserContainer = (BrowserContainer) obj;
                browserContainer.e(4, z);
                browserContainer.requestLayout();
                break;
            case 1:
                ?? r0 = (BrowserActivity) obj;
                int i = BrowserActivity.E1;
                if (r0.getWindow() != null) {
                    RootView rootView = r0.Q;
                    if (rootView == null) {
                        rootView = null;
                    }
                    if (z != rootView.m) {
                        rootView.m = z;
                        rootView.f();
                        rootView.requestLayout();
                        rootView.requestApplyInsets();
                        break;
                    }
                }
                break;
            default:
                ((BrowserFragment) obj).k0();
                break;
        }
    }

    @Override // defpackage.iq9
    public final void P(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                BrowserContainer browserContainer = (BrowserContainer) obj;
                browserContainer.e(2, z);
                browserContainer.requestLayout();
                break;
            case 1:
                break;
            default:
                ((BrowserFragment) obj).k0();
                break;
        }
    }
}
