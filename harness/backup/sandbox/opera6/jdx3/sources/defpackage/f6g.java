package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.Fragment;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f6g extends h53 implements o37 {
    public static final /* synthetic */ xtb[] z = {new d6h(f6g.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentPasswordsSettingsBinding;", 0)};
    public final z77 t;
    public final orm u;
    public final ua7 v;
    public final ktl w;
    public final zyk x;
    public final bjf y;

    public f6g(gjm gjmVar, z77 z77Var, ysj ysjVar, orm ormVar) {
        super(2132021453, 0, 14);
        this.t = z77Var;
        this.u = ormVar;
        this.v = new ua7((Fragment) this, gjmVar);
        this.w = F0(new odf((byte) 13));
        this.x = z4c.b(new yse(this, (byte) 4));
        this.y = new bjf(ysjVar, z77Var, ormVar, new e6g(0, this, f6g.class, "createDocumentURI", "createDocumentURI()V", 0, (byte) 0), (byte) 1);
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return J0();
    }

    public final void H0() {
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.setType("text/comma-separated-values");
        intent.putExtra("android.intent.extra.TITLE", "passwords.csv");
        intent.addCategory("android.intent.category.OPENABLE");
        ((hjf) oi.d(requireContext())).D(intent, new qj2(this, (byte) 10));
    }

    public final im9 I0() {
        xtb xtbVar = z[0];
        a5n a5nVar = this.w.b;
        Objects.requireNonNull(a5nVar);
        return (im9) a5nVar;
    }

    public final m6g J0() {
        return (m6g) this.x.getValue();
    }

    @Override // defpackage.ltl
    public final void onResume() {
        super.onResume();
        m6g m6gVarJ0 = J0();
        if (m6gVarJ0.n) {
            m6gVarJ0.n = false;
            m6gVarJ0.g();
        }
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final byte b = 3;
        I0().j.setOnClickListener(new View.OnClickListener(this) { // from class: c6g
            public final /* synthetic */ f6g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                ijm ijmVar = ijm.b;
                f6g f6gVar = this.b;
                switch (b2) {
                    case 0:
                        m6g m6gVarJ0 = f6gVar.J0();
                        ot2 ot2Var = m6gVarJ0.d;
                        o5f o5fVar = new o5f(m6gVarJ0, (byte) 24);
                        ot2Var.getClass();
                        lqh lqhVar = new lqh();
                        rxh rxhVar = new rxh(2132021123);
                        mt2 mt2Var = new mt2(lqhVar, (byte) 0);
                        mt2 mt2Var2 = new mt2(lqhVar, (byte) 1);
                        qp2 qp2Var = new qp2((byte) 3);
                        xj xjVar = new xj(o5fVar, lqhVar, (byte) 15);
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = null;
                        gkjVar.b = null;
                        gkjVar.c = null;
                        gkjVar.d = null;
                        gkjVar.e = null;
                        gkjVar.f = xjVar;
                        gkjVar.g = qp2Var;
                        gkjVar.h = mt2Var;
                        gkjVar.i = mt2Var2;
                        gkjVar.j = null;
                        gkjVar.k = 2132018535;
                        gkjVar.l = 2132018111;
                        gkjVar.m = 2132020310;
                        gkjVar.n = true;
                        gkjVar.o = rxhVar;
                        z77 z77Var = (z77) ot2Var.a.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
                        z77Var.getClass();
                        z77Var.b(gkjVar, ijmVar);
                        break;
                    case 1:
                        boolean zG = sj2.g(f6gVar.requireContext());
                        z77 z77Var2 = f6gVar.t;
                        if (!zG) {
                            wen wenVar = new wen();
                            z77Var2.getClass();
                            z77Var2.b(wenVar, ijmVar);
                            break;
                        } else {
                            wen wenVar2 = new wen(new b6g(f6gVar, (byte) 2), (byte) 3);
                            z77Var2.getClass();
                            z77Var2.b(wenVar2, ijmVar);
                            break;
                        }
                    case 2:
                        m6g m6gVarJ02 = f6gVar.J0();
                        b6g b6gVar = new b6g(f6gVar, (byte) 1);
                        jvg jvgVar = m6gVarJ02.m;
                        ((gjm) jvgVar.b).c(new d3b(), (atl) jvgVar.c, new iwa(new o5f(b6gVar, (byte) 25), (byte) 16));
                        ((x5f) f6gVar.u).l0(gm0.b);
                        break;
                    case 3:
                        m6g m6gVarJ03 = f6gVar.J0();
                        ot2 ot2Var2 = m6gVarJ03.d;
                        l6g l6gVar = new l6g(m6gVarJ03, (byte) 1);
                        z77 z77Var3 = ((qim) ot2Var2.c.get()).c;
                        nt2 nt2Var = new nt2(l6gVar, new uii());
                        z77Var3.getClass();
                        z77Var3.b(nt2Var, ijmVar);
                        break;
                    case 4:
                        m6g m6gVarJ04 = f6gVar.J0();
                        ot2 ot2Var3 = m6gVarJ04.d;
                        pyc pycVar = new pyc(new qyc((SettingsManager) ot2Var3.k.b.get(), new t02(new l6g(m6gVarJ04, (byte) 2), (byte) 15)));
                        z77 z77Var4 = ((qim) ot2Var3.c.get()).c;
                        z77Var4.getClass();
                        z77Var4.b(pycVar, ijmVar);
                        break;
                    case 5:
                        m6g m6gVarJ05 = f6gVar.J0();
                        hxk hxkVar = m6gVarJ05.e;
                        h6g h6gVar = (h6g) m6gVarJ05.f.i.g();
                        if (h6gVar != null && h6gVar.e.a) {
                            ((kxk) hxkVar).a(2131364356);
                            break;
                        } else {
                            ((kxk) hxkVar).a(2131364640, 2131364356);
                            break;
                        }
                        break;
                    case 6:
                        f6gVar.J0().d.b.e(new ih3(), false);
                        break;
                    default:
                        m6g m6gVarJ06 = f6gVar.J0();
                        m6gVarJ06.n = true;
                        Context context = m6gVarJ06.k.a;
                        Intent intentB = mdb.b(context);
                        intentB.setAction("com.opera.android.action.PASSWORD_MANAGER");
                        Drawable drawableF = sgb.F(2131232537, context);
                        int iA = fan.a(108.0f, context.getResources());
                        Bitmap bitmapU = z5i.u(iA, iA, Bitmap.Config.ARGB_8888);
                        bitmapU.eraseColor(-1);
                        drawableF.setBounds(0, 0, iA, iA);
                        drawableF.draw(new Canvas(bitmapU));
                        IconCompat iconCompat = new IconCompat(5);
                        iconCompat.b = bitmapU;
                        m5h.y(context, "OFA_SHORTCUT_PASSWORDS", context.getResources().getString(2132020339), iconCompat, intentB);
                        break;
                }
            }
        });
        final byte b2 = 0;
        I0().d.u = new vlf(this) { // from class: d6g
            public final /* synthetic */ f6g b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z2) {
                byte b3 = b2;
                f6g f6gVar = this.b;
                switch (b3) {
                    case 0:
                        f6gVar.J0().g.getClass();
                        N.MivZ5HZZ(z2);
                        break;
                    default:
                        m6g m6gVarJ0 = f6gVar.J0();
                        if (!z2) {
                            yu2 yu2Var = m6gVarJ0.i;
                            yu2Var.b();
                            if (yu2Var.a()) {
                                try {
                                    AutofillManager autofillManager = (AutofillManager) yu2Var.a.b;
                                    if (autofillManager != null) {
                                        autofillManager.disableAutofillServices();
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            m6gVarJ0.g();
                            break;
                        } else {
                            m6gVarJ0.d.f(new l6g(m6gVarJ0, (byte) 0));
                            break;
                        }
                }
            }
        };
        final byte b3 = 1;
        I0().c.u = new vlf(this) { // from class: d6g
            public final /* synthetic */ f6g b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z2) {
                byte b32 = b3;
                f6g f6gVar = this.b;
                switch (b32) {
                    case 0:
                        f6gVar.J0().g.getClass();
                        N.MivZ5HZZ(z2);
                        break;
                    default:
                        m6g m6gVarJ0 = f6gVar.J0();
                        if (!z2) {
                            yu2 yu2Var = m6gVarJ0.i;
                            yu2Var.b();
                            if (yu2Var.a()) {
                                try {
                                    AutofillManager autofillManager = (AutofillManager) yu2Var.a.b;
                                    if (autofillManager != null) {
                                        autofillManager.disableAutofillServices();
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            m6gVarJ0.g();
                            break;
                        } else {
                            m6gVarJ0.d.f(new l6g(m6gVarJ0, (byte) 0));
                            break;
                        }
                }
            }
        };
        final byte b4 = 4;
        I0().h.setOnClickListener(new View.OnClickListener(this) { // from class: c6g
            public final /* synthetic */ f6g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b4;
                ijm ijmVar = ijm.b;
                f6g f6gVar = this.b;
                switch (b22) {
                    case 0:
                        m6g m6gVarJ0 = f6gVar.J0();
                        ot2 ot2Var = m6gVarJ0.d;
                        o5f o5fVar = new o5f(m6gVarJ0, (byte) 24);
                        ot2Var.getClass();
                        lqh lqhVar = new lqh();
                        rxh rxhVar = new rxh(2132021123);
                        mt2 mt2Var = new mt2(lqhVar, (byte) 0);
                        mt2 mt2Var2 = new mt2(lqhVar, (byte) 1);
                        qp2 qp2Var = new qp2((byte) 3);
                        xj xjVar = new xj(o5fVar, lqhVar, (byte) 15);
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = null;
                        gkjVar.b = null;
                        gkjVar.c = null;
                        gkjVar.d = null;
                        gkjVar.e = null;
                        gkjVar.f = xjVar;
                        gkjVar.g = qp2Var;
                        gkjVar.h = mt2Var;
                        gkjVar.i = mt2Var2;
                        gkjVar.j = null;
                        gkjVar.k = 2132018535;
                        gkjVar.l = 2132018111;
                        gkjVar.m = 2132020310;
                        gkjVar.n = true;
                        gkjVar.o = rxhVar;
                        z77 z77Var = (z77) ot2Var.a.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
                        z77Var.getClass();
                        z77Var.b(gkjVar, ijmVar);
                        break;
                    case 1:
                        boolean zG = sj2.g(f6gVar.requireContext());
                        z77 z77Var2 = f6gVar.t;
                        if (!zG) {
                            wen wenVar = new wen();
                            z77Var2.getClass();
                            z77Var2.b(wenVar, ijmVar);
                            break;
                        } else {
                            wen wenVar2 = new wen(new b6g(f6gVar, (byte) 2), (byte) 3);
                            z77Var2.getClass();
                            z77Var2.b(wenVar2, ijmVar);
                            break;
                        }
                    case 2:
                        m6g m6gVarJ02 = f6gVar.J0();
                        b6g b6gVar = new b6g(f6gVar, (byte) 1);
                        jvg jvgVar = m6gVarJ02.m;
                        ((gjm) jvgVar.b).c(new d3b(), (atl) jvgVar.c, new iwa(new o5f(b6gVar, (byte) 25), (byte) 16));
                        ((x5f) f6gVar.u).l0(gm0.b);
                        break;
                    case 3:
                        m6g m6gVarJ03 = f6gVar.J0();
                        ot2 ot2Var2 = m6gVarJ03.d;
                        l6g l6gVar = new l6g(m6gVarJ03, (byte) 1);
                        z77 z77Var3 = ((qim) ot2Var2.c.get()).c;
                        nt2 nt2Var = new nt2(l6gVar, new uii());
                        z77Var3.getClass();
                        z77Var3.b(nt2Var, ijmVar);
                        break;
                    case 4:
                        m6g m6gVarJ04 = f6gVar.J0();
                        ot2 ot2Var3 = m6gVarJ04.d;
                        pyc pycVar = new pyc(new qyc((SettingsManager) ot2Var3.k.b.get(), new t02(new l6g(m6gVarJ04, (byte) 2), (byte) 15)));
                        z77 z77Var4 = ((qim) ot2Var3.c.get()).c;
                        z77Var4.getClass();
                        z77Var4.b(pycVar, ijmVar);
                        break;
                    case 5:
                        m6g m6gVarJ05 = f6gVar.J0();
                        hxk hxkVar = m6gVarJ05.e;
                        h6g h6gVar = (h6g) m6gVarJ05.f.i.g();
                        if (h6gVar != null && h6gVar.e.a) {
                            ((kxk) hxkVar).a(2131364356);
                            break;
                        } else {
                            ((kxk) hxkVar).a(2131364640, 2131364356);
                            break;
                        }
                        break;
                    case 6:
                        f6gVar.J0().d.b.e(new ih3(), false);
                        break;
                    default:
                        m6g m6gVarJ06 = f6gVar.J0();
                        m6gVarJ06.n = true;
                        Context context = m6gVarJ06.k.a;
                        Intent intentB = mdb.b(context);
                        intentB.setAction("com.opera.android.action.PASSWORD_MANAGER");
                        Drawable drawableF = sgb.F(2131232537, context);
                        int iA = fan.a(108.0f, context.getResources());
                        Bitmap bitmapU = z5i.u(iA, iA, Bitmap.Config.ARGB_8888);
                        bitmapU.eraseColor(-1);
                        drawableF.setBounds(0, 0, iA, iA);
                        drawableF.draw(new Canvas(bitmapU));
                        IconCompat iconCompat = new IconCompat(5);
                        iconCompat.b = bitmapU;
                        m5h.y(context, "OFA_SHORTCUT_PASSWORDS", context.getResources().getString(2132020339), iconCompat, intentB);
                        break;
                }
            }
        });
        final byte b5 = 5;
        I0().k.setOnClickListener(new View.OnClickListener(this) { // from class: c6g
            public final /* synthetic */ f6g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b5;
                ijm ijmVar = ijm.b;
                f6g f6gVar = this.b;
                switch (b22) {
                    case 0:
                        m6g m6gVarJ0 = f6gVar.J0();
                        ot2 ot2Var = m6gVarJ0.d;
                        o5f o5fVar = new o5f(m6gVarJ0, (byte) 24);
                        ot2Var.getClass();
                        lqh lqhVar = new lqh();
                        rxh rxhVar = new rxh(2132021123);
                        mt2 mt2Var = new mt2(lqhVar, (byte) 0);
                        mt2 mt2Var2 = new mt2(lqhVar, (byte) 1);
                        qp2 qp2Var = new qp2((byte) 3);
                        xj xjVar = new xj(o5fVar, lqhVar, (byte) 15);
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = null;
                        gkjVar.b = null;
                        gkjVar.c = null;
                        gkjVar.d = null;
                        gkjVar.e = null;
                        gkjVar.f = xjVar;
                        gkjVar.g = qp2Var;
                        gkjVar.h = mt2Var;
                        gkjVar.i = mt2Var2;
                        gkjVar.j = null;
                        gkjVar.k = 2132018535;
                        gkjVar.l = 2132018111;
                        gkjVar.m = 2132020310;
                        gkjVar.n = true;
                        gkjVar.o = rxhVar;
                        z77 z77Var = (z77) ot2Var.a.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
                        z77Var.getClass();
                        z77Var.b(gkjVar, ijmVar);
                        break;
                    case 1:
                        boolean zG = sj2.g(f6gVar.requireContext());
                        z77 z77Var2 = f6gVar.t;
                        if (!zG) {
                            wen wenVar = new wen();
                            z77Var2.getClass();
                            z77Var2.b(wenVar, ijmVar);
                            break;
                        } else {
                            wen wenVar2 = new wen(new b6g(f6gVar, (byte) 2), (byte) 3);
                            z77Var2.getClass();
                            z77Var2.b(wenVar2, ijmVar);
                            break;
                        }
                    case 2:
                        m6g m6gVarJ02 = f6gVar.J0();
                        b6g b6gVar = new b6g(f6gVar, (byte) 1);
                        jvg jvgVar = m6gVarJ02.m;
                        ((gjm) jvgVar.b).c(new d3b(), (atl) jvgVar.c, new iwa(new o5f(b6gVar, (byte) 25), (byte) 16));
                        ((x5f) f6gVar.u).l0(gm0.b);
                        break;
                    case 3:
                        m6g m6gVarJ03 = f6gVar.J0();
                        ot2 ot2Var2 = m6gVarJ03.d;
                        l6g l6gVar = new l6g(m6gVarJ03, (byte) 1);
                        z77 z77Var3 = ((qim) ot2Var2.c.get()).c;
                        nt2 nt2Var = new nt2(l6gVar, new uii());
                        z77Var3.getClass();
                        z77Var3.b(nt2Var, ijmVar);
                        break;
                    case 4:
                        m6g m6gVarJ04 = f6gVar.J0();
                        ot2 ot2Var3 = m6gVarJ04.d;
                        pyc pycVar = new pyc(new qyc((SettingsManager) ot2Var3.k.b.get(), new t02(new l6g(m6gVarJ04, (byte) 2), (byte) 15)));
                        z77 z77Var4 = ((qim) ot2Var3.c.get()).c;
                        z77Var4.getClass();
                        z77Var4.b(pycVar, ijmVar);
                        break;
                    case 5:
                        m6g m6gVarJ05 = f6gVar.J0();
                        hxk hxkVar = m6gVarJ05.e;
                        h6g h6gVar = (h6g) m6gVarJ05.f.i.g();
                        if (h6gVar != null && h6gVar.e.a) {
                            ((kxk) hxkVar).a(2131364356);
                            break;
                        } else {
                            ((kxk) hxkVar).a(2131364640, 2131364356);
                            break;
                        }
                        break;
                    case 6:
                        f6gVar.J0().d.b.e(new ih3(), false);
                        break;
                    default:
                        m6g m6gVarJ06 = f6gVar.J0();
                        m6gVarJ06.n = true;
                        Context context = m6gVarJ06.k.a;
                        Intent intentB = mdb.b(context);
                        intentB.setAction("com.opera.android.action.PASSWORD_MANAGER");
                        Drawable drawableF = sgb.F(2131232537, context);
                        int iA = fan.a(108.0f, context.getResources());
                        Bitmap bitmapU = z5i.u(iA, iA, Bitmap.Config.ARGB_8888);
                        bitmapU.eraseColor(-1);
                        drawableF.setBounds(0, 0, iA, iA);
                        drawableF.draw(new Canvas(bitmapU));
                        IconCompat iconCompat = new IconCompat(5);
                        iconCompat.b = bitmapU;
                        m5h.y(context, "OFA_SHORTCUT_PASSWORDS", context.getResources().getString(2132020339), iconCompat, intentB);
                        break;
                }
            }
        });
        final byte b6 = 6;
        I0().i.setOnClickListener(new View.OnClickListener(this) { // from class: c6g
            public final /* synthetic */ f6g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b6;
                ijm ijmVar = ijm.b;
                f6g f6gVar = this.b;
                switch (b22) {
                    case 0:
                        m6g m6gVarJ0 = f6gVar.J0();
                        ot2 ot2Var = m6gVarJ0.d;
                        o5f o5fVar = new o5f(m6gVarJ0, (byte) 24);
                        ot2Var.getClass();
                        lqh lqhVar = new lqh();
                        rxh rxhVar = new rxh(2132021123);
                        mt2 mt2Var = new mt2(lqhVar, (byte) 0);
                        mt2 mt2Var2 = new mt2(lqhVar, (byte) 1);
                        qp2 qp2Var = new qp2((byte) 3);
                        xj xjVar = new xj(o5fVar, lqhVar, (byte) 15);
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = null;
                        gkjVar.b = null;
                        gkjVar.c = null;
                        gkjVar.d = null;
                        gkjVar.e = null;
                        gkjVar.f = xjVar;
                        gkjVar.g = qp2Var;
                        gkjVar.h = mt2Var;
                        gkjVar.i = mt2Var2;
                        gkjVar.j = null;
                        gkjVar.k = 2132018535;
                        gkjVar.l = 2132018111;
                        gkjVar.m = 2132020310;
                        gkjVar.n = true;
                        gkjVar.o = rxhVar;
                        z77 z77Var = (z77) ot2Var.a.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
                        z77Var.getClass();
                        z77Var.b(gkjVar, ijmVar);
                        break;
                    case 1:
                        boolean zG = sj2.g(f6gVar.requireContext());
                        z77 z77Var2 = f6gVar.t;
                        if (!zG) {
                            wen wenVar = new wen();
                            z77Var2.getClass();
                            z77Var2.b(wenVar, ijmVar);
                            break;
                        } else {
                            wen wenVar2 = new wen(new b6g(f6gVar, (byte) 2), (byte) 3);
                            z77Var2.getClass();
                            z77Var2.b(wenVar2, ijmVar);
                            break;
                        }
                    case 2:
                        m6g m6gVarJ02 = f6gVar.J0();
                        b6g b6gVar = new b6g(f6gVar, (byte) 1);
                        jvg jvgVar = m6gVarJ02.m;
                        ((gjm) jvgVar.b).c(new d3b(), (atl) jvgVar.c, new iwa(new o5f(b6gVar, (byte) 25), (byte) 16));
                        ((x5f) f6gVar.u).l0(gm0.b);
                        break;
                    case 3:
                        m6g m6gVarJ03 = f6gVar.J0();
                        ot2 ot2Var2 = m6gVarJ03.d;
                        l6g l6gVar = new l6g(m6gVarJ03, (byte) 1);
                        z77 z77Var3 = ((qim) ot2Var2.c.get()).c;
                        nt2 nt2Var = new nt2(l6gVar, new uii());
                        z77Var3.getClass();
                        z77Var3.b(nt2Var, ijmVar);
                        break;
                    case 4:
                        m6g m6gVarJ04 = f6gVar.J0();
                        ot2 ot2Var3 = m6gVarJ04.d;
                        pyc pycVar = new pyc(new qyc((SettingsManager) ot2Var3.k.b.get(), new t02(new l6g(m6gVarJ04, (byte) 2), (byte) 15)));
                        z77 z77Var4 = ((qim) ot2Var3.c.get()).c;
                        z77Var4.getClass();
                        z77Var4.b(pycVar, ijmVar);
                        break;
                    case 5:
                        m6g m6gVarJ05 = f6gVar.J0();
                        hxk hxkVar = m6gVarJ05.e;
                        h6g h6gVar = (h6g) m6gVarJ05.f.i.g();
                        if (h6gVar != null && h6gVar.e.a) {
                            ((kxk) hxkVar).a(2131364356);
                            break;
                        } else {
                            ((kxk) hxkVar).a(2131364640, 2131364356);
                            break;
                        }
                        break;
                    case 6:
                        f6gVar.J0().d.b.e(new ih3(), false);
                        break;
                    default:
                        m6g m6gVarJ06 = f6gVar.J0();
                        m6gVarJ06.n = true;
                        Context context = m6gVarJ06.k.a;
                        Intent intentB = mdb.b(context);
                        intentB.setAction("com.opera.android.action.PASSWORD_MANAGER");
                        Drawable drawableF = sgb.F(2131232537, context);
                        int iA = fan.a(108.0f, context.getResources());
                        Bitmap bitmapU = z5i.u(iA, iA, Bitmap.Config.ARGB_8888);
                        bitmapU.eraseColor(-1);
                        drawableF.setBounds(0, 0, iA, iA);
                        drawableF.draw(new Canvas(bitmapU));
                        IconCompat iconCompat = new IconCompat(5);
                        iconCompat.b = bitmapU;
                        m5h.y(context, "OFA_SHORTCUT_PASSWORDS", context.getResources().getString(2132020339), iconCompat, intentB);
                        break;
                }
            }
        });
        final byte b7 = 7;
        I0().b.setOnClickListener(new View.OnClickListener(this) { // from class: c6g
            public final /* synthetic */ f6g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b7;
                ijm ijmVar = ijm.b;
                f6g f6gVar = this.b;
                switch (b22) {
                    case 0:
                        m6g m6gVarJ0 = f6gVar.J0();
                        ot2 ot2Var = m6gVarJ0.d;
                        o5f o5fVar = new o5f(m6gVarJ0, (byte) 24);
                        ot2Var.getClass();
                        lqh lqhVar = new lqh();
                        rxh rxhVar = new rxh(2132021123);
                        mt2 mt2Var = new mt2(lqhVar, (byte) 0);
                        mt2 mt2Var2 = new mt2(lqhVar, (byte) 1);
                        qp2 qp2Var = new qp2((byte) 3);
                        xj xjVar = new xj(o5fVar, lqhVar, (byte) 15);
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = null;
                        gkjVar.b = null;
                        gkjVar.c = null;
                        gkjVar.d = null;
                        gkjVar.e = null;
                        gkjVar.f = xjVar;
                        gkjVar.g = qp2Var;
                        gkjVar.h = mt2Var;
                        gkjVar.i = mt2Var2;
                        gkjVar.j = null;
                        gkjVar.k = 2132018535;
                        gkjVar.l = 2132018111;
                        gkjVar.m = 2132020310;
                        gkjVar.n = true;
                        gkjVar.o = rxhVar;
                        z77 z77Var = (z77) ot2Var.a.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
                        z77Var.getClass();
                        z77Var.b(gkjVar, ijmVar);
                        break;
                    case 1:
                        boolean zG = sj2.g(f6gVar.requireContext());
                        z77 z77Var2 = f6gVar.t;
                        if (!zG) {
                            wen wenVar = new wen();
                            z77Var2.getClass();
                            z77Var2.b(wenVar, ijmVar);
                            break;
                        } else {
                            wen wenVar2 = new wen(new b6g(f6gVar, (byte) 2), (byte) 3);
                            z77Var2.getClass();
                            z77Var2.b(wenVar2, ijmVar);
                            break;
                        }
                    case 2:
                        m6g m6gVarJ02 = f6gVar.J0();
                        b6g b6gVar = new b6g(f6gVar, (byte) 1);
                        jvg jvgVar = m6gVarJ02.m;
                        ((gjm) jvgVar.b).c(new d3b(), (atl) jvgVar.c, new iwa(new o5f(b6gVar, (byte) 25), (byte) 16));
                        ((x5f) f6gVar.u).l0(gm0.b);
                        break;
                    case 3:
                        m6g m6gVarJ03 = f6gVar.J0();
                        ot2 ot2Var2 = m6gVarJ03.d;
                        l6g l6gVar = new l6g(m6gVarJ03, (byte) 1);
                        z77 z77Var3 = ((qim) ot2Var2.c.get()).c;
                        nt2 nt2Var = new nt2(l6gVar, new uii());
                        z77Var3.getClass();
                        z77Var3.b(nt2Var, ijmVar);
                        break;
                    case 4:
                        m6g m6gVarJ04 = f6gVar.J0();
                        ot2 ot2Var3 = m6gVarJ04.d;
                        pyc pycVar = new pyc(new qyc((SettingsManager) ot2Var3.k.b.get(), new t02(new l6g(m6gVarJ04, (byte) 2), (byte) 15)));
                        z77 z77Var4 = ((qim) ot2Var3.c.get()).c;
                        z77Var4.getClass();
                        z77Var4.b(pycVar, ijmVar);
                        break;
                    case 5:
                        m6g m6gVarJ05 = f6gVar.J0();
                        hxk hxkVar = m6gVarJ05.e;
                        h6g h6gVar = (h6g) m6gVarJ05.f.i.g();
                        if (h6gVar != null && h6gVar.e.a) {
                            ((kxk) hxkVar).a(2131364356);
                            break;
                        } else {
                            ((kxk) hxkVar).a(2131364640, 2131364356);
                            break;
                        }
                        break;
                    case 6:
                        f6gVar.J0().d.b.e(new ih3(), false);
                        break;
                    default:
                        m6g m6gVarJ06 = f6gVar.J0();
                        m6gVarJ06.n = true;
                        Context context = m6gVarJ06.k.a;
                        Intent intentB = mdb.b(context);
                        intentB.setAction("com.opera.android.action.PASSWORD_MANAGER");
                        Drawable drawableF = sgb.F(2131232537, context);
                        int iA = fan.a(108.0f, context.getResources());
                        Bitmap bitmapU = z5i.u(iA, iA, Bitmap.Config.ARGB_8888);
                        bitmapU.eraseColor(-1);
                        drawableF.setBounds(0, 0, iA, iA);
                        drawableF.draw(new Canvas(bitmapU));
                        IconCompat iconCompat = new IconCompat(5);
                        iconCompat.b = bitmapU;
                        m5h.y(context, "OFA_SHORTCUT_PASSWORDS", context.getResources().getString(2132020339), iconCompat, intentB);
                        break;
                }
            }
        });
        I0().e.setOnClickListener(new View.OnClickListener(this) { // from class: c6g
            public final /* synthetic */ f6g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                ijm ijmVar = ijm.b;
                f6g f6gVar = this.b;
                switch (b22) {
                    case 0:
                        m6g m6gVarJ0 = f6gVar.J0();
                        ot2 ot2Var = m6gVarJ0.d;
                        o5f o5fVar = new o5f(m6gVarJ0, (byte) 24);
                        ot2Var.getClass();
                        lqh lqhVar = new lqh();
                        rxh rxhVar = new rxh(2132021123);
                        mt2 mt2Var = new mt2(lqhVar, (byte) 0);
                        mt2 mt2Var2 = new mt2(lqhVar, (byte) 1);
                        qp2 qp2Var = new qp2((byte) 3);
                        xj xjVar = new xj(o5fVar, lqhVar, (byte) 15);
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = null;
                        gkjVar.b = null;
                        gkjVar.c = null;
                        gkjVar.d = null;
                        gkjVar.e = null;
                        gkjVar.f = xjVar;
                        gkjVar.g = qp2Var;
                        gkjVar.h = mt2Var;
                        gkjVar.i = mt2Var2;
                        gkjVar.j = null;
                        gkjVar.k = 2132018535;
                        gkjVar.l = 2132018111;
                        gkjVar.m = 2132020310;
                        gkjVar.n = true;
                        gkjVar.o = rxhVar;
                        z77 z77Var = (z77) ot2Var.a.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
                        z77Var.getClass();
                        z77Var.b(gkjVar, ijmVar);
                        break;
                    case 1:
                        boolean zG = sj2.g(f6gVar.requireContext());
                        z77 z77Var2 = f6gVar.t;
                        if (!zG) {
                            wen wenVar = new wen();
                            z77Var2.getClass();
                            z77Var2.b(wenVar, ijmVar);
                            break;
                        } else {
                            wen wenVar2 = new wen(new b6g(f6gVar, (byte) 2), (byte) 3);
                            z77Var2.getClass();
                            z77Var2.b(wenVar2, ijmVar);
                            break;
                        }
                    case 2:
                        m6g m6gVarJ02 = f6gVar.J0();
                        b6g b6gVar = new b6g(f6gVar, (byte) 1);
                        jvg jvgVar = m6gVarJ02.m;
                        ((gjm) jvgVar.b).c(new d3b(), (atl) jvgVar.c, new iwa(new o5f(b6gVar, (byte) 25), (byte) 16));
                        ((x5f) f6gVar.u).l0(gm0.b);
                        break;
                    case 3:
                        m6g m6gVarJ03 = f6gVar.J0();
                        ot2 ot2Var2 = m6gVarJ03.d;
                        l6g l6gVar = new l6g(m6gVarJ03, (byte) 1);
                        z77 z77Var3 = ((qim) ot2Var2.c.get()).c;
                        nt2 nt2Var = new nt2(l6gVar, new uii());
                        z77Var3.getClass();
                        z77Var3.b(nt2Var, ijmVar);
                        break;
                    case 4:
                        m6g m6gVarJ04 = f6gVar.J0();
                        ot2 ot2Var3 = m6gVarJ04.d;
                        pyc pycVar = new pyc(new qyc((SettingsManager) ot2Var3.k.b.get(), new t02(new l6g(m6gVarJ04, (byte) 2), (byte) 15)));
                        z77 z77Var4 = ((qim) ot2Var3.c.get()).c;
                        z77Var4.getClass();
                        z77Var4.b(pycVar, ijmVar);
                        break;
                    case 5:
                        m6g m6gVarJ05 = f6gVar.J0();
                        hxk hxkVar = m6gVarJ05.e;
                        h6g h6gVar = (h6g) m6gVarJ05.f.i.g();
                        if (h6gVar != null && h6gVar.e.a) {
                            ((kxk) hxkVar).a(2131364356);
                            break;
                        } else {
                            ((kxk) hxkVar).a(2131364640, 2131364356);
                            break;
                        }
                        break;
                    case 6:
                        f6gVar.J0().d.b.e(new ih3(), false);
                        break;
                    default:
                        m6g m6gVarJ06 = f6gVar.J0();
                        m6gVarJ06.n = true;
                        Context context = m6gVarJ06.k.a;
                        Intent intentB = mdb.b(context);
                        intentB.setAction("com.opera.android.action.PASSWORD_MANAGER");
                        Drawable drawableF = sgb.F(2131232537, context);
                        int iA = fan.a(108.0f, context.getResources());
                        Bitmap bitmapU = z5i.u(iA, iA, Bitmap.Config.ARGB_8888);
                        bitmapU.eraseColor(-1);
                        drawableF.setBounds(0, 0, iA, iA);
                        drawableF.draw(new Canvas(bitmapU));
                        IconCompat iconCompat = new IconCompat(5);
                        iconCompat.b = bitmapU;
                        m5h.y(context, "OFA_SHORTCUT_PASSWORDS", context.getResources().getString(2132020339), iconCompat, intentB);
                        break;
                }
            }
        });
        I0().f.setOnClickListener(new View.OnClickListener(this) { // from class: c6g
            public final /* synthetic */ f6g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b3;
                ijm ijmVar = ijm.b;
                f6g f6gVar = this.b;
                switch (b22) {
                    case 0:
                        m6g m6gVarJ0 = f6gVar.J0();
                        ot2 ot2Var = m6gVarJ0.d;
                        o5f o5fVar = new o5f(m6gVarJ0, (byte) 24);
                        ot2Var.getClass();
                        lqh lqhVar = new lqh();
                        rxh rxhVar = new rxh(2132021123);
                        mt2 mt2Var = new mt2(lqhVar, (byte) 0);
                        mt2 mt2Var2 = new mt2(lqhVar, (byte) 1);
                        qp2 qp2Var = new qp2((byte) 3);
                        xj xjVar = new xj(o5fVar, lqhVar, (byte) 15);
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = null;
                        gkjVar.b = null;
                        gkjVar.c = null;
                        gkjVar.d = null;
                        gkjVar.e = null;
                        gkjVar.f = xjVar;
                        gkjVar.g = qp2Var;
                        gkjVar.h = mt2Var;
                        gkjVar.i = mt2Var2;
                        gkjVar.j = null;
                        gkjVar.k = 2132018535;
                        gkjVar.l = 2132018111;
                        gkjVar.m = 2132020310;
                        gkjVar.n = true;
                        gkjVar.o = rxhVar;
                        z77 z77Var = (z77) ot2Var.a.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
                        z77Var.getClass();
                        z77Var.b(gkjVar, ijmVar);
                        break;
                    case 1:
                        boolean zG = sj2.g(f6gVar.requireContext());
                        z77 z77Var2 = f6gVar.t;
                        if (!zG) {
                            wen wenVar = new wen();
                            z77Var2.getClass();
                            z77Var2.b(wenVar, ijmVar);
                            break;
                        } else {
                            wen wenVar2 = new wen(new b6g(f6gVar, (byte) 2), (byte) 3);
                            z77Var2.getClass();
                            z77Var2.b(wenVar2, ijmVar);
                            break;
                        }
                    case 2:
                        m6g m6gVarJ02 = f6gVar.J0();
                        b6g b6gVar = new b6g(f6gVar, (byte) 1);
                        jvg jvgVar = m6gVarJ02.m;
                        ((gjm) jvgVar.b).c(new d3b(), (atl) jvgVar.c, new iwa(new o5f(b6gVar, (byte) 25), (byte) 16));
                        ((x5f) f6gVar.u).l0(gm0.b);
                        break;
                    case 3:
                        m6g m6gVarJ03 = f6gVar.J0();
                        ot2 ot2Var2 = m6gVarJ03.d;
                        l6g l6gVar = new l6g(m6gVarJ03, (byte) 1);
                        z77 z77Var3 = ((qim) ot2Var2.c.get()).c;
                        nt2 nt2Var = new nt2(l6gVar, new uii());
                        z77Var3.getClass();
                        z77Var3.b(nt2Var, ijmVar);
                        break;
                    case 4:
                        m6g m6gVarJ04 = f6gVar.J0();
                        ot2 ot2Var3 = m6gVarJ04.d;
                        pyc pycVar = new pyc(new qyc((SettingsManager) ot2Var3.k.b.get(), new t02(new l6g(m6gVarJ04, (byte) 2), (byte) 15)));
                        z77 z77Var4 = ((qim) ot2Var3.c.get()).c;
                        z77Var4.getClass();
                        z77Var4.b(pycVar, ijmVar);
                        break;
                    case 5:
                        m6g m6gVarJ05 = f6gVar.J0();
                        hxk hxkVar = m6gVarJ05.e;
                        h6g h6gVar = (h6g) m6gVarJ05.f.i.g();
                        if (h6gVar != null && h6gVar.e.a) {
                            ((kxk) hxkVar).a(2131364356);
                            break;
                        } else {
                            ((kxk) hxkVar).a(2131364640, 2131364356);
                            break;
                        }
                        break;
                    case 6:
                        f6gVar.J0().d.b.e(new ih3(), false);
                        break;
                    default:
                        m6g m6gVarJ06 = f6gVar.J0();
                        m6gVarJ06.n = true;
                        Context context = m6gVarJ06.k.a;
                        Intent intentB = mdb.b(context);
                        intentB.setAction("com.opera.android.action.PASSWORD_MANAGER");
                        Drawable drawableF = sgb.F(2131232537, context);
                        int iA = fan.a(108.0f, context.getResources());
                        Bitmap bitmapU = z5i.u(iA, iA, Bitmap.Config.ARGB_8888);
                        bitmapU.eraseColor(-1);
                        drawableF.setBounds(0, 0, iA, iA);
                        drawableF.draw(new Canvas(bitmapU));
                        IconCompat iconCompat = new IconCompat(5);
                        iconCompat.b = bitmapU;
                        m5h.y(context, "OFA_SHORTCUT_PASSWORDS", context.getResources().getString(2132020339), iconCompat, intentB);
                        break;
                }
            }
        });
        final byte b8 = 2;
        I0().g.setOnClickListener(new View.OnClickListener(this) { // from class: c6g
            public final /* synthetic */ f6g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b8;
                ijm ijmVar = ijm.b;
                f6g f6gVar = this.b;
                switch (b22) {
                    case 0:
                        m6g m6gVarJ0 = f6gVar.J0();
                        ot2 ot2Var = m6gVarJ0.d;
                        o5f o5fVar = new o5f(m6gVarJ0, (byte) 24);
                        ot2Var.getClass();
                        lqh lqhVar = new lqh();
                        rxh rxhVar = new rxh(2132021123);
                        mt2 mt2Var = new mt2(lqhVar, (byte) 0);
                        mt2 mt2Var2 = new mt2(lqhVar, (byte) 1);
                        qp2 qp2Var = new qp2((byte) 3);
                        xj xjVar = new xj(o5fVar, lqhVar, (byte) 15);
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = null;
                        gkjVar.b = null;
                        gkjVar.c = null;
                        gkjVar.d = null;
                        gkjVar.e = null;
                        gkjVar.f = xjVar;
                        gkjVar.g = qp2Var;
                        gkjVar.h = mt2Var;
                        gkjVar.i = mt2Var2;
                        gkjVar.j = null;
                        gkjVar.k = 2132018535;
                        gkjVar.l = 2132018111;
                        gkjVar.m = 2132020310;
                        gkjVar.n = true;
                        gkjVar.o = rxhVar;
                        z77 z77Var = (z77) ot2Var.a.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
                        z77Var.getClass();
                        z77Var.b(gkjVar, ijmVar);
                        break;
                    case 1:
                        boolean zG = sj2.g(f6gVar.requireContext());
                        z77 z77Var2 = f6gVar.t;
                        if (!zG) {
                            wen wenVar = new wen();
                            z77Var2.getClass();
                            z77Var2.b(wenVar, ijmVar);
                            break;
                        } else {
                            wen wenVar2 = new wen(new b6g(f6gVar, (byte) 2), (byte) 3);
                            z77Var2.getClass();
                            z77Var2.b(wenVar2, ijmVar);
                            break;
                        }
                    case 2:
                        m6g m6gVarJ02 = f6gVar.J0();
                        b6g b6gVar = new b6g(f6gVar, (byte) 1);
                        jvg jvgVar = m6gVarJ02.m;
                        ((gjm) jvgVar.b).c(new d3b(), (atl) jvgVar.c, new iwa(new o5f(b6gVar, (byte) 25), (byte) 16));
                        ((x5f) f6gVar.u).l0(gm0.b);
                        break;
                    case 3:
                        m6g m6gVarJ03 = f6gVar.J0();
                        ot2 ot2Var2 = m6gVarJ03.d;
                        l6g l6gVar = new l6g(m6gVarJ03, (byte) 1);
                        z77 z77Var3 = ((qim) ot2Var2.c.get()).c;
                        nt2 nt2Var = new nt2(l6gVar, new uii());
                        z77Var3.getClass();
                        z77Var3.b(nt2Var, ijmVar);
                        break;
                    case 4:
                        m6g m6gVarJ04 = f6gVar.J0();
                        ot2 ot2Var3 = m6gVarJ04.d;
                        pyc pycVar = new pyc(new qyc((SettingsManager) ot2Var3.k.b.get(), new t02(new l6g(m6gVarJ04, (byte) 2), (byte) 15)));
                        z77 z77Var4 = ((qim) ot2Var3.c.get()).c;
                        z77Var4.getClass();
                        z77Var4.b(pycVar, ijmVar);
                        break;
                    case 5:
                        m6g m6gVarJ05 = f6gVar.J0();
                        hxk hxkVar = m6gVarJ05.e;
                        h6g h6gVar = (h6g) m6gVarJ05.f.i.g();
                        if (h6gVar != null && h6gVar.e.a) {
                            ((kxk) hxkVar).a(2131364356);
                            break;
                        } else {
                            ((kxk) hxkVar).a(2131364640, 2131364356);
                            break;
                        }
                        break;
                    case 6:
                        f6gVar.J0().d.b.e(new ih3(), false);
                        break;
                    default:
                        m6g m6gVarJ06 = f6gVar.J0();
                        m6gVarJ06.n = true;
                        Context context = m6gVarJ06.k.a;
                        Intent intentB = mdb.b(context);
                        intentB.setAction("com.opera.android.action.PASSWORD_MANAGER");
                        Drawable drawableF = sgb.F(2131232537, context);
                        int iA = fan.a(108.0f, context.getResources());
                        Bitmap bitmapU = z5i.u(iA, iA, Bitmap.Config.ARGB_8888);
                        bitmapU.eraseColor(-1);
                        drawableF.setBounds(0, 0, iA, iA);
                        drawableF.draw(new Canvas(bitmapU));
                        IconCompat iconCompat = new IconCompat(5);
                        iconCompat.b = bitmapU;
                        m5h.y(context, "OFA_SHORTCUT_PASSWORDS", context.getResources().getString(2132020339), iconCompat, intentB);
                        break;
                }
            }
        });
        xf8.i0(J0().f.i, getViewLifecycleOwner(), I0().a, (List) null, new iwa(this, (byte) 15));
        if (!J0().l.a.getBoolean("no_lock_screen_password_manager_dialog", true) || sj2.g(requireContext())) {
            return;
        }
        wen wenVar = new wen(new b6g(this, (byte) 0), (byte) 6);
        z77 z77Var = this.t;
        z77Var.getClass();
        z77Var.b(wenVar, ijm.b);
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.v;
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.v0(layoutInflater, viewGroup);
        I0().c.C(new sxh(2132021339, new Object[]{getString(2132017591)}));
    }
}
