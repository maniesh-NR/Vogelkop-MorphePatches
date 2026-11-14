package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.OperaRateBar;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.downloads.DownloadProvider;
import com.opera.android.settings.BigSwitchButton;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.api.Callback;
import com.usercentrics.sdk.UsercentricsBanner;
import com.usercentrics.sdk.ui.components.UCButton;
import com.usercentrics.sdk.ui.components.UCTextView;
import com.usercentrics.sdk.ui.secondLayer.component.header.UCSecondLayerHeader;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class j5g implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j5g(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function1 function1Access$getOnLoginClickedCallback$p;
        byte b = this.a;
        eo0 eo0Var = eo0.c;
        eo0 eo0Var2 = eo0.b;
        String str = "image/png";
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ot2 ot2Var = ((t5g) ((k5g) obj2).c.b).I0().b;
                int i = ((w3g) obj).a;
                x5g x5gVar = (x5g) ot2Var.d.get();
                x5g.b(x5gVar, new lt2(i, new eme(x5gVar), ot2Var));
                break;
            case 1:
                hag hagVar = (hag) obj2;
                hagVar.b.s.e(new c9g(((gag) hagVar.c.get(((pmj) obj).getAdapterPosition())).a), false);
                break;
            case 2:
                ljh ljhVar = (ljh) obj2;
                wjh wjhVar = (wjh) ljhVar.f;
                int i2 = ((OperaRateBar) obj).p;
                Integer num = ((vjh) wjhVar.f).b;
                if (num != null) {
                    wjhVar.f = new vjh(num.intValue() == i2 ? ujh.b : ujh.a, num);
                    if (((sa2) wjhVar.e).e()) {
                        ((ai) wjhVar.b).invoke((vjh) wjhVar.f);
                    }
                }
                ljhVar.h0();
                break;
            case 3:
                ljh ljhVar2 = (ljh) obj2;
                ojh ojhVar = (ojh) ljhVar2.f;
                Editable text = ((OperaTextInputEditText) ((q5g) obj).d).getText();
                String string = text != null ? text.toString() : null;
                sx8 sx8Var = ojhVar.d;
                if (ojhVar.c.e()) {
                    yo7 yo7Var = ojhVar.a;
                    Callback callback = (Callback) yo7Var.b;
                    vjh vjhVar = (vjh) yo7Var.c;
                    qjh qjhVar = (qjh) yo7Var.d;
                    callback.run(new pjh(sx8Var != null ? sx8Var.b : null, eo0Var2, string, vjhVar.b));
                    if (!Intrinsics.a(eo0Var2, eo0Var)) {
                        qjhVar.c.f(new glj(2132019051, 5000));
                    }
                }
                ljhVar2.h0();
                break;
            case 4:
                pg5 pg5Var = (pg5) obj2;
                ojh ojhVar2 = (ojh) pg5Var.e;
                Editable text2 = ((OperaTextInputEditText) ((q5g) obj).d).getText();
                String string2 = text2 != null ? text2.toString() : null;
                sx8 sx8Var2 = ojhVar2.d;
                if (ojhVar2.c.e()) {
                    yo7 yo7Var2 = ojhVar2.a;
                    Callback callback2 = (Callback) yo7Var2.b;
                    vjh vjhVar2 = (vjh) yo7Var2.c;
                    qjh qjhVar2 = (qjh) yo7Var2.d;
                    callback2.run(new pjh(sx8Var2 != null ? sx8Var2.b : null, eo0Var2, string2, vjhVar2.b));
                    if (!Intrinsics.a(eo0Var2, eo0Var)) {
                        qjhVar2.c.f(new glj(2132019051, 5000));
                    }
                }
                pg5Var.b();
                break;
            case 5:
                pg5 pg5Var2 = (pg5) obj2;
                wjh wjhVar2 = (wjh) pg5Var2.e;
                int i3 = ((OperaRateBar) obj).p;
                Integer num2 = ((vjh) wjhVar2.f).b;
                if (num2 != null) {
                    wjhVar2.f = new vjh(num2.intValue() == i3 ? ujh.b : ujh.a, num2);
                    if (((sa2) wjhVar2.e).e()) {
                        ((ai) wjhVar2.b).invoke((vjh) wjhVar2.f);
                    }
                }
                pg5Var2.b();
                break;
            case 6:
                knh knhVar = (knh) obj;
                if (((s6h) obj2).I()) {
                    dfm dfmVar = knhVar.B;
                    (dfmVar != null ? dfmVar : null).S();
                    break;
                }
                break;
            case 7:
                ((pli) ((ami) obj2).g).invoke(((ffh) ((gfh) obj)).a);
                break;
            case 8:
                ((pli) ((ami) obj2).g).invoke((hmi) obj);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((lfh) ((ami) obj2).e).a(!((hfh) ((jfh) obj)).a);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                vxi vxiVar = (vxi) obj2;
                ((lz8) vxiVar.f).invoke(((FidoCredentialDetails) obj).getCredentialId());
                vxiVar.b.Q(hjm.a);
                break;
            case 11:
                tji tjiVar = (tji) obj;
                l6j l6jVar = ((z8j) obj2).c;
                if (l6jVar != null) {
                    tjiVar.invoke(l6jVar);
                    break;
                }
                break;
            case 12:
                Uri uriB = (Uri) obj2;
                fp1 fp1Var = ((gcj) obj).r;
                if (s29.g(uriB)) {
                    uriB = DownloadProvider.b(fp1Var, uriB, "image/png");
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(1);
                intent.setDataAndType(uriB, "image/png");
                fp1Var.startActivity(intent);
                break;
            case 13:
                ((ucj) obj2).c.invoke(((tcj) obj).a);
                break;
            case 14:
                nak nakVar = (nak) ((d7h) ((shf) obj2).b).b;
                nakVar.k((Object) null, s5h.a((s5h) nakVar.getValue(), (n8g) obj, false, 0, 62));
                break;
            case 15:
                ((qmj) obj2).c.run(((pmj) obj).c);
                break;
            case 16:
                ((View.OnClickListener) obj).onClick(view);
                ((asj) obj2).b(1);
                break;
            case 17:
                juj jujVar = (juj) obj2;
                jujVar.z++;
                ghf ghfVar = new ghf(new i4d(new vvf((Uri) obj, str, (byte) 19)));
                ghfVar.c = new txi(jujVar, (byte) 9);
                ghfVar.I(jujVar.getContext());
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                Uri uriB2 = (Uri) obj;
                fp1 fp1Var2 = ((kuj) ((tl3) obj2).e).A;
                HashSet hashSet = s29.a;
                if ("file".equals(uriB2.getScheme())) {
                    uriB2 = DownloadProvider.b(fp1Var2, uriB2, "image/png");
                }
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.addFlags(1);
                intent2.setDataAndType(uriB2, "image/png");
                fp1Var2.startActivity(intent2);
                break;
            case 19:
                o9k o9kVar = (o9k) obj2;
                or2 or2Var = (or2) obj;
                if (!o9kVar.l) {
                    o9kVar.l = true;
                    ((OperaMaterialButton) or2Var.e).R(true);
                    o9kVar.i0();
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                View view2 = (View) obj2;
                OperaListItem operaListItem = (OperaListItem) obj;
                b = view2.getVisibility() != 0 ? (byte) 0 : (byte) 1;
                view2.setVisibility(b != 0 ? 8 : 0);
                operaListItem.v(new lxh(b != 0 ? 2131232026 : 2131232032));
                break;
            case 21:
                lrk lrkVar = (lrk) obj2;
                bgm bgmVar = (bgm) obj;
                if (lrkVar != null) {
                    lrkVar.invoke(bgmVar.a);
                    break;
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                wyl wylVar = (wyl) obj2;
                int i4 = ((BigSwitchButton) obj).c != 3 ? 1 : 0;
                if (!wylVar.A) {
                    if (i4 != 0) {
                        xf8.s0(((LinearLayout) wylVar.z.g).getContext(), new gpk((byte) 26), 2132021971, 2132021970);
                        break;
                    }
                } else {
                    wylVar.u.V(i4, "tracker_blocker");
                    break;
                }
                break;
            case 23:
                u3m u3mVar = (u3m) ((ev5) obj2).c;
                u3mVar.t.a(((r3m) obj).a);
                u3mVar.g0();
                break;
            case SizeUtil.textSize2 /* 24 */:
                y4m y4mVar = (y4m) obj2;
                plk plkVar = y4mVar.d.d;
                ((xl) plkVar.b).j(new e4m(plkVar, (String) obj, b));
                r4m r4mVar = y4mVar.f;
                r4mVar.Y(r4mVar.f.o, 1);
                break;
            case 25:
                fl3 fl3Var = (fl3) obj;
                ll3 ll3Var = (ll3) fl3Var.u.a.get(((y5m) obj2).getAdapterPosition());
                fl3Var.s = ll3Var.equals(fl3Var.t) ? fl3Var.s.f() : (jl3) ll3Var;
                fl3Var.J0();
                break;
            case 26:
                ldm ldmVar = (ldm) obj2;
                boolean z = !ldmVar.s;
                ldmVar.s = z;
                ((mdm) obj).c.invoke(Boolean.valueOf(z));
                ((UCTextView) ((UCButton) ldmVar.r.getValue()).p.getValue()).setText(ldmVar.s ? "Opt in all" : "Opt out all");
                break;
            case 27:
                zdm zdmVar = (zdm) obj2;
                qqg qqgVar = (qqg) obj;
                UsercentricsBanner usercentricsBanner = zdmVar.g.a;
                rqg rqgVar = qqgVar.c;
                String str2 = qqgVar.b;
                int iOrdinal = rqgVar.ordinal();
                Integer num3 = rqgVar.a;
                if (iOrdinal == 0) {
                    Context contextAccess$getContext = UsercentricsBanner.access$getContext(usercentricsBanner);
                    if (contextAccess$getContext != null) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        cs5.k0(contextAccess$getContext, str2);
                    }
                    pvm pvmVar = qqgVar.d;
                    s16 s16Var = dqg.c;
                    if (s16Var == null) {
                        s16Var = new s16();
                    }
                    s16Var.a(pvmVar);
                    break;
                } else if (iOrdinal == 1) {
                    zdmVar.f(num3);
                    break;
                } else if (iOrdinal == 2) {
                    zdmVar.f(num3);
                    break;
                } else if (iOrdinal == 3 && (function1Access$getOnLoginClickedCallback$p = UsercentricsBanner.access$getOnLoginClickedCallback$p(usercentricsBanner)) != null) {
                    function1Access$getOnLoginClickedCallback$p.invoke(str2);
                    break;
                }
                break;
            case 28:
                qqg qqgVar2 = (qqg) obj;
                dfm dfmVar2 = ((UCSecondLayerHeader) obj2).B;
                (dfmVar2 != null ? dfmVar2 : null).a(qqgVar2);
                break;
            default:
                UCSecondLayerHeader uCSecondLayerHeader = (UCSecondLayerHeader) obj2;
                ufm ufmVar = (ufm) obj;
                dfm dfmVar3 = uCSecondLayerHeader.B;
                oqg oqgVar = (oqg) (dfmVar3 != null ? dfmVar3 : null).a.g;
                if (oqgVar != null) {
                    List list = oqgVar.a;
                    if (!list.isEmpty()) {
                        String str3 = oqgVar.b.a;
                        h0c h0cVar = new h0c(uCSecondLayerHeader.getContext(), ufmVar);
                        h0cVar.d = new lrk(1, uCSecondLayerHeader, UCSecondLayerHeader.class, "onLanguageSelected", "onLanguageSelected(Ljava/lang/String;)V", 0, (byte) 9);
                        h0cVar.b(view, list, str3);
                        break;
                    }
                }
                break;
        }
    }
}
