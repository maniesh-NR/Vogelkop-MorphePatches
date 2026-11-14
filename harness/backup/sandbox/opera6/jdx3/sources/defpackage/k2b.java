package defpackage;

import android.os.SystemClock;
import android.view.View;
import com.opera.android.widget.ThemeableLottieAnimationView;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class k2b extends ptn {
    public long b;
    public long c;
    public final /* synthetic */ l2b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2b(l2b l2bVar, WebContents webContents) {
        super(webContents);
        this.d = l2bVar;
    }

    public final void didFinishNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        l2b l2bVar = this.d;
        StringBuilder sb = l2bVar.W;
        if (navigationHandle.m != 200) {
            sb.append('#');
            return;
        }
        if (!navigationHandle.a || !navigationHandle.h || navigationHandle.c || navigationHandle.j) {
            if (navigationHandle.j) {
                sb.append('!');
                return;
            }
            return;
        }
        if (navigationHandle.s == this.b) {
            this.b = 0L;
            long jUptimeMillis = SystemClock.uptimeMillis() - this.c;
            on7 on7Var = pn7.b;
            if (pn7.c(cs5.y0(jUptimeMillis, un7.d), cs5.x0(5, un7.e)) > 0) {
                l2bVar.X = true;
            }
        }
        boolean zEquals = "accounts.google.com".equals(navigationHandle.e.c());
        l2bVar.P = zEquals;
        if (zEquals) {
            l2bVar.Q0();
        }
        if ("takeout.google.com".equals(navigationHandle.e.c())) {
            l2bVar.P0();
            View view = l2bVar.S;
            if (view == null) {
                view = null;
            }
            view.setVisibility(8);
            View view2 = l2bVar.T;
            (view2 != null ? view2 : null).setVisibility(8);
            l2bVar.O0();
            sb.append('A');
            l2bVar.J0();
            return;
        }
        boolean zEquals2 = "passwords.google.com".equals(navigationHandle.e.c());
        GURL gurl = navigationHandle.e;
        if (zEquals2) {
            if (gurl.e().equals("/error/sync-passphrase")) {
                sb.append('B');
                l2bVar.I0();
                return;
            }
            l2bVar.P0();
            View view3 = l2bVar.S;
            if (view3 == null) {
                view3 = null;
            }
            view3.setVisibility(8);
            View view4 = l2bVar.T;
            (view4 != null ? view4 : null).setVisibility(8);
            l2bVar.O0();
            sb.append('C');
            l2bVar.H0();
            return;
        }
        if (!"accounts.google.com".equals(gurl.c())) {
            if (!"gds.google.com".equals(navigationHandle.e.c())) {
                sb.append('?');
                return;
            } else {
                sb.append('E');
                l2bVar.G0();
                return;
            }
        }
        if (l2bVar.O) {
            l2bVar.O = false;
            yl8 yl8Var = l2bVar.M;
            if (yl8Var != null) {
                yl8Var.b(yl8Var.d);
            }
            l2bVar.M = null;
        }
        j3b j3bVar = l2bVar.N;
        if (j3bVar != null) {
            ((ThemeableLottieAnimationView) j3bVar.b.d).q();
            j3bVar.setVisibility(8);
        }
        View view5 = l2bVar.S;
        if (view5 == null) {
            view5 = null;
        }
        view5.setVisibility(0);
        View view6 = l2bVar.T;
        (view6 != null ? view6 : null).setVisibility(0);
        l2bVar.B0();
        sb.append('D');
        l2bVar.F0();
    }

    public final void didStartNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        if (navigationHandle.c || navigationHandle.j || !navigationHandle.a) {
            return;
        }
        this.b = navigationHandle.s;
        this.c = SystemClock.uptimeMillis();
    }
}
