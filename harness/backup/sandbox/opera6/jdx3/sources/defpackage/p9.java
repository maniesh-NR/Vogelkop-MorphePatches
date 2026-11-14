package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p9 extends i93 implements o37 {
    public static final /* synthetic */ xtb[] w = {new d6h(p9.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentAccessibilitySettingsBinding;", 0)};
    public static final ixh x = new ixh(264.0f);
    public final ua7 t;
    public final ktl u;
    public final zyk v;

    public p9(gjm gjmVar) {
        super(2132021064, 0, 14);
        this.t = new ua7((Fragment) this, gjmVar);
        this.u = F0(new mc8((byte) 18));
        this.v = z4c.b(new t2(this, (byte) 1));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final vk9 H0() {
        xtb xtbVar = w[0];
        a5n a5nVar = this.u.b;
        Objects.requireNonNull(a5nVar);
        return (vk9) a5nVar;
    }

    public final t9 I0() {
        return (t9) this.v.getValue();
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final byte b = 0;
        H0().e.u = new vlf(this) { // from class: l9
            public final /* synthetic */ p9 b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b2 = b;
                p9 p9Var = this.b;
                switch (b2) {
                    case 0:
                        p9Var.I0().b.V(z ? 1 : 0, "text_wrap");
                        break;
                    default:
                        p9Var.I0().b.V(z ? 1 : 0, "force_enable_zoom");
                        break;
                }
            }
        };
        H0().o.t0(new m9(this, (byte) 0));
        H0().o.u0(new o9(this));
        H0().g.setOnClickListener(new View.OnClickListener(this) { // from class: n9
            public final /* synthetic */ p9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                p9 p9Var = this.b;
                switch (b2) {
                    case 0:
                        p9Var.I0().d.h(r1.g() - 5);
                        break;
                    case 1:
                        bxk bxkVar = p9Var.I0().d;
                        bxkVar.h(bxkVar.g() + 5);
                        break;
                    case 2:
                        ((g8j) p9Var.I0().c).b.e(new ido(), false);
                        break;
                    default:
                        g8j g8jVar = (g8j) p9Var.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("user_agent", g8jVar.a.getString(2132021187));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                }
            }
        });
        final byte b2 = 1;
        H0().h.setOnClickListener(new View.OnClickListener(this) { // from class: n9
            public final /* synthetic */ p9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                p9 p9Var = this.b;
                switch (b22) {
                    case 0:
                        p9Var.I0().d.h(r1.g() - 5);
                        break;
                    case 1:
                        bxk bxkVar = p9Var.I0().d;
                        bxkVar.h(bxkVar.g() + 5);
                        break;
                    case 2:
                        ((g8j) p9Var.I0().c).b.e(new ido(), false);
                        break;
                    default:
                        g8j g8jVar = (g8j) p9Var.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("user_agent", g8jVar.a.getString(2132021187));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                }
            }
        });
        final byte b3 = 2;
        H0().d.setOnClickListener(new View.OnClickListener(this) { // from class: n9
            public final /* synthetic */ p9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b3;
                p9 p9Var = this.b;
                switch (b22) {
                    case 0:
                        p9Var.I0().d.h(r1.g() - 5);
                        break;
                    case 1:
                        bxk bxkVar = p9Var.I0().d;
                        bxkVar.h(bxkVar.g() + 5);
                        break;
                    case 2:
                        ((g8j) p9Var.I0().c).b.e(new ido(), false);
                        break;
                    default:
                        g8j g8jVar = (g8j) p9Var.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("user_agent", g8jVar.a.getString(2132021187));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                }
            }
        });
        H0().c.u = new vlf(this) { // from class: l9
            public final /* synthetic */ p9 b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b22 = b2;
                p9 p9Var = this.b;
                switch (b22) {
                    case 0:
                        p9Var.I0().b.V(z ? 1 : 0, "text_wrap");
                        break;
                    default:
                        p9Var.I0().b.V(z ? 1 : 0, "force_enable_zoom");
                        break;
                }
            }
        };
        final byte b4 = 3;
        H0().b.setOnClickListener(new View.OnClickListener(this) { // from class: n9
            public final /* synthetic */ p9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b4;
                p9 p9Var = this.b;
                switch (b22) {
                    case 0:
                        p9Var.I0().d.h(r1.g() - 5);
                        break;
                    case 1:
                        bxk bxkVar = p9Var.I0().d;
                        bxkVar.h(bxkVar.g() + 5);
                        break;
                    case 2:
                        ((g8j) p9Var.I0().c).b.e(new ido(), false);
                        break;
                    default:
                        g8j g8jVar = (g8j) p9Var.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("user_agent", g8jVar.a.getString(2132021187));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                }
            }
        });
        H0().o.setAccessibilityDelegate(null);
        xf8.i0(I0().e, getViewLifecycleOwner(), H0().a, (List) null, new k9(this, b));
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.t;
    }
}
