package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.UrlMangler;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class dv3 extends y08 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserActivity b;

    public /* synthetic */ dv3(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void G(b2l b2lVar) {
        switch (this.a) {
            case 1:
                BrowserActivity browserActivity = this.b;
                k6l k6lVar = browserActivity.V;
                if (k6lVar == null) {
                    k6lVar = null;
                }
                k6lVar.w.b(this);
                browserActivity.M().e(((d7l) b2lVar).j0());
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void Q(b2l b2lVar, NavigationHandle navigationHandle) {
        switch (this.a) {
            case 0:
                if (UrlMangler.a(((d7l) b2lVar).j.getUrl(), "article_id") != null && Intrinsics.a(navigationHandle.e.g(), wqm.d("startpage"))) {
                    String[] strArr = OperaApplication.K;
                    x5f x5fVar = ((OperaApplication) this.b.getApplication()).L().c;
                    if (x5fVar.h) {
                        x5fVar.l(0);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void e(b2l b2lVar, int i, int i2) {
        switch (this.a) {
            case 0:
                BrowserActivity browserActivity = this.b;
                zyk zykVar = browserActivity.a1;
                if (i == 3 && i2 != 0) {
                    qim qimVar = browserActivity.o;
                    Objects.requireNonNull(qimVar);
                    qimVar.f.S(new glj(2132020636, 2500), b2lVar, false);
                    if (i2 == 1) {
                        ((mu6) zykVar.getValue()).b(((d7l) b2lVar).j.getUrl(), b2lVar, jo0.b);
                        break;
                    } else if (i2 == 2) {
                        ((mu6) zykVar.getValue()).b(((d7l) b2lVar).j.getUrl(), b2lVar, jo0.c);
                        break;
                    }
                }
                break;
        }
    }
}
