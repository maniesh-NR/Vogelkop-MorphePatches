package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.opera.android.OperaApplication;
import com.opera.android.browser.passwordmanager.PasswordGenerationPopupView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o66 implements AdapterView.OnItemClickListener, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, PopupWindow.OnDismissListener, lud, AdapterView.OnItemLongClickListener {
    public static final int[] G = {R.attr.colorControlNormal};
    public boolean A;
    public boolean B;
    public boolean C;
    public kqd D;
    public boolean E;
    public final dkf a;
    public final itd b;
    public final m56 c;
    public final int d;
    public final View e;
    public l56 f;
    public ViewTreeObserver g;
    public r9i h;
    public FrameLayout i;
    public boolean j;
    public int k;
    public int l;
    public int n;
    public boolean o;
    public int p;
    public boolean q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public o73 w;
    public b4g x;
    public boolean z;
    public int m = 0;
    public boolean y = true;
    public final kze F = new kze(og.a);

    public o66(dkf dkfVar, itd itdVar, View view, int i) {
        this.a = dkfVar;
        this.b = itdVar;
        this.c = new m56(itdVar, LayoutInflater.from(dkfVar));
        this.d = i;
        Resources resources = dkfVar.getResources();
        this.u = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131167308));
        this.e = view;
        itdVar.b(this, dkfVar);
    }

    public static void l(ptd ptdVar, ColorStateList colorStateList) {
        Drawable icon = ptdVar.getIcon();
        if (icon != null) {
            icon.setTintList(colorStateList);
            ptdVar.setIcon(icon);
        }
        if (ptdVar.hasSubMenu()) {
            akk akkVar = ptdVar.o;
            for (int i = 0; i < ((itd) akkVar).f.size(); i++) {
                ptd item = akkVar.getItem(i);
                if (item instanceof ptd) {
                    l(item, colorStateList);
                }
            }
        }
    }

    public final void a(boolean z) {
        if (this.A || z) {
            View view = ((ListPopupWindow) this.f).c;
            while (!(view.getLayoutParams() instanceof WindowManager.LayoutParams)) {
                im7 parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                } else {
                    view = (View) parent;
                }
            }
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
            if (this.A) {
                layoutParams.flags |= 8192;
            } else {
                layoutParams.flags &= -8193;
            }
            windowManager.updateViewLayout(view, layoutParams);
        }
    }

    public final boolean b(akk akkVar) {
        boolean z;
        if (akkVar.hasVisibleItems()) {
            View view = this.e;
            int i = this.d;
            dkf dkfVar = this.a;
            o66 o66Var = new o66(dkfVar, akkVar, view, i);
            if (this.o) {
                o66Var.n = this.n;
                o66Var.o = true;
            }
            if (this.q) {
                o66Var.p = this.p;
                o66Var.q = true;
            }
            o66Var.s = this.t && this.s;
            o66Var.t = true;
            o66Var.m = this.m;
            o66Var.h = this.h;
            int size = ((itd) akkVar).f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = akkVar.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            }
            o66Var.c.c = z;
            this.b.c(false);
            if (o66Var.m()) {
                l56 l56Var = o66Var.f;
                im7 im7Var = l56Var != null ? ((ListPopupWindow) l56Var).c : null;
                View viewM = im7Var != null ? q9n.m(im7Var) : null;
                if (viewM != null) {
                    String[] strArr = OperaApplication.K;
                    ((OperaApplication) dkfVar.getApplicationContext()).B().b(viewM);
                    viewM.setClipToOutline(true);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c(ptd ptdVar) {
        return false;
    }

    public final void d(kud kudVar) {
        throw null;
    }

    public final void e() {
        this.j = false;
        m56 m56Var = this.c;
        if (m56Var != null) {
            m56Var.notifyDataSetChanged();
        }
    }

    public final void f(itd itdVar, boolean z) {
        if (itdVar == this.b && j()) {
            this.f.dismiss();
        }
    }

    public final boolean g() {
        return false;
    }

    public final boolean h(ptd ptdVar) {
        return false;
    }

    public final void i(Context context, itd itdVar) {
    }

    public final boolean j() {
        l56 l56Var = this.f;
        return l56Var != null && ((ListPopupWindow) l56Var).B.isShowing();
    }

    public final void k() {
        int i = this.v;
        m56 m56Var = this.c;
        int count = m56Var.getCount();
        int i2 = 0;
        int dividerHeight = 0;
        View view = null;
        for (int i3 = 0; i3 < count; i3++) {
            int itemViewType = m56Var.getItemViewType(i3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            FrameLayout frameLayout = this.i;
            if (frameLayout == null) {
                frameLayout = new FrameLayout(this.a);
                this.i = frameLayout;
            }
            view = m56Var.getView(i3, view, frameLayout);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            int i4 = this.u;
            if (measuredWidth >= i4) {
                i = i4;
            } else if (measuredWidth > i) {
                i = measuredWidth;
            }
            dividerHeight += view.getMeasuredHeight();
        }
        im7 im7Var = ((ListPopupWindow) this.f).c;
        if (im7Var != null) {
            dividerHeight += count > 0 ? (count - 1) * im7Var.getDividerHeight() : 0;
        }
        this.k = i;
        this.l = dividerHeight;
    }

    public final boolean m() {
        LinearLayout linearLayout;
        byte b = 1;
        if (!j()) {
            View view = this.e;
            if (view == null) {
                return false;
            }
            int i = this.d;
            dkf dkfVar = this.a;
            l56 l56Var = new l56(dkfVar, i);
            this.f = l56Var;
            ((ListPopupWindow) l56Var).B.setOnDismissListener(this);
            l56 l56Var2 = this.f;
            ((ListPopupWindow) l56Var2).r = this;
            l56Var2.q(this.y);
            l56 l56Var3 = this.f;
            ((ListPopupWindow) l56Var3).l = this.z;
            ((ListPopupWindow) l56Var3).o = this.E;
            kqd kqdVar = this.D;
            if (kqdVar != null) {
                kwf kwfVar = (kwf) kqdVar.b;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(dkfVar);
                LinearLayout linearLayout2 = new LinearLayout(dkfVar);
                linearLayout2.setOrientation(1);
                if (kwfVar.B) {
                    View viewInflate = layoutInflaterFrom.inflate(2131558670, (ViewGroup) linearLayout2, false);
                    linearLayout2.addView(viewInflate);
                    if (viewInflate == null) {
                        t3p.q("rootView");
                        return false;
                    }
                } else {
                    View viewInflate2 = layoutInflaterFrom.inflate(2131558672, (ViewGroup) linearLayout2, false);
                    linearLayout2.addView(viewInflate2);
                    if (viewInflate2 == null) {
                        t3p.q("rootView");
                        return false;
                    }
                }
                View viewInflate3 = layoutInflaterFrom.inflate(2131559200, (ViewGroup) linearLayout2, false);
                linearLayout2.addView(viewInflate3);
                new igi(kwfVar.v, pt1.b(viewInflate3), new eu3(kwfVar, b), kwfVar.l, new vdf(kwfVar, (byte) 10), (kze) null);
                boolean zIsShowing = ((ListPopupWindow) l56Var3).B.isShowing();
                if (zIsShowing && (linearLayout = ((ListPopupWindow) l56Var3).n) != null) {
                    ViewParent parent = linearLayout.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(((ListPopupWindow) l56Var3).n);
                    }
                }
                ((ListPopupWindow) l56Var3).n = linearLayout2;
                if (zIsShowing) {
                    l56Var3.show();
                }
            }
            boolean z = this.g == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.g = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
            }
            ((ListPopupWindow) this.f).q = view;
            int i2 = this.m;
            boolean zW = (i2 == 0 || (i2 & 8388608) != 0) ? cs5.W(view) : false;
            l56 l56Var4 = this.f;
            int i3 = this.m;
            if (zW) {
                l56Var4.p(i3 == 0 ? 8388611 : Gravity.getAbsoluteGravity(i3, 1));
                l56 l56Var5 = this.f;
                ((ListPopupWindow) l56Var5).f = -((ListPopupWindow) l56Var5).f;
            } else {
                l56Var4.p(i3);
            }
            if (!this.j) {
                k();
                this.j = true;
            }
            boolean z2 = this.o;
            l56 l56Var6 = this.f;
            if (z2) {
                l56Var6.g(this.n);
            } else {
                l56Var6.g(l56Var6.j());
            }
            if (this.q) {
                ((ListPopupWindow) this.f).f = this.p;
            }
            if (this.t) {
                l56 l56Var7 = this.f;
                boolean z3 = this.s;
                l56Var7.getClass();
                mzg.j(l56Var7, "setPopupClipToScreenEnabled", new Class[]{Boolean.TYPE}, new Object[]{Boolean.valueOf(z3)});
                ((ListPopupWindow) l56Var7).B.setClippingEnabled(z3);
            }
            n();
            ((ListPopupWindow) this.f).B.setInputMethodMode(2);
            itd itdVar = this.b;
            boolean z4 = itdVar.n != null;
            m56 m56Var = this.c;
            if (!z4) {
                this.f.k(m56Var);
            }
            this.F.r(ng.a);
            this.f.show();
            a(false);
            im7 im7Var = ((ListPopupWindow) this.f).c;
            im7Var.setOnKeyListener(this);
            n66 n66Var = new n66(this);
            WeakHashMap weakHashMap = r5n.a;
            m5n.a(im7Var, n66Var);
            im7Var.setOnItemLongClickListener(this);
            im7Var.setId(2131363914);
            if (this.r != 0) {
                h5n.c(im7Var, new n66(this));
            }
            if (z4) {
                TextView textView = (TextView) LayoutInflater.from(dkfVar).inflate(2131558628, (ViewGroup) im7Var, false);
                textView.setText(itdVar.n);
                textView.setEnabled(false);
                im7Var.addHeaderView(textView, null, false);
                this.f.k(m56Var);
                this.f.show();
            }
        }
        return true;
    }

    public final void n() {
        boolean z = this.B;
        View view = this.e;
        this.f.o(cs5.t(z ? Math.max(Math.min(view.getWidth(), this.u), this.k) : this.k, 0, q9n.n(view).width()));
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        o73 o73Var = this.w;
        if (o73Var != null) {
            o73Var.onDismiss();
        }
        l56 l56Var = this.f;
        if (l56Var != null) {
            im7 im7Var = ((ListPopupWindow) l56Var).c;
            if (im7Var != null) {
                WeakHashMap weakHashMap = r5n.a;
                h5n.c(im7Var, (bcf) null);
            }
            this.f = null;
        }
        this.b.c(true);
        ViewTreeObserver viewTreeObserver = this.g;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.g = this.e.getViewTreeObserver();
            }
            this.g.removeGlobalOnLayoutListener(this);
            this.g = null;
        }
        xf8.G0(this.F, og.a);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (j()) {
            View view = this.e;
            if (view == null || !view.isShown()) {
                if (j()) {
                    this.f.dismiss();
                    return;
                }
                return;
            }
            n();
            if (this.C) {
                m56 m56Var = this.c;
                boolean z = true;
                if (m56Var.getCount() >= 1) {
                    Rect rect = new Rect();
                    view.getWindowVisibleDisplayFrame(rect);
                    k();
                    int i = this.l;
                    Rect rect2 = new Rect();
                    if (((ListPopupWindow) this.f).B.getBackground() != null) {
                        ((ListPopupWindow) this.f).B.getBackground().getPadding(rect2);
                    }
                    int i2 = i + rect2.top + rect2.bottom;
                    int bottom = rect.bottom - view.getBottom();
                    int top = rect.bottom - view.getTop();
                    int top2 = view.getTop() - rect.top;
                    int count = i2 / m56Var.getCount();
                    if (i2 >= top && top2 >= top) {
                        z = false;
                    }
                    if (z && i2 > bottom && bottom > count) {
                        l56 l56Var = this.f;
                        l56Var.getClass();
                        if (bottom < 0 && -2 != bottom && -1 != bottom) {
                            qp2.o("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
                            return;
                        }
                        ((ListPopupWindow) l56Var).d = bottom;
                    } else if (!z && i2 > top2 && top2 > count) {
                        l56 l56Var2 = this.f;
                        l56Var2.getClass();
                        if (top2 < 0 && -2 != top2 && -1 != top2) {
                            qp2.o("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
                            return;
                        }
                        ((ListPopupWindow) l56Var2).d = top2;
                    }
                }
            }
            this.f.show();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.f == null) {
            return;
        }
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (m56) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (m56) listAdapter).a.q((MenuItem) listAdapter.getItem(i), (lud) null, 0);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        if (this.x == null) {
            return false;
        }
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        b4g b4gVar = this.x;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        PasswordGenerationPopupView passwordGenerationPopupView = b4gVar.m;
        menuItem.getItemId();
        passwordGenerationPopupView.getClass();
        return false;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || (i != 82 && (i != 111 || !fr3.H(0, keyEvent)))) {
            return c37.r().l(2, keyEvent);
        }
        if (j()) {
            this.f.dismiss();
        }
        return true;
    }
}
