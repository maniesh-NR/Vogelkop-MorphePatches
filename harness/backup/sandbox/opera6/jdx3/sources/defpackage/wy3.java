package defpackage;

import J.N;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.ChromiumContent;
import kotlin.text.StringsKt;
import org.chromium.content_public.browser.LoadCommittedDetails;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class wy3 extends rtn {
    public final /* synthetic */ byte c = 2;
    public final Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy3(FullscreenWebActivity fullscreenWebActivity, WebContentsWrapper webContentsWrapper, ViewGroup viewGroup) {
        super(webContentsWrapper);
        this.e = fullscreenWebActivity;
        this.d = viewGroup;
        fullscreenWebActivity.u.setVisibility(4);
    }

    public wy3(WebContentsWrapper webContentsWrapper, u78 u78Var, Uri uri) {
        super(webContentsWrapper);
        this.d = u78Var;
        this.e = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy3(ChromiumContent chromiumContent, xy3 xy3Var) {
        super(chromiumContent);
        this.d = chromiumContent;
        this.e = xy3Var;
    }

    public final void didFailLoad(boolean z, int i, GURL gurl, int i2) {
        switch (this.c) {
            case 0:
                ((xy3) this.e).p(false);
                break;
        }
    }

    public final void didFinishNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        switch (this.c) {
            case 0:
                xy3 xy3Var = (xy3) this.e;
                kze kzeVar = xy3Var.t;
                ode odeVar = xy3Var.s;
                if (!navigationHandle.i) {
                    if (!((ChromiumContent) this.d).h()) {
                        if (!z5i.b0(navigationHandle.e)) {
                            odeVar.r((Object) null);
                            kzeVar.r(Boolean.FALSE);
                            if (xy3Var.E) {
                                k73 k73Var = (k73) xy3Var.d.h;
                                if (k73Var != null ? k73Var.o() : false) {
                                    xy3Var.E = false;
                                }
                            }
                            if (xy3Var.D) {
                                xy3Var.D = false;
                                ((kze) xy3Var.y.d).q(xy3Var);
                                xy3Var.I.q(xy3Var);
                                xy3Var.b.i();
                            }
                            xy3Var.p(false);
                            break;
                        } else if (xy3Var.K != null || !navigationHandle.v || !navigationHandle.c) {
                            odeVar.r((Object) null);
                            kzeVar.r(Boolean.FALSE);
                            xy3Var.h();
                            xy3Var.j();
                            xy3Var.o();
                            xy3Var.p(true);
                            break;
                        }
                    } else {
                        xy3Var.p(false);
                        break;
                    }
                }
                break;
        }
    }

    public final void didFirstVisuallyNonEmptyPaint() {
        switch (this.c) {
            case 2:
                g();
                ((FullscreenWebActivity) this.e).u.postOnAnimationDelayed(new ld9(this, (byte) 9), 16L);
                break;
        }
    }

    @Override // defpackage.rtn
    public final void g() {
        switch (this.c) {
            case 2:
                super.g();
                FullscreenWebActivity fullscreenWebActivity = (FullscreenWebActivity) this.e;
                if (fullscreenWebActivity.y == this) {
                    fullscreenWebActivity.y = null;
                    break;
                }
                break;
            default:
                super.g();
                break;
        }
    }

    public final void navigationEntryCommitted(LoadCommittedDetails loadCommittedDetails) {
        switch (this.c) {
            case 2:
                FullscreenWebActivity fullscreenWebActivity = (FullscreenWebActivity) this.e;
                if (fullscreenWebActivity.u.getParent() == null) {
                    ((ViewGroup) this.d).addView((View) fullscreenWebActivity.u, 0);
                    break;
                }
                break;
        }
    }

    public final void primaryMainFrameRenderProcessGone(int i) {
        switch (this.c) {
            case 0:
                ((xy3) this.e).p(false);
                break;
        }
    }

    public final void titleWasSet(String str) {
        Object value;
        WebContents webContentsF;
        String strN;
        switch (this.c) {
            case 1:
                WebContentsWrapper webContentsWrapper = this.b;
                String str2 = null;
                if (webContentsWrapper.j) {
                    webContentsWrapper = null;
                }
                if (webContentsWrapper != null && (webContentsF = webContentsWrapper.f()) != null) {
                    GURL gurlP = webContentsF.p();
                    String authority = ((Uri) this.e).getAuthority();
                    gurlP.getClass();
                    if (!N.MstQ1QcZ(gurlP, authority)) {
                        webContentsF = null;
                    }
                    if (webContentsF != null && (strN = webContentsF.n()) != null && !StringsKt.N(strN)) {
                        str2 = strN;
                    }
                }
                u78 u78Var = (u78) this.d;
                pxh rxhVar = str2 == null ? new rxh(2132018896) : new qxh(str2);
                nak nakVar = u78Var.i;
                do {
                    value = nakVar.getValue();
                } while (!nakVar.h(value, h78.a((h78) value, rxhVar, 6)));
                break;
        }
    }

    @Override // defpackage.rtn
    public final void webContentsDestroyed() {
        switch (this.c) {
            case 2:
                super.webContentsDestroyed();
                g();
                break;
            default:
                super.webContentsDestroyed();
                break;
        }
    }
}
