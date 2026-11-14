package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.LineHeaderTextView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.security.GeneralSecurityException;
import java.util.Map;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.net.X509Util;

/* loaded from: classes.dex */
public final /* synthetic */ class sjn implements xjj, yjj, zkn, fn8, bcf, lo7, ktn, wxg, k0g, i0g, hvb {
    public final /* synthetic */ byte a;

    public /* synthetic */ sjn(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj + obj2);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void l(String str, Object obj, Throwable th) {
        throw new IllegalArgumentException(str + obj, th);
    }

    @Override // defpackage.wxg
    public final Object a(oup oupVar) {
        b9o b9oVar = (b9o) oupVar;
        int i = b9oVar.f.b;
        if (i < 8 || i > 12) {
            t3p.w("invalid salt size");
            return null;
        }
        byte[] bArrB = ((m54) b9oVar.g.b).b();
        m54 m54Var = b9oVar.h;
        d20 d20Var = new d20();
        exg.k(q20.z0(r20.b(bArrB.length), new i4d((Object) m54.a(bArrB), (byte) 24)));
        m54Var.b();
        return d20Var;
    }

    public final s6h b(c0g c0gVar) {
        e9o e9oVar = (e9o) c0gVar;
        jvb jvbVarZ = kvb.z();
        jvbVarZ.i("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        c9o c9oVarX = d9o.x();
        f9o f9oVarX = g9o.x();
        int i = e9oVar.b;
        f9oVarX.f();
        ((av9) f9oVarX).b.y(i);
        g9o g9oVarB = f9oVarX.b();
        c9oVarX.f();
        ((av9) c9oVarX).b.z(g9oVarB);
        jvbVarZ.j(c9oVarX.b().e());
        jvbVarZ.g(i9o.a(e9oVar.a));
        return s6h.D(jvbVarZ.b());
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        byte b = 5;
        int i = 2131362543;
        switch (this.a) {
            case 6:
                ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131559540, viewGroup, false);
                int i2 = 2131362034;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) w1h.j(2131362034, constraintLayoutN);
                if (themeableLottieAnimationView != null) {
                    i2 = 2131362690;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362690, constraintLayoutN);
                    if (stylingTextView != null) {
                        break;
                    }
                }
                t3p.q("Missing required view with ID: ".concat(constraintLayoutN.getResources().getResourceName(i2)));
                break;
            case 11:
                View viewN = j7c.n(viewGroup, 2131559565, viewGroup, false);
                View viewJ = w1h.j(2131362543, viewN);
                if (viewJ != null) {
                    b98 b98Var = new b98((FrameLayout) viewJ, b);
                    if (((FrameLayout) w1h.j(2131364527, viewN)) != null) {
                        break;
                    } else {
                        i = 2131364527;
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(i)));
                break;
            default:
                View viewN2 = j7c.n(viewGroup, 2131559563, viewGroup, false);
                View viewJ2 = w1h.j(2131362543, viewN2);
                if (viewJ2 != null) {
                    b98 b98Var2 = new b98((FrameLayout) viewJ2, b);
                    FrameLayout frameLayout = (FrameLayout) w1h.j(2131364081, viewN2);
                    if (frameLayout != null) {
                        break;
                    } else {
                        i = 2131364081;
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewN2.getResources().getResourceName(i)));
                break;
        }
        return null;
    }

    @Override // defpackage.fn8
    public final cn8[] createExtractors() {
        return new cn8[]{new vnn()};
    }

    @Override // defpackage.zkn
    public final lkn d(Context context, xkn xknVar, o2c o2cVar, Bitmap bitmap, int i, y1n y1nVar) {
        return new lkn(xknVar, bitmap, i, y1nVar);
    }

    public final Object e(WebContentsImpl webContentsImpl) {
        return new a2o(webContentsImpl);
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        ode odeVar;
        Map map;
        k15 k15Var = null;
        final byte b = 0;
        switch (this.a) {
            case 0:
                ((LineHeaderTextView) ((p6n) iVar).b.b).setText(am2.b(((bkb) obj).a));
                return;
            case 1:
                y6n y6nVar = (y6n) iVar;
                y6nVar.getClass();
                aln alnVar = ((jkb) obj).a;
                y6nVar.c = alnVar;
                gt9 gt9Var = (gt9) ((i) y6nVar).itemView;
                x4i x4iVarO = y6nVar.b.o();
                if (x4iVarO != null && (odeVar = x4iVarO.h) != null && (map = (Map) odeVar.g()) != null) {
                    k15Var = (k15) map.get(alnVar.getId());
                }
                ov0 ov0Var = gt9Var.d;
                LinearLayout linearLayout = (LinearLayout) ov0Var.c;
                if (k15Var == null || k15Var.a()) {
                    b = 8;
                } else {
                    ((StylingTextView) ov0Var.d).setText(String.valueOf(k15Var.b));
                }
                linearLayout.setVisibility(b);
                pyl pylVar = y6nVar.d;
                pylVar.c = alnVar;
                pyl.i(((View) pylVar.d).getContext(), alnVar, (View) pylVar.d, (agm) pylVar.e, pylVar.b, ((tjn) pylVar.f).a());
                return;
            case 2:
                throw new ClassCastException();
            case 3:
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
            default:
                final rqn rqnVar = (rqn) obj;
                final wqn wqnVar = (wqn) iVar;
                q5g q5gVar = wqnVar.b;
                ioh iohVar = rqnVar.c;
                Uri uri = rqnVar.b;
                wqnVar.e = iohVar;
                wqnVar.f = false;
                final byte b2 = 1;
                if ((iohVar instanceof tqn) && ((tqn) iohVar).a == o29.IMAGE) {
                    wqnVar.U(uri);
                } else if (iohVar.equals(uqn.a)) {
                    String strT = dbh.t(((pne) wqnVar.d.get()).a, uri.toString());
                    if (strT.length() == 0) {
                        wqnVar.f = true;
                        wqnVar.X(iohVar);
                    } else {
                        wqnVar.U(Uri.parse(strT));
                    }
                } else {
                    wqnVar.X(iohVar);
                }
                ((b98) q5gVar.c).b.setOnClickListener(new View.OnClickListener() { // from class: vqn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b;
                        rqn rqnVar2 = rqnVar;
                        wqn wqnVar2 = wqnVar;
                        switch (b3) {
                            case 0:
                                ((mrn) wqnVar2.c.b).p.f(new grn(rqnVar2.a));
                                break;
                            default:
                                ((mrn) wqnVar2.c.b).p.f(new frn(rqnVar2.a));
                                break;
                        }
                    }
                });
                ((ImageView) q5gVar.d).setOnClickListener(new View.OnClickListener() { // from class: vqn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        rqn rqnVar2 = rqnVar;
                        wqn wqnVar2 = wqnVar;
                        switch (b3) {
                            case 0:
                                ((mrn) wqnVar2.c.b).p.f(new grn(rqnVar2.a));
                                break;
                            default:
                                ((mrn) wqnVar2.c.b).p.f(new frn(rqnVar2.a));
                                break;
                        }
                    }
                });
                return;
            case 7:
                q5g q5gVar2 = ((q6n) iVar).b;
                ((StylingTextView) q5gVar2.d).setText(2132022353);
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) q5gVar2.c;
                themeableLottieAnimationView.j(2131951659);
                themeableLottieAnimationView.s(0, 0, Integer.MAX_VALUE, null);
                return;
        }
    }

    public final r6h j(oup oupVar) {
        b9o b9oVar = (b9o) oupVar;
        z8o z8oVarY = a9o.y();
        byte[] bArrB = ((m54) b9oVar.g.b).b();
        c54 c54VarH = e54.h(0, bArrB.length, bArrB);
        z8oVarY.f();
        ((av9) z8oVarY).b.A(c54VarH);
        f9o f9oVarX = g9o.x();
        e9o e9oVar = b9oVar.f;
        int i = e9oVar.b;
        f9oVarX.f();
        ((av9) f9oVarX).b.y(i);
        g9o g9oVarB = f9oVarX.b();
        z8oVarY.f();
        ((av9) z8oVarY).b.B(g9oVarB);
        return r6h.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", z8oVarY.b().e(), mub.c, i9o.a(e9oVar.a), b9oVar.i);
    }

    public final g3o l0(View view, g3o g3oVar) {
        d3o d3oVar = g3oVar.a;
        if (d3oVar.i(8).d != 0) {
            p37.p0(z7h.h(view.getContext(), 4.0f), view);
            return g3oVar;
        }
        p37.p0(d3oVar.i(519).d, view);
        return g3oVar;
    }

    public final o8o m() {
        switch (this.a) {
            case 23:
                return X509Util.a();
            default:
                return X509Util.b();
        }
    }

    public final c0g n(s6h s6hVar) {
        kvb kvbVar = (kvb) s6hVar.b;
        if (!kvbVar.x().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            t3p.i(kvbVar.x(), "Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ");
            return null;
        }
        try {
            d9o d9oVarY = d9o.y(kvbVar.y(), xk8.a());
            if (d9oVarY.w() == 0) {
                return e9o.b(i9o.b(kvbVar.w()), d9oVarY.v().w());
            }
            t3p.w("Only version 0 parameters are accepted");
            return null;
        } catch (ajb e) {
            t3p.k("Parsing XAesGcmParameters failed: ", e);
            return null;
        }
    }

    @Override // defpackage.lo7
    public final no7 x(Context context) {
        return new bvn(context, 17, "web_page_translation_settings");
    }
}
