package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nl4 extends eud implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public final Context b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public View o;
    public View p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean w;
    public kud x;
    public ViewTreeObserver y;
    public c21 z;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final dh j = new dh(this, (byte) 3);
    public final z61 k = new z61(this, (byte) 3);
    public final eme l = new eme(this);
    public int m = 0;
    public int n = 0;
    public boolean v = false;

    public nl4(Context context, View view, int i, int i2, boolean z) {
        this.b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.q = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.g = new Handler();
    }

    @Override // defpackage.gij
    public final boolean a() {
        ArrayList arrayList = this.i;
        return arrayList.size() > 0 && ((ml4) arrayList.get(0)).a.B.isShowing();
    }

    @Override // defpackage.lud
    public final boolean b(akk akkVar) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ml4 ml4Var = (ml4) obj;
            if (akkVar == ml4Var.b) {
                ml4Var.a.c.requestFocus();
                return true;
            }
        }
        if (!akkVar.hasVisibleItems()) {
            return false;
        }
        j(akkVar);
        kud kudVar = this.x;
        if (kudVar != null) {
            kudVar.p(akkVar);
        }
        return true;
    }

    @Override // defpackage.lud
    public final void d(kud kudVar) {
        this.x = kudVar;
    }

    @Override // defpackage.gij
    public final void dismiss() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        if (size > 0) {
            ml4[] ml4VarArr = (ml4[]) arrayList.toArray(new ml4[size]);
            for (int i = size - 1; i >= 0; i--) {
                ml4 ml4Var = ml4VarArr[i];
                if (ml4Var.a.B.isShowing()) {
                    ml4Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.lud
    public final void e() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((ml4) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((etd) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.lud
    public final void f(itd itdVar, boolean z) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (itdVar == ((ml4) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < arrayList.size()) {
                ((ml4) arrayList.get(i2)).b.c(false);
            }
            ml4 ml4Var = (ml4) arrayList.remove(i);
            itd itdVar2 = ml4Var.b;
            hud hudVar = ml4Var.a;
            itdVar2.r(this);
            if (this.A) {
                hudVar.B.setExitTransition(null);
                hudVar.B.setAnimationStyle(0);
            }
            hudVar.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.q = ((ml4) arrayList.get(size2 - 1)).c;
            } else {
                this.q = this.o.getLayoutDirection() == 1 ? 0 : 1;
            }
            if (size2 != 0) {
                if (z) {
                    ((ml4) arrayList.get(0)).b.c(false);
                    return;
                }
                return;
            }
            dismiss();
            kud kudVar = this.x;
            if (kudVar != null) {
                kudVar.f(itdVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.y;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.y.removeGlobalOnLayoutListener(this.j);
                }
                this.y = null;
            }
            this.p.removeOnAttachStateChangeListener(this.k);
            this.z.onDismiss();
        }
    }

    @Override // defpackage.lud
    public final boolean g() {
        return false;
    }

    @Override // defpackage.eud
    public final void j(itd itdVar) {
        itdVar.b(this, this.b);
        if (a()) {
            t(itdVar);
        } else {
            this.h.add(itdVar);
        }
    }

    @Override // defpackage.gij
    public final im7 l() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((ml4) am2.k(1, arrayList)).a.c;
    }

    @Override // defpackage.eud
    public final void m(View view) {
        if (this.o != view) {
            this.o = view;
            this.n = Gravity.getAbsoluteGravity(this.m, view.getLayoutDirection());
        }
    }

    @Override // defpackage.eud
    public final void n(boolean z) {
        this.v = z;
    }

    @Override // defpackage.eud
    public final void o(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = Gravity.getAbsoluteGravity(i, this.o.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ml4 ml4Var;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ml4Var = null;
                break;
            }
            ml4Var = (ml4) arrayList.get(i);
            if (!ml4Var.a.B.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (ml4Var != null) {
            ml4Var.b.c(false);
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
        this.r = true;
        this.t = i;
    }

    @Override // defpackage.eud
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.z = (c21) onDismissListener;
    }

    @Override // defpackage.eud
    public final void r(boolean z) {
        this.w = z;
    }

    @Override // defpackage.eud
    public final void s(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // defpackage.gij
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t((itd) obj);
        }
        arrayList.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.itd r18) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl4.t(itd):void");
    }
}
