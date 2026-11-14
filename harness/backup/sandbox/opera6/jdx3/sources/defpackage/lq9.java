package defpackage;

import com.opera.android.FullscreenWebActivity;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.custom_views.ToolbarProgressBar;
import java.util.HashSet;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class lq9 extends rtn {
    public final /* synthetic */ byte c;
    public final /* synthetic */ FullscreenWebActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq9(FullscreenWebActivity fullscreenWebActivity, WebContentsWrapper webContentsWrapper, byte b) {
        super(webContentsWrapper);
        this.c = b;
        switch (b) {
            case 1:
                this.d = fullscreenWebActivity;
                super(webContentsWrapper);
                fullscreenWebActivity.C.G(Math.round(webContentsWrapper.e().d0() * 100.0f), 0L);
                break;
            default:
                this.d = fullscreenWebActivity;
                break;
        }
    }

    public final void didStartLoading(GURL gurl) {
        switch (this.c) {
            case 1:
                this.d.C.G(0, 0L);
                break;
        }
    }

    public final void didStopLoading(GURL gurl, boolean z) {
        switch (this.c) {
            case 1:
                this.d.C.r(false);
                break;
        }
    }

    public final void loadProgressChanged(float f) {
        switch (this.c) {
            case 1:
                shf shfVar = this.d.C;
                int iRound = Math.round(f * 100.0f);
                shfVar.Q();
                n4h n4hVar = (n4h) shfVar.c;
                if (n4hVar.a == -1) {
                    ToolbarProgressBar toolbarProgressBar = (ToolbarProgressBar) n4hVar.c.a;
                    toolbarProgressBar.a = true;
                    toolbarProgressBar.setProgress(iRound);
                    break;
                } else {
                    n4hVar.b = iRound;
                    break;
                }
        }
    }

    public final void primaryMainFrameRenderProcessGone(int i) {
        switch (this.c) {
            case 1:
                this.d.C.r(false);
                break;
        }
    }

    public final void virtualKeyboardModeChanged(int i) {
        switch (this.c) {
            case 0:
                HashSet hashSet = FullscreenWebActivity.I;
                this.d.y0(i);
                break;
        }
    }
}
