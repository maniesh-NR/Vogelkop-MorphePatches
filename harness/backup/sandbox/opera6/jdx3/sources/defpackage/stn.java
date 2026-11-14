package defpackage;

import com.opera.android.browser.WebContentsWrapper;
import kotlin.jvm.functions.Function1;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class stn extends rtn {
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ Function1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stn(WebContentsWrapper webContentsWrapper, Function1 function1) {
        super(webContentsWrapper);
        this.f = function1;
    }

    public final void didFinishNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        this.c = true;
        this.d = navigationHandle.j;
        i();
    }

    public final void didFirstVisuallyNonEmptyPaint() {
        this.e = true;
        i();
    }

    public final void i() {
        if (this.d || (this.c && this.e)) {
            g();
            this.f.invoke(Boolean.valueOf(!this.d));
        }
    }
}
