package defpackage;

import com.opera.android.browser.BrowserFragment;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class tx3 implements p5j {
    public int a;
    public final /* synthetic */ BrowserFragment b;

    public tx3(BrowserFragment browserFragment) {
        this.b = browserFragment;
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        int iA;
        if (("toolbar_disposition_classic".equals(str) || "toolbar_disposition_tablet".equals(str) || "addressbar_position".equals(str)) && (iA = a()) != this.a) {
            this.a = iA;
            BrowserFragment browserFragment = this.b;
            az3 az3Var = browserFragment.j;
            boolean z = iA != 0;
            if (az3Var.i != z) {
                az3Var.i = z;
                az3Var.N(3, false);
            }
            ChromiumContainerView chromiumContainerView = browserFragment.p;
            if (chromiumContainerView != null) {
                int i = browserFragment.m;
                int i2 = browserFragment.n;
                int i3 = browserFragment.o;
                int i4 = browserFragment.c.a;
                zy4 zy4Var = chromiumContainerView.b;
                zy4Var.g = i;
                zy4Var.h = i2;
                zy4Var.i = i3;
                zy4Var.j = i4;
                zy4Var.T();
            }
        }
    }

    public final int a() {
        BrowserFragment browserFragment = this.b;
        SettingsManager settingsManager = browserFragment.a;
        int iOrdinal = settingsManager.D(settingsManager.f()).ordinal();
        if (iOrdinal == 1) {
            return 3;
        }
        if (iOrdinal != 2) {
            return 0;
        }
        return browserFragment.a.c() == b7j.c ? 1 : 3;
    }
}
