package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.opera.ad.entity.Macros;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class aoo extends fjo implements View.OnClickListener, View.OnTouchListener, ooo {
    public final Context a;
    public final View b;
    public final ami c;
    public ArrayList d;
    public loo e;
    public double f;
    public double g;
    public ArrayList h;
    public bzo i;
    public View j;
    public View k;
    public xbf l;
    public y55 m;
    public ltm n;
    public sc o;
    public tvk p;
    public boolean q;
    public oam r;
    public zg s;
    public final drj t;

    public aoo(Context context, View view) {
        super(context, null, 0);
        this.a = context;
        view = view == null ? k() : view;
        this.b = view;
        this.c = new ami(context, (byte) 16);
        this.t = new drj((byte) 11);
        s(view);
    }

    public final void a() {
        this.q = true;
    }

    public final void b() {
    }

    public final void c() {
    }

    public final Integer d() {
        return 1;
    }

    public final int e() {
        return 0;
    }

    public final boolean f() {
        return this.q;
    }

    public final int g() {
        return 0;
    }

    public final int h() {
        return 0;
    }

    public void i(View view) {
        if (this.q) {
            return;
        }
        if (view == this.j) {
            u(1);
        }
        this.c.a(view);
    }

    public final void j(View view) {
        y55 y55Var;
        bzo bzoVar = this.i;
        if ((bzoVar instanceof cie) && !((cie) bzoVar).q0 && (y55Var = this.m) != null) {
            y55Var.o();
            return;
        }
        t();
        xbf xbfVar = this.l;
        if (xbfVar == null) {
            xbf xbfVar2 = new xbf(this.a, this.s, this.m, this, this.n);
            this.l = xbfVar2;
            xbfVar = xbfVar2;
        }
        xbfVar.a(view);
    }

    public View k() {
        return this;
    }

    public void l(w06 w06Var) {
        View view = this.j;
        if (view != null) {
            this.c.b(view, this);
        }
        if (w06.b == w06Var || w06.c == w06Var || w06.u == w06Var || w06.g == w06Var || w06.i == w06Var || w06.j == w06Var || w06.h == w06Var) {
            View view2 = this.j;
            if (view2 != null && g1p.j) {
                s(view2);
            }
            View view3 = this.k;
            if (view3 != null) {
                view3.setOnClickListener(this);
                view3.setOnTouchListener(this);
            }
            if (m5h.d(this.d)) {
                return;
            }
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (obj != null) {
                    View view4 = (View) obj;
                    view4.setOnClickListener(this);
                    view4.setOnTouchListener(this);
                }
            }
        }
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j(view);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.f = motionEvent.getX();
        this.g = motionEvent.getY();
        return false;
    }

    public void p() {
    }

    public void q(View view) {
        j(view);
    }

    public void r() {
    }

    public final void s(View view) {
        GestureDetector gestureDetector = new GestureDetector(view.getContext(), new sgh(this, view, (byte) 4));
        view.setClickable(true);
        view.setOnTouchListener(new bmd(this, gestureDetector, (byte) 2));
    }

    public final void t() {
        ArrayList arrayList;
        loo looVar;
        tvk tvkVar = this.p;
        if (tvkVar != null && !tvkVar.f(this.i, 2) && (looVar = this.e) != null) {
            looVar.onAdClicked();
            return;
        }
        sc scVar = this.o;
        if (scVar != null) {
            scVar.g();
        }
        ArrayList arrayList2 = this.h;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                pho phoVar = (pho) obj;
                if (phoVar.a == 4 && (arrayList = phoVar.b) != null) {
                    List list = sjo.a;
                    ArrayList arrayListE = sjo.e("clickts", String.valueOf(System.currentTimeMillis()), arrayList);
                    int size2 = arrayListE.size();
                    while (i < size2) {
                        Object obj2 = arrayListE.get(i);
                        i++;
                        String strP = f1p.a().p(lno.a((String) obj2, new Macros(getHeight(), getWidth(), this.f, this.g)));
                        if (!TextUtils.isEmpty(strP)) {
                            phj.t(strP, 4);
                        }
                    }
                    loo looVar2 = this.e;
                    if (looVar2 != null) {
                        looVar2.onAdClicked();
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(int r9) {
        /*
            r8 = this;
            tvk r0 = r8.p
            r1 = 1
            if (r0 == 0) goto L19
            if (r9 != r1) goto L9
            r2 = r1
            goto La
        L9:
            r2 = 4
        La:
            bzo r3 = r8.i
            boolean r0 = r0.f(r3, r2)
            if (r0 != 0) goto L19
            if (r1 != r9) goto L63
            loo r8 = r8.e
            if (r8 == 0) goto L63
            goto L60
        L19:
            r8.r()
            java.util.ArrayList r0 = r8.h
            if (r0 == 0) goto L63
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L26:
            if (r4 >= r2) goto L63
            java.lang.Object r5 = r0.get(r4)
            int r4 = r4 + 1
            pho r5 = (defpackage.pho) r5
            int r6 = r5.a
            if (r6 != r9) goto L26
            java.util.ArrayList r5 = r5.b
            if (r5 == 0) goto L26
            java.util.List r0 = defpackage.sjo.a
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r2 = "impressionts"
            java.util.ArrayList r0 = defpackage.sjo.e(r2, r0, r5)
            int r2 = r0.size()
        L4c:
            if (r3 >= r2) goto L5a
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            java.lang.String r4 = (java.lang.String) r4
            phj.t(r4, r9)
            goto L4c
        L5a:
            loo r8 = r8.e
            if (r8 == 0) goto L63
            if (r1 != r9) goto L63
        L60:
            r8.a()
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoo.u(int):void");
    }

    @Override // defpackage.mro
    public final void unregister() {
        p();
        setOnClickListener(null);
        setOnTouchListener(null);
        ami amiVar = this.c;
        ((WeakHashMap) amiVar.c).clear();
        ((WeakHashMap) amiVar.d).clear();
        ((WeakHashMap) amiVar.e).clear();
        tuj tujVar = (tuj) amiVar.b;
        ((WeakHashMap) tujVar.g).clear();
        Handler handler = (Handler) tujVar.k;
        handler.removeMessages(0);
        tujVar.c = false;
        ((Handler) amiVar.f).removeMessages(0);
        ((WeakHashMap) tujVar.g).clear();
        handler.removeMessages(0);
        tujVar.c = false;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) ((WeakReference) tujVar.f).get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener((ml2) tujVar.e);
        }
        ((WeakReference) tujVar.f).clear();
        tujVar.i = null;
    }

    public final void v(View view) {
        sc nooVar;
        if (!((Boolean) sjo.b.a()).booleanValue() || this.i == null || this.r == null) {
            return;
        }
        Context context = view.getContext();
        if (!c26.q.b) {
            c26.f(context);
        }
        zg zgVar = this.s;
        String str = zgVar != null ? (String) zgVar.b : null;
        if (view instanceof euo) {
            nooVar = new c6p((euo) view, str, this.r);
        } else {
            boolean z = view instanceof WebView;
            oam oamVar = this.r;
            nooVar = z ? new noo((WebView) view, str, oamVar, (byte) 0) : new noo(view, str, oamVar, (byte) 1);
        }
        this.o = nooVar;
    }
}
