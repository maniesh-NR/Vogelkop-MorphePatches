package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.settings.SettingsManager;
import java.util.List;
import java.util.Objects;
import org.chromium.components.browser_ui.modaldialog.ModalDialogView;

/* loaded from: classes.dex */
public final class pu1 extends i93 implements o37 {
    public static final /* synthetic */ xtb[] y = {new d6h(pu1.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentAppearanceSettingsBinding;", 0)};
    public final ua7 t;
    public final ktl u;
    public final zyk v;
    public final bv1 w;
    public final dt1 x;

    public pu1(gjm gjmVar) {
        super(2132021102, 0, 14);
        this.t = new ua7((Fragment) this, gjmVar);
        this.u = F0(new t40((byte) 15));
        this.v = z4c.b(new t2(this, (byte) 9));
        this.w = new bv1(new mu1(this, (byte) 3));
        this.x = new dt1(new mu1(this, (byte) 4));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final cl9 H0() {
        xtb xtbVar = y[0];
        a5n a5nVar = this.u.b;
        Objects.requireNonNull(a5nVar);
        return (cl9) a5nVar;
    }

    public final dv1 I0() {
        return (dv1) this.v.getValue();
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        dv1 dv1VarI0 = I0();
        yu1 yu1Var = dv1VarI0.i;
        e7j e7jVarB = yu1Var.b();
        SettingsManager settingsManager = dv1VarI0.b;
        if (e7jVarB != settingsManager.f()) {
            settingsManager.V(e7jVarB.ordinal(), "app_layout");
        }
        b7j b7jVarA = yu1Var.a();
        if (b7jVarA != settingsManager.c()) {
            settingsManager.V(b7jVarA.ordinal(), "addressbar_position");
        }
        ev1 ev1Var = dv1VarI0.g;
        ev1Var.a = null;
        ev1Var.b = null;
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = H0().n;
        recyclerView.y0(this.w);
        recyclerView.getContext();
        final byte b = 3;
        final byte b2 = 1;
        recyclerView.C0(new GridLayoutManager(3, 1));
        final byte b3 = 0;
        recyclerView.m(new ou1((byte) 0, fan.a(8.0f, recyclerView.getResources())));
        RecyclerView recyclerView2 = H0().m;
        recyclerView2.y0(this.x);
        recyclerView2.getContext();
        recyclerView2.C0(new LinearLayoutManager(0, false));
        recyclerView2.m(new ou1((byte) 0, fan.a(8.0f, recyclerView2.getResources())));
        final byte b4 = 5;
        H0().p.setOnClickListener(new View.OnClickListener(this) { // from class: lu1
            public final /* synthetic */ pu1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b4;
                ijm ijmVar = ijm.b;
                pu1 pu1Var = this.b;
                switch (b5) {
                    case 0:
                        pu1Var.I0().f.b.e(new fs1(), false);
                        break;
                    case 1:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 2:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 3:
                        dv1 dv1VarI0 = pu1Var.I0();
                        g8j g8jVar = dv1VarI0.f;
                        b7j b7jVarA = dv1VarI0.i.a();
                        cv1 cv1Var = new cv1(dv1VarI0, (byte) 0);
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVar = new tim(new alj(new ivg(b7jVarA, cv1Var, (byte) 4), g8jVar.a.getString(2132021075)));
                        z77Var.getClass();
                        z77Var.b(timVar, ijmVar);
                        break;
                    case 4:
                        dv1 dv1VarI02 = pu1Var.I0();
                        g8j g8jVar2 = dv1VarI02.f;
                        yu1 yu1Var = dv1VarI02.i;
                        r7j r7jVarD = yu1Var.a.D(yu1Var.b());
                        b7j b7jVarA2 = yu1Var.a();
                        b7j b7jVar = b7j.d;
                        if (b7jVarA2 == b7jVar && r7jVarD == r7j.ONLY_ADDRESS_BAR) {
                            r7jVarD = r7j.BOTH;
                        }
                        boolean z = yu1Var.a() == b7jVar || yu1Var.b() == e7j.d;
                        cv1 cv1Var2 = new cv1(dv1VarI02, (byte) 1);
                        z77 z77Var2 = ((qim) g8jVar2.c.get()).c;
                        tim timVar2 = new tim(new alj(new eyi((byte) 1, r7jVarD, cv1Var2, z), g8jVar2.a.getString(2132021227)));
                        z77Var2.getClass();
                        z77Var2.b(timVar2, ijmVar);
                        break;
                    case 5:
                        pu1Var.I0().d.b.e(new rkn(vln.a, null), false);
                        break;
                    case 6:
                        pu1Var.I0().f.a(new int[0]);
                        break;
                    case 7:
                        g8j g8jVar3 = pu1Var.I0().f;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new dw9(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        g8j g8jVar4 = pu1Var.I0().f;
                        psp pspVar = wo3.K;
                        uo3 uo3Var = uo3.SETTINGS;
                        pspVar.getClass();
                        g8jVar4.l(wo3.class, psp.j(uo3Var));
                        break;
                    default:
                        pu1Var.I0().f.l(ts1.class, null);
                        break;
                }
            }
        });
        final byte b5 = 9;
        H0().e.setOnClickListener(new View.OnClickListener(this) { // from class: lu1
            public final /* synthetic */ pu1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b52 = b5;
                ijm ijmVar = ijm.b;
                pu1 pu1Var = this.b;
                switch (b52) {
                    case 0:
                        pu1Var.I0().f.b.e(new fs1(), false);
                        break;
                    case 1:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 2:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 3:
                        dv1 dv1VarI0 = pu1Var.I0();
                        g8j g8jVar = dv1VarI0.f;
                        b7j b7jVarA = dv1VarI0.i.a();
                        cv1 cv1Var = new cv1(dv1VarI0, (byte) 0);
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVar = new tim(new alj(new ivg(b7jVarA, cv1Var, (byte) 4), g8jVar.a.getString(2132021075)));
                        z77Var.getClass();
                        z77Var.b(timVar, ijmVar);
                        break;
                    case 4:
                        dv1 dv1VarI02 = pu1Var.I0();
                        g8j g8jVar2 = dv1VarI02.f;
                        yu1 yu1Var = dv1VarI02.i;
                        r7j r7jVarD = yu1Var.a.D(yu1Var.b());
                        b7j b7jVarA2 = yu1Var.a();
                        b7j b7jVar = b7j.d;
                        if (b7jVarA2 == b7jVar && r7jVarD == r7j.ONLY_ADDRESS_BAR) {
                            r7jVarD = r7j.BOTH;
                        }
                        boolean z = yu1Var.a() == b7jVar || yu1Var.b() == e7j.d;
                        cv1 cv1Var2 = new cv1(dv1VarI02, (byte) 1);
                        z77 z77Var2 = ((qim) g8jVar2.c.get()).c;
                        tim timVar2 = new tim(new alj(new eyi((byte) 1, r7jVarD, cv1Var2, z), g8jVar2.a.getString(2132021227)));
                        z77Var2.getClass();
                        z77Var2.b(timVar2, ijmVar);
                        break;
                    case 5:
                        pu1Var.I0().d.b.e(new rkn(vln.a, null), false);
                        break;
                    case 6:
                        pu1Var.I0().f.a(new int[0]);
                        break;
                    case 7:
                        g8j g8jVar3 = pu1Var.I0().f;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new dw9(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        g8j g8jVar4 = pu1Var.I0().f;
                        psp pspVar = wo3.K;
                        uo3 uo3Var = uo3.SETTINGS;
                        pspVar.getClass();
                        g8jVar4.l(wo3.class, psp.j(uo3Var));
                        break;
                    default:
                        pu1Var.I0().f.l(ts1.class, null);
                        break;
                }
            }
        });
        H0().d.setOnClickListener(new View.OnClickListener(this) { // from class: lu1
            public final /* synthetic */ pu1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b52 = b3;
                ijm ijmVar = ijm.b;
                pu1 pu1Var = this.b;
                switch (b52) {
                    case 0:
                        pu1Var.I0().f.b.e(new fs1(), false);
                        break;
                    case 1:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 2:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 3:
                        dv1 dv1VarI0 = pu1Var.I0();
                        g8j g8jVar = dv1VarI0.f;
                        b7j b7jVarA = dv1VarI0.i.a();
                        cv1 cv1Var = new cv1(dv1VarI0, (byte) 0);
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVar = new tim(new alj(new ivg(b7jVarA, cv1Var, (byte) 4), g8jVar.a.getString(2132021075)));
                        z77Var.getClass();
                        z77Var.b(timVar, ijmVar);
                        break;
                    case 4:
                        dv1 dv1VarI02 = pu1Var.I0();
                        g8j g8jVar2 = dv1VarI02.f;
                        yu1 yu1Var = dv1VarI02.i;
                        r7j r7jVarD = yu1Var.a.D(yu1Var.b());
                        b7j b7jVarA2 = yu1Var.a();
                        b7j b7jVar = b7j.d;
                        if (b7jVarA2 == b7jVar && r7jVarD == r7j.ONLY_ADDRESS_BAR) {
                            r7jVarD = r7j.BOTH;
                        }
                        boolean z = yu1Var.a() == b7jVar || yu1Var.b() == e7j.d;
                        cv1 cv1Var2 = new cv1(dv1VarI02, (byte) 1);
                        z77 z77Var2 = ((qim) g8jVar2.c.get()).c;
                        tim timVar2 = new tim(new alj(new eyi((byte) 1, r7jVarD, cv1Var2, z), g8jVar2.a.getString(2132021227)));
                        z77Var2.getClass();
                        z77Var2.b(timVar2, ijmVar);
                        break;
                    case 5:
                        pu1Var.I0().d.b.e(new rkn(vln.a, null), false);
                        break;
                    case 6:
                        pu1Var.I0().f.a(new int[0]);
                        break;
                    case 7:
                        g8j g8jVar3 = pu1Var.I0().f;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new dw9(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        g8j g8jVar4 = pu1Var.I0().f;
                        psp pspVar = wo3.K;
                        uo3 uo3Var = uo3.SETTINGS;
                        pspVar.getClass();
                        g8jVar4.l(wo3.class, psp.j(uo3Var));
                        break;
                    default:
                        pu1Var.I0().f.l(ts1.class, null);
                        break;
                }
            }
        });
        H0().k.setOnClickListener(new View.OnClickListener(this) { // from class: lu1
            public final /* synthetic */ pu1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b52 = b2;
                ijm ijmVar = ijm.b;
                pu1 pu1Var = this.b;
                switch (b52) {
                    case 0:
                        pu1Var.I0().f.b.e(new fs1(), false);
                        break;
                    case 1:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 2:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 3:
                        dv1 dv1VarI0 = pu1Var.I0();
                        g8j g8jVar = dv1VarI0.f;
                        b7j b7jVarA = dv1VarI0.i.a();
                        cv1 cv1Var = new cv1(dv1VarI0, (byte) 0);
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVar = new tim(new alj(new ivg(b7jVarA, cv1Var, (byte) 4), g8jVar.a.getString(2132021075)));
                        z77Var.getClass();
                        z77Var.b(timVar, ijmVar);
                        break;
                    case 4:
                        dv1 dv1VarI02 = pu1Var.I0();
                        g8j g8jVar2 = dv1VarI02.f;
                        yu1 yu1Var = dv1VarI02.i;
                        r7j r7jVarD = yu1Var.a.D(yu1Var.b());
                        b7j b7jVarA2 = yu1Var.a();
                        b7j b7jVar = b7j.d;
                        if (b7jVarA2 == b7jVar && r7jVarD == r7j.ONLY_ADDRESS_BAR) {
                            r7jVarD = r7j.BOTH;
                        }
                        boolean z = yu1Var.a() == b7jVar || yu1Var.b() == e7j.d;
                        cv1 cv1Var2 = new cv1(dv1VarI02, (byte) 1);
                        z77 z77Var2 = ((qim) g8jVar2.c.get()).c;
                        tim timVar2 = new tim(new alj(new eyi((byte) 1, r7jVarD, cv1Var2, z), g8jVar2.a.getString(2132021227)));
                        z77Var2.getClass();
                        z77Var2.b(timVar2, ijmVar);
                        break;
                    case 5:
                        pu1Var.I0().d.b.e(new rkn(vln.a, null), false);
                        break;
                    case 6:
                        pu1Var.I0().f.a(new int[0]);
                        break;
                    case 7:
                        g8j g8jVar3 = pu1Var.I0().f;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new dw9(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        g8j g8jVar4 = pu1Var.I0().f;
                        psp pspVar = wo3.K;
                        uo3 uo3Var = uo3.SETTINGS;
                        pspVar.getClass();
                        g8jVar4.l(wo3.class, psp.j(uo3Var));
                        break;
                    default:
                        pu1Var.I0().f.l(ts1.class, null);
                        break;
                }
            }
        });
        final byte b6 = 2;
        H0().j.setOnClickListener(new View.OnClickListener(this) { // from class: lu1
            public final /* synthetic */ pu1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b52 = b6;
                ijm ijmVar = ijm.b;
                pu1 pu1Var = this.b;
                switch (b52) {
                    case 0:
                        pu1Var.I0().f.b.e(new fs1(), false);
                        break;
                    case 1:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 2:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 3:
                        dv1 dv1VarI0 = pu1Var.I0();
                        g8j g8jVar = dv1VarI0.f;
                        b7j b7jVarA = dv1VarI0.i.a();
                        cv1 cv1Var = new cv1(dv1VarI0, (byte) 0);
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVar = new tim(new alj(new ivg(b7jVarA, cv1Var, (byte) 4), g8jVar.a.getString(2132021075)));
                        z77Var.getClass();
                        z77Var.b(timVar, ijmVar);
                        break;
                    case 4:
                        dv1 dv1VarI02 = pu1Var.I0();
                        g8j g8jVar2 = dv1VarI02.f;
                        yu1 yu1Var = dv1VarI02.i;
                        r7j r7jVarD = yu1Var.a.D(yu1Var.b());
                        b7j b7jVarA2 = yu1Var.a();
                        b7j b7jVar = b7j.d;
                        if (b7jVarA2 == b7jVar && r7jVarD == r7j.ONLY_ADDRESS_BAR) {
                            r7jVarD = r7j.BOTH;
                        }
                        boolean z = yu1Var.a() == b7jVar || yu1Var.b() == e7j.d;
                        cv1 cv1Var2 = new cv1(dv1VarI02, (byte) 1);
                        z77 z77Var2 = ((qim) g8jVar2.c.get()).c;
                        tim timVar2 = new tim(new alj(new eyi((byte) 1, r7jVarD, cv1Var2, z), g8jVar2.a.getString(2132021227)));
                        z77Var2.getClass();
                        z77Var2.b(timVar2, ijmVar);
                        break;
                    case 5:
                        pu1Var.I0().d.b.e(new rkn(vln.a, null), false);
                        break;
                    case 6:
                        pu1Var.I0().f.a(new int[0]);
                        break;
                    case 7:
                        g8j g8jVar3 = pu1Var.I0().f;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new dw9(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        g8j g8jVar4 = pu1Var.I0().f;
                        psp pspVar = wo3.K;
                        uo3 uo3Var = uo3.SETTINGS;
                        pspVar.getClass();
                        g8jVar4.l(wo3.class, psp.j(uo3Var));
                        break;
                    default:
                        pu1Var.I0().f.l(ts1.class, null);
                        break;
                }
            }
        });
        H0().j.u = new mu1(this, b3);
        H0().g.u = new mu1(this, b2);
        H0().l.u = new mu1(this, b6);
        H0().c.setOnClickListener(new View.OnClickListener(this) { // from class: lu1
            public final /* synthetic */ pu1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b52 = b;
                ijm ijmVar = ijm.b;
                pu1 pu1Var = this.b;
                switch (b52) {
                    case 0:
                        pu1Var.I0().f.b.e(new fs1(), false);
                        break;
                    case 1:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 2:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 3:
                        dv1 dv1VarI0 = pu1Var.I0();
                        g8j g8jVar = dv1VarI0.f;
                        b7j b7jVarA = dv1VarI0.i.a();
                        cv1 cv1Var = new cv1(dv1VarI0, (byte) 0);
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVar = new tim(new alj(new ivg(b7jVarA, cv1Var, (byte) 4), g8jVar.a.getString(2132021075)));
                        z77Var.getClass();
                        z77Var.b(timVar, ijmVar);
                        break;
                    case 4:
                        dv1 dv1VarI02 = pu1Var.I0();
                        g8j g8jVar2 = dv1VarI02.f;
                        yu1 yu1Var = dv1VarI02.i;
                        r7j r7jVarD = yu1Var.a.D(yu1Var.b());
                        b7j b7jVarA2 = yu1Var.a();
                        b7j b7jVar = b7j.d;
                        if (b7jVarA2 == b7jVar && r7jVarD == r7j.ONLY_ADDRESS_BAR) {
                            r7jVarD = r7j.BOTH;
                        }
                        boolean z = yu1Var.a() == b7jVar || yu1Var.b() == e7j.d;
                        cv1 cv1Var2 = new cv1(dv1VarI02, (byte) 1);
                        z77 z77Var2 = ((qim) g8jVar2.c.get()).c;
                        tim timVar2 = new tim(new alj(new eyi((byte) 1, r7jVarD, cv1Var2, z), g8jVar2.a.getString(2132021227)));
                        z77Var2.getClass();
                        z77Var2.b(timVar2, ijmVar);
                        break;
                    case 5:
                        pu1Var.I0().d.b.e(new rkn(vln.a, null), false);
                        break;
                    case 6:
                        pu1Var.I0().f.a(new int[0]);
                        break;
                    case 7:
                        g8j g8jVar3 = pu1Var.I0().f;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new dw9(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        g8j g8jVar4 = pu1Var.I0().f;
                        psp pspVar = wo3.K;
                        uo3 uo3Var = uo3.SETTINGS;
                        pspVar.getClass();
                        g8jVar4.l(wo3.class, psp.j(uo3Var));
                        break;
                    default:
                        pu1Var.I0().f.l(ts1.class, null);
                        break;
                }
            }
        });
        final byte b7 = 4;
        H0().o.setOnClickListener(new View.OnClickListener(this) { // from class: lu1
            public final /* synthetic */ pu1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b52 = b7;
                ijm ijmVar = ijm.b;
                pu1 pu1Var = this.b;
                switch (b52) {
                    case 0:
                        pu1Var.I0().f.b.e(new fs1(), false);
                        break;
                    case 1:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 2:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 3:
                        dv1 dv1VarI0 = pu1Var.I0();
                        g8j g8jVar = dv1VarI0.f;
                        b7j b7jVarA = dv1VarI0.i.a();
                        cv1 cv1Var = new cv1(dv1VarI0, (byte) 0);
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVar = new tim(new alj(new ivg(b7jVarA, cv1Var, (byte) 4), g8jVar.a.getString(2132021075)));
                        z77Var.getClass();
                        z77Var.b(timVar, ijmVar);
                        break;
                    case 4:
                        dv1 dv1VarI02 = pu1Var.I0();
                        g8j g8jVar2 = dv1VarI02.f;
                        yu1 yu1Var = dv1VarI02.i;
                        r7j r7jVarD = yu1Var.a.D(yu1Var.b());
                        b7j b7jVarA2 = yu1Var.a();
                        b7j b7jVar = b7j.d;
                        if (b7jVarA2 == b7jVar && r7jVarD == r7j.ONLY_ADDRESS_BAR) {
                            r7jVarD = r7j.BOTH;
                        }
                        boolean z = yu1Var.a() == b7jVar || yu1Var.b() == e7j.d;
                        cv1 cv1Var2 = new cv1(dv1VarI02, (byte) 1);
                        z77 z77Var2 = ((qim) g8jVar2.c.get()).c;
                        tim timVar2 = new tim(new alj(new eyi((byte) 1, r7jVarD, cv1Var2, z), g8jVar2.a.getString(2132021227)));
                        z77Var2.getClass();
                        z77Var2.b(timVar2, ijmVar);
                        break;
                    case 5:
                        pu1Var.I0().d.b.e(new rkn(vln.a, null), false);
                        break;
                    case 6:
                        pu1Var.I0().f.a(new int[0]);
                        break;
                    case 7:
                        g8j g8jVar3 = pu1Var.I0().f;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new dw9(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        g8j g8jVar4 = pu1Var.I0().f;
                        psp pspVar = wo3.K;
                        uo3 uo3Var = uo3.SETTINGS;
                        pspVar.getClass();
                        g8jVar4.l(wo3.class, psp.j(uo3Var));
                        break;
                    default:
                        pu1Var.I0().f.l(ts1.class, null);
                        break;
                }
            }
        });
        final byte b8 = 6;
        H0().b.setOnClickListener(new View.OnClickListener(this) { // from class: lu1
            public final /* synthetic */ pu1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b52 = b8;
                ijm ijmVar = ijm.b;
                pu1 pu1Var = this.b;
                switch (b52) {
                    case 0:
                        pu1Var.I0().f.b.e(new fs1(), false);
                        break;
                    case 1:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 2:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 3:
                        dv1 dv1VarI0 = pu1Var.I0();
                        g8j g8jVar = dv1VarI0.f;
                        b7j b7jVarA = dv1VarI0.i.a();
                        cv1 cv1Var = new cv1(dv1VarI0, (byte) 0);
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVar = new tim(new alj(new ivg(b7jVarA, cv1Var, (byte) 4), g8jVar.a.getString(2132021075)));
                        z77Var.getClass();
                        z77Var.b(timVar, ijmVar);
                        break;
                    case 4:
                        dv1 dv1VarI02 = pu1Var.I0();
                        g8j g8jVar2 = dv1VarI02.f;
                        yu1 yu1Var = dv1VarI02.i;
                        r7j r7jVarD = yu1Var.a.D(yu1Var.b());
                        b7j b7jVarA2 = yu1Var.a();
                        b7j b7jVar = b7j.d;
                        if (b7jVarA2 == b7jVar && r7jVarD == r7j.ONLY_ADDRESS_BAR) {
                            r7jVarD = r7j.BOTH;
                        }
                        boolean z = yu1Var.a() == b7jVar || yu1Var.b() == e7j.d;
                        cv1 cv1Var2 = new cv1(dv1VarI02, (byte) 1);
                        z77 z77Var2 = ((qim) g8jVar2.c.get()).c;
                        tim timVar2 = new tim(new alj(new eyi((byte) 1, r7jVarD, cv1Var2, z), g8jVar2.a.getString(2132021227)));
                        z77Var2.getClass();
                        z77Var2.b(timVar2, ijmVar);
                        break;
                    case 5:
                        pu1Var.I0().d.b.e(new rkn(vln.a, null), false);
                        break;
                    case 6:
                        pu1Var.I0().f.a(new int[0]);
                        break;
                    case 7:
                        g8j g8jVar3 = pu1Var.I0().f;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new dw9(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        g8j g8jVar4 = pu1Var.I0().f;
                        psp pspVar = wo3.K;
                        uo3 uo3Var = uo3.SETTINGS;
                        pspVar.getClass();
                        g8jVar4.l(wo3.class, psp.j(uo3Var));
                        break;
                    default:
                        pu1Var.I0().f.l(ts1.class, null);
                        break;
                }
            }
        });
        final byte b9 = 7;
        H0().h.setOnClickListener(new View.OnClickListener(this) { // from class: lu1
            public final /* synthetic */ pu1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b52 = b9;
                ijm ijmVar = ijm.b;
                pu1 pu1Var = this.b;
                switch (b52) {
                    case 0:
                        pu1Var.I0().f.b.e(new fs1(), false);
                        break;
                    case 1:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 2:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 3:
                        dv1 dv1VarI0 = pu1Var.I0();
                        g8j g8jVar = dv1VarI0.f;
                        b7j b7jVarA = dv1VarI0.i.a();
                        cv1 cv1Var = new cv1(dv1VarI0, (byte) 0);
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVar = new tim(new alj(new ivg(b7jVarA, cv1Var, (byte) 4), g8jVar.a.getString(2132021075)));
                        z77Var.getClass();
                        z77Var.b(timVar, ijmVar);
                        break;
                    case 4:
                        dv1 dv1VarI02 = pu1Var.I0();
                        g8j g8jVar2 = dv1VarI02.f;
                        yu1 yu1Var = dv1VarI02.i;
                        r7j r7jVarD = yu1Var.a.D(yu1Var.b());
                        b7j b7jVarA2 = yu1Var.a();
                        b7j b7jVar = b7j.d;
                        if (b7jVarA2 == b7jVar && r7jVarD == r7j.ONLY_ADDRESS_BAR) {
                            r7jVarD = r7j.BOTH;
                        }
                        boolean z = yu1Var.a() == b7jVar || yu1Var.b() == e7j.d;
                        cv1 cv1Var2 = new cv1(dv1VarI02, (byte) 1);
                        z77 z77Var2 = ((qim) g8jVar2.c.get()).c;
                        tim timVar2 = new tim(new alj(new eyi((byte) 1, r7jVarD, cv1Var2, z), g8jVar2.a.getString(2132021227)));
                        z77Var2.getClass();
                        z77Var2.b(timVar2, ijmVar);
                        break;
                    case 5:
                        pu1Var.I0().d.b.e(new rkn(vln.a, null), false);
                        break;
                    case 6:
                        pu1Var.I0().f.a(new int[0]);
                        break;
                    case 7:
                        g8j g8jVar3 = pu1Var.I0().f;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new dw9(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        g8j g8jVar4 = pu1Var.I0().f;
                        psp pspVar = wo3.K;
                        uo3 uo3Var = uo3.SETTINGS;
                        pspVar.getClass();
                        g8jVar4.l(wo3.class, psp.j(uo3Var));
                        break;
                    default:
                        pu1Var.I0().f.l(ts1.class, null);
                        break;
                }
            }
        });
        final byte b10 = 8;
        H0().f.setOnClickListener(new View.OnClickListener(this) { // from class: lu1
            public final /* synthetic */ pu1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b52 = b10;
                ijm ijmVar = ijm.b;
                pu1 pu1Var = this.b;
                switch (b52) {
                    case 0:
                        pu1Var.I0().f.b.e(new fs1(), false);
                        break;
                    case 1:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 2:
                        pu1Var.I0().e.a(new int[0]);
                        break;
                    case 3:
                        dv1 dv1VarI0 = pu1Var.I0();
                        g8j g8jVar = dv1VarI0.f;
                        b7j b7jVarA = dv1VarI0.i.a();
                        cv1 cv1Var = new cv1(dv1VarI0, (byte) 0);
                        z77 z77Var = ((qim) g8jVar.c.get()).c;
                        tim timVar = new tim(new alj(new ivg(b7jVarA, cv1Var, (byte) 4), g8jVar.a.getString(2132021075)));
                        z77Var.getClass();
                        z77Var.b(timVar, ijmVar);
                        break;
                    case 4:
                        dv1 dv1VarI02 = pu1Var.I0();
                        g8j g8jVar2 = dv1VarI02.f;
                        yu1 yu1Var = dv1VarI02.i;
                        r7j r7jVarD = yu1Var.a.D(yu1Var.b());
                        b7j b7jVarA2 = yu1Var.a();
                        b7j b7jVar = b7j.d;
                        if (b7jVarA2 == b7jVar && r7jVarD == r7j.ONLY_ADDRESS_BAR) {
                            r7jVarD = r7j.BOTH;
                        }
                        boolean z = yu1Var.a() == b7jVar || yu1Var.b() == e7j.d;
                        cv1 cv1Var2 = new cv1(dv1VarI02, (byte) 1);
                        z77 z77Var2 = ((qim) g8jVar2.c.get()).c;
                        tim timVar2 = new tim(new alj(new eyi((byte) 1, r7jVarD, cv1Var2, z), g8jVar2.a.getString(2132021227)));
                        z77Var2.getClass();
                        z77Var2.b(timVar2, ijmVar);
                        break;
                    case 5:
                        pu1Var.I0().d.b.e(new rkn(vln.a, null), false);
                        break;
                    case 6:
                        pu1Var.I0().f.a(new int[0]);
                        break;
                    case 7:
                        g8j g8jVar3 = pu1Var.I0().f;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new dw9(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        g8j g8jVar4 = pu1Var.I0().f;
                        psp pspVar = wo3.K;
                        uo3 uo3Var = uo3.SETTINGS;
                        pspVar.getClass();
                        g8jVar4.l(wo3.class, psp.j(uo3Var));
                        break;
                    default:
                        pu1Var.I0().f.l(ts1.class, null);
                        break;
                }
            }
        });
        H0().m.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: nu1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                switch (b3) {
                    case 0:
                        if (i3 - i != i7 - i5) {
                            view2.postOnAnimation(new ca(view2, (byte) 2));
                            break;
                        }
                        break;
                    default:
                        int i9 = ModalDialogView.D;
                        boolean z = true;
                        if (!view2.canScrollVertically(-1) && !view2.canScrollVertically(1)) {
                            z = false;
                        }
                        view2.setFocusable(z);
                        break;
                }
            }
        });
        xf8.i0(I0().i.g, getViewLifecycleOwner(), H0().a, (List) null, new k9(this, b10));
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.t;
    }
}
