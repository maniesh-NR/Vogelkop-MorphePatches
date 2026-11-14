package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.BottomBar;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class r22 implements krn {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;

    public r22() {
        this.a = new Object();
        this.b = new tod(this, (byte) 1);
        this.c = new WeakReference(null);
    }

    public r22(Context context, qtm qtmVar, d93 d93Var) {
        this.a = qtmVar;
        this.b = d93Var;
        this.c = v1.u(context);
    }

    public r22(BrowserActivity browserActivity, BottomBar bottomBar, w6j w6jVar) {
        int iA;
        this.a = bottomBar;
        int iC = bottomBar.c();
        int iC2 = bottomBar.c();
        View view = bottomBar.g;
        final byte b = 0;
        if (view == null || view.getVisibility() != 0) {
            iA = 0;
        } else {
            Context context = bottomBar.getContext();
            iA = fan.a(1.0f, context.getResources()) + f03.w(2130971212, context, 0);
        }
        this.b = new pde(new np3(iC, iA + iC2));
        this.c = new bp();
        ((pde) w6jVar.c).j(browserActivity, new f7f(this) { // from class: oo3
            public final /* synthetic */ r22 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                r22 r22Var = this.b;
                switch (b2) {
                    case 0:
                        r22Var.P();
                        break;
                    default:
                        r22Var.P();
                        break;
                }
            }
        });
        final byte b2 = 1;
        bottomBar.p.j(browserActivity, new f7f(this) { // from class: oo3
            public final /* synthetic */ r22 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                r22 r22Var = this.b;
                switch (b22) {
                    case 0:
                        r22Var.P();
                        break;
                    default:
                        r22Var.P();
                        break;
                }
            }
        });
    }

    public /* synthetic */ r22(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public r22(qim qimVar) {
        this.a = new ArrayDeque();
        this.b = new ArrayDeque();
        this.c = qimVar;
        this.d = new z4k((Object) this, (byte) 9);
    }

    public r22(x22 x22Var, mrn mrnVar, nrl nrlVar, Function1 function1) {
        this.d = x22Var;
        this.a = mrnVar;
        this.b = nrlVar;
        this.c = function1;
    }

    public static void p(r22 r22Var, boolean z, int i) {
        float height = ((FrameLayout) ((rvg) ((nrl) r22Var.b).b).b).getHeight();
        if ((i & 2) != 0) {
            z = ((mrn) r22Var.a).j.hasFocus();
        }
        s62 s62VarH = r22Var.h();
        Resources resources = ((mrn) r22Var.a).m.getResources();
        Rect rect = fan.a;
        xf8.F0(s62VarH.q, new r52((int) (height / resources.getDisplayMetrics().density), z));
    }

    public void A(mid midVar) {
    }

    public void B() {
    }

    public void C(long j) {
    }

    public void D(float f) {
    }

    public void E(yjh yjhVar) {
    }

    public void F(yjh yjhVar) {
    }

    public void G(int i) {
    }

    public void H(int i) {
    }

    public void I() {
    }

    public void J() {
    }

    public void K(long j) {
    }

    public void L() {
    }

    public void M(int i) {
        BottomBar bottomBar = (BottomBar) this.a;
        bottomBar.l(i);
        atj atjVar = bottomBar.q;
        if (atjVar != null) {
            pde pdeVar = atjVar.b;
            if (!((Set) pdeVar.g()).isEmpty()) {
                pdeVar.r(pdeVar.g());
            }
        }
        P();
    }

    public void N(ap3 ap3Var) {
        BottomBar bottomBar = (BottomBar) this.a;
        if (ap3Var.equals(bottomBar.c)) {
            return;
        }
        bottomBar.c = ap3Var;
        bottomBar.a(ap3Var.a.a);
        bottomBar.b(ap3Var.c);
        bottomBar.invalidate();
        c1f c1fVar = bottomBar.b;
        if (c1fVar != null) {
            c1fVar.e();
        }
    }

    public boolean O() {
        return false;
    }

    public final void P() {
        int iA;
        pde pdeVar = (pde) this.b;
        BottomBar bottomBar = (BottomBar) this.a;
        int iC = bottomBar.c();
        int iC2 = bottomBar.c();
        View view = bottomBar.g;
        if (view == null || view.getVisibility() != 0) {
            iA = 0;
        } else {
            Context context = bottomBar.getContext();
            iA = fan.a(1.0f, context.getResources()) + f03.w(2130971212, context, 0);
        }
        xf8.F0(pdeVar, new np3(iC, iA + iC2));
        pt3 pt3Var = (pt3) this.d;
        if (pt3Var != null) {
            int iF = bottomBar.f();
            BrowserActivity browserActivity = pt3Var.b;
            c37 c37Var = browserActivity.L;
            if (c37Var == null) {
                c37Var = null;
            }
            r22 r22Var = browserActivity.I;
            if (r22Var == null) {
                r22Var = null;
            }
            ((nak) c37Var.a).k((Object) null, Boolean.valueOf(iF >= ((np3) ((pde) r22Var.b).g()).b));
            browserActivity.j0();
        }
    }

    public final void a(jjm jjmVar) {
        b(jjmVar, jjmVar.getDefaultPriority());
    }

    public final void b(jjm jjmVar, ijm ijmVar) {
        e(ijmVar).offer(jjmVar);
        jjmVar.setRequestDismisser((z4k) this.d);
        ((qim) this.c).a();
    }

    public Uri.Builder c() {
        String str;
        this.d = c26.q();
        d93 d93Var = (d93) this.b;
        URL url = d93Var.a.a;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol()).encodedAuthority(url.getAuthority()).encodedPath(url.getPath()).appendQueryParameter("product", "opera").appendQueryParameter("features", String.valueOf(d93Var.b)).appendQueryParameter("ac", (String) this.d).appendQueryParameter("lang", sfe.b0(Locale.getDefault())).appendQueryParameter("abgroup", ((v1) this.c).x());
        String str2 = d93Var.c;
        if (str2 != null) {
            builder.appendQueryParameter("config_bundle", str2);
        }
        qtm qtmVar = (qtm) this.a;
        if (qtmVar != null && (str = qtmVar.d) != null) {
            builder.appendQueryParameter("uid", str);
        }
        return builder;
    }

    public no3 d(rsg rsgVar) {
        return new no3(true, false, !(rsgVar.b && rsgVar.c));
    }

    public final ArrayDeque e(ijm ijmVar) {
        int iOrdinal = ijmVar.ordinal();
        if (iOrdinal == 0) {
            return (ArrayDeque) this.a;
        }
        if (iOrdinal == 1) {
            return (ArrayDeque) this.b;
        }
        throw new RuntimeException(null, null);
    }

    @Override // defpackage.krn
    public final void f(tc2 tc2Var) {
        mrn mrnVar = (mrn) this.a;
        if (tc2Var.a) {
            g().c.f().f();
        }
        if (tc2Var.equals(drn.b)) {
            g().g();
            mrnVar.g();
            return;
        }
        if (tc2Var.equals(drn.c)) {
            g().k.c(l60.h);
            return;
        }
        char c = 1;
        if (tc2Var.equals(drn.d)) {
            g().h(ux1.a, true, new o22((x22) this.d, c == true ? 1 : 0));
            return;
        }
        if (tc2Var.equals(drn.e)) {
            vsn vsnVarG = g();
            if (vsnVarG.b().size() < 3) {
                iy1 iy1VarE = vsnVarG.c.e();
                iy1VarE.getClass();
                String strValueOf = String.valueOf(System.currentTimeMillis());
                ny1 ny1Var = iy1VarE.f;
                wx wxVar = new wx((Object) iy1VarE, (Object) strValueOf, (byte) 4);
                Context context = ny1Var.a;
                try {
                    ny1Var.a(context, wxVar);
                    return;
                } catch (ActivityNotFoundException unused) {
                    az0 az0Var = new az0(context);
                    az0Var.a(2132019060);
                    az0Var.setNegativeButton(2132020155, (DialogInterface.OnClickListener) null).c();
                    return;
                }
            }
            return;
        }
        if (tc2Var.equals(drn.f)) {
            g().i(ux1.a);
            return;
        }
        if (tc2Var.equals(drn.g)) {
            bq1 bq1Var = mrnVar.j;
            bq1Var.clearFocus();
            q9n.u(bq1Var);
            g().k.c(l60.d);
            g().g();
            return;
        }
        if (tc2Var.equals(drn.h)) {
            g().k.c(l60.e);
            return;
        }
        if (tc2Var instanceof frn) {
            qx1 qx1VarF = g().f(((frn) tc2Var).b);
            if (qx1VarF != null) {
                Uri uriX = w7d.x(qx1VarF.m);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriX, qx1VarF.n);
                intent.addFlags(1);
                ((Function1) this.c).invoke(intent);
                return;
            }
            return;
        }
        if (tc2Var instanceof grn) {
            g().c.e().g(((grn) tc2Var).b, false);
            return;
        }
        if (tc2Var instanceof hrn) {
            g().c.e().h(((hrn) tc2Var).b);
            return;
        }
        if (tc2Var.equals(drn.i)) {
            g().l();
            return;
        }
        if (tc2Var.equals(drn.j)) {
            String strValueOf2 = String.valueOf(mrnVar.j.getText());
            lsn lsnVar = ((tsn) xf8.B(g().q).g()).b;
            if (StringsKt.N(strValueOf2) || lsnVar.b() != msn.b) {
                return;
            }
            g().m(strValueOf2, mrnVar.r.u);
            mrnVar.i("");
            h().b.e().J0().b.requestFocus();
            return;
        }
        if (tc2Var instanceof irn) {
            boolean z = ((irn) tc2Var).b;
            if (!z) {
                q9n.u(mrnVar.m);
            }
            vsn vsnVarG2 = g();
            vsnVarG2.t = z;
            vsnVarG2.q.u();
            p(this, z, 1);
            return;
        }
        if (tc2Var instanceof jrn) {
            g().d(((jrn) tc2Var).b.length() > 0);
        } else if (tc2Var instanceof ern) {
            vsn.j(g(), ((ern) tc2Var).b);
        } else {
            if (tc2Var.equals(drn.k)) {
                return;
            }
            h9o.p();
        }
    }

    public abstract vsn g();

    public abstract s62 h();

    public boolean i() {
        return true;
    }

    public void j(mid midVar) {
    }

    public void k(mid midVar, int i) {
    }

    public final void l() {
        mrn mrnVar = (mrn) this.a;
        mrnVar.i("");
        mrnVar.h(((tsn) xf8.B(g().q).g()).b);
        p(this, false, 3);
    }

    public void m(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o() {
    }

    public boolean q(Intent intent) {
        return false;
    }

    public void r() {
    }

    public void s() {
    }

    public void t(String str, Bundle bundle) {
    }

    public void u(String str, Bundle bundle) {
    }

    public void v(Uri uri, Bundle bundle) {
    }

    public void w() {
    }

    public void x(String str, Bundle bundle) {
    }

    public void y(String str, Bundle bundle) {
    }

    public void z(Uri uri, Bundle bundle) {
    }
}
