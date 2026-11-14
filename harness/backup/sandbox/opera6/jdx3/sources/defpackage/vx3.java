package defpackage;

import com.opera.android.browser.TabInfo;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vx3 {
    public final lqm a;
    public TabInfo h;
    public sqh l;
    public boolean m;
    public boolean n;
    public boolean q;
    public boolean s;
    public int b = 2;
    public int c = 3;
    public int d = 3;
    public n3l e = n3l.d;
    public boolean f = true;
    public int g = Integer.MIN_VALUE;
    public v4l i = v4l.d;
    public int j = -1;
    public wx3 k = wx3.Ho;
    public byte o = 0;
    public final ArrayList p = new ArrayList();
    public boolean r = true;

    public vx3(lqm lqmVar) {
        this.a = lqmVar;
    }

    public final void a(boolean z) {
        this.d = z ? 3 : 1;
    }

    public final void b(String str, boolean z) {
        this.p.add(new yx3(str, z));
    }

    public final void c(boolean z) {
        this.b = z ? 1 : 2;
    }

    public final void d(boolean z) {
        this.e = z ? n3l.e : n3l.d;
    }

    public final void e(boolean z) {
        this.c = z ? 2 : 3;
    }
}
