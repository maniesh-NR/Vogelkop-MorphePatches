package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.CreditCard;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xq2 extends lj implements jj2 {
    public static final /* synthetic */ xtb[] x = {new d6h(xq2.class, "binding", "getBinding()Lcom/opera/android/databinding/AutofillCardDetailsFragmentBinding;", 0)};
    public final wh2 r;
    public final ktl s;
    public zq2 t;
    public final zyk u;
    public final ua7 v;
    public final wq2 w;

    /* JADX WARN: Illegal instructions before constructor call */
    public xq2(gjm gjmVar, wh2 wh2Var) {
        u7k u7kVarF = u7k.f(fki.a);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.k = 1;
        u7kVarF.s(2132017756);
        super(itlVar);
        this.r = wh2Var;
        this.s = F0(new qp2((byte) 2));
        this.u = z4c.b(new t2(this, (byte) 11));
        this.v = new ua7((Fragment) this, gjmVar);
        this.w = new wq2();
    }

    public final void G0(CharSequence charSequence) {
        Context context;
        if (charSequence == null || charSequence.length() == 0 || (context = getContext()) == null) {
            return;
        }
        lcp.F(context, charSequence.toString(), false);
    }

    public final yq2 H0() {
        xtb xtbVar = x[0];
        a5n a5nVar = this.s.b;
        Objects.requireNonNull(a5nVar);
        return (yq2) a5nVar;
    }

    @Override // defpackage.jj2
    public final void b0() {
        this.v.D();
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wh2 wh2Var = this.r;
        wh2Var.getClass();
        getLifecycle().a(wh2Var.b);
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AppCompatImageView appCompatImageView = H0().e;
        dll dllVarS = q9n.s(appCompatImageView);
        if (dllVarS != null) {
            u8n.b(dllVarS, appCompatImageView, this.w);
        }
        ((StylingTextView) H0().f.f).setText(2132017757);
        ((StylingTextView) H0().c.f).setText(2132017761);
        ((StylingTextView) H0().d.f).setText(2132017821);
        ((StylingTextView) H0().g.f).setText(2132017790);
        ((StylingTextView) H0().b.f).setText(2132017712);
        final byte b = 0;
        ((StylingImageButton) H0().f.d).setVisibility(0);
        ((StylingImageButton) H0().f.d).setOnClickListener(new View.OnClickListener(this) { // from class: vq2
            public final /* synthetic */ xq2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v7, types: [android.content.Context, com.opera.android.BrowserActivity, hjf] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                xq2 xq2Var = this.b;
                switch (b2) {
                    case 0:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().f.b).getText());
                        break;
                    case 1:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().c.b).getText());
                        break;
                    case 2:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().d.b).getText());
                        break;
                    case 3:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().g.b).getText());
                        break;
                    case 4:
                        br2 br2Var = (br2) xq2Var.u.getValue();
                        ot2 ot2Var = br2Var.c;
                        CreditCard creditCard = br2Var.h;
                        if (creditCard == null) {
                            creditCard = null;
                        }
                        CreditCard creditCard2 = creditCard;
                        ?? r8 = ot2Var.a;
                        AutofillManager autofillManager = (AutofillManager) ot2Var.e.get();
                        gw gwVar = (gw) ot2Var.g.get();
                        orm ormVar = (orm) ot2Var.h.b.get();
                        wh2 wh2Var = (wh2) ot2Var.f.get();
                        va2 va2Var = new va2(ot2Var, (byte) 9);
                        if (wh2Var == null) {
                            wh2Var = new wh2(r8, autofillManager);
                        }
                        wh2 wh2Var2 = wh2Var;
                        wh2Var2.b(r8, new fs2((Object) ormVar, (Object) wh2Var2, (Object) autofillManager, (Object) gwVar, (Object) creditCard2, (Object) va2Var, (byte) 0));
                        break;
                    default:
                        br2 br2Var2 = (br2) xq2Var.u.getValue();
                        oc2 oc2Var = new oc2(xq2Var, (byte) 1);
                        jvg jvgVar = br2Var2.f;
                        ((gjm) jvgVar.b).c(new bs2(), (atl) jvgVar.c, new pb(new t02(oc2Var, (byte) 14), (byte) 15));
                        break;
                }
            }
        });
        ((StylingImageButton) H0().c.d).setVisibility(0);
        final byte b2 = 1;
        ((StylingImageButton) H0().c.d).setOnClickListener(new View.OnClickListener(this) { // from class: vq2
            public final /* synthetic */ xq2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v7, types: [android.content.Context, com.opera.android.BrowserActivity, hjf] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                xq2 xq2Var = this.b;
                switch (b22) {
                    case 0:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().f.b).getText());
                        break;
                    case 1:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().c.b).getText());
                        break;
                    case 2:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().d.b).getText());
                        break;
                    case 3:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().g.b).getText());
                        break;
                    case 4:
                        br2 br2Var = (br2) xq2Var.u.getValue();
                        ot2 ot2Var = br2Var.c;
                        CreditCard creditCard = br2Var.h;
                        if (creditCard == null) {
                            creditCard = null;
                        }
                        CreditCard creditCard2 = creditCard;
                        ?? r8 = ot2Var.a;
                        AutofillManager autofillManager = (AutofillManager) ot2Var.e.get();
                        gw gwVar = (gw) ot2Var.g.get();
                        orm ormVar = (orm) ot2Var.h.b.get();
                        wh2 wh2Var = (wh2) ot2Var.f.get();
                        va2 va2Var = new va2(ot2Var, (byte) 9);
                        if (wh2Var == null) {
                            wh2Var = new wh2(r8, autofillManager);
                        }
                        wh2 wh2Var2 = wh2Var;
                        wh2Var2.b(r8, new fs2((Object) ormVar, (Object) wh2Var2, (Object) autofillManager, (Object) gwVar, (Object) creditCard2, (Object) va2Var, (byte) 0));
                        break;
                    default:
                        br2 br2Var2 = (br2) xq2Var.u.getValue();
                        oc2 oc2Var = new oc2(xq2Var, (byte) 1);
                        jvg jvgVar = br2Var2.f;
                        ((gjm) jvgVar.b).c(new bs2(), (atl) jvgVar.c, new pb(new t02(oc2Var, (byte) 14), (byte) 15));
                        break;
                }
            }
        });
        ((StylingImageButton) H0().d.d).setVisibility(0);
        final byte b3 = 2;
        ((StylingImageButton) H0().d.d).setOnClickListener(new View.OnClickListener(this) { // from class: vq2
            public final /* synthetic */ xq2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v7, types: [android.content.Context, com.opera.android.BrowserActivity, hjf] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b3;
                xq2 xq2Var = this.b;
                switch (b22) {
                    case 0:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().f.b).getText());
                        break;
                    case 1:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().c.b).getText());
                        break;
                    case 2:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().d.b).getText());
                        break;
                    case 3:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().g.b).getText());
                        break;
                    case 4:
                        br2 br2Var = (br2) xq2Var.u.getValue();
                        ot2 ot2Var = br2Var.c;
                        CreditCard creditCard = br2Var.h;
                        if (creditCard == null) {
                            creditCard = null;
                        }
                        CreditCard creditCard2 = creditCard;
                        ?? r8 = ot2Var.a;
                        AutofillManager autofillManager = (AutofillManager) ot2Var.e.get();
                        gw gwVar = (gw) ot2Var.g.get();
                        orm ormVar = (orm) ot2Var.h.b.get();
                        wh2 wh2Var = (wh2) ot2Var.f.get();
                        va2 va2Var = new va2(ot2Var, (byte) 9);
                        if (wh2Var == null) {
                            wh2Var = new wh2(r8, autofillManager);
                        }
                        wh2 wh2Var2 = wh2Var;
                        wh2Var2.b(r8, new fs2((Object) ormVar, (Object) wh2Var2, (Object) autofillManager, (Object) gwVar, (Object) creditCard2, (Object) va2Var, (byte) 0));
                        break;
                    default:
                        br2 br2Var2 = (br2) xq2Var.u.getValue();
                        oc2 oc2Var = new oc2(xq2Var, (byte) 1);
                        jvg jvgVar = br2Var2.f;
                        ((gjm) jvgVar.b).c(new bs2(), (atl) jvgVar.c, new pb(new t02(oc2Var, (byte) 14), (byte) 15));
                        break;
                }
            }
        });
        ((StylingImageButton) H0().g.d).setVisibility(0);
        final byte b4 = 3;
        ((StylingImageButton) H0().g.d).setOnClickListener(new View.OnClickListener(this) { // from class: vq2
            public final /* synthetic */ xq2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v7, types: [android.content.Context, com.opera.android.BrowserActivity, hjf] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b4;
                xq2 xq2Var = this.b;
                switch (b22) {
                    case 0:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().f.b).getText());
                        break;
                    case 1:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().c.b).getText());
                        break;
                    case 2:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().d.b).getText());
                        break;
                    case 3:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().g.b).getText());
                        break;
                    case 4:
                        br2 br2Var = (br2) xq2Var.u.getValue();
                        ot2 ot2Var = br2Var.c;
                        CreditCard creditCard = br2Var.h;
                        if (creditCard == null) {
                            creditCard = null;
                        }
                        CreditCard creditCard2 = creditCard;
                        ?? r8 = ot2Var.a;
                        AutofillManager autofillManager = (AutofillManager) ot2Var.e.get();
                        gw gwVar = (gw) ot2Var.g.get();
                        orm ormVar = (orm) ot2Var.h.b.get();
                        wh2 wh2Var = (wh2) ot2Var.f.get();
                        va2 va2Var = new va2(ot2Var, (byte) 9);
                        if (wh2Var == null) {
                            wh2Var = new wh2(r8, autofillManager);
                        }
                        wh2 wh2Var2 = wh2Var;
                        wh2Var2.b(r8, new fs2((Object) ormVar, (Object) wh2Var2, (Object) autofillManager, (Object) gwVar, (Object) creditCard2, (Object) va2Var, (byte) 0));
                        break;
                    default:
                        br2 br2Var2 = (br2) xq2Var.u.getValue();
                        oc2 oc2Var = new oc2(xq2Var, (byte) 1);
                        jvg jvgVar = br2Var2.f;
                        ((gjm) jvgVar.b).c(new bs2(), (atl) jvgVar.c, new pb(new t02(oc2Var, (byte) 14), (byte) 15));
                        break;
                }
            }
        });
        zq2 zq2Var = this.t;
        if (zq2Var == null) {
            zq2Var = null;
        }
        final byte b5 = 4;
        zq2Var.d.setOnClickListener(new View.OnClickListener(this) { // from class: vq2
            public final /* synthetic */ xq2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v7, types: [android.content.Context, com.opera.android.BrowserActivity, hjf] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b5;
                xq2 xq2Var = this.b;
                switch (b22) {
                    case 0:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().f.b).getText());
                        break;
                    case 1:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().c.b).getText());
                        break;
                    case 2:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().d.b).getText());
                        break;
                    case 3:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().g.b).getText());
                        break;
                    case 4:
                        br2 br2Var = (br2) xq2Var.u.getValue();
                        ot2 ot2Var = br2Var.c;
                        CreditCard creditCard = br2Var.h;
                        if (creditCard == null) {
                            creditCard = null;
                        }
                        CreditCard creditCard2 = creditCard;
                        ?? r8 = ot2Var.a;
                        AutofillManager autofillManager = (AutofillManager) ot2Var.e.get();
                        gw gwVar = (gw) ot2Var.g.get();
                        orm ormVar = (orm) ot2Var.h.b.get();
                        wh2 wh2Var = (wh2) ot2Var.f.get();
                        va2 va2Var = new va2(ot2Var, (byte) 9);
                        if (wh2Var == null) {
                            wh2Var = new wh2(r8, autofillManager);
                        }
                        wh2 wh2Var2 = wh2Var;
                        wh2Var2.b(r8, new fs2((Object) ormVar, (Object) wh2Var2, (Object) autofillManager, (Object) gwVar, (Object) creditCard2, (Object) va2Var, (byte) 0));
                        break;
                    default:
                        br2 br2Var2 = (br2) xq2Var.u.getValue();
                        oc2 oc2Var = new oc2(xq2Var, (byte) 1);
                        jvg jvgVar = br2Var2.f;
                        ((gjm) jvgVar.b).c(new bs2(), (atl) jvgVar.c, new pb(new t02(oc2Var, (byte) 14), (byte) 15));
                        break;
                }
            }
        });
        zq2 zq2Var2 = this.t;
        if (zq2Var2 == null) {
            zq2Var2 = null;
        }
        final byte b6 = 5;
        zq2Var2.c.setOnClickListener(new View.OnClickListener(this) { // from class: vq2
            public final /* synthetic */ xq2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v7, types: [android.content.Context, com.opera.android.BrowserActivity, hjf] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b6;
                xq2 xq2Var = this.b;
                switch (b22) {
                    case 0:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().f.b).getText());
                        break;
                    case 1:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().c.b).getText());
                        break;
                    case 2:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().d.b).getText());
                        break;
                    case 3:
                        xq2Var.G0(((StylingTextView) xq2Var.H0().g.b).getText());
                        break;
                    case 4:
                        br2 br2Var = (br2) xq2Var.u.getValue();
                        ot2 ot2Var = br2Var.c;
                        CreditCard creditCard = br2Var.h;
                        if (creditCard == null) {
                            creditCard = null;
                        }
                        CreditCard creditCard2 = creditCard;
                        ?? r8 = ot2Var.a;
                        AutofillManager autofillManager = (AutofillManager) ot2Var.e.get();
                        gw gwVar = (gw) ot2Var.g.get();
                        orm ormVar = (orm) ot2Var.h.b.get();
                        wh2 wh2Var = (wh2) ot2Var.f.get();
                        va2 va2Var = new va2(ot2Var, (byte) 9);
                        if (wh2Var == null) {
                            wh2Var = new wh2(r8, autofillManager);
                        }
                        wh2 wh2Var2 = wh2Var;
                        wh2Var2.b(r8, new fs2((Object) ormVar, (Object) wh2Var2, (Object) autofillManager, (Object) gwVar, (Object) creditCard2, (Object) va2Var, (byte) 0));
                        break;
                    default:
                        br2 br2Var2 = (br2) xq2Var.u.getValue();
                        oc2 oc2Var = new oc2(xq2Var, (byte) 1);
                        jvg jvgVar = br2Var2.f;
                        ((gjm) jvgVar.b).c(new bs2(), (atl) jvgVar.c, new pb(new t02(oc2Var, (byte) 14), (byte) 15));
                        break;
                }
            }
        });
        zyk zykVar = this.u;
        br2 br2Var = (br2) zykVar.getValue();
        br2Var.g = ((uq2) this.v.p()).a;
        br2Var.g();
        xf8.i0(((br2) zykVar.getValue()).e, getViewLifecycleOwner(), H0().a, (List) null, new pb(this, (byte) 14));
    }

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558520, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362508;
        MaterialButton materialButtonJ = w1h.j(2131362508, viewInflate);
        if (materialButtonJ != null) {
            i = 2131362655;
            MaterialButton materialButtonJ2 = w1h.j(2131362655, viewInflate);
            if (materialButtonJ2 != null) {
                this.t = new zq2((LinearLayout) viewInflate, materialButtonJ, materialButtonJ2, (byte) 0);
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.jbl
    public final String y() {
        return "AuthCardsSettings";
    }
}
