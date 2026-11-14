package defpackage;

import com.leanplum.internal.Constants;
import com.opera.android.Lazy;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.List;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class aeb {
    public static final u1b k = u1b.t("about", "blob", "chrome", "content", Constants.Params.DATA, "file", new String[]{"http", "https", "inline", "javascript", "opera-distiller", "opera-offline", "opera-jump"});
    public final ChromiumContent a;
    public final u59 b;
    public final Lazy c;
    public final List d;
    public final ty3 e;
    public final bp f;
    public zdb g;
    public String h;
    public long i;
    public long j;

    public aeb(ChromiumContent chromiumContent, Lazy lazy, List list) {
        ty3 ty3Var = new ty3(this, (byte) 6);
        this.e = ty3Var;
        bp bpVar = new bp();
        bpVar.a = -2;
        this.f = bpVar;
        this.a = chromiumContent;
        this.b = new u59(chromiumContent, (byte) 19);
        this.c = lazy;
        this.d = list;
        this.g = new zdb(this, this);
        chromiumContent.k(ty3Var);
    }

    public final String a() {
        uo7 uo7Var = ((vo7) this.c.get()).h;
        if (uo7Var == null) {
            return null;
        }
        return uo7Var.b.a;
    }

    public final WebContents b() {
        ChromiumContent chromiumContent = this.a;
        if (chromiumContent.h()) {
            return null;
        }
        return chromiumContent.e();
    }

    public final void c(NavigationHandle navigationHandle) {
        NavigationController navigationControllerD = this.a.d();
        this.f.d0(navigationHandle.d, navigationHandle.q, navigationHandle.p, navigationControllerD.t(), navigationControllerD.d(), navigationHandle.b);
    }

    public final boolean d() {
        b2l b2lVarF = this.b.F();
        return b2lVarF != null && ((d7l) b2lVarF).l == lqm.i;
    }
}
