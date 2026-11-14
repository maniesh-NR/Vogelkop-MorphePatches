package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.ActionBarSearchView;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class oy {
    public boolean a;
    public final Object b;
    public final Object c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    /* JADX WARN: Multi-variable type inference failed */
    public oy(i5o i5oVar, int i, Uri uri, String str) {
        Objects.requireNonNull(i5oVar);
        this.j = i5oVar;
        this.a = i;
        this.b = uri;
        this.c = str;
    }

    public oy(ysi ysiVar, shf shfVar, Locale locale) {
        this.b = ysiVar;
        this.c = shfVar;
        this.d = locale;
        this.e = new kze(Boolean.FALSE);
        h42 h42Var = new h42();
        this.f = h42Var;
        this.g = new lwc(this);
        byte b = 5;
        h42Var.s(ysiVar.m(), new w4i(new tji(this, b), b));
    }

    public final tn a() {
        String str;
        String str2;
        String str3 = (String) this.g;
        if (str3 == null) {
            str3 = "com.opera.android";
            this.g = "com.opera.android";
        }
        String str4 = str3;
        String str5 = (String) this.f;
        if (str5 == null) {
            this.f = "unknown";
            str = "unknown";
        } else {
            str = str5;
        }
        String str6 = (String) this.i;
        if (str6 == null) {
            this.i = "unknown";
            str2 = "unknown";
        } else {
            str2 = str6;
        }
        umi umiVar = (umi) ((i5o) this.j).e;
        Uri uri = (Uri) this.b;
        boolean z = this.a;
        cy cyVar = new cy(str4, z ? 1 : 0, str, str2, (String) this.d, (String) this.e, (String) this.h, (String) this.c);
        tn tnVar = new tn();
        tnVar.b = umiVar;
        String string = uri.toString();
        hra hraVarD = null;
        try {
            rma rmaVar = new rma((byte) 4);
            rmaVar.o(string, null);
            hraVarD = rmaVar.d();
        } catch (IllegalArgumentException unused) {
        }
        tnVar.c = hraVarD;
        tnVar.d = cyVar;
        return tnVar;
    }

    public final void b() {
        ActionBarSearchView actionBarSearchView = (ActionBarSearchView) this.i;
        MenuItem menuItem = (MenuItem) this.h;
        if (actionBarSearchView == null || menuItem == null) {
            return;
        }
        q9n.u(actionBarSearchView);
        actionBarSearchView.clearFocus();
        if (menuItem.isActionViewExpanded() && TextUtils.isEmpty(actionBarSearchView.getQuery())) {
            menuItem.collapseActionView();
        }
    }

    public final boolean c() {
        MenuItem menuItem = (MenuItem) this.h;
        if (menuItem == null || !menuItem.isActionViewExpanded()) {
            return false;
        }
        MenuItem menuItem2 = (MenuItem) this.h;
        if (menuItem2 != null) {
            menuItem2.collapseActionView();
        }
        return true;
    }

    public List d(Object obj) {
        return l08.a;
    }

    public final boolean e() {
        return ((Boolean) ((kze) this.e).g()).booleanValue();
    }

    public void f() {
        if (e()) {
            ((kze) this.e).r(Boolean.FALSE);
            j1c j1cVar = (j1c) this.j;
            if (j1cVar != null) {
                j1cVar.h(e());
            }
            l();
        }
    }

    public final void g(String str) {
        esi esiVar = (str == null || StringsKt.N(str)) ? null : new esi(StringsKt.l0(str.toString()).toString(), (Locale) this.d);
        shf shfVar = (shf) this.c;
        if (esiVar != null && !esiVar.equals(shfVar.a) && !this.a) {
            this.a = true;
            h();
        }
        shfVar.S(esiVar);
        l();
    }

    public abstract void h();

    public final void i(j1c j1cVar) {
        this.j = j1cVar;
        if (!e() || j1cVar == null) {
            return;
        }
        j1cVar.h(true);
    }

    public final void j(MenuItem menuItem, RecyclerView recyclerView, int i, int i2) {
        if (menuItem == null) {
            return;
        }
        this.h = menuItem;
        byte b = 3;
        menuItem.setOnActionExpandListener(new z73(this, b));
        ActionBarSearchView actionView = menuItem.getActionView();
        this.i = actionView;
        if (actionView != null) {
            actionView.setInputType(i2);
        }
        ActionBarSearchView actionBarSearchView = (ActionBarSearchView) this.i;
        if (actionBarSearchView != null) {
            actionBarSearchView.setActionViewObserver(new fm3(this, (byte) 1));
        }
        ActionBarSearchView actionBarSearchView2 = (ActionBarSearchView) this.i;
        if (actionBarSearchView2 != null) {
            actionBarSearchView2.setQueryHint(recyclerView.getContext().getString(i));
        }
        recyclerView.n(new em3(this, b));
    }

    public final void l() {
        esi esiVar;
        ysi ysiVar = (ysi) this.b;
        if (e()) {
            shf shfVar = (shf) this.c;
            shfVar.q();
            esiVar = (esi) shfVar.a;
        } else {
            esiVar = null;
        }
        ysiVar.g(esiVar);
        l08 l08Var = (List) ysiVar.m().g();
        if (l08Var == null) {
            l08Var = l08.a;
        }
        List listK0 = CollectionsKt.k0((Iterable) l08Var);
        if (!ysiVar.i() || esiVar == null) {
            ((h42) this.f).r(listK0);
            return;
        }
        lwc lwcVar = (lwc) this.g;
        lwcVar.b = esiVar;
        lwcVar.c = listK0;
        lwcVar.filter(esiVar.a);
    }
}
