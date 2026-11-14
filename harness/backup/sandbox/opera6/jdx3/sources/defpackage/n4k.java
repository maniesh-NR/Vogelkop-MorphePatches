package defpackage;

import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import com.opera.android.OperaApplication;
import com.opera.android.browser.OperaPageRootView;
import com.opera.android.feed.FeedViewPager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n4k implements knf {
    public final c5k a;
    public final h5k b;
    public boolean c;
    public boolean d;
    public Parcelable e;
    public final boolean f;
    public f1p g;

    public n4k(c5k c5kVar, boolean z, Parcelable parcelable) {
        this.a = c5kVar;
        this.e = parcelable;
        yul yulVar = c5kVar.e.c != s8k.a ? yul.e : yul.d;
        p8l p8lVar = ((lo3) c5kVar.V.g()).a ? p8l.b : p8l.a;
        p8l p8lVar2 = p8l.b;
        this.b = new h5k(yulVar, p8lVar == p8lVar2 ? new q8l(p8lVar2, n8l.a) : q8l.c, false);
        this.f = z;
    }

    @Override // defpackage.knf
    public final ikc B() {
        return this.a.a;
    }

    @Override // defpackage.knf
    public final q8l D() {
        return (q8l) this.b.d;
    }

    @Override // defpackage.knf
    public final void E() {
        c5k c5kVar = this.a;
        cv8 cv8Var = c5kVar.q;
        cv8Var.m.a();
        cv8Var.E = false;
        uvl uvlVar = c5kVar.I;
        if (uvlVar != null) {
            uvlVar.l = false;
        }
    }

    @Override // defpackage.knf
    public final void F() {
        this.d = true;
        c5k c5kVar = this.a;
        c5kVar.g.r(ng.a);
        bx8 bx8Var = c5kVar.A;
        bx8Var.s = true;
        ArrayList arrayList = bx8Var.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xw8 xw8Var = ((zw8) obj).b;
            if (xw8Var != null && xw8.class.isAssignableFrom(xw8.class)) {
                xw8Var.i(bx8Var.s);
            }
        }
        bmb it = sfe.R(c5kVar.q.p.b.values(), e5k.class).iterator();
        while (true) {
            bmb bmbVar = it;
            if (!bmbVar.hasNext()) {
                break;
            } else {
                ((e5k) bmbVar.next()).p(true);
            }
        }
        if (this.c) {
            g();
        } else {
            c5kVar.e(this.e);
        }
    }

    @Override // defpackage.knf
    public final void a() {
        if (this.c && this.d) {
            f();
        }
        c5k c5kVar = this.a;
        c5kVar.P.b();
        bx8 bx8Var = c5kVar.A;
        bx8Var.s = false;
        ArrayList arrayList = bx8Var.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xw8 xw8Var = ((zw8) obj).b;
            if (xw8Var != null && xw8.class.isAssignableFrom(xw8.class)) {
                xw8Var.i(bx8Var.s);
            }
        }
        bmb it = sfe.R(c5kVar.q.p.b.values(), e5k.class).iterator();
        while (true) {
            bmb bmbVar = it;
            if (!bmbVar.hasNext()) {
                c5kVar.g.r(og.a);
                this.d = false;
                return;
            }
            ((e5k) bmbVar.next()).p(false);
        }
    }

    @Override // defpackage.knf
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, androidx.viewpager.widget.ViewPager, com.opera.android.custom_views.LayoutDirectionViewPager, com.opera.android.feed.FeedViewPager] */
    public final void c(Parcelable parcelable, boolean z) {
        f1p f1pVar;
        cue cueVar;
        c5k c5kVar = this.a;
        if (c5kVar.d != parcelable) {
            c5kVar.d = parcelable;
            ?? r1 = c5kVar.B;
            aba abaVar = c5kVar.G;
            k1g k1gVar = abaVar.n;
            k1gVar.getClass();
            if (!(k1gVar instanceof yaa)) {
                abaVar.l = true;
            }
            abaVar.d();
            c5kVar.Z = true;
            Parcelable parcelableE = c5kVar.e(parcelable);
            int iQ = r1.q();
            boolean z2 = false;
            if (parcelableE != null) {
                r1.onRestoreInstanceState(parcelableE);
            } else {
                ViewPager.SavedState savedState = new ViewPager.SavedState(View.BaseSavedState.EMPTY_STATE);
                ru9 ru9Var = c5kVar.X;
                String string = ru9Var.a.getString("startpage.feed_category_id", null);
                int i = ru9Var.a.getInt("startpage.feed_category_backend", -1);
                if (string != null) {
                    fp1 fp1Var = c5kVar.b;
                    String[] strArr = OperaApplication.K;
                    fue fueVarZ = ((OperaApplication) fp1Var.getApplication()).z();
                    fueVarZ.d();
                    cueVar = fueVarZ.a;
                    if (cueVar.a != i) {
                        string = null;
                    }
                } else {
                    cueVar = cue.None;
                }
                if (string != null) {
                    int iA = c5kVar.A.a(string);
                    if (iA == -1) {
                        c5kVar.O = new nrl(new f1p(cueVar, string), z2);
                    } else {
                        mzg.p(savedState, Integer.valueOf(r1.r(iA)), "position");
                    }
                } else if (cs5.W((View) r1)) {
                    mzg.p(savedState, Integer.valueOf(r1.r(0)), "position");
                }
                r1.onRestoreInstanceState(savedState);
            }
            int iQ2 = r1.q();
            if (iQ == iQ2) {
                c5kVar.t.b(iQ2, false);
                ac8.a(new ir5());
            }
            c5kVar.Z = false;
        }
        if (z) {
            this.e = null;
        }
        if (parcelable == null && (f1pVar = this.g) != null) {
            c5kVar.g(f1pVar, true, true);
        }
        if (z) {
            this.g = null;
        }
    }

    @Override // defpackage.knf
    public final void d() {
        this.c = true;
        if (this.d) {
            g();
        }
    }

    @Override // defpackage.knf
    public final void e() {
        if (this.d && this.c) {
            f();
        }
        this.c = false;
    }

    public final void f() {
        c5k c5kVar = this.a;
        c5kVar.getClass();
        Parcelable parcelableOnSaveInstanceState = c5kVar.B.onSaveInstanceState();
        NestedScrollView nestedScrollView = c5kVar.l;
        nestedScrollView.getClass();
        ex8 ex8Var = new ex8(parcelableOnSaveInstanceState);
        ex8Var.a = nestedScrollView.getScrollY();
        c5kVar.d = ex8Var;
        this.e = ex8Var;
        bx8 bx8Var = c5kVar.A;
        bx8Var.t = false;
        ArrayList arrayList = bx8Var.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xw8 xw8Var = ((zw8) obj).b;
            if (xw8Var != null && xw8.class.isAssignableFrom(xw8.class)) {
                xw8Var.j(bx8Var.t);
            }
        }
        c5kVar.q.p.b(new nv8(false));
        x4k x4kVar = c5kVar.L;
        x4kVar.d = false;
        wjh wjhVar = (wjh) x4kVar.a.get();
        o59 o59Var = (o59) wjhVar.f;
        if (o59Var != null && o59Var.k <= -1) {
            o59Var.k = SystemClock.uptimeMillis() - ((o59) wjhVar.f).b;
            wjhVar.y(ie0.g);
        }
        c5kVar.x.a(false);
        c5kVar.f.a(false);
        c5kVar.G.d();
        c5kVar.K.b = null;
    }

    public final void g() {
        c5k c5kVar = this.a;
        c5kVar.getClass();
        h5k h5kVar = c5kVar.K;
        yul yulVar = (yul) h5kVar.c;
        h5k h5kVar2 = this.b;
        h5kVar2.c(yulVar);
        h5kVar2.b((q8l) h5kVar.d);
        h5kVar.b = h5kVar2;
        c(this.e, true);
        c5kVar.f.a(true);
        bx8 bx8Var = c5kVar.A;
        bx8Var.t = true;
        ArrayList arrayList = bx8Var.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xw8 xw8Var = ((zw8) obj).b;
            if (xw8Var != null && xw8.class.isAssignableFrom(xw8.class)) {
                xw8Var.j(bx8Var.t);
            }
        }
        x5f x5fVar = c5kVar.u;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            am2.f(zpaVar, x56VarF).b.p(2, 1, 1L);
            x5fVar.U0(x56VarF);
        }
        cv8 cv8Var = c5kVar.q;
        cv8Var.p.b(new nv8(true));
        ipk ipkVar = cv8Var.f;
        ipkVar.l = true;
        ipkVar.b.a();
        x4k x4kVar = c5kVar.L;
        x4kVar.d = true;
        wjh wjhVar = (wjh) x4kVar.a.get();
        o59 o59Var = (o59) wjhVar.f;
        if (o59Var != null && o59Var.i <= -1) {
            o59Var.i = SystemClock.uptimeMillis() - ((o59) wjhVar.f).b;
            wjhVar.p();
        }
        x4kVar.j();
        c5kVar.x.a(true);
        aba abaVar = c5kVar.G;
        k1g k1gVar = abaVar.n;
        k1gVar.getClass();
        if (!(k1gVar instanceof yaa)) {
            abaVar.l = true;
        }
        abaVar.d();
    }

    @Override // defpackage.knf
    public final Parcelable getState() {
        if (!this.c || !this.d) {
            return this.e;
        }
        c5k c5kVar = this.a;
        c5kVar.getClass();
        Parcelable parcelableOnSaveInstanceState = c5kVar.B.onSaveInstanceState();
        NestedScrollView nestedScrollView = c5kVar.l;
        nestedScrollView.getClass();
        ex8 ex8Var = new ex8(parcelableOnSaveInstanceState);
        ex8Var.a = nestedScrollView.getScrollY();
        c5kVar.d = ex8Var;
        return ex8Var;
    }

    @Override // defpackage.knf
    public final String getUrl() {
        return this.f ? wqm.d("startpage") : "operaui://feed";
    }

    @Override // defpackage.knf
    public final OperaPageRootView getView() {
        return this.a.c;
    }

    @Override // defpackage.knf
    public final String n() {
        return this.a.b.getResources().getString(2132021418).toString();
    }

    @Override // defpackage.knf
    public final void o() {
        this.a.h();
    }

    @Override // defpackage.knf
    public final void q() {
        c5k c5kVar = this.a;
        c5kVar.P.b();
        c5kVar.h();
        c5kVar.l.scrollTo(0, 0);
        FeedViewPager feedViewPager = c5kVar.B;
        feedViewPager.setCurrentItem(feedViewPager.r(0));
        xw8 xw8VarB = c5kVar.b();
        if (xw8VarB != null) {
            xw8VarB.g.x0(0);
        }
    }

    @Override // defpackage.knf
    public final void r() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (!this.c || !this.d) {
            c(this.e, false);
        }
        c5k c5kVar = this.a;
        if (!c5kVar.c.isAttachedToWindow()) {
            c5kVar.a((mnf) c5kVar.a.g());
        }
        xw8 xw8VarB = c5kVar.b();
        if (xw8VarB != null) {
            xw8VarB.y.T();
        }
        cv8 cv8Var = c5kVar.q;
        cv8Var.E = true;
        cv8Var.m.a();
        uvl uvlVar = c5kVar.I;
        if (uvlVar != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) uvlVar.a.f;
            uvlVar.l = true;
            uvlVar.d(false);
            FrameLayout frameLayout = uvlVar.i;
            if (frameLayout.getWidth() == 0 || (layoutParams = constraintLayout.getLayoutParams()) == null || (layoutParams2 = frameLayout.getLayoutParams()) == null) {
                return;
            }
            if (frameLayout.getHeight() == layoutParams2.height && constraintLayout.getWidth() == layoutParams.width) {
                return;
            }
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824));
            frameLayout.layout(frameLayout.getLeft(), frameLayout.getTop(), frameLayout.getRight(), frameLayout.getTop() + layoutParams2.height);
        }
    }

    @Override // defpackage.knf
    public final void u() {
        xw8 xw8VarB = this.a.b();
        if (xw8VarB != null) {
            f92 f92Var = xw8VarB.j;
            f92Var.d().m(xw8VarB.l);
        }
    }

    @Override // defpackage.knf
    public final void v(w6j w6jVar) {
        this.b.b = new rgh(w6jVar, this);
    }

    @Override // defpackage.knf
    public final boolean w() {
        return this.a.J.a;
    }

    @Override // defpackage.knf
    public final yul x() {
        return (yul) this.b.c;
    }

    @Override // defpackage.knf
    public final void y() {
        c5k c5kVar = this.a;
        t5k t5kVar = c5kVar.q.p;
        bmb it = sfe.R(t5kVar.b.values(), zsh.class).iterator();
        while (true) {
            bmb bmbVar = it;
            if (!bmbVar.hasNext()) {
                break;
            } else {
                ((zsh) bmbVar.next()).c();
            }
        }
        bmb it2 = sfe.R((i7f) t5kVar.d.a, zsh.class).iterator();
        while (true) {
            bmb bmbVar2 = it2;
            if (!bmbVar2.hasNext()) {
                break;
            } else {
                ((zsh) bmbVar2.next()).c();
            }
        }
        xw8 xw8VarB = c5kVar.b();
        if (xw8VarB != null) {
            xw8VarB.e(q9n.x(xw8VarB.o.c) ? 2 : 1, true);
        }
    }

    @Override // defpackage.knf
    public final String z() {
        return "";
    }
}
