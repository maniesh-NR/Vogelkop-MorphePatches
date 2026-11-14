package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ResultReceiver;
import android.view.MenuItem;
import android.view.View;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.zzc;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.text.StringsKt;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class dcl implements lw1, htd, qvm, b1n, hpf, ann, krn, hti, jrp, ph, evp {
    public final Object a;

    public dcl() {
        this.a = dtp.b;
    }

    public dcl(float f, float f2, if1 if1Var) {
        mf1 riiVar;
        int[] iArr = z0n.a;
        if (if1Var == null && f == 1.0f && f2 == 1500.0f) {
            riiVar = fw6.a;
        } else if (if1Var != null) {
            riiVar = new rii(f, f2, if1Var);
        } else {
            oji ojiVar = new oji();
            ojiVar.a = new w89(f, f2);
            riiVar = ojiVar;
        }
        this.a = new w7j(riiVar);
    }

    public dcl(Context context, z4k z4kVar, bl blVar, fio fioVar) {
        this.a = new dzo(context, z4kVar, blVar, fioVar);
    }

    public /* synthetic */ dcl(Object obj) {
        this.a = obj;
    }

    public dcl(kw3 kw3Var, kw3 kw3Var2, qii qiiVar) {
        this.a = kw3Var2;
    }

    @Override // defpackage.hpf
    public final void I(fpf fpfVar) {
        ggn ggnVar = (ggn) this.a;
        ggnVar.o = false;
        ggnVar.a();
    }

    public final void a(pvm pvmVar) {
        ((uwm) this.a).h(pvmVar);
    }

    public final boolean b() {
        return false;
    }

    public final long c(if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return ((w7j) this.a).c(if1Var, if1Var2, if1Var3);
    }

    @Override // defpackage.ann
    public final void d() {
        ((lmn) ((l45) this.a).c).c();
    }

    @Override // defpackage.ann
    public final void e() {
        ((lmn) ((l45) this.a).c).c();
    }

    @Override // defpackage.krn
    public final void f(tc2 tc2Var) {
        ViewAndroidDelegate viewAndroidDelegateJ0;
        lqn lqnVar = (lqn) this.a;
        vsn vsnVar = lqnVar.w;
        if (tc2Var.a) {
            vsnVar.c.f().f();
        }
        if (tc2Var.equals(drn.b)) {
            vsnVar.g();
            mrn mrnVar = lqnVar.G;
            (mrnVar != null ? mrnVar : null).g();
            return;
        }
        if (tc2Var.equals(drn.c)) {
            vsnVar.k.c(l60.h);
            return;
        }
        if (tc2Var.equals(drn.d)) {
            vsnVar.h(ux1.a, false, new tu(lqnVar, (byte) 13));
            return;
        }
        if (tc2Var.equals(drn.e)) {
            if (vsnVar.b().size() < 3) {
                iy1 iy1VarE = vsnVar.c.e();
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
            vsnVar.i(ux1.a);
            return;
        }
        if (tc2Var.equals(drn.g)) {
            mrn mrnVar2 = lqnVar.G;
            bq1 bq1Var = (mrnVar2 != null ? mrnVar2 : null).j;
            bq1Var.clearFocus();
            q9n.u(bq1Var);
            vsnVar.k.c(l60.d);
            vsnVar.g();
            return;
        }
        if (tc2Var.equals(drn.h)) {
            vsnVar.k.c(l60.e);
            return;
        }
        if (tc2Var instanceof frn) {
            qx1 qx1VarF = vsnVar.f(((frn) tc2Var).b);
            if (qx1VarF != null) {
                Uri uriX = w7d.x(qx1VarF.m);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriX, qx1VarF.n);
                intent.addFlags(1);
                lqnVar.startActivity(intent);
                return;
            }
            return;
        }
        if (tc2Var instanceof grn) {
            vsnVar.c.e().g(((grn) tc2Var).b, false);
            return;
        }
        if (tc2Var instanceof hrn) {
            vsnVar.c.e().h(((hrn) tc2Var).b);
            return;
        }
        if (tc2Var.equals(drn.i)) {
            vsnVar.l();
            return;
        }
        if (!tc2Var.equals(drn.j)) {
            if (tc2Var instanceof irn) {
                boolean z = ((irn) tc2Var).b;
                vsnVar.t = z;
                vsnVar.q.u();
                lqn.I0(lqnVar, 0, z, 1);
                return;
            }
            if (tc2Var instanceof jrn) {
                lqnVar.H0(((jrn) tc2Var).b);
                return;
            } else if (tc2Var instanceof ern) {
                vsn.j(vsnVar, ((ern) tc2Var).b);
                return;
            } else {
                if (tc2Var.equals(drn.k)) {
                    return;
                }
                h9o.p();
                return;
            }
        }
        mrn mrnVar3 = lqnVar.G;
        if (mrnVar3 == null) {
            mrnVar3 = null;
        }
        String strValueOf2 = String.valueOf(mrnVar3.j.getText());
        lsn lsnVar = ((tsn) xf8.B(vsnVar.q).g()).b;
        if (StringsKt.N(strValueOf2) || lsnVar.b() != msn.b) {
            return;
        }
        vsnVar.m(strValueOf2, false);
        mrn mrnVar4 = lqnVar.G;
        (mrnVar4 != null ? mrnVar4 : null).i("");
        WebContents webContents = lqnVar.J;
        if (webContents == null || (viewAndroidDelegateJ0 = webContents.J0()) == null) {
            return;
        }
        viewAndroidDelegateJ0.b.requestFocus();
    }

    @Override // defpackage.hpf
    public final void h(cpf cpfVar) {
        ggn ggnVar = (ggn) this.a;
        ggnVar.o = false;
        ggnVar.a();
    }

    public final void i() {
        dzo dzoVar = (dzo) this.a;
        nyo nyoVar = dzoVar.c;
        if (dzoVar.f) {
            nyoVar.getSettings().setJavaScriptEnabled(true);
            nyoVar.onResume();
            dzoVar.f = false;
        }
    }

    public final synchronized void j(Context context, HashSet hashSet) {
        AssetManager assets = context.getAssets();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Integer) u0h.u(assets, "addAssetPath", Integer.class, String.class, ((File) it.next()).getPath())).intValue();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.app.Activity, com.android.billingclient.api.ProxyBillingActivityV2] */
    public final void k(Object obj) {
        ?? r4 = (ProxyBillingActivityV2) this.a;
        oh ohVar = (oh) obj;
        Intent intent = ohVar.b;
        int i = zzc.zzi(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = r4.h;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = ohVar.a;
        if (i2 != -1 || i != 0) {
            zzc.zzo("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i2 + " and billing's responseCode: " + i);
        }
        r4.finish();
    }

    @Override // defpackage.hpf
    public final void n(epf epfVar) {
        ggn ggnVar = (ggn) this.a;
        ggnVar.o = false;
        ggnVar.a();
    }

    public final void p(String str) {
        d83 d83Var = ((jdo) this.a).v;
        if (d83Var == null) {
            d83Var = null;
        }
        d83Var.getClass();
        new c83(d83Var, (byte) 4).filter(str);
    }

    public final if1 q(if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return ((w7j) this.a).q(if1Var, if1Var2, if1Var3);
    }

    @Override // defpackage.hpf
    public final void r(gpf gpfVar) {
        ggn ggnVar = (ggn) this.a;
        ggnVar.o = true;
        ggnVar.a();
    }

    public final void s(itd itdVar) {
        usl uslVar = (usl) this.a;
        boolean zT = uslVar.a.a.t();
        sp1 sp1Var = uslVar.b;
        if (zT) {
            sp1Var.onPanelClosed(108, itdVar);
        } else if (sp1Var.onPreparePanel(0, (View) null, itdVar)) {
            sp1Var.onMenuOpened(108, itdVar);
        }
    }

    public final if1 t(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return ((w7j) this.a).t(j, if1Var, if1Var2, if1Var3);
    }

    @Override // defpackage.ann
    public final void u(bnn bnnVar) {
        ((lmn) ((l45) this.a).c).c();
    }

    public final void v(String str) {
        d83 d83Var = ((jdo) this.a).v;
        if (d83Var == null) {
            d83Var = null;
        }
        d83Var.getClass();
        new c83(d83Var, (byte) 4).filter(str);
    }

    public final if1 w(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return ((w7j) this.a).w(j, if1Var, if1Var2, if1Var3);
    }

    public final boolean x(itd itdVar, MenuItem menuItem) {
        return false;
    }

    public final Object y(opi opiVar, Float f, Float f2, itj itjVar, ltj ltjVar) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objJ = xvg.j(opiVar, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, cs5.a(28, 0.0f, fFloatValue2), (a2k) this.a, itjVar, ltjVar);
        return objJ == px5.a ? objJ : (te1) objJ;
    }

    @Override // defpackage.ann
    public final void z(cnn cnnVar) {
        ((lmn) ((l45) this.a).c).d(cnnVar.a);
    }

    @Override // defpackage.jrp
    /* renamed from: zza */
    public final Object mo1zza() {
        ktp ktpVar = (ktp) ((jrp) this.a).mo1zza();
        if (ktpVar != null) {
            return ktpVar;
        }
        t3p.q("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public final void zza() {
        top topVar = (top) this.a;
        int i = 0;
        while (true) {
            XmlPullParser xmlPullParser = topVar.a;
            if (i >= xmlPullParser.getAttributeCount()) {
                topVar.a("split-install-error", new tvk(topVar));
                return;
            }
            if ("defaultErrorCode".equals(xmlPullParser.getAttributeName(i))) {
                wci wciVar = topVar.b;
                String attributeValue = xmlPullParser.getAttributeValue(i);
                Integer num = (Integer) jop.c.get(attributeValue);
                if (num == null) {
                    qp2.o(String.valueOf(attributeValue).concat(" is unknown error."));
                    return;
                }
                wciVar.b = num;
            }
            i++;
        }
    }
}
