package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Trace;
import android.util.Size;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;
import com.opera.android.tabui2.ConfigurationProvidingFrameLayout;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j1c implements u9j {
    public Object a;
    public final Object b;
    public Object c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public j1c() {
        dfe dfeVar = new dfe(new zt9[16]);
        this.b = dfeVar;
        tee teeVar = jmi.a;
        this.c = new tee();
        this.d = dfeVar;
        this.e = new dfe(new Object[16]);
        this.g = new dfe(new Function0[16]);
    }

    public j1c(Toolbar toolbar, AppBarLayout appBarLayout, View view, RecyclerView recyclerView, View view2, yz7 yz7Var) {
        this(toolbar, appBarLayout, null, view, recyclerView, view2, yz7Var, null, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j1c(Toolbar toolbar, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, View view, RecyclerView recyclerView, View view2, yz7 yz7Var, xsi xsiVar, int i) {
        toolbar = (i & 1) != 0 ? null : toolbar;
        collapsingToolbarLayout = (i & 4) != 0 ? null : collapsingToolbarLayout;
        RecyclerView recyclerView2 = (i & 32) != 0 ? recyclerView : view2;
        yz7Var = (i & 64) != 0 ? null : yz7Var;
        xsiVar = (i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0 ? null : xsiVar;
        this.a = toolbar;
        this.b = appBarLayout;
        this.c = collapsingToolbarLayout;
        this.d = view;
        this.e = recyclerView;
        this.f = recyclerView2;
        this.g = yz7Var;
        this.h = xsiVar;
    }

    public j1c(SettingsManager settingsManager, SharedPreferences sharedPreferences, v3m v3mVar, jbn jbnVar) {
        this.a = settingsManager;
        this.b = sharedPreferences;
        this.c = v3mVar;
        this.d = jbnVar;
        this.e = new v9j(this);
        this.f = e82.E(new String[]{"translation_source", "translate_web_pages_enabled", "translate_web_pages_to_language", "translate_web_pages_backup_translation_method_enabled"});
        this.h = new s9(this, (byte) 19);
        final byte b = 0;
        this.i = new f7f(this) { // from class: i1c
            public final /* synthetic */ j1c b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                j1c j1cVar = this.b;
                switch (b2) {
                    case 0:
                        j1cVar.k();
                        break;
                    default:
                        Set set = (Set) obj;
                        if (!Intrinsics.a((Set) j1cVar.g, set)) {
                            j1cVar.g = set;
                            j1cVar.k();
                            break;
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.k = new f7f(this) { // from class: i1c
            public final /* synthetic */ j1c b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                j1c j1cVar = this.b;
                switch (b22) {
                    case 0:
                        j1cVar.k();
                        break;
                    default:
                        Set set = (Set) obj;
                        if (!Intrinsics.a((Set) j1cVar.g, set)) {
                            j1cVar.g = set;
                            j1cVar.k();
                            break;
                        }
                        break;
                }
            }
        };
        this.g = v08.a;
    }

    public /* synthetic */ j1c(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, Object obj6, String str, Object obj7, Object obj8, Object obj9) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = serializable;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = str;
        this.i = obj7;
        this.j = obj8;
        this.k = obj9;
    }

    public j1c(x5f x5fVar, FrameLayout frameLayout, RecyclerView recyclerView, ConfigurationProvidingFrameLayout configurationProvidingFrameLayout, View view, View view2, z77 z77Var, ysj ysjVar, mt3 mt3Var, k6l k6lVar, i53 i53Var, nr8 nr8Var, u4l u4lVar, yu3 yu3Var, yqa yqaVar) {
        this.a = x5fVar;
        this.b = frameLayout;
        this.c = configurationProvidingFrameLayout;
        this.d = view;
        this.e = view2;
        this.f = k6lVar;
        this.g = yu3Var;
        pde pdeVar = (pde) new t9l((ViewGroup) recyclerView).b;
        pde pdeVar2 = new pde(eyj.I);
        this.h = pdeVar2;
        pde pdeVar3 = new pde(b3c.g);
        this.i = pdeVar3;
        pde pdeVar4 = new pde(null);
        s9i s9iVar = new s9i(pdeVar, k6lVar);
        b2l b2lVar = k6lVar.o;
        pde pdeVar5 = new pde(b2lVar != null ? b2lVar.T() : p6l.a);
        this.j = pdeVar5;
        final byte b = 0;
        z5l z5lVar = new z5l(pdeVar, k6lVar, u4lVar, pdeVar2, configurationProvidingFrameLayout.c, pdeVar4, s9iVar, pdeVar3, recyclerView, configurationProvidingFrameLayout, pdeVar5, new a21(new ohf(x5fVar), new Function0(this) { // from class: b3l
            public final /* synthetic */ j1c b;

            {
                this.b = this;
            }

            public final Object invoke() throws Resources.NotFoundException {
                byte b2 = b;
                j1c j1cVar = this.b;
                switch (b2) {
                    case 0:
                        return ((FrameLayout) j1cVar.b).getContext();
                    default:
                        pde pdeVar6 = (pde) j1cVar.j;
                        b2l b2lVar2 = ((k6l) j1cVar.f).o;
                        if (xf8.F0(pdeVar6, b2lVar2 != null ? b2lVar2.T() : p6l.a)) {
                            j1cVar.a();
                        }
                        return Unit.a;
                }
            }
        }, z77Var, k6lVar, i53Var, nr8Var, u4lVar, s9iVar, ysjVar, mt3Var, yu3Var), yqaVar, l08.a, frameLayout.getResources());
        final byte b2 = 0;
        a26.V(z5lVar.k, pdeVar, new g3l(this, (byte) 0));
        this.k = z5lVar;
        a26.T(configurationProvidingFrameLayout.b, pdeVar, new f7f(this) { // from class: c3l
            public final /* synthetic */ j1c b;

            {
                this.b = this;
            }

            public final void d0(Object obj) throws Resources.NotFoundException {
                byte b3 = b2;
                j1c j1cVar = this.b;
                switch (b3) {
                    case 0:
                        j1cVar.a();
                        break;
                    default:
                        j1cVar.a();
                        break;
                }
            }
        });
        final byte b3 = 1;
        a26.T(configurationProvidingFrameLayout.c, pdeVar, new f7f(this) { // from class: c3l
            public final /* synthetic */ j1c b;

            {
                this.b = this;
            }

            public final void d0(Object obj) throws Resources.NotFoundException {
                byte b32 = b3;
                j1c j1cVar = this.b;
                switch (b32) {
                    case 0:
                        j1cVar.a();
                        break;
                    default:
                        j1cVar.a();
                        break;
                }
            }
        });
        a26.U(k6lVar, pdeVar, new f3l(this), new Function0(this) { // from class: b3l
            public final /* synthetic */ j1c b;

            {
                this.b = this;
            }

            public final Object invoke() throws Resources.NotFoundException {
                byte b22 = b3;
                j1c j1cVar = this.b;
                switch (b22) {
                    case 0:
                        return ((FrameLayout) j1cVar.b).getContext();
                    default:
                        pde pdeVar6 = (pde) j1cVar.j;
                        b2l b2lVar2 = ((k6l) j1cVar.f).o;
                        if (xf8.F0(pdeVar6, b2lVar2 != null ? b2lVar2.T() : p6l.a)) {
                            j1cVar.a();
                        }
                        return Unit.a;
                }
            }
        });
        view.setOnClickListener(new View.OnClickListener(this) { // from class: d3l
            public final /* synthetic */ j1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b4 = b2;
                ph0 ph0Var = ph0.o;
                j1c j1cVar = this.b;
                switch (b4) {
                    case 0:
                        ((x5f) j1cVar.a).f0(ph0Var);
                        ((yu3) j1cVar.g).j0((p6l) ((pde) j1cVar.j).g(), null);
                        break;
                    default:
                        ((x5f) j1cVar.a).f0(ph0Var);
                        ((yu3) j1cVar.g).j0((p6l) ((pde) j1cVar.j).g(), null);
                        break;
                }
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: e3l
            public final /* synthetic */ j1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) {
                byte b4 = b2;
                ph0 ph0Var = ph0.p;
                j1c j1cVar = this.b;
                switch (b4) {
                    case 0:
                        ((x5f) j1cVar.a).f0(ph0Var);
                        BrowserActivity browserActivity = ((yu3) j1cVar.g).a;
                        int i = BrowserActivity.E1;
                        browserActivity.s1(view3, 1, false);
                        break;
                    default:
                        ((x5f) j1cVar.a).f0(ph0Var);
                        BrowserActivity browserActivity2 = ((yu3) j1cVar.g).a;
                        int i2 = BrowserActivity.E1;
                        browserActivity2.s1(view3, 1, false);
                        break;
                }
                return true;
            }
        });
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: d3l
            public final /* synthetic */ j1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b4 = b3;
                ph0 ph0Var = ph0.o;
                j1c j1cVar = this.b;
                switch (b4) {
                    case 0:
                        ((x5f) j1cVar.a).f0(ph0Var);
                        ((yu3) j1cVar.g).j0((p6l) ((pde) j1cVar.j).g(), null);
                        break;
                    default:
                        ((x5f) j1cVar.a).f0(ph0Var);
                        ((yu3) j1cVar.g).j0((p6l) ((pde) j1cVar.j).g(), null);
                        break;
                }
            }
        });
        view2.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: e3l
            public final /* synthetic */ j1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) {
                byte b4 = b3;
                ph0 ph0Var = ph0.p;
                j1c j1cVar = this.b;
                switch (b4) {
                    case 0:
                        ((x5f) j1cVar.a).f0(ph0Var);
                        BrowserActivity browserActivity = ((yu3) j1cVar.g).a;
                        int i = BrowserActivity.E1;
                        browserActivity.s1(view3, 1, false);
                        break;
                    default:
                        ((x5f) j1cVar.a).f0(ph0Var);
                        BrowserActivity browserActivity2 = ((yu3) j1cVar.g).a;
                        int i2 = BrowserActivity.E1;
                        browserActivity2.s1(view3, 1, false);
                        break;
                }
                return true;
            }
        });
    }

    public static final boolean g(zt9 zt9Var, dfe dfeVar) {
        Object[] objArr = dfeVar.a;
        int i = dfeVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            dth dthVar = ((zt9) objArr[i2]).a;
            if (dthVar instanceof g8g) {
                dfe dfeVar2 = ((g8g) dthVar).b;
                if (dfeVar2.k(zt9Var) || g(zt9Var, dfeVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() throws Resources.NotFoundException {
        Size size;
        FrameLayout frameLayout = (FrameLayout) this.b;
        Resources resources = frameLayout.getResources();
        Size size2 = (Size) ((ConfigurationProvidingFrameLayout) this.c).c.g();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131167631) - resources.getDimensionPixelSize(2131167634);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(2131167633);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(2131167632);
        int iIntValue = ((Number) ((z5l) this.k).v.o.g.getValue()).intValue();
        if (size2.getWidth() <= 0 || iIntValue <= 0) {
            size = new Size(dimensionPixelSize3, dimensionPixelSize);
        } else {
            size = new Size(djh.c(((size2.getWidth() - resources.getDimensionPixelSize(2131167636)) - resources.getDimensionPixelSize(2131167635)) / iIntValue, dimensionPixelSize2, dimensionPixelSize3) - (resources.getDimensionPixelSize(2131167638) << 1), dimensionPixelSize);
        }
        Size size3 = size;
        pde pdeVar = (pde) this.h;
        cyj cyjVar = eyj.H;
        xf8.F0(pdeVar, m5h.e(frameLayout.getContext(), (b3c) ((pde) this.i).g(), size2, size3, 0, 0));
    }

    public final void b() {
        this.f = null;
        this.a = null;
        dfe dfeVar = (dfe) this.b;
        dfeVar.h();
        ((tee) this.c).b();
        this.d = dfeVar;
        ((dfe) this.e).h();
        ((dfe) this.g).h();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void c() {
        Set set = (Set) this.f;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                dth dthVar = (dth) it.next();
                it.remove();
                dthVar.b();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void d() {
        dfe dfeVar = (dfe) this.b;
        dfe dfeVar2 = (dfe) this.e;
        Set set = (Set) this.f;
        if (set != null) {
            this.k = null;
            if (dfeVar2.c != 0) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    tee teeVar = (tee) this.h;
                    int i = dfeVar2.c;
                    while (true) {
                        i--;
                        if (-1 >= i) {
                            break;
                        }
                        Object obj = dfeVar2.a[i];
                        try {
                            if (obj instanceof zt9) {
                                dth dthVar = ((zt9) obj).a;
                                set.remove(dthVar);
                                dthVar.c();
                            }
                            if (obj instanceof eg5) {
                                if (teeVar == null || !teeVar.c(obj)) {
                                    ((eg5) obj).a();
                                } else {
                                    ((eg5) obj).c();
                                }
                            }
                        } catch (Throwable th) {
                            di5 di5Var = (di5) this.a;
                            if (di5Var != null) {
                                phj.A0(th, new gb3(di5Var, obj, (byte) 17));
                            }
                            throw th;
                        }
                    }
                } finally {
                }
            }
            if (dfeVar.c != 0) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    Set set2 = (Set) this.f;
                    if (set2 != null) {
                        Object[] objArr = dfeVar.a;
                        int i2 = dfeVar.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            zt9 zt9Var = (zt9) objArr[i3];
                            dth dthVar2 = zt9Var.a;
                            set2.remove(dthVar2);
                            try {
                                dthVar2.a();
                            } catch (Throwable th2) {
                                di5 di5Var2 = (di5) this.a;
                                if (di5Var2 != null) {
                                    phj.A0(th2, new gb3(di5Var2, zt9Var, (byte) 17));
                                }
                                throw th2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void e() {
        dfe dfeVar = (dfe) this.g;
        if (dfeVar.c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = dfeVar.a;
                int i = dfeVar.c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((Function0) objArr[i2]).invoke();
                }
                dfeVar.h();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void f(zt9 zt9Var) {
        dfe dfeVar = (dfe) this.b;
        if (!((tee) this.c).c(zt9Var)) {
            tee teeVar = (tee) this.k;
            if (teeVar == null || !teeVar.c(zt9Var)) {
                ((dfe) this.e).c(zt9Var);
                return;
            }
            return;
        }
        ((tee) this.c).l(zt9Var);
        if (!((dfe) this.d).k(zt9Var) && !dfeVar.k(zt9Var)) {
            g(zt9Var, dfeVar);
        }
        Set set = (Set) this.f;
        if (set != null) {
            set.add(zt9Var.a);
        }
    }

    public final void h(boolean z) {
        itd itdVarO;
        RecyclerView recyclerView = (RecyclerView) this.e;
        View view = (View) this.f;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.c;
        AppBarLayout appBarLayout = (AppBarLayout) this.b;
        yz7 yz7Var = (yz7) this.g;
        View view2 = (View) this.d;
        if (z) {
            if (view2 != null) {
                view2.setVisibility(0);
            }
            if (collapsingToolbarLayout != null) {
                collapsingToolbarLayout.e(f03.G(collapsingToolbarLayout.getContext()).getDefaultColor());
            }
            if (appBarLayout != null) {
                appBarLayout.l = false;
                appBarLayout.i = true;
                appBarLayout.l(false, true);
                appBarLayout.k(false, false, true);
            }
            if (view != null) {
                view.setNestedScrollingEnabled(false);
            }
            this.i = recyclerView != null ? recyclerView.M : null;
            if (recyclerView != null) {
                recyclerView.B0((e) null);
            }
            this.j = yz7Var != null ? Integer.valueOf(yz7Var.b.d) : null;
            this.k = yz7Var != null ? Integer.valueOf(yz7Var.b.c) : null;
            if (yz7Var != null) {
                yz7Var.b(2132021308);
                yz7Var.a(2131951669);
            }
        } else {
            if (view2 != null) {
                view2.setVisibility(4);
            }
            if (collapsingToolbarLayout != null) {
                collapsingToolbarLayout.e(f03.W(2130969328, collapsingToolbarLayout.getContext()).getDefaultColor());
            }
            if (appBarLayout != null) {
                appBarLayout.l = true;
                appBarLayout.i = false;
            }
            if (view != null) {
                view.setNestedScrollingEnabled(true);
            }
            e eVar = (e) this.i;
            if (eVar != null && recyclerView != null) {
                recyclerView.B0(eVar);
            }
            Integer num = (Integer) this.j;
            if (num != null) {
                int iIntValue = num.intValue();
                if (yz7Var != null) {
                    yz7Var.b(iIntValue);
                }
            }
            Integer num2 = (Integer) this.k;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                if (yz7Var != null) {
                    yz7Var.a(iIntValue2);
                }
            }
        }
        Toolbar toolbar = (Toolbar) this.a;
        if (toolbar == null || (itdVarO = toolbar.o()) == null) {
            return;
        }
        int size = itdVarO.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = itdVarO.getItem(i);
            xsi xsiVar = (xsi) this.h;
            if (xsiVar != null) {
                xsiVar.b(item, z);
            } else if (item.getItemId() != 2131364146) {
                item.setVisible(!z);
            }
        }
    }

    public final void i(Set set, di5 di5Var) {
        b();
        this.f = set;
        this.a = di5Var;
    }

    @Override // defpackage.u9j
    public final void j() {
        k();
        ((SettingsManager) this.a).F((s9) this.h);
        ekc ekcVar = (ode) ((v3m) this.c).d.c;
        ((v9j) this.e).s(ekcVar, (i1c) this.k);
        this.j = ekcVar;
        ((jbn) this.d).a().k((i1c) this.i);
    }

    public final void k() {
        v9j v9jVar = (v9j) this.e;
        String str = ywc.a(((SharedPreferences) this.b).getString("language_code", null)).a;
        String str2 = ywc.a((String) ((jbn) this.d).a().g()).a;
        SettingsManager settingsManager = (SettingsManager) this.a;
        z4m z4mVarE = settingsManager.E();
        v3m v3mVar = (v3m) this.c;
        v9jVar.r(new h1c(str, str2, z4mVarE, new e5m(v3m.f(v3mVar.a), settingsManager.i("translate_web_pages_enabled"), v3mVar.d(), settingsManager.i("translate_web_pages_backup_translation_method_enabled")), (Set) this.g));
    }

    @Override // defpackage.u9j
    public final void onStopped() {
        ((jbn) this.d).a().p((i1c) this.i);
        ekc ekcVar = (ode) this.j;
        if (ekcVar != null) {
            ((v9j) this.e).t(ekcVar);
        }
        this.j = null;
        ((SettingsManager) this.a).H((s9) this.h);
    }
}
