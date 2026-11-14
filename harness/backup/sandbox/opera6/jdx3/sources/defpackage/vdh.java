package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.settings.SettingsManager;
import java.util.Collection;

/* loaded from: classes.dex */
public final class vdh extends v5k implements zsh, e5k {
    public final RecyclerView d;
    public final SettingsManager e;
    public final tsd f;
    public final pde g;
    public final kze h;
    public final x5f i;
    public final x5f j;
    public final mdh k;
    public final qdh l;
    public final View.OnLongClickListener m;
    public final cy n;
    public final qr8 o;
    public final nv2 p;
    public final tlg q;
    public final o4b r;
    public final kze s;
    public final agm t;

    /* JADX WARN: Illegal instructions before constructor call */
    public vdh(RecyclerView recyclerView, SettingsManager settingsManager, tsd tsdVar, pde pdeVar, kze kzeVar, x5f x5fVar, x5f x5fVar2, mdh mdhVar, qdh qdhVar, View.OnLongClickListener onLongClickListener, cy cyVar, ijc ijcVar, qr8 qr8Var, nv2 nv2Var, tlg tlgVar, pde pdeVar2, p6l p6lVar) {
        e6k e6kVar = e6k.h;
        super(udh.class, ijcVar, e6kVar, 2131558828);
        this.d = recyclerView;
        this.e = settingsManager;
        this.f = tsdVar;
        this.g = pdeVar;
        this.h = kzeVar;
        this.i = x5fVar;
        this.j = x5fVar2;
        this.k = mdhVar;
        this.l = qdhVar;
        this.m = onLongClickListener;
        this.n = cyVar;
        this.o = qr8Var;
        this.p = nv2Var;
        this.q = tlgVar;
        this.r = new o4b(this, e6kVar, (byte) 3);
        kze kzeVar2 = new kze(ng.a);
        this.s = kzeVar2;
        this.t = new agm(new uef(this, pdeVar2, p6lVar, (byte) 4));
        final byte b = 0;
        a26.T(mdhVar.h, kzeVar2, new f7f(this) { // from class: tdh
            public final /* synthetic */ vdh b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                vdh vdhVar = this.b;
                switch (b2) {
                    case 0:
                        vdhVar.n.g(vdhVar.z());
                        vdhVar.A();
                        break;
                    default:
                        ((Boolean) obj).getClass();
                        vdhVar.n.g(vdhVar.z());
                        vdhVar.A();
                        break;
                }
            }
        });
        final byte b2 = 1;
        a26.T(tsdVar, kzeVar2, new f7f(this) { // from class: tdh
            public final /* synthetic */ vdh b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                vdh vdhVar = this.b;
                switch (b22) {
                    case 0:
                        vdhVar.n.g(vdhVar.z());
                        vdhVar.A();
                        break;
                    default:
                        ((Boolean) obj).getClass();
                        vdhVar.n.g(vdhVar.z());
                        vdhVar.A();
                        break;
                }
            }
        });
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        return this.t.r();
    }

    @Override // defpackage.zsh
    public final void c() {
        mdh mdhVar = this.k;
        mdhVar.getClass();
        mdh.b(mdhVar, true, null, null, 2);
    }

    @Override // defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        lw7 lw7Var = (lw7) this.n.f;
        tcc tccVar = lw7Var.b;
        if (tccVar != null) {
            tccVar.b(lw7Var);
        }
        lw7Var.b = null;
        this.s.r(og.a);
    }

    @Override // defpackage.e5k
    public final void p(boolean z) {
        if (z) {
            return;
        }
        cy cyVar = this.n;
        ((xdh) cyVar.d).i();
        ((qdh) cyVar.c).c.clear();
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return new udh();
    }

    @Override // defpackage.u5k
    public final k6k u() {
        return this.r;
    }

    @Override // defpackage.u5k
    public final boolean z() {
        Collection collection;
        return (!((Boolean) this.f.g()).booleanValue() || (collection = (Collection) this.k.h.g()) == null || collection.isEmpty()) ? false : true;
    }
}
