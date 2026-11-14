package defpackage;

import J.N;
import android.os.Handler;
import android.os.Looper;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.media.MediaCaptureNotificationService;
import java.util.Objects;
import org.chromium.content_public.browser.MediaSession;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class fz4 extends rtn {
    public final /* synthetic */ byte c = 1;
    public final Object d;

    public fz4(WebContentsWrapper webContentsWrapper, u78 u78Var) {
        super(webContentsWrapper);
        this.d = u78Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz4(ChromiumContent chromiumContent, ChromiumContent chromiumContent2) {
        super(chromiumContent2);
        this.d = chromiumContent;
    }

    public final void didChangeThemeColor() {
        switch (this.c) {
            case 0:
                int iT = ((ptn) this).a.T();
                h7f h7fVar = ((ChromiumContent) this.d).C;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((iz4) g7fVarH.next()).k(iT);
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void didFinishNavigationInPrimaryMainFrame(org.chromium.content_public.browser.NavigationHandle r5) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.didFinishNavigationInPrimaryMainFrame(org.chromium.content_public.browser.NavigationHandle):void");
    }

    public final void didFirstVisuallyNonEmptyPaint() {
        switch (this.c) {
            case 0:
                ChromiumContent chromiumContent = (ChromiumContent) this.d;
                h7f h7fVar = chromiumContent.C;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((iz4) g7fVarH.next()).m(chromiumContent);
                }
                break;
        }
    }

    public final void didStartLoading(GURL gurl) {
        switch (this.c) {
            case 0:
                ((ChromiumContent) this.d).H.d();
                break;
        }
    }

    public final void didStartNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        Object value;
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                ChromiumContent chromiumContent = (ChromiumContent) obj;
                if (!navigationHandle.c) {
                    GURL gurl = ChromiumContent.V;
                    chromiumContent.P = chromiumContent.Q;
                    chromiumContent.Q = null;
                    chromiumContent.H.d();
                    fr frVar = ChromiumContent.W;
                    int i = frVar.c + 1;
                    frVar.c = i;
                    chromiumContent.l = fr.k(fr.k(i) ^ frVar.b);
                }
                t59 t59Var = chromiumContent.M;
                t59Var.b = 0L;
                t59Var.a = 0L;
                t59Var.g();
                t59Var.h();
                h7f h7fVar = chromiumContent.C;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((iz4) g7fVarH.next()).o(chromiumContent, navigationHandle);
                }
                break;
            default:
                u78 u78Var = (u78) obj;
                u78Var.i(true);
                if (!(((i78) u78Var.n.a.getValue()).b instanceof k78)) {
                    nak nakVar = u78Var.k;
                    do {
                        value = nakVar.getValue();
                    } while (!nakVar.h(value, x88.a));
                }
                break;
        }
    }

    public final void didStopLoading(GURL gurl, boolean z) {
        switch (this.c) {
            case 0:
                ((ChromiumContent) this.d).H.e();
                break;
        }
    }

    @Override // defpackage.rtn
    public final void h() {
        switch (this.c) {
            case 0:
                ChromiumContent chromiumContent = (ChromiumContent) this.d;
                if (N.MMzOlmu8(chromiumContent.e()) == 0) {
                    kcf onBackPressedDispatcher = chromiumContent.c().getOnBackPressedDispatcher();
                    Handler handler = new Handler(Looper.getMainLooper());
                    Objects.requireNonNull(onBackPressedDispatcher);
                    handler.post(new lb4(onBackPressedDispatcher, (byte) 13));
                    break;
                }
                break;
        }
    }

    public final void hasEffectivelyFullscreenVideoChange(boolean z) {
        switch (this.c) {
            case 0:
                ChromiumContent chromiumContent = (ChromiumContent) this.d;
                h7f h7fVar = chromiumContent.C;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((iz4) g7fVarH.next()).u(chromiumContent, z);
                }
                break;
        }
    }

    public final void loadProgressChanged(float f) {
        switch (this.c) {
            case 0:
                np1 np1Var = ((ChromiumContent) this.d).H;
                int i = (int) (f * 100.0d);
                if (!np1Var.b) {
                    r4h r4hVar = (r4h) np1Var.d;
                    r4hVar.d = Math.max(0, i - r4hVar.c) + r4hVar.d;
                    r4hVar.c = i;
                    if (i >= 80) {
                        r4hVar.c = 100;
                        r4hVar.a();
                        break;
                    }
                }
                break;
        }
    }

    public final void mediaSessionCreated(MediaSession mediaSession) {
        switch (this.c) {
            case 0:
                h7f h7fVar = ((ChromiumContent) this.d).C;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((iz4) g7fVarH.next()).e(mediaSession);
                }
                break;
        }
    }

    public final void mediaStartedPlaying(int i, boolean z, boolean z2) {
        switch (this.c) {
            case 0:
                h7f h7fVar = ((ChromiumContent) this.d).C;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((iz4) g7fVarH.next()).getClass();
                }
                break;
        }
    }

    public final void mediaStoppedPlaying(int i) {
        switch (this.c) {
            case 0:
                h7f h7fVar = ((ChromiumContent) this.d).C;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((iz4) g7fVarH.next()).getClass();
                }
                break;
        }
    }

    public final void onVisibilityChanged(int i) {
        switch (this.c) {
            case 0:
                ChromiumContent chromiumContent = (ChromiumContent) this.d;
                if (i == 0) {
                    h7f h7fVar = chromiumContent.C;
                    g7f g7fVarH = am2.h(h7fVar, h7fVar);
                    while (g7fVarH.hasNext()) {
                        ((iz4) g7fVarH.next()).L(chromiumContent);
                    }
                    break;
                }
                break;
        }
    }

    public final void primaryMainFrameRenderProcessGone(int i) {
        switch (this.c) {
            case 0:
                ChromiumContent chromiumContent = (ChromiumContent) this.d;
                if (!chromiumContent.s && !chromiumContent.o.n(chromiumContent)) {
                    if (chromiumContent.q) {
                        chromiumContent.s = true;
                    }
                    if (chromiumContent.Q == null) {
                        chromiumContent.onLanguageDetermined("", false, "", "");
                    }
                    h7f h7fVar = chromiumContent.C;
                    g7f g7fVarH = am2.h(h7fVar, h7fVar);
                    while (g7fVarH.hasNext()) {
                        ((iz4) g7fVarH.next()).z(chromiumContent);
                    }
                    break;
                }
                break;
        }
    }

    public final void viewportFitChanged(int i) {
        switch (this.c) {
            case 0:
                ChromiumContent chromiumContent = (ChromiumContent) this.d;
                if (chromiumContent.E != i) {
                    chromiumContent.E = i;
                    h7f h7fVar = chromiumContent.C;
                    g7f g7fVarH = am2.h(h7fVar, h7fVar);
                    while (g7fVarH.hasNext()) {
                        ((iz4) g7fVarH.next()).G();
                    }
                    break;
                }
                break;
        }
    }

    public final void virtualKeyboardModeChanged(int i) {
        switch (this.c) {
            case 0:
                h7f h7fVar = ((ChromiumContent) this.d).C;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((iz4) g7fVarH.next()).K(i);
                }
                break;
        }
    }

    @Override // defpackage.rtn
    public final void webContentsDestroyed() {
        switch (this.c) {
            case 0:
                ChromiumContent chromiumContent = (ChromiumContent) this.d;
                MediaCaptureNotificationService.b(chromiumContent.c(), chromiumContent.i, 0, chromiumContent.r());
                super.webContentsDestroyed();
                break;
            default:
                super.webContentsDestroyed();
                break;
        }
    }
}
