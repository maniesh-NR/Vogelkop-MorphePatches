package defpackage;

import J.N;
import android.os.SystemClock;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.HashSet;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class az3 extends iz4 implements iq9 {
    public final ysl a;
    public final eq9 b;
    public final z4k c;
    public final bz3 d;
    public final HashSet e = new HashSet();
    public final b7f f;
    public final wa g;
    public final h7f h;
    public boolean i;

    public az3(boolean z, eq9 eq9Var, b7f b7fVar) {
        wa waVar = new wa(this, (byte) 7);
        this.g = waVar;
        this.h = new h7f();
        this.a = z ? new r16() : new eme(this);
        bz3 bz3Var = new bz3();
        bz3Var.g = new dtl();
        this.d = bz3Var;
        this.c = new z4k((byte) 7, false);
        this.b = eq9Var;
        this.f = b7fVar;
        b7fVar.getClass();
        b7fVar.c(waVar);
        M((dtl) b7fVar.b);
        if (z) {
            return;
        }
        eq9Var.a(this);
    }

    @Override // defpackage.iq9
    public final void F(boolean z, boolean z2) {
        z4k z4kVar = this.c;
        if (z) {
            ChromiumContent chromiumContent = (ChromiumContent) z4kVar.b;
            if (chromiumContent != null) {
                chromiumContent.e().d1().a(SystemClock.uptimeMillis(), false);
            }
            N(3, false);
            return;
        }
        int i = z2 ? 4 : 3;
        ChromiumContent chromiumContent2 = (ChromiumContent) z4kVar.b;
        if (chromiumContent2 != null) {
            chromiumContent2.e().d1().a(SystemClock.uptimeMillis(), false);
        }
        N(i, false);
    }

    @Override // defpackage.iz4
    public final void H(ChromiumContent chromiumContent, qwi qwiVar) {
        if (this.c.f(chromiumContent)) {
            N(3, true);
        }
    }

    public final void M(dtl dtlVar) {
        bz3 bz3Var = this.d;
        bz3Var.getClass();
        int i = dtlVar.a;
        boolean z = i > 0 && ((dtl) bz3Var.g).a == 0;
        bz3Var.g = dtlVar;
        if (z) {
            bz3Var.e(0, i);
        }
        bz3Var.f();
        N(3, false);
    }

    public final boolean N(int i, boolean z) {
        ChromiumContent chromiumContent = (ChromiumContent) this.c.b;
        if (chromiumContent == null) {
            return false;
        }
        boolean zIsEmpty = (!chromiumContent.r().startsWith("operaui")) & (!chromiumContent.j) & this.e.isEmpty();
        eq9 eq9Var = this.b;
        if (!(zIsEmpty & (eq9Var.c() || (this.i && (!chromiumContent.H.a || wqm.w(chromiumContent.n()))))) || !(!(chromiumContent.o() == nwi.d))) {
            i = 1;
        } else if (eq9Var.c()) {
            i = 2;
        }
        boolean z2 = i == 4 || i == 1;
        z4k.h(chromiumContent, i, z & (z2 != this.d.c()));
        boolean zQ = this.a.q();
        long j = chromiumContent.n;
        if (j == 0) {
            return z2;
        }
        N.MmoI4FKZ(j, zQ);
        return z2;
    }

    @Override // defpackage.iq9
    public final void P(boolean z) {
        z4k z4kVar = this.c;
        if (z) {
            ChromiumContent chromiumContent = (ChromiumContent) z4kVar.b;
            if (chromiumContent != null) {
                chromiumContent.e().d1().a(SystemClock.uptimeMillis(), false);
            }
            N(3, false);
            return;
        }
        ChromiumContent chromiumContent2 = (ChromiumContent) z4kVar.b;
        if (chromiumContent2 != null) {
            chromiumContent2.e().d1().a(SystemClock.uptimeMillis(), false);
        }
        N(4, false);
    }

    @Override // defpackage.iz4
    public final void i(ChromiumContent chromiumContent, int i, int i2, int i3) {
        boolean z;
        if (this.c.f(chromiumContent)) {
            bz3 bz3Var = this.d;
            if (bz3Var.d) {
                boolean z2 = true;
                if (i == bz3Var.a && i2 == bz3Var.b) {
                    z = false;
                } else {
                    bz3Var.e(i, i2);
                    z = true;
                }
                if (i3 == bz3Var.c) {
                    z2 = false;
                } else {
                    bz3Var.c = i3;
                    bz3Var.f();
                }
                if ((z || z2) && bz3Var.c()) {
                    h7f h7fVar = this.h;
                    g7f g7fVarH = am2.h(h7fVar, h7fVar);
                    while (g7fVarH.hasNext()) {
                        ((Runnable) g7fVarH.next()).run();
                    }
                    h7fVar.clear();
                }
            }
        }
    }

    @Override // defpackage.iz4
    public final void l(ChromiumContent chromiumContent, NavigationHandle navigationHandle) {
        if (!navigationHandle.h || navigationHandle.c) {
            return;
        }
        if (this.c.f(chromiumContent)) {
            N(4, false);
        } else {
            z4k.h(chromiumContent, 4, false);
        }
    }

    @Override // defpackage.iz4
    public final void n(ChromiumContent chromiumContent) {
        if (!this.c.f(chromiumContent)) {
            z4k.h(chromiumContent, 1, false);
        } else {
            if (!chromiumContent.H.a || wqm.w(chromiumContent.n())) {
                return;
            }
            N(1, true);
        }
    }

    @Override // defpackage.iz4
    public final void p(ChromiumContent chromiumContent) {
        if (this.c.f(chromiumContent)) {
            N(3, true);
        } else {
            z4k.h(chromiumContent, 3, false);
        }
    }

    @Override // defpackage.iz4
    public final void z(ChromiumContent chromiumContent) {
        if (this.c.f(chromiumContent)) {
            bz3 bz3Var = this.d;
            if (bz3Var.d) {
                bz3Var.d(true);
            }
        }
    }
}
