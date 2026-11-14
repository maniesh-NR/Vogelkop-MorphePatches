package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class l3k extends eud implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context b;
    public final itd c;
    public final etd d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final hud i;
    public c21 l;
    public View m;
    public View n;
    public kud o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean u;
    public final dh j = new dh(this, (byte) 5);
    public final z61 k = new z61(this, (byte) 21);
    public int t = 0;

    public l3k(int i, int i2, itd itdVar, Context context, View view, boolean z) {
        this.b = context;
        this.c = itdVar;
        this.e = z;
        this.d = new etd(itdVar, LayoutInflater.from(context), z, 2131558419);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.m = view;
        this.i = new hud(context, null, i, i2);
        itdVar.b(this, context);
    }

    @Override // defpackage.gij
    public final boolean a() {
        return !this.q && this.i.B.isShowing();
    }

    @Override // defpackage.lud
    public final boolean b(akk akkVar) {
        boolean z;
        if (akkVar.hasVisibleItems()) {
            fud fudVar = new fud(this.g, this.h, akkVar, this.b, this.n, this.e);
            kud kudVar = this.o;
            fudVar.i = kudVar;
            eud eudVar = fudVar.j;
            if (eudVar != null) {
                eudVar.d(kudVar);
            }
            int size = akkVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = akkVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            fudVar.h = z;
            eud eudVar2 = fudVar.j;
            if (eudVar2 != null) {
                eudVar2.n(z);
            }
            fudVar.k = this.l;
            this.l = null;
            this.c.c(false);
            hud hudVar = this.i;
            int width = hudVar.f;
            int iJ = hudVar.j();
            if ((Gravity.getAbsoluteGravity(this.t, this.m.getLayoutDirection()) & 7) == 5) {
                width += this.m.getWidth();
            }
            if (!fudVar.b()) {
                if (fudVar.f != null) {
                    fudVar.d(width, iJ, true, true);
                }
            }
            kud kudVar2 = this.o;
            if (kudVar2 != null) {
                kudVar2.p(akkVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.lud
    public final void d(kud kudVar) {
        this.o = kudVar;
    }

    @Override // defpackage.gij
    public final void dismiss() {
        if (a()) {
            this.i.dismiss();
        }
    }

    @Override // defpackage.lud
    public final void e() {
        this.r = false;
        etd etdVar = this.d;
        if (etdVar != null) {
            etdVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.lud
    public final void f(itd itdVar, boolean z) {
        if (itdVar == this.c) {
            dismiss();
            kud kudVar = this.o;
            if (kudVar != null) {
                kudVar.f(itdVar, z);
            }
        }
    }

    @Override // defpackage.lud
    public final boolean g() {
        return false;
    }

    @Override // defpackage.gij
    public final im7 l() {
        return this.i.c;
    }

    @Override // defpackage.eud
    public final void m(View view) {
        this.m = view;
    }

    @Override // defpackage.eud
    public final void n(boolean z) {
        this.d.c = z;
    }

    @Override // defpackage.eud
    public final void o(int i) {
        this.t = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.q = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        c21 c21Var = this.l;
        if (c21Var != null) {
            c21Var.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.eud
    public final void p(int i) {
        this.i.f = i;
    }

    @Override // defpackage.eud
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.l = (c21) onDismissListener;
    }

    @Override // defpackage.eud
    public final void r(boolean z) {
        this.u = z;
    }

    @Override // defpackage.eud
    public final void s(int i) {
        this.i.g(i);
    }

    @Override // defpackage.gij
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.q || (view = this.m) == null) {
            qp2.n("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.n = view;
        hud hudVar = this.i;
        hudVar.B.setOnDismissListener(this);
        hudVar.r = this;
        hudVar.q(true);
        View view2 = this.n;
        boolean z = this.p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        hudVar.q = view2;
        hudVar.p(this.t);
        boolean z2 = this.r;
        Context context = this.b;
        etd etdVar = this.d;
        if (!z2) {
            this.s = eud.k(etdVar, context, this.f);
            this.r = true;
        }
        hudVar.o(this.s);
        hudVar.B.setInputMethodMode(2);
        Rect rect = this.a;
        hudVar.z = rect != null ? new Rect(rect) : null;
        hudVar.show();
        im7 im7Var = hudVar.c;
        im7Var.setOnKeyListener(this);
        if (this.u) {
            itd itdVar = this.c;
            if (itdVar.n != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131558418, (ViewGroup) im7Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(itdVar.n);
                }
                frameLayout.setEnabled(false);
                im7Var.addHeaderView(frameLayout, null, false);
            }
        }
        hudVar.k(etdVar);
        hudVar.show();
    }
}
