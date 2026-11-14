package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.favorites.e;
import com.opera.android.feed.FeedScrollView;
import com.opera.android.settings.SettingsManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ts8 extends v5k {
    public final RecyclerView d;
    public final FeedScrollView e;
    public final x5f f;
    public final SettingsManager g;
    public final tsd h;
    public final tsd i;
    public final bvl j;
    public final nr8 k;
    public final kze l;
    public final View.OnLongClickListener m;
    public final dg7 n;
    public final nv2 o;
    public final tlg p;
    public final ss8 q;
    public final os8 r;
    public final os8 s;
    public boolean t;
    public final agm u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r10v1, types: [f7f, os8] */
    /* JADX WARN: Type inference failed for: r8v7, types: [f7f, os8] */
    public ts8(RecyclerView recyclerView, FeedScrollView feedScrollView, x5f x5fVar, SettingsManager settingsManager, tsd tsdVar, tsd tsdVar2, bvl bvlVar, nr8 nr8Var, kze kzeVar, View.OnLongClickListener onLongClickListener, ijc ijcVar, dg7 dg7Var, nv2 nv2Var, tlg tlgVar, pde pdeVar, p6l p6lVar) {
        e6k e6kVar = e6k.i;
        super(qs8.class, ijcVar, e6kVar, 2131558820);
        this.d = recyclerView;
        this.e = feedScrollView;
        this.f = x5fVar;
        this.g = settingsManager;
        this.h = tsdVar;
        this.i = tsdVar2;
        this.j = bvlVar;
        this.k = nr8Var;
        this.l = kzeVar;
        this.m = onLongClickListener;
        this.n = dg7Var;
        this.o = nv2Var;
        this.p = tlgVar;
        this.q = new ss8(this, e6kVar);
        final byte b = 0;
        ?? r8 = new f7f(this) { // from class: os8
            public final /* synthetic */ ts8 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                ts8 ts8Var = this.b;
                ((Boolean) obj).getClass();
                switch (b2) {
                    case 0:
                        ts8Var.A();
                        break;
                    default:
                        ts8Var.A();
                        break;
                }
            }
        };
        this.r = r8;
        final byte b2 = 1;
        ?? r10 = new f7f(this) { // from class: os8
            public final /* synthetic */ ts8 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                ts8 ts8Var = this.b;
                ((Boolean) obj).getClass();
                switch (b22) {
                    case 0:
                        ts8Var.A();
                        break;
                    default:
                        ts8Var.A();
                        break;
                }
            }
        };
        this.s = r10;
        this.u = new agm(new hv((Object) this, (Object) pdeVar, (Object) p6lVar, (byte) 14));
        tsdVar.k((f7f) r8);
        tsdVar2.k((f7f) r8);
        tlgVar.h.k((f7f) r10);
        nr8Var.f(new ps8(this, (byte) 0));
        ac8.c(this);
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        return this.u.r();
    }

    @vkk
    public final void C(@NotNull nzj nzjVar) {
        A();
    }

    @Override // defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        tsd tsdVar = this.h;
        os8 os8Var = this.r;
        tsdVar.p(os8Var);
        this.i.p(os8Var);
        this.p.h.p(this.s);
        ac8.d(this);
    }

    @Override // defpackage.u5k
    public final k6k u() {
        return this.q;
    }

    @Override // defpackage.u5k
    public final boolean z() {
        if (!((Boolean) this.h.g()).booleanValue()) {
            return false;
        }
        if (!this.t || ((e) this.k).f.e.size() <= 0) {
            return ((Boolean) this.i.g()).booleanValue() && ((Boolean) this.p.h.g()).booleanValue();
        }
        return true;
    }
}
