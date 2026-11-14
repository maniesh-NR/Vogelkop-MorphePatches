package defpackage;

import com.opera.android.browser.chromium.ChromiumContent;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class zy4 extends iz4 implements j0b {
    public final b7f a = uup.m(new dtl());
    public r9b b;
    public r9b c;
    public final lb4 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;

    public zy4(lb4 lb4Var) {
        r9b r9bVar = r9b.e;
        this.b = r9bVar;
        this.c = r9bVar;
        this.q = 1;
        this.d = lb4Var;
    }

    @Override // defpackage.iz4
    public final void K(int i) {
        if (i == this.q) {
            return;
        }
        this.q = i;
        T();
    }

    public final int M() {
        int i;
        int i2;
        if (this.q == 2 && this.e > 0 && !this.o) {
            return this.c.d;
        }
        if (this.e <= 0 || this.o) {
            i = this.c.d;
            i2 = this.i;
        } else {
            i = this.c.d;
            i2 = this.f;
        }
        return i + i2;
    }

    public final int N() {
        int i;
        if (this.n) {
            return this.c.d;
        }
        boolean z = this.o;
        if (!z && (i = this.e) <= 0) {
            return (this.j & 2) != 0 ? this.c.d : (this.q != 2 || i <= 0 || z) ? this.c.d + this.h : this.c.d;
        }
        return M();
    }

    public final int O() {
        if (this.n) {
            return this.c.b;
        }
        if (!this.p && (this.j & 1) != 0) {
            return this.c.b;
        }
        int i = this.g;
        int i2 = this.c.b;
        return i + i2;
    }

    public final int Q() {
        int iMax;
        int i;
        int i2 = this.q;
        if (i2 == 2 || i2 == 3) {
            return 0;
        }
        boolean z = this.o;
        int i3 = this.e;
        if (z) {
            iMax = Math.max(0, i3 - this.c.d);
            i = this.f;
        } else {
            iMax = Math.max(0, i3 - N());
            i = this.f;
        }
        return iMax + i;
    }

    public final int R() {
        if (this.o) {
            return 0;
        }
        dtl dtlVar = (dtl) this.a.b;
        return Math.max(0, this.e - (dtlVar.g ? dtlVar.c : dtlVar.d)) + this.f;
    }

    public final void S() {
        int i;
        r9b r9bVarC;
        boolean z = false;
        if (this.q != 2) {
            r9b r9bVar = this.b;
            this.c = r9bVar;
            r9bVarC = r9bVar;
            i = 0;
        } else {
            i = this.f;
            int iMax = Math.max(this.e, this.b.d);
            r9b r9bVar2 = this.c;
            int i2 = r9bVar2.a;
            r9b r9bVar3 = this.b;
            int i3 = r9bVar3.a;
            int i4 = r9bVar3.c;
            int i5 = r9bVar3.b;
            if (i2 == i3 && r9bVar2.b == i5 && r9bVar2.c == i4 && r9bVar2.d == iMax) {
                r9bVarC = r9bVar2;
            } else {
                r9bVarC = r9b.c(i3, i5, i4, iMax);
                this.c = r9bVarC;
            }
        }
        int i6 = this.g + r9bVarC.b;
        int iO = O();
        int iM = M() + i;
        int iN = N() + i;
        int i7 = this.i;
        int i8 = this.e;
        if ((this.l == 0 && this.g > 0) || (this.m == 0 && M() > N())) {
            z = true;
        }
        dtl dtlVar = new dtl(i6, iO, z, iM, iN, i7, i8);
        b7f b7fVar = this.a;
        if (dtlVar.equals(b7fVar.b)) {
            return;
        }
        b7fVar.d(dtlVar);
        this.d.run();
    }

    public final void T() {
        if (this.k) {
            return;
        }
        int i = this.l;
        b7f b7fVar = this.a;
        if (i < 0) {
            dtl dtlVar = (dtl) b7fVar.b;
            if (i > (-(dtlVar.a - dtlVar.b)) && this.g > O()) {
                return;
            }
        }
        int i2 = this.m;
        if (i2 > 0) {
            dtl dtlVar2 = (dtl) b7fVar.b;
            if (i2 < dtlVar2.c - dtlVar2.d && M() > N()) {
                return;
            }
        }
        S();
    }

    public final void b(boolean z, boolean z2) {
        if (this.p == z) {
            return;
        }
        this.p = z;
        T();
    }

    @Override // defpackage.iz4
    public final void i(ChromiumContent chromiumContent, int i, int i2, int i3) {
        if (i == this.l && i3 == this.m) {
            return;
        }
        this.l = i;
        this.m = i3;
        T();
    }

    @Override // defpackage.iz4
    public final void l(ChromiumContent chromiumContent, NavigationHandle navigationHandle) {
        if (navigationHandle.c || !navigationHandle.h) {
            return;
        }
        K(chromiumContent.e().x0());
    }
}
