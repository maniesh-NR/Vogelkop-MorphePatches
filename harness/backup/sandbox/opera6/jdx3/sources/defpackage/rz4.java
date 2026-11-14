package defpackage;

import J.N;
import android.net.Uri;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.OperaApplication;
import com.opera.android.account.AuthExtension;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.dialog.DialogDelegate;
import java.util.Objects;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public abstract class rz4 extends FullscreenWebActivity {
    public final byte J;
    public final qz4 K = new qz4(this, (byte) 0);
    public final u59 L = new u59(this, (byte) 25);
    public final pz4 M = new pz4(this);
    public ChromiumContent N;

    /* JADX WARN: Multi-variable type inference failed */
    public rz4(int i) {
        this.J = i;
    }

    public DialogDelegate B0() {
        return new oz4((byte) 0);
    }

    public InterceptNavigationDelegate C0(ChromiumContent chromiumContent) {
        return this.M;
    }

    public void D0(WebContents webContents) {
        i7f i7fVar = AuthExtension.a;
        N.MjTR_eId(webContents);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean E0(NavigationHandle navigationHandle, GURL gurl, boolean z, boolean z2) {
        if (!wqm.v(gurl.g())) {
            return false;
        }
        if (navigationHandle.a) {
            Uri uri = Uri.parse(gurl.g());
            lk6 lk6Var = lk6.a;
            ik6 ik6Var = ik6.b;
            lqm lqmVar = lqm.d;
            if (lk6.f(1, ik6Var, lqmVar, this, uri)) {
                lk6.a(uri, lqmVar, 1, this);
                finish();
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.FullscreenWebActivity
    public final WebContentsWrapper f0(qi qiVar, WebContents webContents) {
        ChromiumContent chromiumContent = new ChromiumContent(this.L, qiVar, webContents, false, false, this.J);
        D0(webContents);
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        qy4 qy4Var = new qy4(0, new vk2((byte) 7), chromiumContent, operaApplication.L().c, ru9.c(this));
        rbe rbeVar = new rbe((byte) 25);
        qii qiiVar = new qii();
        chromiumContent.t(qy4Var, rbeVar, new qp2((byte) 20), C0(chromiumContent), this.K, operaApplication.L().c, O(), null, null, qiiVar);
        chromiumContent.p = B0();
        SelectionPopupControllerImpl selectionPopupControllerImplFromWebContents = SelectionPopupControllerImpl.fromWebContents(chromiumContent.e());
        selectionPopupControllerImplFromWebContents.getClass();
        selectionPopupControllerImplFromWebContents.f = new ue(this, selectionPopupControllerImplFromWebContents, new yw3(this), rbeVar, operaApplication.I(), operaApplication.L().c, qiiVar, te.Bo);
        chromiumContent.m = new pjn(this, (byte) 25);
        return chromiumContent;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final void g0(WebContentsWrapper webContentsWrapper) {
        ChromiumContent chromiumContent = (ChromiumContent) webContentsWrapper;
        chromiumContent.s();
        chromiumContent.l();
    }

    public void onPause() {
        super/*androidx.fragment.app.r*/.onPause();
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        qimVar.p = true;
        qimVar.b.h++;
    }

    public void onResume() {
        super/*androidx.fragment.app.r*/.onResume();
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        qimVar.i(true);
    }

    @Override // com.opera.android.FullscreenWebActivity
    public void x0(WebContentsWrapper webContentsWrapper) {
        ChromiumContent chromiumContent = this.N;
        if (chromiumContent != null) {
            chromiumContent.z(false);
        }
        super.x0(webContentsWrapper);
        if (webContentsWrapper instanceof ChromiumContent) {
            ChromiumContent chromiumContent2 = (ChromiumContent) webContentsWrapper;
            this.N = chromiumContent2;
            chromiumContent2.z(true);
        }
    }
}
