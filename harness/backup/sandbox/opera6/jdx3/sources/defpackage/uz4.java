package defpackage;

import android.view.ViewConfiguration;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.widget.ThumbScroller;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class uz4 {
    public final ThumbScroller a;
    public final ChromiumContent b;
    public final WebContents c;
    public final ysl d;
    public s03 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final int k;
    public boolean l;
    public final ty3 m = new ty3(this, 2);
    public final tz4 o = new tz4(this, 0);
    public final lb4 n = new lb4(this, 14);

    public uz4(ThumbScroller thumbScroller, ChromiumContent chromiumContent, ysl yslVar) {
        this.a = thumbScroller;
        this.b = chromiumContent;
        this.c = chromiumContent.e();
        this.d = yslVar;
        this.k = (int) (ViewConfiguration.get(thumbScroller.getContext()).getScaledMaximumFlingVelocity() * 0.09f);
        thumbScroller.i = new zy9(this);
        b(true);
    }

    public final huh a() {
        return this.c.g;
    }

    public final void b(boolean z) {
        if (z == this.l) {
            return;
        }
        this.l = z;
        tz4 tz4Var = this.o;
        WebContents webContents = this.c;
        lb4 lb4Var = this.n;
        ty3 ty3Var = this.m;
        ChromiumContent chromiumContent = this.b;
        if (z) {
            chromiumContent.k(ty3Var);
            a().l.b(lb4Var);
            GestureListenerManagerImpl.e(webContents).b(tz4Var, 2);
        } else {
            chromiumContent.y(ty3Var);
            a().l.c(lb4Var);
            GestureListenerManagerImpl.e(webContents).h(tz4Var);
        }
    }
}
