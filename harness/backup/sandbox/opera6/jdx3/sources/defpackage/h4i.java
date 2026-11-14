package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.w;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.StylingImageCheckableWithText;
import com.opera.android.premium.ui.view.PremiumPricingCard;
import com.opera.android.premium.ui.view.SubscriptionPlanList;
import com.opera.android.settings.speed_dial.SpeedDialShapePreview;
import com.opera.api.Callback;
import com.usercentrics.sdk.ui.PredefinedUIResponse;
import com.usercentrics.sdk.ui.components.UCToggle;
import com.usercentrics.sdk.ui.secondLayer.component.footer.UCSecondLayerFooter;
import com.usercentrics.sdk.ui.secondLayer.component.header.UCSecondLayerHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class h4i implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h4i(ami amiVar, gfh gfhVar) {
        this.a = (byte) 2;
        this.b = gfhVar;
    }

    public /* synthetic */ h4i(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [android.content.Context, com.opera.android.BrowserActivity] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 13;
        byte b4 = 2;
        final byte b5 = 0;
        final byte b6 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                k4i k4iVar = (k4i) obj;
                if (!k4iVar.w) {
                    k4iVar.w = true;
                    cqp.r0(k4iVar.r, new m4i(1));
                    break;
                }
                break;
            case 1:
                ((qli) ((ami) obj).f).invoke();
                break;
            case 2:
                Context context = view.getContext();
                fmi fmiVar = ((ffh) ((gfh) obj)).a.d;
                if (!(fmiVar instanceof bmi)) {
                    if (!(fmiVar instanceof dmi)) {
                        if (!(fmiVar instanceof cmi)) {
                            if (!(fmiVar instanceof emi)) {
                                h9o.p();
                                break;
                            } else {
                                emi emiVar = (emi) fmiVar;
                                String str = emiVar.b.c;
                                if (str == null) {
                                    str = emiVar.a;
                                }
                                lcp.F(context, str, false);
                                break;
                            }
                        } else {
                            lcp.F(context, ((cmi) fmiVar).a, false);
                            break;
                        }
                    } else {
                        lcp.F(context, ((dmi) fmiVar).a, false);
                        break;
                    }
                } else {
                    lcp.F(context, ((bmi) fmiVar).a, false);
                    break;
                }
            case 3:
                gqi gqiVar = (gqi) ((dqi) obj).s.getValue();
                pqi pqiVar = gqiVar.d;
                n08 n08Var = n08.a;
                pqiVar.getClass();
                if (N.MphJ2uhp()) {
                    pqiVar.c(n08Var, false);
                }
                sqi sqiVar = gqiVar.c;
                new zg(sqiVar.a, sqiVar.h, sqiVar.m, new f23(new tji(gqiVar, b2), sqiVar, l08.a, (byte) 13));
                break;
            case 4:
                vxi vxiVar = (vxi) obj;
                ((lz8) vxiVar.f).invoke(((FidoCredentialDetails) ((ArrayList) vxiVar.e).get(0)).getCredentialId());
                vxiVar.b.Q(hjm.a);
                break;
            case 5:
                yzi yziVar = (yzi) obj;
                if (yziVar.Y()) {
                    yziVar.b.a.d(yziVar.getItemId());
                    break;
                }
                break;
            case 6:
                f1j f1jVar = (f1j) ((qt) obj).d;
                ?? r0 = f1jVar.a;
                zhj.a(new fge(r0, f1jVar.b, f1jVar.e), 4099).c(r0);
                break;
            case 7:
                o9j o9jVar = (o9j) obj;
                o9jVar.getClass();
                o9jVar.f(new k9j(o9jVar, b6));
                break;
            case 8:
                ((e6g) obj).invoke();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                lag lagVar = ((uoj) obj).t;
                Iterator it = s9g.h.i(false).iterator();
                while (it.hasNext()) {
                    s9g.h.b(lagVar, (String) it.next(), false);
                }
                int iOrdinal = lagVar.ordinal();
                if (iOrdinal == 4) {
                    N.MZtcCH9M();
                    break;
                } else if (iOrdinal == 5) {
                    N.MCsTD9Tv();
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((bsj) obj).b.invoke();
                break;
            case 11:
                juj jujVar = (juj) obj;
                String host = jujVar.s.getHost();
                String[] strArr = aik.a;
                StringBuilder sbS = p3p.s("snapshot_", host != null ? host : "", "_");
                sbS.append(System.currentTimeMillis());
                String string = sbS.toString();
                qim qimVar = jujVar.u.o;
                Objects.requireNonNull(qimVar);
                nej nejVar = qimVar.d;
                zfe zfeVar = new zfe(jujVar, string, b4);
                nejVar.getClass();
                nejVar.b(zfeVar, ijm.b);
                break;
            case 12:
                int i = SpeedDialShapePreview.v;
                ((SpeedDialShapePreview) obj).setSelected(true);
                break;
            case 13:
                o9k o9kVar = (o9k) obj;
                d0n d0nVarG0 = o9kVar.g0();
                if (d0nVarG0 != null) {
                    o9kVar.f0(d0nVarG0, true);
                    break;
                }
                break;
            case 14:
                int[] iArr = StylingImageCheckableWithText.x;
                ((StylingImageCheckableWithText) obj).toggle();
                break;
            case 15:
                ((jri) obj).run();
                break;
            case 16:
                SubscriptionPlanList subscriptionPlanList = (SubscriptionPlanList) obj;
                int i2 = SubscriptionPlanList.c;
                if (view instanceof PremiumPricingCard) {
                    subscriptionPlanList.e((PremiumPricingCard) view);
                    break;
                }
                break;
            case 17:
                ndc ndcVar = (qrk) obj;
                rrk rrkVar = (rrk) ndcVar.t.getValue();
                rrkVar.b.c(new trk(), ndcVar, new w4i(new n6k(rrkVar, b3), (byte) 17));
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                ((urk) obj).invoke();
                break;
            case 19:
                ((urk) obj).invoke();
                break;
            case SizeUtil.textSize0 /* 20 */:
                xrk xrkVar = (xrk) obj;
                yrk yrkVar = (yrk) xrkVar.s.getValue();
                ojn ojnVar = yrkVar.c;
                byte b7 = 10;
                final d7k d7kVar = new d7k(yrkVar, xrkVar, b7);
                fjn fjnVar = ojnVar.c;
                if (!fjnVar.b.a.getBoolean("crypto.wallet.has_new_wallet", false)) {
                    if (!fjnVar.b.a.getBoolean("crypto.wallet.has_wallet", false)) {
                        d7kVar.invoke(ljn.c);
                        break;
                    } else {
                        pjb pjbVar = ((y5i) ((sin) ((ra3) ojnVar.e.getValue()).a.get()).a).f;
                        new r62((pjbVar != null ? pjbVar : null).a(new String[]{"wallets"}, true, new q0n((byte) 2)), new iyk(d7kVar, ojnVar, b7), (byte) 1);
                        break;
                    }
                } else {
                    ((vj2) ojnVar.d.getValue()).b(new Callback() { // from class: kjn
                        @Override // com.opera.api.Callback
                        public final void run(Object obj2) throws JSONException {
                            byte b8 = b5;
                            d7k d7kVar2 = d7kVar;
                            switch (b8) {
                                case 0:
                                    String str2 = (String) obj2;
                                    ljn ljnVar = ljn.b;
                                    try {
                                        JSONObject jSONObject = new JSONObject(str2);
                                        Object objU = orb.u(jSONObject.getJSONObject(jSONObject.keys().next()).get("mnemonic"));
                                        if (objU == null) {
                                            throw new JSONException("mnemonic is null");
                                        }
                                        d7kVar2.invoke(new mjn(String.valueOf(objU)));
                                        return;
                                    } catch (NullPointerException unused) {
                                        d7kVar2.invoke(ljnVar);
                                        return;
                                    } catch (JSONException unused2) {
                                        d7kVar2.invoke(ljnVar);
                                        return;
                                    }
                                default:
                                    if (((fsb) obj2) == fsb.a) {
                                        d7kVar2.invoke(ljn.a);
                                        return;
                                    } else {
                                        d7kVar2.invoke(ljn.b);
                                        return;
                                    }
                            }
                        }
                    }, new Callback() { // from class: kjn
                        @Override // com.opera.api.Callback
                        public final void run(Object obj2) throws JSONException {
                            byte b8 = b6;
                            d7k d7kVar2 = d7kVar;
                            switch (b8) {
                                case 0:
                                    String str2 = (String) obj2;
                                    ljn ljnVar = ljn.b;
                                    try {
                                        JSONObject jSONObject = new JSONObject(str2);
                                        Object objU = orb.u(jSONObject.getJSONObject(jSONObject.keys().next()).get("mnemonic"));
                                        if (objU == null) {
                                            throw new JSONException("mnemonic is null");
                                        }
                                        d7kVar2.invoke(new mjn(String.valueOf(objU)));
                                        return;
                                    } catch (NullPointerException unused) {
                                        d7kVar2.invoke(ljnVar);
                                        return;
                                    } catch (JSONException unused2) {
                                        d7kVar2.invoke(ljnVar);
                                        return;
                                    }
                                default:
                                    if (((fsb) obj2) == fsb.a) {
                                        d7kVar2.invoke(ljn.a);
                                        return;
                                    } else {
                                        d7kVar2.invoke(ljn.b);
                                        return;
                                    }
                            }
                        }
                    });
                    break;
                }
            case 21:
                syk sykVar = (syk) obj;
                w parentFragmentManager = sykVar.getParentFragmentManager();
                xih.u(parentFragmentManager);
                parentFragmentManager.i0("SyncAuthPortalFragment_request", sykVar, sykVar);
                break;
            case SizeUtil.textSize1 /* 22 */:
                vyk vykVar = (vyk) obj;
                w parentFragmentManager2 = vykVar.getParentFragmentManager();
                xih.u(parentFragmentManager2);
                parentFragmentManager2.i0("SyncAuthPortalFragment_request", vykVar, vykVar);
                break;
            case 23:
                apl aplVar = (apl) obj;
                wol wolVar = aplVar.d;
                if (wolVar != null) {
                    y53 y53Var = aplVar.c;
                    h73 h73Var = y53Var.b;
                    switch (wolVar.ordinal()) {
                        case 0:
                        case 1:
                            h73Var.a.b();
                            break;
                        case 2:
                            y53Var.a.g0();
                            y53Var.T(mh0.F);
                            f7d f7dVar = h73Var.a;
                            fp1 fp1Var = f7dVar.a;
                            String[] strArr2 = OperaApplication.K;
                            l6e l6eVarC = ((OperaApplication) fp1Var.getApplication()).I().c(9223372036854775805L);
                            if (l6eVarC != null) {
                                f7dVar.k.b(l6eVarC, "", false, true);
                                break;
                            }
                            break;
                        case 3:
                            y53Var.T(mh0.e);
                            h73Var.a.b.e(new xl3(null), false);
                            break;
                        case 4:
                            y53Var.T(mh0.g);
                            h73Var.a.a(wg7.class);
                            break;
                        case 5:
                            y53Var.T(mh0.j);
                            h73Var.a.b.e(new tca(0), false);
                            break;
                        case 6:
                            y53Var.T(mh0.n);
                            f7d f7dVar2 = h73Var.a;
                            fp1 fp1Var2 = f7dVar2.a;
                            String[] strArr3 = OperaApplication.K;
                            OperaApplication operaApplication = (OperaApplication) fp1Var2.getApplication();
                            zhj.a(new nlh(operaApplication.H(), f7dVar2.e, operaApplication.J()), 4099).c(f7dVar2.a);
                            break;
                        case 7:
                            y53Var.T(mh0.y);
                            f7d f7dVar3 = h73Var.a;
                            zhj.a(new fge(f7dVar3.a, f7dVar3.d, f7dVar3.e), 4099).c(f7dVar3.a);
                            break;
                        case 8:
                            y53Var.T(mh0.G);
                            lcp.C(h73Var.a.a, jzd.MAIN_MENU);
                            break;
                        case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                            y53Var.T(mh0.f);
                            h73Var.a.b.e(new wrk(), false);
                            break;
                        case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                            y53Var.T(mh0.H);
                            f7d f7dVar4 = h73Var.a;
                            f7dVar4.c.a(f7dVar4.a, o3i.MAIN_MENU, null);
                            break;
                        case 11:
                            y53Var.T(mh0.I);
                            fp1 fp1Var3 = h73Var.a.a;
                            Intent intentB = mdb.b(fp1Var3);
                            intentB.setAction("android.intent.action.MAIN");
                            intentB.addCategory("android.intent.category.LAUNCHER");
                            intentB.putExtra("DESTINATION_VIEW_ID", (int) j7c.f(40));
                            intentB.setAction("ACTION_DESTINATION_VIEW");
                            fp1Var3.startActivity(intentB);
                            break;
                    }
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                k8 k8Var = (k8) obj;
                k8Var.r0(new qrl(k8Var, !k8Var.isEnabled(), k8Var.m0(), b5));
                break;
            case 25:
                ((rzg) obj).dismiss();
                break;
            case 26:
                ((UCToggle) obj).toggle();
                break;
            case 27:
                ((lem) obj).b.invoke();
                break;
            case 28:
                int i3 = UCSecondLayerFooter.w;
                ((UCSecondLayerFooter) obj).r().toggle();
                break;
            default:
                pjb pjbVar2 = ((UCSecondLayerHeader) obj).B;
                kfm kfmVar = ((dfm) (pjbVar2 != null ? pjbVar2 : null)).c;
                i3j i3jVar = kfmVar.c;
                kfmVar.m.a(lah.z(new PredefinedUIResponse(mqg.d, ((axm) i3jVar.b).o(), (String) i3jVar.a)));
                break;
        }
    }
}
