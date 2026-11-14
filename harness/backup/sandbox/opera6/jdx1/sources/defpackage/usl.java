package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class usl extends gc {
    public final rtl a;
    public final sp1 b;
    public final bxk c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ssi h = new ssi(this, (byte) 13);

    public usl(Toolbar toolbar, CharSequence charSequence, sp1 sp1Var) {
        tvk tvkVar = new tvk(this);
        rtl rtlVar = new rtl(toolbar, false);
        this.a = rtlVar;
        sp1Var.getClass();
        this.b = sp1Var;
        rtlVar.k = sp1Var;
        toolbar.H = tvkVar;
        if (!rtlVar.g) {
            rtlVar.h = charSequence;
            if ((rtlVar.b & 8) != 0) {
                toolbar.D(charSequence);
                if (rtlVar.g) {
                    r5n.m(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.c = new bxk(this, (byte) 4);
    }

    @Override // defpackage.gc
    public final boolean a() {
        ne neVar;
        qe qeVar = this.a.a.a;
        return (qeVar == null || (neVar = qeVar.t) == null || !neVar.j()) ? false : true;
    }

    @Override // defpackage.gc
    public final boolean b() {
        ptd ptdVar;
        qsl qslVar = this.a.a.L;
        if (qslVar == null || (ptdVar = qslVar.b) == null) {
            return false;
        }
        if (qslVar == null) {
            ptdVar = null;
        }
        if (ptdVar == null) {
            return true;
        }
        ptdVar.collapseActionView();
        return true;
    }

    @Override // defpackage.gc
    public final void c(boolean z) {
        if (z != this.f) {
            this.f = z;
            ArrayList arrayList = this.g;
            if (arrayList.size() > 0) {
                throw fki.n(0, arrayList);
            }
        }
    }

    @Override // defpackage.gc
    public final int d() {
        return this.a.b;
    }

    @Override // defpackage.gc
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // defpackage.gc
    public final void f() {
        this.a.a.setVisibility(8);
    }

    @Override // defpackage.gc
    public final boolean g() {
        rtl rtlVar = this.a;
        Toolbar toolbar = rtlVar.a;
        Runnable runnable = this.h;
        toolbar.removeCallbacks(runnable);
        Toolbar toolbar2 = rtlVar.a;
        WeakHashMap weakHashMap = r5n.a;
        toolbar2.postOnAnimation(runnable);
        return true;
    }

    @Override // defpackage.gc
    public final void i() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // defpackage.gc
    public final boolean j(int i, KeyEvent keyEvent) {
        itd itdVarW = w();
        if (itdVarW == null) {
            return false;
        }
        itdVarW.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return itdVarW.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.gc
    public final boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            l();
        }
        return true;
    }

    @Override // defpackage.gc
    public final boolean l() {
        return this.a.a.F();
    }

    @Override // defpackage.gc
    public final void n(boolean z) {
        rtl rtlVar = this.a;
        rtlVar.a(4 | (rtlVar.b & (-5)));
    }

    @Override // defpackage.gc
    public final void o() {
        rtl rtlVar = this.a;
        int i = rtlVar.b;
        rtlVar.a(12);
    }

    @Override // defpackage.gc
    public final void p(int i) {
        rtl rtlVar = this.a;
        Toolbar toolbar = rtlVar.a;
        Drawable drawableF = i != 0 ? sgb.F(i, toolbar.getContext()) : null;
        rtlVar.f = drawableF;
        if ((rtlVar.b & 4) == 0) {
            toolbar.A(null);
            return;
        }
        if (drawableF == null) {
            drawableF = rtlVar.o;
        }
        toolbar.A(drawableF);
    }

    @Override // defpackage.gc
    public final void r(String str) {
        this.a.b(str);
    }

    @Override // defpackage.gc
    public final void s(String str) {
        rtl rtlVar = this.a;
        rtlVar.g = true;
        Toolbar toolbar = rtlVar.a;
        rtlVar.h = str;
        if ((rtlVar.b & 8) != 0) {
            toolbar.D(str);
            if (rtlVar.g) {
                r5n.m(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.gc
    public final void t(CharSequence charSequence) {
        rtl rtlVar = this.a;
        if (rtlVar.g) {
            return;
        }
        Toolbar toolbar = rtlVar.a;
        rtlVar.h = charSequence;
        if ((rtlVar.b & 8) != 0) {
            toolbar.D(charSequence);
            if (rtlVar.g) {
                r5n.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.gc
    public final void u() {
        this.a.a.setVisibility(0);
    }

    public final itd w() {
        boolean z = this.e;
        rtl rtlVar = this.a;
        if (!z) {
            n9k n9kVar = new n9k(this);
            dcl dclVar = new dcl(this);
            Toolbar toolbar = rtlVar.a;
            toolbar.M = n9kVar;
            toolbar.N = dclVar;
            qe qeVar = toolbar.a;
            if (qeVar != null) {
                qeVar.u = n9kVar;
                qeVar.v = dclVar;
            }
            this.e = true;
        }
        return rtlVar.a.o();
    }
}
