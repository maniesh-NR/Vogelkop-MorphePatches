package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class azg extends i93 implements o37 {
    public static final /* synthetic */ xtb[] w = {new d6h(azg.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentPrivacyAndSecuritySettingsBinding;", 0)};
    public final ua7 t;
    public final zyk u;
    public final ktl v;

    public azg(gjm gjmVar) {
        super(2132021377, 0, 14);
        this.t = new ua7((Fragment) this, gjmVar);
        this.u = z4c.b(new yse(this, (byte) 8));
        this.v = F0(new odf((byte) 27));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final lm9 H0() {
        xtb xtbVar = w[0];
        a5n a5nVar = this.v.b;
        Objects.requireNonNull(a5nVar);
        return (lm9) a5nVar;
    }

    public final hzg I0() {
        return (hzg) this.u.getValue();
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H0().b.a(getString(2132021375, new Object[]{getString(2132017591)}));
        final byte b = 5;
        H0().m.setOnClickListener(new View.OnClickListener(this) { // from class: yyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                azg azgVar = this.b;
                switch (b2) {
                    case 0:
                        azgVar.I0().f.a();
                        break;
                    case 1:
                        azgVar.I0().g.b.e(new moj(), false);
                        break;
                    case 2:
                        g8j g8jVar = (g8j) azgVar.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("accept_cookies", g8jVar.a.getString(2132018395));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    case 3:
                        g8j g8jVar2 = (g8j) azgVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new pb6(false, new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        g8j g8jVar3 = (g8j) azgVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new xvi(new oba(2, 0, new int[0])), false);
                        break;
                    case 5:
                        azgVar.I0().d.a(new int[0]);
                        break;
                    case 6:
                        g8j g8jVar4 = (g8j) azgVar.I0().c;
                        g8jVar4.b.e(new n35(), false);
                        break;
                    case 7:
                        g8j g8jVar5 = (g8j) azgVar.I0().c;
                        g8jVar5.getClass();
                        zhj.a(e35.H0(2), 4099).c(g8jVar5.a);
                        break;
                    default:
                        azgVar.I0().e.a(new int[0]);
                        break;
                }
            }
        });
        final byte b2 = 3;
        H0().m.u = new vlf(this) { // from class: zyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b3 = b2;
                final byte b4 = 0;
                azg azgVar = this.b;
                switch (b3) {
                    case 0:
                        final hzg hzgVarI0 = azgVar.I0();
                        hzgVarI0.k.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(hzgVarI0.f.a, new qj(new Runnable() { // from class: fzg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b5 = b4;
                                    hzg hzgVar = hzgVarI0;
                                    switch (b5) {
                                        case 0:
                                            hzgVar.g();
                                            break;
                                        default:
                                            hzgVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 8), 2132021971, 2132021970);
                            break;
                        } else {
                            hzgVarI0.b.V(z ? 1 : 0, "tracker_blocker");
                            break;
                        }
                    case 1:
                        azgVar.I0().b.V(z ? 1 : 0, "safe_browsing_enabled");
                        break;
                    case 2:
                        azgVar.I0().b.V(z ? 1 : 0, "block_popups");
                        break;
                    case 3:
                        azgVar.I0().h.C(z);
                        break;
                    default:
                        final hzg hzgVarI02 = azgVar.I0();
                        hzgVarI02.j.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            final byte b5 = 1;
                            xf8.s0(hzgVarI02.e.a, new qj(new Runnable() { // from class: fzg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b52 = b5;
                                    hzg hzgVar = hzgVarI02;
                                    switch (b52) {
                                        case 0:
                                            hzgVar.g();
                                            break;
                                        default:
                                            hzgVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 0), 2132017291, 2132017290);
                            break;
                        } else {
                            hzgVarI02.b.V(z ? 1 : 0, "ad_blocking");
                            break;
                        }
                }
            }
        };
        final byte b3 = 8;
        H0().c.setOnClickListener(new View.OnClickListener(this) { // from class: yyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b3;
                azg azgVar = this.b;
                switch (b22) {
                    case 0:
                        azgVar.I0().f.a();
                        break;
                    case 1:
                        azgVar.I0().g.b.e(new moj(), false);
                        break;
                    case 2:
                        g8j g8jVar = (g8j) azgVar.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("accept_cookies", g8jVar.a.getString(2132018395));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    case 3:
                        g8j g8jVar2 = (g8j) azgVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new pb6(false, new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        g8j g8jVar3 = (g8j) azgVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new xvi(new oba(2, 0, new int[0])), false);
                        break;
                    case 5:
                        azgVar.I0().d.a(new int[0]);
                        break;
                    case 6:
                        g8j g8jVar4 = (g8j) azgVar.I0().c;
                        g8jVar4.b.e(new n35(), false);
                        break;
                    case 7:
                        g8j g8jVar5 = (g8j) azgVar.I0().c;
                        g8jVar5.getClass();
                        zhj.a(e35.H0(2), 4099).c(g8jVar5.a);
                        break;
                    default:
                        azgVar.I0().e.a(new int[0]);
                        break;
                }
            }
        });
        final byte b4 = 4;
        H0().c.u = new vlf(this) { // from class: zyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b32 = b4;
                final byte b42 = 0;
                azg azgVar = this.b;
                switch (b32) {
                    case 0:
                        final hzg hzgVarI0 = azgVar.I0();
                        hzgVarI0.k.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(hzgVarI0.f.a, new qj(new Runnable() { // from class: fzg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b52 = b42;
                                    hzg hzgVar = hzgVarI0;
                                    switch (b52) {
                                        case 0:
                                            hzgVar.g();
                                            break;
                                        default:
                                            hzgVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 8), 2132021971, 2132021970);
                            break;
                        } else {
                            hzgVarI0.b.V(z ? 1 : 0, "tracker_blocker");
                            break;
                        }
                    case 1:
                        azgVar.I0().b.V(z ? 1 : 0, "safe_browsing_enabled");
                        break;
                    case 2:
                        azgVar.I0().b.V(z ? 1 : 0, "block_popups");
                        break;
                    case 3:
                        azgVar.I0().h.C(z);
                        break;
                    default:
                        final hzg hzgVarI02 = azgVar.I0();
                        hzgVarI02.j.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            final byte b5 = 1;
                            xf8.s0(hzgVarI02.e.a, new qj(new Runnable() { // from class: fzg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b52 = b5;
                                    hzg hzgVar = hzgVarI02;
                                    switch (b52) {
                                        case 0:
                                            hzgVar.g();
                                            break;
                                        default:
                                            hzgVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 0), 2132017291, 2132017290);
                            break;
                        } else {
                            hzgVarI02.b.V(z ? 1 : 0, "ad_blocking");
                            break;
                        }
                }
            }
        };
        final byte b5 = 0;
        H0().l.setOnClickListener(new View.OnClickListener(this) { // from class: yyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b5;
                azg azgVar = this.b;
                switch (b22) {
                    case 0:
                        azgVar.I0().f.a();
                        break;
                    case 1:
                        azgVar.I0().g.b.e(new moj(), false);
                        break;
                    case 2:
                        g8j g8jVar = (g8j) azgVar.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("accept_cookies", g8jVar.a.getString(2132018395));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    case 3:
                        g8j g8jVar2 = (g8j) azgVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new pb6(false, new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        g8j g8jVar3 = (g8j) azgVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new xvi(new oba(2, 0, new int[0])), false);
                        break;
                    case 5:
                        azgVar.I0().d.a(new int[0]);
                        break;
                    case 6:
                        g8j g8jVar4 = (g8j) azgVar.I0().c;
                        g8jVar4.b.e(new n35(), false);
                        break;
                    case 7:
                        g8j g8jVar5 = (g8j) azgVar.I0().c;
                        g8jVar5.getClass();
                        zhj.a(e35.H0(2), 4099).c(g8jVar5.a);
                        break;
                    default:
                        azgVar.I0().e.a(new int[0]);
                        break;
                }
            }
        });
        H0().l.u = new vlf(this) { // from class: zyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b32 = b5;
                final byte b42 = 0;
                azg azgVar = this.b;
                switch (b32) {
                    case 0:
                        final hzg hzgVarI0 = azgVar.I0();
                        hzgVarI0.k.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(hzgVarI0.f.a, new qj(new Runnable() { // from class: fzg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b52 = b42;
                                    hzg hzgVar = hzgVarI0;
                                    switch (b52) {
                                        case 0:
                                            hzgVar.g();
                                            break;
                                        default:
                                            hzgVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 8), 2132021971, 2132021970);
                            break;
                        } else {
                            hzgVarI0.b.V(z ? 1 : 0, "tracker_blocker");
                            break;
                        }
                    case 1:
                        azgVar.I0().b.V(z ? 1 : 0, "safe_browsing_enabled");
                        break;
                    case 2:
                        azgVar.I0().b.V(z ? 1 : 0, "block_popups");
                        break;
                    case 3:
                        azgVar.I0().h.C(z);
                        break;
                    default:
                        final hzg hzgVarI02 = azgVar.I0();
                        hzgVarI02.j.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            final byte b52 = 1;
                            xf8.s0(hzgVarI02.e.a, new qj(new Runnable() { // from class: fzg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b522 = b52;
                                    hzg hzgVar = hzgVarI02;
                                    switch (b522) {
                                        case 0:
                                            hzgVar.g();
                                            break;
                                        default:
                                            hzgVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 0), 2132017291, 2132017290);
                            break;
                        } else {
                            hzgVarI02.b.V(z ? 1 : 0, "ad_blocking");
                            break;
                        }
                }
            }
        };
        final byte b6 = 1;
        H0().k.setOnClickListener(new View.OnClickListener(this) { // from class: yyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b6;
                azg azgVar = this.b;
                switch (b22) {
                    case 0:
                        azgVar.I0().f.a();
                        break;
                    case 1:
                        azgVar.I0().g.b.e(new moj(), false);
                        break;
                    case 2:
                        g8j g8jVar = (g8j) azgVar.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("accept_cookies", g8jVar.a.getString(2132018395));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    case 3:
                        g8j g8jVar2 = (g8j) azgVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new pb6(false, new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        g8j g8jVar3 = (g8j) azgVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new xvi(new oba(2, 0, new int[0])), false);
                        break;
                    case 5:
                        azgVar.I0().d.a(new int[0]);
                        break;
                    case 6:
                        g8j g8jVar4 = (g8j) azgVar.I0().c;
                        g8jVar4.b.e(new n35(), false);
                        break;
                    case 7:
                        g8j g8jVar5 = (g8j) azgVar.I0().c;
                        g8jVar5.getClass();
                        zhj.a(e35.H0(2), 4099).c(g8jVar5.a);
                        break;
                    default:
                        azgVar.I0().e.a(new int[0]);
                        break;
                }
            }
        });
        final byte b7 = 2;
        H0().g.setOnClickListener(new View.OnClickListener(this) { // from class: yyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b7;
                azg azgVar = this.b;
                switch (b22) {
                    case 0:
                        azgVar.I0().f.a();
                        break;
                    case 1:
                        azgVar.I0().g.b.e(new moj(), false);
                        break;
                    case 2:
                        g8j g8jVar = (g8j) azgVar.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("accept_cookies", g8jVar.a.getString(2132018395));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    case 3:
                        g8j g8jVar2 = (g8j) azgVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new pb6(false, new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        g8j g8jVar3 = (g8j) azgVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new xvi(new oba(2, 0, new int[0])), false);
                        break;
                    case 5:
                        azgVar.I0().d.a(new int[0]);
                        break;
                    case 6:
                        g8j g8jVar4 = (g8j) azgVar.I0().c;
                        g8jVar4.b.e(new n35(), false);
                        break;
                    case 7:
                        g8j g8jVar5 = (g8j) azgVar.I0().c;
                        g8jVar5.getClass();
                        zhj.a(e35.H0(2), 4099).c(g8jVar5.a);
                        break;
                    default:
                        azgVar.I0().e.a(new int[0]);
                        break;
                }
            }
        });
        H0().h.setOnClickListener(new View.OnClickListener(this) { // from class: yyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                azg azgVar = this.b;
                switch (b22) {
                    case 0:
                        azgVar.I0().f.a();
                        break;
                    case 1:
                        azgVar.I0().g.b.e(new moj(), false);
                        break;
                    case 2:
                        g8j g8jVar = (g8j) azgVar.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("accept_cookies", g8jVar.a.getString(2132018395));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    case 3:
                        g8j g8jVar2 = (g8j) azgVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new pb6(false, new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        g8j g8jVar3 = (g8j) azgVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new xvi(new oba(2, 0, new int[0])), false);
                        break;
                    case 5:
                        azgVar.I0().d.a(new int[0]);
                        break;
                    case 6:
                        g8j g8jVar4 = (g8j) azgVar.I0().c;
                        g8jVar4.b.e(new n35(), false);
                        break;
                    case 7:
                        g8j g8jVar5 = (g8j) azgVar.I0().c;
                        g8jVar5.getClass();
                        zhj.a(e35.H0(2), 4099).c(g8jVar5.a);
                        break;
                    default:
                        azgVar.I0().e.a(new int[0]);
                        break;
                }
            }
        });
        H0().j.setOnClickListener(new View.OnClickListener(this) { // from class: yyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b4;
                azg azgVar = this.b;
                switch (b22) {
                    case 0:
                        azgVar.I0().f.a();
                        break;
                    case 1:
                        azgVar.I0().g.b.e(new moj(), false);
                        break;
                    case 2:
                        g8j g8jVar = (g8j) azgVar.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("accept_cookies", g8jVar.a.getString(2132018395));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    case 3:
                        g8j g8jVar2 = (g8j) azgVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new pb6(false, new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        g8j g8jVar3 = (g8j) azgVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new xvi(new oba(2, 0, new int[0])), false);
                        break;
                    case 5:
                        azgVar.I0().d.a(new int[0]);
                        break;
                    case 6:
                        g8j g8jVar4 = (g8j) azgVar.I0().c;
                        g8jVar4.b.e(new n35(), false);
                        break;
                    case 7:
                        g8j g8jVar5 = (g8j) azgVar.I0().c;
                        g8jVar5.getClass();
                        zhj.a(e35.H0(2), 4099).c(g8jVar5.a);
                        break;
                    default:
                        azgVar.I0().e.a(new int[0]);
                        break;
                }
            }
        });
        H0().i.u = new vlf(this) { // from class: zyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b32 = b6;
                final byte b42 = 0;
                azg azgVar = this.b;
                switch (b32) {
                    case 0:
                        final hzg hzgVarI0 = azgVar.I0();
                        hzgVarI0.k.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(hzgVarI0.f.a, new qj(new Runnable() { // from class: fzg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b522 = b42;
                                    hzg hzgVar = hzgVarI0;
                                    switch (b522) {
                                        case 0:
                                            hzgVar.g();
                                            break;
                                        default:
                                            hzgVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 8), 2132021971, 2132021970);
                            break;
                        } else {
                            hzgVarI0.b.V(z ? 1 : 0, "tracker_blocker");
                            break;
                        }
                    case 1:
                        azgVar.I0().b.V(z ? 1 : 0, "safe_browsing_enabled");
                        break;
                    case 2:
                        azgVar.I0().b.V(z ? 1 : 0, "block_popups");
                        break;
                    case 3:
                        azgVar.I0().h.C(z);
                        break;
                    default:
                        final hzg hzgVarI02 = azgVar.I0();
                        hzgVarI02.j.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            final byte b52 = 1;
                            xf8.s0(hzgVarI02.e.a, new qj(new Runnable() { // from class: fzg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b522 = b52;
                                    hzg hzgVar = hzgVarI02;
                                    switch (b522) {
                                        case 0:
                                            hzgVar.g();
                                            break;
                                        default:
                                            hzgVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 0), 2132017291, 2132017290);
                            break;
                        } else {
                            hzgVarI02.b.V(z ? 1 : 0, "ad_blocking");
                            break;
                        }
                }
            }
        };
        H0().d.u = new vlf(this) { // from class: zyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b32 = b7;
                final byte b42 = 0;
                azg azgVar = this.b;
                switch (b32) {
                    case 0:
                        final hzg hzgVarI0 = azgVar.I0();
                        hzgVarI0.k.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(hzgVarI0.f.a, new qj(new Runnable() { // from class: fzg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b522 = b42;
                                    hzg hzgVar = hzgVarI0;
                                    switch (b522) {
                                        case 0:
                                            hzgVar.g();
                                            break;
                                        default:
                                            hzgVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 8), 2132021971, 2132021970);
                            break;
                        } else {
                            hzgVarI0.b.V(z ? 1 : 0, "tracker_blocker");
                            break;
                        }
                    case 1:
                        azgVar.I0().b.V(z ? 1 : 0, "safe_browsing_enabled");
                        break;
                    case 2:
                        azgVar.I0().b.V(z ? 1 : 0, "block_popups");
                        break;
                    case 3:
                        azgVar.I0().h.C(z);
                        break;
                    default:
                        final hzg hzgVarI02 = azgVar.I0();
                        hzgVarI02.j.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            final byte b52 = 1;
                            xf8.s0(hzgVarI02.e.a, new qj(new Runnable() { // from class: fzg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b522 = b52;
                                    hzg hzgVar = hzgVarI02;
                                    switch (b522) {
                                        case 0:
                                            hzgVar.g();
                                            break;
                                        default:
                                            hzgVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 0), 2132017291, 2132017290);
                            break;
                        } else {
                            hzgVarI02.b.V(z ? 1 : 0, "ad_blocking");
                            break;
                        }
                }
            }
        };
        final byte b8 = 6;
        H0().f.setOnClickListener(new View.OnClickListener(this) { // from class: yyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b8;
                azg azgVar = this.b;
                switch (b22) {
                    case 0:
                        azgVar.I0().f.a();
                        break;
                    case 1:
                        azgVar.I0().g.b.e(new moj(), false);
                        break;
                    case 2:
                        g8j g8jVar = (g8j) azgVar.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("accept_cookies", g8jVar.a.getString(2132018395));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    case 3:
                        g8j g8jVar2 = (g8j) azgVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new pb6(false, new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        g8j g8jVar3 = (g8j) azgVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new xvi(new oba(2, 0, new int[0])), false);
                        break;
                    case 5:
                        azgVar.I0().d.a(new int[0]);
                        break;
                    case 6:
                        g8j g8jVar4 = (g8j) azgVar.I0().c;
                        g8jVar4.b.e(new n35(), false);
                        break;
                    case 7:
                        g8j g8jVar5 = (g8j) azgVar.I0().c;
                        g8jVar5.getClass();
                        zhj.a(e35.H0(2), 4099).c(g8jVar5.a);
                        break;
                    default:
                        azgVar.I0().e.a(new int[0]);
                        break;
                }
            }
        });
        final byte b9 = 7;
        H0().e.setOnClickListener(new View.OnClickListener(this) { // from class: yyg
            public final /* synthetic */ azg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b9;
                azg azgVar = this.b;
                switch (b22) {
                    case 0:
                        azgVar.I0().f.a();
                        break;
                    case 1:
                        azgVar.I0().g.b.e(new moj(), false);
                        break;
                    case 2:
                        g8j g8jVar = (g8j) azgVar.I0().c;
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVarL0 = nrf.l0("accept_cookies", g8jVar.a.getString(2132018395));
                        z77Var.getClass();
                        z77Var.b(timVarL0, ijm.b);
                        break;
                    case 3:
                        g8j g8jVar2 = (g8j) azgVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new pb6(false, new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        g8j g8jVar3 = (g8j) azgVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new xvi(new oba(2, 0, new int[0])), false);
                        break;
                    case 5:
                        azgVar.I0().d.a(new int[0]);
                        break;
                    case 6:
                        g8j g8jVar4 = (g8j) azgVar.I0().c;
                        g8jVar4.b.e(new n35(), false);
                        break;
                    case 7:
                        g8j g8jVar5 = (g8j) azgVar.I0().c;
                        g8jVar5.getClass();
                        zhj.a(e35.H0(2), 4099).c(g8jVar5.a);
                        break;
                    default:
                        azgVar.I0().e.a(new int[0]);
                        break;
                }
            }
        });
        xf8.i0(I0().n, getViewLifecycleOwner(), H0().a, (List) null, new d8d(this, (byte) 28));
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.t;
    }
}
