package defpackage;

import J.N;
import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.vpn.LocationButton;

/* loaded from: classes.dex */
public final class bdn implements ndc {
    public final Context a;
    public final z0c b;
    public final ydn c;
    public final pt1 d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final cdn h;
    public final hv3 i;
    public final adn j = new adn(this, (byte) 0);
    public final xcn k = new xcn(this);
    public final qdc l;
    public final ocn m;

    /* JADX WARN: Type inference failed for: r17v1, types: [android.view.View, android.view.ViewGroup, com.opera.android.ui.catalog.widget.OperaListItem] */
    public bdn(ViewStub viewStub, z0c z0cVar, ydn ydnVar, boolean z, boolean z2, String str, cdn cdnVar, hv3 hv3Var, boolean z3, boolean z4) {
        final byte b = 0;
        final byte b2 = 1;
        qdc qdcVar = new qdc(this, true);
        this.l = qdcVar;
        this.a = viewStub.getContext();
        this.b = z0cVar;
        this.c = ydnVar;
        viewStub.setLayoutResource(2131559505);
        View viewInflate = viewStub.inflate();
        int i = 2131362056;
        LayoutDirectionLinearLayout layoutDirectionLinearLayout = (LayoutDirectionLinearLayout) w1h.j(2131362056, viewInflate);
        if (layoutDirectionLinearLayout != null) {
            i = 2131363358;
            LocationButton locationButton = (LocationButton) w1h.j(2131363358, viewInflate);
            if (locationButton != null) {
                i = 2131363869;
                MaterialButton materialButtonJ = w1h.j(2131363869, viewInflate);
                if (materialButtonJ != null) {
                    i = 2131364077;
                    MaterialButton materialButtonJ2 = w1h.j(2131364077, viewInflate);
                    if (materialButtonJ2 != null) {
                        i = 2131364268;
                        MaterialButton materialButtonJ3 = w1h.j(2131364268, viewInflate);
                        if (materialButtonJ3 != null) {
                            i = 2131365038;
                            OperaIconedMessage operaIconedMessage = (OperaIconedMessage) w1h.j(2131365038, viewInflate);
                            if (operaIconedMessage != null) {
                                i = 2131365057;
                                ?? r17 = (OperaListItem) w1h.j(2131365057, viewInflate);
                                if (r17 != 0) {
                                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                                    this.d = new pt1(linearLayout, layoutDirectionLinearLayout, locationButton, materialButtonJ, materialButtonJ2, materialButtonJ3, operaIconedMessage, r17);
                                    this.e = z;
                                    this.f = z2;
                                    this.g = str;
                                    this.h = cdnVar;
                                    this.i = hv3Var;
                                    if (z4) {
                                        layoutDirectionLinearLayout.setLayoutTransition(null);
                                    }
                                    materialButtonJ3.setOnClickListener(new View.OnClickListener(this) { // from class: ycn
                                        public final /* synthetic */ bdn b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b3 = b;
                                            bdn bdnVar = this.b;
                                            switch (b3) {
                                                case 0:
                                                    bdnVar.b.g(1);
                                                    break;
                                                case 1:
                                                    bdnVar.b.g(2);
                                                    break;
                                                case 2:
                                                    bdnVar.b.g(3);
                                                    break;
                                                default:
                                                    qq8 qq8Var = bdnVar.c.f;
                                                    qq8Var.n(0L);
                                                    ((ydn) qq8Var.c).D(true);
                                                    break;
                                            }
                                        }
                                    });
                                    r17.t(z ? ydnVar.d.a : ydnVar.d.a());
                                    r17.u = new r2n(this, (byte) 1);
                                    new bpd(locationButton);
                                    locationButton.setOnClickListener(new View.OnClickListener(this) { // from class: ycn
                                        public final /* synthetic */ bdn b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b3 = b2;
                                            bdn bdnVar = this.b;
                                            switch (b3) {
                                                case 0:
                                                    bdnVar.b.g(1);
                                                    break;
                                                case 1:
                                                    bdnVar.b.g(2);
                                                    break;
                                                case 2:
                                                    bdnVar.b.g(3);
                                                    break;
                                                default:
                                                    qq8 qq8Var = bdnVar.c.f;
                                                    qq8Var.n(0L);
                                                    ((ydn) qq8Var.c).D(true);
                                                    break;
                                            }
                                        }
                                    });
                                    if (z3) {
                                        locationButton.postDelayed(new Runnable(this) { // from class: zcn
                                            public final /* synthetic */ bdn b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b3 = b;
                                                bdn bdnVar = this.b;
                                                switch (b3) {
                                                    case 0:
                                                        qe6.N((LocationButton) bdnVar.d.d);
                                                        break;
                                                    case 1:
                                                        ydn ydnVar2 = bdnVar.c;
                                                        ydnVar2.F(bdnVar.j);
                                                        bdnVar.h.a.b(bdnVar.k);
                                                        ((OperaListItem) bdnVar.d.b).E(new rxh(ydnVar2.c.isEnabled() ? 2132022254 : 2132022280));
                                                        bdnVar.b();
                                                        bdnVar.l.g(qcc.e);
                                                        break;
                                                    default:
                                                        bdnVar.l.g(qcc.a);
                                                        bdnVar.h.a.c(bdnVar.k);
                                                        bdnVar.c.H(bdnVar.j);
                                                        break;
                                                }
                                            }
                                        }, 500L);
                                    }
                                    final byte b3 = 2;
                                    materialButtonJ.setOnClickListener(new View.OnClickListener(this) { // from class: ycn
                                        public final /* synthetic */ bdn b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b32 = b3;
                                            bdn bdnVar = this.b;
                                            switch (b32) {
                                                case 0:
                                                    bdnVar.b.g(1);
                                                    break;
                                                case 1:
                                                    bdnVar.b.g(2);
                                                    break;
                                                case 2:
                                                    bdnVar.b.g(3);
                                                    break;
                                                default:
                                                    qq8 qq8Var = bdnVar.c.f;
                                                    qq8Var.n(0L);
                                                    ((ydn) qq8Var.c).D(true);
                                                    break;
                                            }
                                        }
                                    });
                                    final byte b4 = 3;
                                    materialButtonJ2.setOnClickListener(new View.OnClickListener(this) { // from class: ycn
                                        public final /* synthetic */ bdn b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b32 = b4;
                                            bdn bdnVar = this.b;
                                            switch (b32) {
                                                case 0:
                                                    bdnVar.b.g(1);
                                                    break;
                                                case 1:
                                                    bdnVar.b.g(2);
                                                    break;
                                                case 2:
                                                    bdnVar.b.g(3);
                                                    break;
                                                default:
                                                    qq8 qq8Var = bdnVar.c.f;
                                                    qq8Var.n(0L);
                                                    ((ydn) qq8Var.c).D(true);
                                                    break;
                                            }
                                        }
                                    });
                                    svk svkVar = new svk(this, (byte) 23);
                                    dll dllVarS = q9n.s(r17);
                                    if (dllVarS != null) {
                                        u8n.b(dllVarS, r17, svkVar);
                                    }
                                    ocn ocnVar = new ocn(r17, qdcVar, ydnVar);
                                    this.m = ocnVar;
                                    if (z != ocnVar.i) {
                                        ocnVar.i = z;
                                        ocnVar.T();
                                    }
                                    q9n.g(linearLayout, new tu4(new Runnable(this) { // from class: zcn
                                        public final /* synthetic */ bdn b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b32 = b2;
                                            bdn bdnVar = this.b;
                                            switch (b32) {
                                                case 0:
                                                    qe6.N((LocationButton) bdnVar.d.d);
                                                    break;
                                                case 1:
                                                    ydn ydnVar2 = bdnVar.c;
                                                    ydnVar2.F(bdnVar.j);
                                                    bdnVar.h.a.b(bdnVar.k);
                                                    ((OperaListItem) bdnVar.d.b).E(new rxh(ydnVar2.c.isEnabled() ? 2132022254 : 2132022280));
                                                    bdnVar.b();
                                                    bdnVar.l.g(qcc.e);
                                                    break;
                                                default:
                                                    bdnVar.l.g(qcc.a);
                                                    bdnVar.h.a.c(bdnVar.k);
                                                    bdnVar.c.H(bdnVar.j);
                                                    break;
                                            }
                                        }
                                    }, new Runnable(this) { // from class: zcn
                                        public final /* synthetic */ bdn b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b32 = b3;
                                            bdn bdnVar = this.b;
                                            switch (b32) {
                                                case 0:
                                                    qe6.N((LocationButton) bdnVar.d.d);
                                                    break;
                                                case 1:
                                                    ydn ydnVar2 = bdnVar.c;
                                                    ydnVar2.F(bdnVar.j);
                                                    bdnVar.h.a.b(bdnVar.k);
                                                    ((OperaListItem) bdnVar.d.b).E(new rxh(ydnVar2.c.isEnabled() ? 2132022254 : 2132022280));
                                                    bdnVar.b();
                                                    bdnVar.l.g(qcc.e);
                                                    break;
                                                default:
                                                    bdnVar.l.g(qcc.a);
                                                    bdnVar.h.a.c(bdnVar.k);
                                                    bdnVar.c.H(bdnVar.j);
                                                    break;
                                            }
                                        }
                                    }, (byte) 7));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final int a() {
        boolean z = this.e;
        ydn ydnVar = this.c;
        return z ? ydnVar.q() : ydnVar.r();
    }

    public final void b() {
        boolean z = this.e;
        ydn ydnVar = this.c;
        boolean zA = z ? ydnVar.d.a : ydnVar.d.a();
        c();
        pt1 pt1Var = this.d;
        if (zA && this.f) {
            OperaIconedMessage operaIconedMessage = (OperaIconedMessage) pt1Var.c;
            OperaIconedMessage operaIconedMessage2 = (OperaIconedMessage) pt1Var.c;
            operaIconedMessage.setVisibility(0);
            ((OperaListItem) pt1Var.b).y(rlf.h);
            ((LocationButton) pt1Var.d).setVisibility(8);
            String str = this.g;
            if (!N.MpNM_Rhp(str)) {
                ((TextView) operaIconedMessage2.a.i).setText(operaIconedMessage2.getContext().getString(2132022263));
            } else if (N.MYQRevfF(str)) {
                ((TextView) operaIconedMessage2.a.i).setText(operaIconedMessage2.getContext().getString(2132022167));
            } else {
                ((TextView) operaIconedMessage2.a.i).setText(operaIconedMessage2.getContext().getString(2132022264));
            }
        } else {
            OperaIconedMessage operaIconedMessage3 = (OperaIconedMessage) pt1Var.c;
            OperaListItem operaListItem = (OperaListItem) pt1Var.b;
            operaIconedMessage3.setVisibility(8);
            operaListItem.y(new tlf());
            operaListItem.t(zA);
            ((LocationButton) pt1Var.d).setVisibility(0);
        }
        int iA = a();
        boolean z2 = ydnVar.c.isEnabled() && iA == 2;
        boolean z3 = ydnVar.c.isEnabled() && ydnVar.f.g() && iA == 1;
        ((MaterialButton) pt1Var.e).setVisibility(z2 ? 0 : 8);
        ((MaterialButton) pt1Var.f).setVisibility(z3 ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void c() {
        pxh rxhVar;
        LayerDrawable layerDrawableP;
        ShapeDrawable shapeDrawableD;
        pt1 pt1Var = this.d;
        OperaListItem operaListItem = (OperaListItem) pt1Var.b;
        ?? r0 = (OperaListItem) pt1Var.b;
        boolean zIsChecked = operaListItem.isChecked();
        String[] strArr = OperaApplication.K;
        Context context = this.a;
        SettingsManager settingsManagerJ = ((OperaApplication) context.getApplicationContext()).J();
        int iA = a();
        boolean z = this.f;
        boolean z2 = true;
        int i = 2130969366;
        ydn ydnVar = this.c;
        if (zIsChecked || !settingsManagerJ.i("compression") || ydnVar.c.isEnabled()) {
            int iA2 = vep.A(this.h.k);
            if (iA2 != 0) {
                if (iA2 == 1) {
                    rxhVar = new rxh(2132022141);
                } else if (iA2 == 2) {
                    rxhVar = new rxh(2132022142);
                } else if (iA2 == 3) {
                    rxhVar = new rxh(2132022143);
                } else if (iA2 == 4) {
                    rxhVar = new sxh(2132022144, new Object[]{new rxh(2132017591)});
                } else {
                    rxhVar = null;
                    i = 0;
                }
                r0.D(new dxh(i));
                r0.C(rxhVar);
            } else {
                i = R.attr.textColorSecondary;
                if (z) {
                    rxhVar = new rxh(2132022270);
                } else {
                    if (iA == 1) {
                        rxhVar = ydnVar.f.g() ? ydnVar.f.f(context) : new rxh(2132022270);
                    } else if (iA == 3) {
                        rxhVar = new rxh(ydnVar.e.d ? 2132022276 : 2132021630);
                    } else if (iA == 2) {
                        rxhVar = new rxh(2132022271);
                    } else {
                        if (iA == 4) {
                            rxhVar = new rxh(2132022275);
                        }
                        rxhVar = null;
                        i = 0;
                    }
                    i = 2130969119;
                }
                r0.D(new dxh(i));
                r0.C(rxhVar);
            }
        } else {
            r0.D(new dxh(2130969366));
            r0.C(new rxh(2132022133));
        }
        if (z || (a() != 2 && a() != 3)) {
            z2 = false;
        }
        boolean zIsEnabled = ydnVar.c.isEnabled();
        ocn ocnVar = this.m;
        if (zIsEnabled) {
            f3d f3dVarF = ocnVar.a;
            Context context2 = r0.getContext();
            int iA3 = fan.a(40.0f, context2.getResources());
            if (z2) {
                int iA0 = p37.a0(0.12f, f03.t(2130971253, context2, 2131101243));
                int iA02 = p37.a0(0.12f, f03.t(2130971254, context2, 2131101243));
                shapeDrawableD = new ShapeDrawable(new OvalShape());
                shapeDrawableD.setPadding(new Rect());
                shapeDrawableD.setIntrinsicWidth(iA3);
                shapeDrawableD.setIntrinsicHeight(iA3);
                shapeDrawableD.setShaderFactory(new vcn(iA0, iA02));
            } else {
                shapeDrawableD = j14.D(iA3, f03.t(2130969343, context2, 2131101243));
                f3dVarF = sgb.F(2131232301, context2);
                j14.n0(f3dVarF, f03.t(2130969288, context2, 2131101243));
            }
            layerDrawableP = j14.p(shapeDrawableD, f3dVarF);
        } else {
            layerDrawableP = ddh.p(z2, ocnVar.a, r0.getContext());
        }
        r0.z(new mxh(layerDrawableP));
    }

    public final tcc getLifecycle() {
        return this.l;
    }
}
