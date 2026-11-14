package defpackage;

import J.N;
import android.widget.FrameLayout;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class yy4 extends iz4 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final /* synthetic */ FrameLayout c;

    public yy4(ChromiumContainerView chromiumContainerView, vx vxVar) {
        Objects.requireNonNull(chromiumContainerView);
        this.c = chromiumContainerView;
        this.b = vxVar;
    }

    public yy4(g7b g7bVar) {
        this.c = g7bVar;
        this.b = g7bVar;
    }

    @Override // defpackage.iz4
    public final void A(ChromiumContent chromiumContent) {
        switch (this.a) {
            case 0:
                M(chromiumContent);
                if (((Boolean) ((vx) this.b).get()).booleanValue()) {
                    ((ChromiumContainerView) this.c).requestFocus();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void L(ChromiumContent chromiumContent) {
        switch (this.a) {
            case 0:
                M(chromiumContent);
                break;
        }
    }

    public final void M(ChromiumContent chromiumContent) {
        ChromiumContainerView chromiumContainerView = (ChromiumContainerView) this.c;
        if (chromiumContainerView.d == this) {
            chromiumContainerView.d = null;
        }
        chromiumContent.y(this);
    }

    @Override // defpackage.iz4
    public final void i(ChromiumContent chromiumContent, int i, int i2, int i3) {
        switch (this.a) {
            case 1:
                g7b g7bVar = (g7b) this.b;
                int i4 = i2 - g7bVar.k;
                g7bVar.k = i2;
                if (g7bVar.e != 0) {
                    g7bVar.h -= i4;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void j(ChromiumContent chromiumContent) {
        switch (this.a) {
            case 0:
                M(chromiumContent);
                break;
        }
    }

    @Override // defpackage.iz4
    public final void l(ChromiumContent chromiumContent, NavigationHandle navigationHandle) {
        switch (this.a) {
            case 1:
                if (chromiumContent.r) {
                    ((g7b) this.b).n = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void m(ChromiumContent chromiumContent) {
        switch (this.a) {
            case 0:
                M(chromiumContent);
                if (((Boolean) ((vx) this.b).get()).booleanValue()) {
                    ((ChromiumContainerView) this.c).requestFocus();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void o(ChromiumContent chromiumContent, NavigationHandle navigationHandle) {
        switch (this.a) {
            case 1:
                if (navigationHandle.b && N.M3e4Lx_w(chromiumContent.r(), navigationHandle.e.g(), true)) {
                    return;
                }
                g7b g7bVar = (g7b) this.c;
                ArrayList arrayList = new ArrayList();
                Iterator it = g7bVar.q.iterator();
                if (it.hasNext()) {
                    throw p3p.g(it);
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    throw p3p.g(it2);
                }
                return;
            default:
                return;
        }
    }
}
