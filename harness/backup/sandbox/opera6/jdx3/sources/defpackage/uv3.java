package defpackage;

import android.os.SystemClock;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class uv3 extends y08 {
    public long a;
    public final /* synthetic */ BrowserActivity b;
    public final /* synthetic */ OperaApplication c;

    public uv3(BrowserActivity browserActivity, OperaApplication operaApplication) {
        this.b = browserActivity;
        this.c = operaApplication;
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        if (!this.b.g(((d7l) b2lVar).j.getUrl()) || SystemClock.uptimeMillis() - this.a <= 750) {
            return;
        }
        x5f x5fVar = this.c.L().c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            am2.f(zpaVar, x56VarF).b.p(21, 1, 1L);
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void G(b2l b2lVar) {
        BrowserActivity browserActivity = this.b;
        xf8.G0(browserActivity.h0, Boolean.valueOf(((d7l) b2lVar).j.m()));
        browserActivity.C();
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void Q(b2l b2lVar, NavigationHandle navigationHandle) {
        if (this.b.g(navigationHandle.e.g())) {
            this.a = SystemClock.uptimeMillis();
        }
    }
}
