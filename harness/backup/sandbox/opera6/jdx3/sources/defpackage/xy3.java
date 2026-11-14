package defpackage;

import J.N;
import android.content.res.Resources;
import android.net.Uri;
import com.opera.android.Lazy;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.chromium.OperaBrowserContextHandle;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class xy3 extends s62 {
    public final boolean F;
    public final m02 G;
    public final hw3 H;
    public final ikc I;
    public final wy3 J;
    public l62 K;

    public xy3(ChromiumContent chromiumContent, boolean z, m02 m02Var, wth wthVar, l02 l02Var, h62 h62Var, f62 f62Var, SettingsManager settingsManager, Lazy lazy, g7m g7mVar, p12 p12Var, wyn wynVar, ky1 ky1Var, yk6 yk6Var, a52 a52Var, qb qbVar, g62 g62Var, hw3 hw3Var, f9 f9Var, r2 r2Var, yv3 yv3Var, Resources resources) {
        super(t62.b, chromiumContent, m02Var, wthVar, l02Var, h62Var, f62Var, settingsManager, lazy, g7mVar, p12Var, wynVar, ky1Var, yk6Var, a52Var, qbVar, g62Var, f9Var, r2Var, yv3Var);
        this.F = z;
        this.G = m02Var;
        this.H = hw3Var;
        this.I = new ikc(Float.valueOf(1.0f));
        this.J = new wy3(chromiumContent, this);
        N.MdX$dmbm(z ? (OperaBrowserContextHandle) N.MGWafL4o() : (OperaBrowserContextHandle) N.M4QvXpDD(), "opera-aria", "ui", oup.n0(djh.c(settingsManager.n("default_webpage_zoom"), 50, resources.getBoolean(2131034131) ? 200 : 130)));
        n();
        j();
    }

    @Override // defpackage.s62
    public final void b(l62 l62Var) {
        WebContentsWrapper webContentsWrapper = this.b;
        if (webContentsWrapper.e().K0()) {
            this.K = l62Var;
        } else if (!z5i.b0(webContentsWrapper.e().s())) {
            l62Var.invoke(Boolean.FALSE);
        } else {
            o();
            l62Var.invoke(Boolean.TRUE);
        }
    }

    @Override // defpackage.s62
    public final ikc g() {
        return this.I;
    }

    @Override // defpackage.s62
    public final void m() {
        this.J.g();
    }

    public final void o() {
        Uri uri = Uri.parse(BrowserUtils.getRendererUrl(this.b.e().s().a));
        if (!this.F) {
            kul kulVar = (kul) this.H.get();
            na2.B(kulVar.c, (CoroutineContext) null, (rx5) null, new ful(kulVar, uri, null, (byte) 0), 3);
        }
        String strM = wqm.m(uri, "s");
        if (strM != null) {
            String strM2 = wqm.m(uri, "q");
            String str = strM2 == null ? "" : strM2;
            cv2 cv2Var = new cv2(strM2, this, (byte) 10);
            m02 m02Var = this.G;
            if (strM.equals(m02Var.e) && m02Var.a != null) {
                cv2Var.invoke(Boolean.FALSE);
                return;
            }
            m02Var.a = null;
            m02Var.b = new ArrayList();
            m02Var.e = strM;
            m02Var.i(m02Var.c.a(strM, str, this.F, cv2Var, new pa(m02Var, (byte) 23)));
            m02Var.d.invoke();
        }
    }

    public final void p(boolean z) {
        l62 l62Var = this.K;
        if (l62Var == null) {
            return;
        }
        this.K = null;
        l62Var.invoke(Boolean.valueOf(z));
    }
}
