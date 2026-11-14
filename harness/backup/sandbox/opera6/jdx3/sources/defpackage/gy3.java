package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gy3 extends i93 implements o37 {
    public static final /* synthetic */ xtb[] w = {new d6h(gy3.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentBrowserSettingsBinding;", 0)};
    public final ua7 t;
    public final ktl u;
    public final zyk v;

    public gy3(gjm gjmVar) {
        super(2132021143, 0, 14);
        this.t = new ua7((Fragment) this, gjmVar);
        this.u = F0(new qp2((byte) 22));
        this.v = z4c.b(new t2(this, (byte) 16));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final fl9 H0() {
        xtb xtbVar = w[0];
        a5n a5nVar = this.u.b;
        Objects.requireNonNull(a5nVar);
        return (fl9) a5nVar;
    }

    public final oy3 I0() {
        return (oy3) this.v.getValue();
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final byte b = 0;
        H0().b.setOnClickListener(new View.OnClickListener(this) { // from class: ey3
            public final /* synthetic */ gy3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                gy3 gy3Var = this.b;
                switch (b2) {
                    case 0:
                        gy3Var.I0().i.i();
                        break;
                    case 1:
                        g8j g8jVar = gy3Var.I0().d;
                        g8jVar.b.e(new aak(), false);
                        break;
                    case 2:
                        g8j g8jVar2 = gy3Var.I0().d;
                        z77 z77Var = ((qim) g8jVar2.c.get()).c;
                        tim timVarL0 = nrf.l0("tab_disposition", g8jVar2.a.getString(2132021435));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    default:
                        gy3Var.I0().k.a(new int[0]);
                        break;
                }
            }
        });
        final byte b2 = 1;
        H0().g.setOnClickListener(new View.OnClickListener(this) { // from class: ey3
            public final /* synthetic */ gy3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                gy3 gy3Var = this.b;
                switch (b22) {
                    case 0:
                        gy3Var.I0().i.i();
                        break;
                    case 1:
                        g8j g8jVar = gy3Var.I0().d;
                        g8jVar.b.e(new aak(), false);
                        break;
                    case 2:
                        g8j g8jVar2 = gy3Var.I0().d;
                        z77 z77Var = ((qim) g8jVar2.c.get()).c;
                        tim timVarL0 = nrf.l0("tab_disposition", g8jVar2.a.getString(2132021435));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    default:
                        gy3Var.I0().k.a(new int[0]);
                        break;
                }
            }
        });
        final byte b3 = 2;
        H0().e.setOnClickListener(new View.OnClickListener(this) { // from class: ey3
            public final /* synthetic */ gy3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b3;
                gy3 gy3Var = this.b;
                switch (b22) {
                    case 0:
                        gy3Var.I0().i.i();
                        break;
                    case 1:
                        g8j g8jVar = gy3Var.I0().d;
                        g8jVar.b.e(new aak(), false);
                        break;
                    case 2:
                        g8j g8jVar2 = gy3Var.I0().d;
                        z77 z77Var = ((qim) g8jVar2.c.get()).c;
                        tim timVarL0 = nrf.l0("tab_disposition", g8jVar2.a.getString(2132021435));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    default:
                        gy3Var.I0().k.a(new int[0]);
                        break;
                }
            }
        });
        H0().h.u = new vlf(this) { // from class: fy3
            public final /* synthetic */ gy3 b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b4 = b;
                gy3 gy3Var = this.b;
                switch (b4) {
                    case 0:
                        gy3Var.I0().b.V(z ? 1 : 0, "tab_auto_grouping");
                        break;
                    default:
                        gy3Var.I0().b.V(z ? 1 : 0, "enable_rewards");
                        break;
                }
            }
        };
        final byte b4 = 3;
        H0().d.setOnClickListener(new View.OnClickListener(this) { // from class: ey3
            public final /* synthetic */ gy3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b4;
                gy3 gy3Var = this.b;
                switch (b22) {
                    case 0:
                        gy3Var.I0().i.i();
                        break;
                    case 1:
                        g8j g8jVar = gy3Var.I0().d;
                        g8jVar.b.e(new aak(), false);
                        break;
                    case 2:
                        g8j g8jVar2 = gy3Var.I0().d;
                        z77 z77Var = ((qim) g8jVar2.c.get()).c;
                        tim timVarL0 = nrf.l0("tab_disposition", g8jVar2.a.getString(2132021435));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    default:
                        gy3Var.I0().k.a(new int[0]);
                        break;
                }
            }
        });
        H0().f.u = new vlf(this) { // from class: fy3
            public final /* synthetic */ gy3 b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b42 = b2;
                gy3 gy3Var = this.b;
                switch (b42) {
                    case 0:
                        gy3Var.I0().b.V(z ? 1 : 0, "tab_auto_grouping");
                        break;
                    default:
                        gy3Var.I0().b.V(z ? 1 : 0, "enable_rewards");
                        break;
                }
            }
        };
        xf8.i0((v9j) I0().j.h, getViewLifecycleOwner(), H0().a, (List) null, new k9(this, (byte) 19));
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.t;
    }
}
