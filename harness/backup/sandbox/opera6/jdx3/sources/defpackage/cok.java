package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.feed.FeedScrollView;
import com.opera.android.settings.SettingsManager;
import java.util.Collections;

/* loaded from: classes.dex */
public final class cok extends v5k implements zsh, e5k, w25, p5j, mo7 {
    public final f35 d;
    public final SettingsManager e;
    public final nr8 f;
    public final ipk g;
    public final xnh h;
    public final FeedScrollView i;
    public final x5f j;
    public final x5f k;
    public final osf l;
    public final kze m;
    public final View.OnLongClickListener n;
    public final qr8 o;
    public final nv2 p;
    public final o4b q;
    public final vpk r;
    public final agm s;

    /* JADX WARN: Illegal instructions before constructor call */
    public cok(RecyclerView recyclerView, f35 f35Var, SettingsManager settingsManager, nr8 nr8Var, ipk ipkVar, xnh xnhVar, FeedScrollView feedScrollView, x5f x5fVar, x5f x5fVar2, osf osfVar, kze kzeVar, View.OnLongClickListener onLongClickListener, ijc ijcVar, qr8 qr8Var, nv2 nv2Var, bvl bvlVar, pde pdeVar, p6l p6lVar) {
        e6k e6kVar = e6k.q;
        super(aok.class, ijcVar, e6kVar, 2131558831);
        this.d = f35Var;
        this.e = settingsManager;
        this.f = nr8Var;
        this.g = ipkVar;
        this.h = xnhVar;
        this.i = feedScrollView;
        this.j = x5fVar;
        this.k = x5fVar2;
        this.l = osfVar;
        this.m = kzeVar;
        this.n = onLongClickListener;
        this.o = qr8Var;
        this.p = nv2Var;
        this.q = new o4b(this, e6kVar, (byte) 13);
        this.r = new vpk(ipkVar);
        this.s = new agm(new n12(recyclerView, this, bvlVar, pdeVar, p6lVar, (byte) 4));
        f35Var.a.b(this);
        settingsManager.F(this);
        xnhVar.F(this);
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        return this.s.r();
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("enable_suggested_speed_dials_on_start_page".equals(str)) {
            A();
        }
    }

    @Override // defpackage.w25
    public final void P() {
        vpk vpkVar = this.r;
        if (vpkVar.e != -1) {
            return;
        }
        vpkVar.e = 2;
    }

    @Override // defpackage.zsh
    public final void c() {
        vpk vpkVar = this.r;
        if (vpkVar.e == -1) {
            vpkVar.e = 1;
        }
        this.g.b.a();
    }

    @Override // defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        vpk vpkVar = this.r;
        vpkVar.d.p(vpkVar);
        vpkVar.b(-1, Collections.EMPTY_LIST);
        this.d.a.c(this);
        this.e.H(this);
        this.h.H(this);
    }

    @Override // defpackage.e5k
    public final void p(boolean z) {
        if (z) {
            this.r.a();
        }
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return new aok(this.r);
    }

    @Override // defpackage.u5k
    public final k6k u() {
        return this.q;
    }

    @Override // defpackage.u5k
    public final boolean z() {
        return this.e.A(this.h);
    }
}
