package defpackage;

import androidx.fragment.app.r;
import com.opera.android.browser.BrowserFragment;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class px3 extends y08 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserFragment b;

    public /* synthetic */ px3(BrowserFragment browserFragment, byte b) {
        this.a = b;
        this.b = browserFragment;
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        switch (this.a) {
            case 1:
                if (((d7l) b2lVar).j.isActive()) {
                    ami amiVar = this.b.r;
                    amiVar.getClass();
                    amiVar.w(new ro9(amiVar, b2lVar), false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void Q(b2l b2lVar, NavigationHandle navigationHandle) {
        qim qimVar;
        u7k u7kVar;
        switch (this.a) {
            case 1:
                if (((d7l) b2lVar).j.isActive() && (u7kVar = (qimVar = (qim) this.b.k.c).n) != null) {
                    z9l z9lVar = (z9l) u7kVar.a;
                    if (z9lVar.d) {
                        z9lVar.finish(hjm.b);
                        qimVar.n = null;
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void a(b2l b2lVar, d7l d7lVar) {
        switch (this.a) {
            case 1:
                BrowserFragment browserFragment = this.b;
                browserFragment.g.f(b2lVar, d7lVar, true);
                r activity = browserFragment.getActivity();
                l5b l5bVar = q9n.c;
                q9n.v(activity.getWindow());
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void f(b2l b2lVar) {
        switch (this.a) {
            case 1:
                boolean zIsActive = ((d7l) b2lVar).j.isActive();
                BrowserFragment browserFragment = this.b;
                if (!zIsActive) {
                    browserFragment.k.T(b2lVar);
                    break;
                } else {
                    ami amiVar = browserFragment.r;
                    amiVar.getClass();
                    amiVar.w(new ro9(amiVar, b2lVar), false);
                    break;
                }
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void u(b2l b2lVar) {
        switch (this.a) {
            case 0:
                BrowserFragment browserFragment = this.b;
                oml omlVar = browserFragment.t;
                if (omlVar != null) {
                    omlVar.cancel(false);
                    browserFragment.t = null;
                }
                ((d7l) b2lVar).H(this);
                browserFragment.h0(false);
                break;
        }
    }
}
