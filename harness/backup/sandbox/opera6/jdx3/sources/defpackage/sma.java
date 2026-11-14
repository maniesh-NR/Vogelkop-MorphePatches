package defpackage;

import android.content.Intent;
import android.view.View;
import androidx.mediarouter.app.e;
import com.leanplum.utils.SizeUtil;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.import_data.ImportChromeBookmarksActivity;
import com.opera.android.import_data.ImportChromeDataActivity;
import com.opera.android.import_data.ImportChromePasswordsActivity;
import com.opera.android.premium.ui.view.SubscriptionPlanList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class sma implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sma(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        Function1 function1;
        aoo aooVar;
        byte b = this.a;
        byte b2 = 2;
        char c = 1;
        byte bMax = 0;
        byte b3 = 4;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((vma) obj).b.c(null);
                return;
            case 1:
                PropertyModel propertyModel = (PropertyModel) obj;
                ((Callback) propertyModel.c(kfo.f)).c(Integer.valueOf(propertyModel.b(kfo.b)));
                return;
            case 2:
                fp1 fp1Var = (ImportChromeDataActivity) obj;
                int i = ImportChromeDataActivity.d0;
                Intent intentB = mdb.b(fp1Var);
                intentB.setAction("android.intent.action.MAIN");
                intentB.addCategory("android.intent.category.LAUNCHER");
                intentB.putExtra("DESTINATION_VIEW_ID", j7c.f(4));
                intentB.setAction("ACTION_DESTINATION_VIEW");
                fp1Var.startActivity(intentB);
                ac8.b(aij.a);
                return;
            case 3:
                fp1 fp1Var2 = (l2b) obj;
                Intent intentB2 = mdb.b(fp1Var2);
                intentB2.setAction("android.intent.action.MAIN");
                intentB2.addCategory("android.intent.category.LAUNCHER");
                intentB2.putExtra("DESTINATION_VIEW_ID", j7c.f(4));
                intentB2.setAction("ACTION_DESTINATION_VIEW");
                fp1Var2.startActivity(intentB2);
                return;
            case 4:
                o2b o2bVar = (o2b) obj;
                q2b q2bVar = (q2b) o2bVar.t.getValue();
                al7 al7Var = new al7((Object) o2bVar, (byte) 28);
                u2b u2bVar = q2bVar.b;
                pde pdeVar = q2bVar.c;
                boolean z = ((n3b) pdeVar.g()).a;
                boolean z2 = ((n3b) pdeVar.g()).b;
                if (!z) {
                    if (z2) {
                        qj2 qj2Var = new qj2(new p2b(al7Var, b2), (byte) 5);
                        u2bVar.getClass();
                        int i2 = ImportChromePasswordsActivity.b0;
                        k1g.f0(u2bVar.a, qj2Var, w2b.e);
                        return;
                    }
                    return;
                }
                if (!z2) {
                    qj2 qj2Var2 = new qj2(new p2b(al7Var, c == true ? 1 : 0), b3);
                    u2bVar.getClass();
                    int i3 = ImportChromeBookmarksActivity.b0;
                    o0g.E0(u2bVar.a, qj2Var2, w2b.e);
                    return;
                }
                qj2 qj2Var3 = new qj2(new p2b(al7Var, bMax), (byte) 6);
                u2bVar.getClass();
                int i4 = ImportChromeDataActivity.d0;
                fp1 fp1Var3 = u2bVar.a;
                hv5 hv5Var = w2b.b;
                Intent intentE0 = FullscreenWebActivity.e0(fp1Var3, ImportChromeDataActivity.class, "https://passwords.google.com/options", new rxh(2132020330), true, lqm.d);
                intentE0.putExtra("extra_import_entry_point", "deeplink");
                ((hjf) oi.d(fp1Var3)).D(intentE0, qj2Var3);
                return;
            case 5:
                h0c h0cVar = (h0c) obj;
                h0cVar.c.dismiss();
                Object tag = view.getTag();
                String str = tag instanceof String ? (String) tag : null;
                if (str == null || (function1 = h0cVar.d) == null) {
                    return;
                }
                function1.invoke(str);
                return;
            case 6:
                ((StylingImageView) ((y83) obj).d).callOnClick();
                return;
            case 7:
                f9c f9cVar = (f9c) obj;
                f9cVar.g0();
                ((i9c) f9cVar.v).g();
                return;
            case 8:
                i16 i16Var = (i16) ((i9c) obj).f;
                w00 w00Var = ((y00) i16Var.c).G;
                cie cieVar = (cie) i16Var.b;
                w00Var.m = true;
                cs5.q0(cieVar, 3);
                jsd jsdVar = cieVar.P;
                if (jsdVar != null && (aooVar = cieVar.w0) != null) {
                    aooVar.j(jsdVar);
                }
                w00Var.m = false;
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((g9c) obj).p(view);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                js6 js6Var = ((qkc) obj).b;
                js6Var.b = true;
                ((fs6) js6Var.d).a.V(0, "live_scores_enabled");
                ((xoc) js6Var.g).a(tg0.f);
                return;
            case 11:
                xkc xkcVar = (xkc) obj;
                kmc kmcVar = xkcVar.g;
                if (kmcVar != null) {
                    xkcVar.d.a.b.b(kmcVar);
                    return;
                }
                return;
            case 12:
                znc zncVar = (znc) obj;
                nmc nmcVar = zncVar.h;
                if (nmcVar != null) {
                    zncVar.d.a.b.b(nmcVar);
                    return;
                }
                return;
            case 13:
                foc focVar = (foc) obj;
                pmc pmcVar = focVar.g;
                if (pmcVar != null) {
                    focVar.d.a.b.b(pmcVar);
                    return;
                }
                return;
            case 14:
                hoc hocVar = (hoc) obj;
                qmc qmcVar = hocVar.h;
                if (qmcVar != null) {
                    hocVar.d.a.b.b(qmcVar);
                    return;
                }
                return;
            case 15:
                ((jkc) obj).invoke(view);
                return;
            case 16:
                zoc zocVar = (zoc) obj;
                wmc wmcVar = zocVar.j;
                if (wmcVar != null) {
                    zocVar.d.a.b.b(wmcVar);
                    return;
                }
                return;
            case 17:
                ((jkc) obj).invoke(view);
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                ((q4b) obj).invoke();
                return;
            case 19:
                ((lrc) obj).s.b.run();
                return;
            case SizeUtil.textSize0 /* 20 */:
                ((zuc) obj).f.r(view.getContext());
                return;
            case 21:
                ((i7d) obj).o0();
                return;
            case SizeUtil.textSize1 /* 22 */:
                p12 p12Var = ((r7d) obj).b;
                p7d p7dVar = (p7d) ((tsd) p12Var.h).g();
                if (p7dVar != null) {
                    x5f x5fVar = (x5f) p12Var.f;
                    nh0 nh0Var = p7dVar.b ? nh0.b : nh0.c;
                    if (x5fVar.h) {
                        zpa zpaVar = x5fVar.d;
                        x56 x56VarF = zpa.F();
                        lh0 lh0Var = new lh0(2443, -1, 4);
                        lh0Var.q(0, 1, mh0.z);
                        lh0Var.q(3, 1, nh0Var);
                        x56VarF.B(zpaVar).B0().add(lh0Var);
                        x5fVar.U0(x56VarF);
                    }
                    va2 va2Var = (va2) p12Var.g;
                    byte b4 = p7dVar.a;
                    f7d f7dVar = (f7d) va2Var.b;
                    if (f7dVar.h.d()) {
                        f7dVar.j.a(b4);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                h8d h8dVar = (h8d) obj;
                amk amkVarA = ((SubscriptionPlanList) h8dVar.j.d).a();
                if (amkVarA != null) {
                    h8dVar.g.j(new jg4(h8dVar, amkVarA, b3));
                    return;
                }
                return;
            case SizeUtil.textSize2 /* 24 */:
                ((qdd) obj).g0();
                throw null;
            case 25:
                ((nmd) obj).dismiss();
                return;
            case 26:
                ((hnd) obj).dismiss();
                return;
            case 27:
                e eVar = (e) obj;
                ond ondVar = eVar.e;
                cod codVar = ondVar.x;
                ue2 ue2Var = ondVar.s;
                if (codVar != null) {
                    ue2Var.removeMessages(2);
                }
                ondVar.x = eVar.b;
                boolean zIsActivated = view.isActivated();
                boolean z3 = !zIsActivated;
                if (zIsActivated) {
                    Integer num = (Integer) ondVar.y.get(eVar.b.c);
                    bMax = num != null ? Math.max(1, num.intValue()) : 1;
                }
                eVar.V(z3);
                eVar.d.setProgress(bMax);
                eVar.b.j(bMax);
                ue2Var.sendEmptyMessageDelayed(2, 500L);
                return;
            case 28:
                knd kndVar = (knd) obj;
                dod dodVar = kndVar.h.j.g;
                cod codVar2 = kndVar.g;
                dodVar.getClass();
                if (codVar2 == null) {
                    t3p.q("route must not be null");
                    return;
                }
                dod.b();
                ez9 ez9VarC = dod.c();
                ynd yndVarA = ez9VarC.d.a();
                if (yndVarA != null) {
                    List<cod> listSingletonList = Collections.singletonList(codVar2);
                    ArrayList arrayList = new ArrayList();
                    for (cod codVar3 : listSingletonList) {
                        qnd qndVar = (qnd) yndVarA.x.get(codVar3.c);
                        if (qndVar == null || !qndVar.e) {
                            codVar3.toString();
                        } else {
                            arrayList.add(codVar3.b);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (yndVarA.g()) {
                            rnd rndVar = ez9VarC.e;
                            if (!(rndVar instanceof rnd)) {
                                qp2.n("There is no currently selected dynamic group route.");
                                return;
                            }
                            rndVar.o(arrayList);
                        } else if (yndVarA.n()) {
                            ez9VarC.f();
                            yndVarA.toString();
                        } else {
                            yndVarA.toString();
                        }
                    }
                }
                kndVar.c.setVisibility(4);
                kndVar.d.setVisibility(0);
                return;
            default:
                ((exd) obj).b(hjm.a);
                return;
        }
    }
}
