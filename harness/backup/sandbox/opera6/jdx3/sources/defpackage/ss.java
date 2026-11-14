package defpackage;

import android.content.res.Configuration;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.opera.android.custom_views.FadingRecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ss extends ltl {
    public static final /* synthetic */ xtb[] v = {new d6h(ss.class, "adapter", "getAdapter()Lcom/opera/android/favorites/add/AddFavoriteAdapter;", 0)};
    public final ua7 r;
    public final zyk s;
    public final ks t;
    public FadingRecyclerView u;

    public ss(gjm gjmVar) {
        super((itl) u7k.e().a);
        this.r = new ua7((Fragment) this, gjmVar);
        this.s = z4c.b(new t2(this, (byte) 3));
        final byte b = 0;
        final byte b2 = 1;
        this.t = new ks(new wth(this, (byte) 5), false, new Function0(this) { // from class: rs
            public final /* synthetic */ ss b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b;
                ss ssVar = this.b;
                switch (b3) {
                    case 0:
                        return ssVar.u;
                    default:
                        return Boolean.valueOf(ssVar.G0().d.i("speed_dial.large_icons"));
                }
            }
        }, new Function0(this) { // from class: rs
            public final /* synthetic */ ss b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b2;
                ss ssVar = this.b;
                switch (b3) {
                    case 0:
                        return ssVar.u;
                    default:
                        return Boolean.valueOf(ssVar.G0().d.i("speed_dial.large_icons"));
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ltl
    public final void B0(LayoutInflater layoutInflater, FadingRecyclerView fadingRecyclerView) {
        this.u = fadingRecyclerView;
        xs xsVarG0 = G0();
        st[] stVarArr = ((qs) this.r.p()).b;
        xsVarG0.getClass();
        if (stVarArr == null) {
            stVarArr = new st[0];
        }
        xsVarG0.b.v(stVarArr);
        xsVarG0.h = stVarArr;
        xsVarG0.f();
        xf8.i0(G0().g, getViewLifecycleOwner(), fadingRecyclerView, (List) null, new k9(this, (byte) 2));
    }

    @Override // defpackage.ltl
    public final itl C0(itl itlVar) {
        xs xsVarG0 = G0();
        ts tsVar = ((qs) this.r.p()).a;
        if (tsVar != null) {
            xsVarG0.getClass();
            kq8 kq8Var = tsVar.a;
            xsVarG0.f = kq8Var.a;
            xsVarG0.i = kq8Var;
        } else {
            xsVarG0.f = 0;
            xsVarG0.i = null;
        }
        itlVar.getClass();
        int i = G0().f;
        itlVar.a = i != 0 ? new rxh(i) : null;
        return itlVar;
    }

    public final xs G0() {
        return (xs) this.s.getValue();
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        cqp.r0(this.r, G0().h);
        super.l0(z);
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        FadingRecyclerView fadingRecyclerView = this.u;
        if (fadingRecyclerView != null) {
            fadingRecyclerView.a0();
        }
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.u = null;
    }
}
