package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.w;
import com.leanplum.internal.Constants;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.Lazy;
import com.opera.android.settings.SettingsManager;
import com.opera.android.webaiassistant.WebAiAssistantLayoutSwitcher;
import com.opera.android.webaiassistant.WebAiAssistantSheetContentWrapper;
import com.opera.android.webcore.FastResizeWebViewContainer;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content_public.browser.WebContents;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class lqn extends ltl implements jbl {
    public final sw3 A;
    public final Lazy B;
    public WebAiAssistantSheetContentWrapper C;
    public WebAiAssistantLayoutSwitcher D;
    public zv0 E;
    public mlj F;
    public mrn G;
    public final kqn H;
    public p8f I;
    public WebContents J;
    public sba K;
    public View L;
    public String M;
    public boolean N;
    public boolean O;
    public final tvk P;
    public final dcl Q;
    public final ru9 r;
    public final pjn s;
    public final Lazy t;
    public final orm u;
    public final hq3 v;
    public final vsn w;
    public final wll x;
    public final qwe y;
    public final d7h z;

    /* JADX WARN: Illegal instructions before constructor call */
    public lqn(u7k u7kVar, ru9 ru9Var, pjn pjnVar, Lazy lazy, orm ormVar, hq3 hq3Var, vsn vsnVar, wll wllVar, qwe qweVar, d7h d7hVar, sw3 sw3Var, Lazy lazy2) {
        u7kVar.s(2132017424);
        itl itlVar = (itl) u7kVar.a;
        itlVar.b = 2131755013;
        itlVar.f = true;
        super(itlVar);
        this.r = ru9Var;
        this.s = pjnVar;
        this.t = lazy;
        this.u = ormVar;
        this.v = hq3Var;
        this.w = vsnVar;
        this.x = wllVar;
        this.y = qweVar;
        this.z = d7hVar;
        this.A = sw3Var;
        this.B = lazy2;
        this.H = new kqn(this);
        this.P = new tvk(this);
        this.Q = new dcl(this);
    }

    public static void I0(lqn lqnVar, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            WebAiAssistantSheetContentWrapper webAiAssistantSheetContentWrapper = lqnVar.C;
            if (webAiAssistantSheetContentWrapper == null) {
                webAiAssistantSheetContentWrapper = null;
            }
            i = webAiAssistantSheetContentWrapper.d;
        }
        if ((i2 & 2) != 0) {
            mrn mrnVar = lqnVar.G;
            if (mrnVar == null) {
                mrnVar = null;
            }
            z = mrnVar.j.hasFocus();
        }
        hq3 hq3Var = lqnVar.v;
        float f = i;
        mrn mrnVar2 = lqnVar.G;
        Resources resources = (mrnVar2 != null ? mrnVar2 : null).m.getResources();
        Rect rect = fan.a;
        xf8.F0(hq3Var.q, new r52((int) (f / resources.getDisplayMetrics().density), z));
    }

    public final void G0() {
        if (!((tsn) xf8.B(this.w.q).g()).f) {
            this.M = null;
            return;
        }
        String str = this.M;
        String str2 = (String) ((jbn) this.t.get()).a().g();
        this.M = str2;
        if (!this.N || str == null || str.equals(str2)) {
            return;
        }
        mlj mljVar = this.F;
        (mljVar != null ? mljVar : null).b(new rxh(2132017444), 5000, new rxh(2132017450), new dqn(this, (byte) 1));
    }

    public final void H0(String str) {
        this.w.d(str.length() > 0);
    }

    public final void J0(xrn xrnVar) {
        if (gqn.a[xrnVar.ordinal()] != 1) {
            h9o.p();
            return;
        }
        mlj mljVar = this.F;
        if (mljVar == null) {
            mljVar = null;
        }
        mljVar.a(new rxh(2132020435), 2500);
    }

    public final void K0() {
        mrn mrnVar = this.G;
        if (mrnVar == null) {
            mrnVar = null;
        }
        bq1 bq1Var = mrnVar.j;
        bq1Var.clearFocus();
        q9n.u(bq1Var);
        ((gjm) this.B.get()).e(new tca(sca.b), false);
        this.w.k.c(l60.b);
    }

    @Override // defpackage.k24, defpackage.l24
    public final void L() {
        super.L();
        this.N = false;
    }

    public final void L0(sba sbaVar, kz3 kz3Var) {
        sbaVar.a(kz3Var);
        sbaVar.a(new q22(this, (byte) 3));
        sbaVar.f();
        this.K = sbaVar;
    }

    public final void M0(zm9 zm9Var) {
        Toolbar toolbar = this.l;
        toolbar.setBackgroundColor(((dxh) zm9Var.c).a(toolbar.getContext()));
        AppCompatImageView appCompatImageView = this.l.d;
        Drawable drawable = appCompatImageView != null ? appCompatImageView.getDrawable() : null;
        if (drawable != null) {
            drawable.setTint(new dxh(2130969284).a(this.l.getContext()));
        }
    }

    @Override // defpackage.ryl
    public final void g0() {
        if (this.a) {
            return;
        }
        super.g0();
        ((d5o) this.w.k.g).w(u70.d);
        getLifecycle().a(new jw0(((tw3) this.s.b).b, (byte) 1));
        WebAiAssistantLayoutSwitcher webAiAssistantLayoutSwitcher = this.D;
        if (webAiAssistantLayoutSwitcher != null) {
            FastResizeWebViewContainer fastResizeWebViewContainer = (FastResizeWebViewContainer) webAiAssistantLayoutSwitcher.getChildAt(0);
            zll zllVar = fastResizeWebViewContainer.c;
            if (zllVar != null) {
                fastResizeWebViewContainer.removeView(zllVar);
            }
            fastResizeWebViewContainer.c = null;
            fastResizeWebViewContainer.b = null;
            qwe qweVar = fastResizeWebViewContainer.d;
            if (qweVar != null) {
                qweVar.b.c(fastResizeWebViewContainer.g);
            }
            fastResizeWebViewContainer.d = null;
        }
        p8f p8fVar = this.I;
        if (p8fVar != null) {
            p8fVar.j();
        }
        this.I = null;
        this.J = null;
    }

    @Override // defpackage.k24, defpackage.ryl
    public final void h0(w wVar) {
        wVar.Y(-1, 1, "WebAiAssistantFragmentBase");
    }

    @Override // defpackage.k24
    public final int k0() {
        return 2130969943;
    }

    @Override // defpackage.k24, defpackage.l24
    public final void l() {
        super.l();
        this.N = true;
        G0();
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        sba sbaVar = this.K;
        if (sbaVar != null) {
            sbaVar.b(hjm.b);
            return;
        }
        ((d5o) this.w.k.g).w(u70.c);
        vl6 vl6Var = ((mqn) this).T;
        if (vl6Var == null) {
            vl6Var = null;
        }
        vl6Var.S();
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        zv0 zv0Var;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            zv0Var = new zv0(mkh.u(arguments), null, null, false, null, null, null, false, false, null);
        } else {
            nv0 nv0VarU = mkh.u(arguments);
            String string = arguments.getString("submitted_text");
            String string2 = arguments.getString("prefilled_text");
            boolean z = arguments.getBoolean("is_restore");
            String string3 = arguments.getString("ask_aria_query");
            String string4 = arguments.getString("summarize_page_url");
            String string5 = arguments.getString("summarize_page_content");
            boolean z2 = arguments.getBoolean("force_new_chat");
            boolean z3 = arguments.getBoolean("activate_input");
            String string6 = arguments.getString("attribution");
            orb orbVar = string6 != null ? new orb(string6) : null;
            zv0Var = new zv0(nv0VarU, string, string2, z, string3, string4, string5, z2, z3, orbVar == null ? null : new fw0(orbVar.m("c", null), orbVar.m("s", null), orbVar.m("t", null)));
        }
        this.E = zv0Var;
        this.E = zv0.a(zv0Var, 1535);
        this.O = zv0Var.i;
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        WebAiAssistantLayoutSwitcher webAiAssistantLayoutSwitcher = this.D;
        if (webAiAssistantLayoutSwitcher != null) {
            FastResizeWebViewContainer fastResizeWebViewContainer = (FastResizeWebViewContainer) webAiAssistantLayoutSwitcher.getChildAt(0);
            zll zllVar = fastResizeWebViewContainer.c;
            if (zllVar != null) {
                fastResizeWebViewContainer.removeView(zllVar);
            }
            fastResizeWebViewContainer.c = null;
            fastResizeWebViewContainer.b = null;
            qwe qweVar = fastResizeWebViewContainer.d;
            if (qweVar != null) {
                qweVar.b.c(fastResizeWebViewContainer.g);
            }
            fastResizeWebViewContainer.d = null;
        }
        p8f p8fVar = this.I;
        if (p8fVar != null) {
            p8fVar.j();
        }
        this.I = null;
        this.J = null;
        WebAiAssistantSheetContentWrapper webAiAssistantSheetContentWrapper = this.C;
        (webAiAssistantSheetContentWrapper != null ? webAiAssistantSheetContentWrapper : null).H(this.H);
        if (this.a) {
            return;
        }
        ((d5o) this.w.k.g).w(u70.c);
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) throws JSONException {
        mrn mrnVar = this.G;
        if (mrnVar == null) {
            mrnVar = null;
        }
        bq1 bq1Var = mrnVar.j;
        bq1Var.clearFocus();
        q9n.u(bq1Var);
        int itemId = menuItem.getItemId();
        byte b = 1;
        vsn vsnVar = this.w;
        if (itemId == 2131362451) {
            ju4 ju4VarC = vsnVar.c();
            if (ju4VarC != null) {
                vsnVar.c.c().b(ju4VarC.a, new vrn(vsnVar, (byte) 4));
                return true;
            }
        } else {
            if (itemId != 2131364411) {
                if (itemId != 2131362509) {
                    if (itemId == 2131362303) {
                        K0();
                        return true;
                    }
                    if (itemId == 2131364453) {
                        vsnVar.k(b80.b);
                        return true;
                    }
                    if (itemId == 2131362842) {
                        FullscreenWebActivity.A0(requireContext(), "https://help.opera.com/en/browser-ai-faq/", new rxh(2132021212));
                        return true;
                    }
                    if (itemId != 2131364244) {
                        return false;
                    }
                    ((gjm) this.B.get()).e(new ic2(), false);
                    return true;
                }
                ju4 ju4VarC2 = vsnVar.c();
                if (ju4VarC2 != null) {
                    long j = ju4VarC2.a;
                    ole oleVar = vsnVar.c.c().a;
                    t40 t40Var = new t40((byte) 16);
                    oleVar.getClass();
                    vpb vpbVar = new vpb();
                    orb orbVar = new orb();
                    vpbVar.a(orbVar);
                    orbVar.o(j, "id");
                    qq8 qq8Var = (qq8) oleVar.a;
                    String strH = qq8Var.h();
                    orb orbVarJ = o18.j("jsonrpc", "2.0", "method", "actions.v1.deleteChat");
                    orbVarJ.p(vpbVar, Constants.Params.PARAMS);
                    orbVarJ.p(strH, "id");
                    qq8Var.l(orbVarJ, new f32(t40Var, b));
                }
                mlj mljVar = this.F;
                (mljVar != null ? mljVar : null).a(new rxh(2132017408), 2500);
                return true;
            }
            ju4 ju4VarC3 = vsnVar.c();
            if (ju4VarC3 != null) {
                vsnVar.c.c().b(ju4VarC3.a, new vrn(vsnVar, (byte) 3));
            }
        }
        return true;
    }

    public final void onStart() {
        super.onStart();
        WebContents webContents = this.J;
        if (webContents != null) {
            webContents.y1(2);
        }
    }

    public final void onStop() {
        super.onStop();
        WebContents webContents = this.J;
        if (webContents != null) {
            webContents.y1(0);
        }
    }

    @Override // defpackage.k24
    public void onViewCreated(View view, Bundle bundle) {
        joh dsnVar;
        String str;
        super.onViewCreated(view, bundle);
        mrn mrnVar = this.G;
        if (mrnVar == null) {
            mrnVar = null;
        }
        ndc viewLifecycleOwner = getViewLifecycleOwner();
        if (!Intrinsics.a(mrnVar.z, viewLifecycleOwner)) {
            mrnVar.z = viewLifecycleOwner;
        }
        mrn mrnVar2 = this.G;
        if (mrnVar2 == null) {
            mrnVar2 = null;
        }
        vsn vsnVar = this.w;
        boolean z = vsnVar.m;
        s62 s62Var = vsnVar.c;
        bq1 bq1Var = mrnVar2.j;
        if (z) {
            bq1Var.setImeOptions(bq1Var.getImeOptions() | 16777216);
        } else {
            bq1Var.setImeOptions(bq1Var.getImeOptions() & (-16777217));
        }
        mrn mrnVar3 = this.G;
        if (mrnVar3 == null) {
            mrnVar3 = null;
        }
        ode odeVar = s62Var.f().i;
        ndc ndcVar = mrnVar3.z;
        if (ndcVar != null) {
            xbf xbfVar = mrnVar3.u;
            if (!((vbn) xbfVar.f).i(ndcVar, odeVar)) {
                ((vbn) xbfVar.f).destroy();
                plk plkVar = new plk(xbfVar, ndcVar, odeVar);
                xbfVar.f = plkVar;
                o2g o2gVarJ = plkVar.j();
                if (o2gVarJ != ((o2g) xbfVar.c)) {
                    xbfVar.c = o2gVarJ;
                    ((ThemeableLottieAnimationView) xbfVar.b).invalidate();
                    xbfVar.E((s75) o2gVarJ.c, null);
                }
            }
        }
        final byte b = 0;
        s62Var.d().j(getViewLifecycleOwner(), new jqn(new gil((Object) new pqh(), (Object) this, (byte) 20), (byte) 0));
        xf8.B(vsnVar.q).j(getViewLifecycleOwner(), new jqn(new Function1(this) { // from class: bqn
            public final /* synthetic */ lqn b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                nrn nrnVar;
                byte b2 = b;
                lqn lqnVar = this.b;
                switch (b2) {
                    case 0:
                        tsn tsnVar = (tsn) obj;
                        lqnVar.E0();
                        vsn vsnVar2 = lqnVar.w;
                        Toolbar toolbar = lqnVar.l;
                        zm9 zm9Var = tsnVar.a;
                        lsn lsnVar = tsnVar.b;
                        lqnVar.l.D(((pxh) zm9Var.b).a(toolbar.getResources()));
                        zm9 zm9Var2 = tsnVar.a;
                        if (zm9Var2.a) {
                            toolbar.o = toolbar.getResources().getDimensionPixelSize(2131165287);
                            toolbar.requestLayout();
                            toolbar.y(sgb.F(2131231724, toolbar.getContext()));
                        } else {
                            toolbar.o = 0;
                            toolbar.requestLayout();
                            toolbar.y((Drawable) null);
                        }
                        lqnVar.M0(zm9Var2);
                        psn psnVar = (psn) zm9Var2.d;
                        aoh.f(lqnVar.l.o(), 2131363668, psnVar.b);
                        aoh.f(lqnVar.l.o(), 2131362304, psnVar.a);
                        aoh.f(lqnVar.l.o(), 2131362637, psnVar.c);
                        WebAiAssistantLayoutSwitcher webAiAssistantLayoutSwitcher = lqnVar.D;
                        if (webAiAssistantLayoutSwitcher == null) {
                            webAiAssistantLayoutSwitcher = null;
                        }
                        int iOrdinal = tsnVar.c.ordinal();
                        if (iOrdinal == 0) {
                            nrnVar = nrn.c;
                        } else if (iOrdinal == 1 || iOrdinal == 2) {
                            nrnVar = nrn.a;
                        } else if (iOrdinal == 3) {
                            nrnVar = nrn.b;
                        } else if (iOrdinal == 4) {
                            nrnVar = nrn.c;
                        } else if (iOrdinal != 5) {
                            h9o.p();
                            break;
                        } else {
                            nrnVar = nrn.d;
                        }
                        webAiAssistantLayoutSwitcher.d(nrnVar);
                        mrn mrnVar4 = lqnVar.G;
                        if (mrnVar4 == null) {
                            mrnVar4 = null;
                        }
                        mrnVar4.h(lsnVar);
                        if (lsnVar.isEnabled()) {
                            zv0 zv0Var = lqnVar.E;
                            String str2 = (zv0Var == null ? null : zv0Var).b;
                            if (zv0Var == null) {
                                zv0Var = null;
                            }
                            lqnVar.E = zv0.a(zv0Var, 2045);
                            if (str2 != null) {
                                vsnVar2.m(str2, false);
                            }
                        }
                        zv0 zv0Var2 = lqnVar.E;
                        String str3 = (zv0Var2 == null ? null : zv0Var2).c;
                        if (zv0Var2 == null) {
                            zv0Var2 = null;
                        }
                        lqnVar.E = zv0.a(zv0Var2, 2043);
                        if (str3 != null) {
                            mrn mrnVar5 = lqnVar.G;
                            if (mrnVar5 == null) {
                                mrnVar5 = null;
                            }
                            mrnVar5.i(str3);
                            lqnVar.H0(str3);
                        }
                        lqnVar.G0();
                        if (lqnVar.O && lsnVar.isEnabled()) {
                            lqnVar.O = false;
                            mrn mrnVar6 = lqnVar.G;
                            (mrnVar6 != null ? mrnVar6 : null).g();
                        }
                        break;
                    case 1:
                        xf8.G0(lqnVar.w.c.f().k, Boolean.FALSE);
                        lqnVar.G0();
                        break;
                    case 2:
                        if (!((Boolean) obj).booleanValue()) {
                            lqnVar.g0();
                        }
                        break;
                    default:
                        lqnVar.w.l.r((pg) obj);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 0));
        final byte b2 = 2;
        j14.Y(new z99(vsnVar.p, new te5(2, this, lqn.class, "handleEvent", "handleEvent(Lcom/opera/android/webaiassistant/WebAiAssistantViewModel$Event;)V", 4, (byte) 8), (byte) 2), fsp.y(getViewLifecycleOwner()));
        final byte b3 = 1;
        ((jbn) this.t.get()).a().j(getViewLifecycleOwner(), new jqn(new Function1(this) { // from class: bqn
            public final /* synthetic */ lqn b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                nrn nrnVar;
                byte b22 = b3;
                lqn lqnVar = this.b;
                switch (b22) {
                    case 0:
                        tsn tsnVar = (tsn) obj;
                        lqnVar.E0();
                        vsn vsnVar2 = lqnVar.w;
                        Toolbar toolbar = lqnVar.l;
                        zm9 zm9Var = tsnVar.a;
                        lsn lsnVar = tsnVar.b;
                        lqnVar.l.D(((pxh) zm9Var.b).a(toolbar.getResources()));
                        zm9 zm9Var2 = tsnVar.a;
                        if (zm9Var2.a) {
                            toolbar.o = toolbar.getResources().getDimensionPixelSize(2131165287);
                            toolbar.requestLayout();
                            toolbar.y(sgb.F(2131231724, toolbar.getContext()));
                        } else {
                            toolbar.o = 0;
                            toolbar.requestLayout();
                            toolbar.y((Drawable) null);
                        }
                        lqnVar.M0(zm9Var2);
                        psn psnVar = (psn) zm9Var2.d;
                        aoh.f(lqnVar.l.o(), 2131363668, psnVar.b);
                        aoh.f(lqnVar.l.o(), 2131362304, psnVar.a);
                        aoh.f(lqnVar.l.o(), 2131362637, psnVar.c);
                        WebAiAssistantLayoutSwitcher webAiAssistantLayoutSwitcher = lqnVar.D;
                        if (webAiAssistantLayoutSwitcher == null) {
                            webAiAssistantLayoutSwitcher = null;
                        }
                        int iOrdinal = tsnVar.c.ordinal();
                        if (iOrdinal == 0) {
                            nrnVar = nrn.c;
                        } else if (iOrdinal == 1 || iOrdinal == 2) {
                            nrnVar = nrn.a;
                        } else if (iOrdinal == 3) {
                            nrnVar = nrn.b;
                        } else if (iOrdinal == 4) {
                            nrnVar = nrn.c;
                        } else if (iOrdinal != 5) {
                            h9o.p();
                            break;
                        } else {
                            nrnVar = nrn.d;
                        }
                        webAiAssistantLayoutSwitcher.d(nrnVar);
                        mrn mrnVar4 = lqnVar.G;
                        if (mrnVar4 == null) {
                            mrnVar4 = null;
                        }
                        mrnVar4.h(lsnVar);
                        if (lsnVar.isEnabled()) {
                            zv0 zv0Var = lqnVar.E;
                            String str2 = (zv0Var == null ? null : zv0Var).b;
                            if (zv0Var == null) {
                                zv0Var = null;
                            }
                            lqnVar.E = zv0.a(zv0Var, 2045);
                            if (str2 != null) {
                                vsnVar2.m(str2, false);
                            }
                        }
                        zv0 zv0Var2 = lqnVar.E;
                        String str3 = (zv0Var2 == null ? null : zv0Var2).c;
                        if (zv0Var2 == null) {
                            zv0Var2 = null;
                        }
                        lqnVar.E = zv0.a(zv0Var2, 2043);
                        if (str3 != null) {
                            mrn mrnVar5 = lqnVar.G;
                            if (mrnVar5 == null) {
                                mrnVar5 = null;
                            }
                            mrnVar5.i(str3);
                            lqnVar.H0(str3);
                        }
                        lqnVar.G0();
                        if (lqnVar.O && lsnVar.isEnabled()) {
                            lqnVar.O = false;
                            mrn mrnVar6 = lqnVar.G;
                            (mrnVar6 != null ? mrnVar6 : null).g();
                        }
                        break;
                    case 1:
                        xf8.G0(lqnVar.w.c.f().k, Boolean.FALSE);
                        lqnVar.G0();
                        break;
                    case 2:
                        if (!((Boolean) obj).booleanValue()) {
                            lqnVar.g0();
                        }
                        break;
                    default:
                        lqnVar.w.l.r((pg) obj);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 0));
        if (vsnVar.m) {
            vsnVar.a.j(getViewLifecycleOwner(), new jqn(new Function1(this) { // from class: bqn
                public final /* synthetic */ lqn b;

                {
                    this.b = this;
                }

                public final Object invoke(Object obj) {
                    nrn nrnVar;
                    byte b22 = b2;
                    lqn lqnVar = this.b;
                    switch (b22) {
                        case 0:
                            tsn tsnVar = (tsn) obj;
                            lqnVar.E0();
                            vsn vsnVar2 = lqnVar.w;
                            Toolbar toolbar = lqnVar.l;
                            zm9 zm9Var = tsnVar.a;
                            lsn lsnVar = tsnVar.b;
                            lqnVar.l.D(((pxh) zm9Var.b).a(toolbar.getResources()));
                            zm9 zm9Var2 = tsnVar.a;
                            if (zm9Var2.a) {
                                toolbar.o = toolbar.getResources().getDimensionPixelSize(2131165287);
                                toolbar.requestLayout();
                                toolbar.y(sgb.F(2131231724, toolbar.getContext()));
                            } else {
                                toolbar.o = 0;
                                toolbar.requestLayout();
                                toolbar.y((Drawable) null);
                            }
                            lqnVar.M0(zm9Var2);
                            psn psnVar = (psn) zm9Var2.d;
                            aoh.f(lqnVar.l.o(), 2131363668, psnVar.b);
                            aoh.f(lqnVar.l.o(), 2131362304, psnVar.a);
                            aoh.f(lqnVar.l.o(), 2131362637, psnVar.c);
                            WebAiAssistantLayoutSwitcher webAiAssistantLayoutSwitcher = lqnVar.D;
                            if (webAiAssistantLayoutSwitcher == null) {
                                webAiAssistantLayoutSwitcher = null;
                            }
                            int iOrdinal = tsnVar.c.ordinal();
                            if (iOrdinal == 0) {
                                nrnVar = nrn.c;
                            } else if (iOrdinal == 1 || iOrdinal == 2) {
                                nrnVar = nrn.a;
                            } else if (iOrdinal == 3) {
                                nrnVar = nrn.b;
                            } else if (iOrdinal == 4) {
                                nrnVar = nrn.c;
                            } else if (iOrdinal != 5) {
                                h9o.p();
                                break;
                            } else {
                                nrnVar = nrn.d;
                            }
                            webAiAssistantLayoutSwitcher.d(nrnVar);
                            mrn mrnVar4 = lqnVar.G;
                            if (mrnVar4 == null) {
                                mrnVar4 = null;
                            }
                            mrnVar4.h(lsnVar);
                            if (lsnVar.isEnabled()) {
                                zv0 zv0Var = lqnVar.E;
                                String str2 = (zv0Var == null ? null : zv0Var).b;
                                if (zv0Var == null) {
                                    zv0Var = null;
                                }
                                lqnVar.E = zv0.a(zv0Var, 2045);
                                if (str2 != null) {
                                    vsnVar2.m(str2, false);
                                }
                            }
                            zv0 zv0Var2 = lqnVar.E;
                            String str3 = (zv0Var2 == null ? null : zv0Var2).c;
                            if (zv0Var2 == null) {
                                zv0Var2 = null;
                            }
                            lqnVar.E = zv0.a(zv0Var2, 2043);
                            if (str3 != null) {
                                mrn mrnVar5 = lqnVar.G;
                                if (mrnVar5 == null) {
                                    mrnVar5 = null;
                                }
                                mrnVar5.i(str3);
                                lqnVar.H0(str3);
                            }
                            lqnVar.G0();
                            if (lqnVar.O && lsnVar.isEnabled()) {
                                lqnVar.O = false;
                                mrn mrnVar6 = lqnVar.G;
                                (mrnVar6 != null ? mrnVar6 : null).g();
                            }
                            break;
                        case 1:
                            xf8.G0(lqnVar.w.c.f().k, Boolean.FALSE);
                            lqnVar.G0();
                            break;
                        case 2:
                            if (!((Boolean) obj).booleanValue()) {
                                lqnVar.g0();
                            }
                            break;
                        default:
                            lqnVar.w.l.r((pg) obj);
                            break;
                    }
                    return Unit.a;
                }
            }, (byte) 0));
        }
        View view2 = this.L;
        if (view2 != null) {
            view2.postOnAnimationDelayed(new y1n((Object) this, (byte) 25), 500L);
        }
        zv0 zv0Var = this.E;
        nv0 nv0Var = (zv0Var == null ? null : zv0Var).a;
        zv0 zv0Var2 = zv0Var == null ? null : zv0Var;
        String str2 = zv0Var2.e;
        if (str2 != null) {
            dsnVar = new yrn(str2);
        } else {
            String str3 = zv0Var2.f;
            dsnVar = (str3 == null || (str = zv0Var2.g) == null) ? zv0Var2.c != null ? bsn.a : zv0Var2.h ? asn.a : zrn.a : new dsn(str3, str);
        }
        vsnVar.e(nv0Var, dsnVar, (zv0Var != null ? zv0Var : null).j);
        p8f p8fVar = this.I;
        if (p8fVar != null) {
            zll zllVar = (zll) p8fVar.b;
            r8n r8nVar = new r8n(this) { // from class: cqn
                public final /* synthetic */ lqn b;

                {
                    this.b = this;
                }

                @Override // defpackage.r8n
                public final void a(View view3) {
                    byte b4 = b;
                    lqn lqnVar = this.b;
                    switch (b4) {
                        case 0:
                            eyi eyiVar = lqnVar.w.c.y;
                            xf8.G0((kze) eyiVar.d, eyiVar.b ? "ofa-private-mode" : "ofa-".concat(((SettingsManager) eyiVar.c).g().d));
                            break;
                        default:
                            lqnVar.M0(((tsn) xf8.B(lqnVar.w.q).g()).a);
                            break;
                    }
                }
            };
            l5b l5bVar = q9n.c;
            dll dllVarV = hjf.v(zllVar.getContext());
            if (dllVarV != null) {
                u8n.b(dllVarV, zllVar, r8nVar);
            }
        }
        q9n.e(this.l, new r8n(this) { // from class: cqn
            public final /* synthetic */ lqn b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view3) {
                byte b4 = b3;
                lqn lqnVar = this.b;
                switch (b4) {
                    case 0:
                        eyi eyiVar = lqnVar.w.c.y;
                        xf8.G0((kze) eyiVar.d, eyiVar.b ? "ofa-private-mode" : "ofa-".concat(((SettingsManager) eyiVar.c).g().d));
                        break;
                    default:
                        lqnVar.M0(((tsn) xf8.B(lqnVar.w.q).g()).a);
                        break;
                }
            }
        });
        final byte b4 = 3;
        ((kze) new z61(view).b).k(new jqn(new Function1(this) { // from class: bqn
            public final /* synthetic */ lqn b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                nrn nrnVar;
                byte b22 = b4;
                lqn lqnVar = this.b;
                switch (b22) {
                    case 0:
                        tsn tsnVar = (tsn) obj;
                        lqnVar.E0();
                        vsn vsnVar2 = lqnVar.w;
                        Toolbar toolbar = lqnVar.l;
                        zm9 zm9Var = tsnVar.a;
                        lsn lsnVar = tsnVar.b;
                        lqnVar.l.D(((pxh) zm9Var.b).a(toolbar.getResources()));
                        zm9 zm9Var2 = tsnVar.a;
                        if (zm9Var2.a) {
                            toolbar.o = toolbar.getResources().getDimensionPixelSize(2131165287);
                            toolbar.requestLayout();
                            toolbar.y(sgb.F(2131231724, toolbar.getContext()));
                        } else {
                            toolbar.o = 0;
                            toolbar.requestLayout();
                            toolbar.y((Drawable) null);
                        }
                        lqnVar.M0(zm9Var2);
                        psn psnVar = (psn) zm9Var2.d;
                        aoh.f(lqnVar.l.o(), 2131363668, psnVar.b);
                        aoh.f(lqnVar.l.o(), 2131362304, psnVar.a);
                        aoh.f(lqnVar.l.o(), 2131362637, psnVar.c);
                        WebAiAssistantLayoutSwitcher webAiAssistantLayoutSwitcher = lqnVar.D;
                        if (webAiAssistantLayoutSwitcher == null) {
                            webAiAssistantLayoutSwitcher = null;
                        }
                        int iOrdinal = tsnVar.c.ordinal();
                        if (iOrdinal == 0) {
                            nrnVar = nrn.c;
                        } else if (iOrdinal == 1 || iOrdinal == 2) {
                            nrnVar = nrn.a;
                        } else if (iOrdinal == 3) {
                            nrnVar = nrn.b;
                        } else if (iOrdinal == 4) {
                            nrnVar = nrn.c;
                        } else if (iOrdinal != 5) {
                            h9o.p();
                            break;
                        } else {
                            nrnVar = nrn.d;
                        }
                        webAiAssistantLayoutSwitcher.d(nrnVar);
                        mrn mrnVar4 = lqnVar.G;
                        if (mrnVar4 == null) {
                            mrnVar4 = null;
                        }
                        mrnVar4.h(lsnVar);
                        if (lsnVar.isEnabled()) {
                            zv0 zv0Var3 = lqnVar.E;
                            String str22 = (zv0Var3 == null ? null : zv0Var3).b;
                            if (zv0Var3 == null) {
                                zv0Var3 = null;
                            }
                            lqnVar.E = zv0.a(zv0Var3, 2045);
                            if (str22 != null) {
                                vsnVar2.m(str22, false);
                            }
                        }
                        zv0 zv0Var22 = lqnVar.E;
                        String str32 = (zv0Var22 == null ? null : zv0Var22).c;
                        if (zv0Var22 == null) {
                            zv0Var22 = null;
                        }
                        lqnVar.E = zv0.a(zv0Var22, 2043);
                        if (str32 != null) {
                            mrn mrnVar5 = lqnVar.G;
                            if (mrnVar5 == null) {
                                mrnVar5 = null;
                            }
                            mrnVar5.i(str32);
                            lqnVar.H0(str32);
                        }
                        lqnVar.G0();
                        if (lqnVar.O && lsnVar.isEnabled()) {
                            lqnVar.O = false;
                            mrn mrnVar6 = lqnVar.G;
                            (mrnVar6 != null ? mrnVar6 : null).g();
                        }
                        break;
                    case 1:
                        xf8.G0(lqnVar.w.c.f().k, Boolean.FALSE);
                        lqnVar.G0();
                        break;
                    case 2:
                        if (!((Boolean) obj).booleanValue()) {
                            lqnVar.g0();
                        }
                        break;
                    default:
                        lqnVar.w.l.r((pg) obj);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 0));
        view.postOnAnimation(new ca(view, (byte) 10));
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        View viewFindViewById;
        View viewFindViewById2;
        View actionView = itdVar.findItem(2131362304).getActionView();
        View viewFindViewById3 = actionView != null ? actionView.findViewById(2131362050) : null;
        this.L = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new eqn(this, (byte) 1));
        }
        View actionView2 = itdVar.findItem(2131363668).getActionView();
        if (actionView2 != null && (viewFindViewById2 = actionView2.findViewById(2131362050)) != null) {
            viewFindViewById2.setOnClickListener(new eqn(this, (byte) 2));
        }
        View actionView3 = itdVar.findItem(2131362637).getActionView();
        if (actionView3 == null || (viewFindViewById = actionView3.findViewById(2131362050)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new eqn(this, (byte) 3));
    }

    @Override // defpackage.jbl
    public final String y() {
        return "WebAiAssistantFragmentBase";
    }

    @Override // defpackage.ltl
    public final void z0() {
        mrn mrnVar = this.G;
        if (mrnVar == null) {
            mrnVar = null;
        }
        View view = mrnVar.m;
        sjn sjnVar = new sjn((byte) 10);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(view, sjnVar);
        z4o.r0(this.k, (dxh) null);
    }
}
