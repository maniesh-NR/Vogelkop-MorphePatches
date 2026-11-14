package defpackage;

import ads_mobile_sdk.ev;
import ads_mobile_sdk.jz2;
import ads_mobile_sdk.mt0;
import ads_mobile_sdk.rr1;
import android.content.Context;
import android.view.View;
import com.leanplum.utils.SizeUtil;
import com.opera.ad.interstitial.AdActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.weather.ui.WeatherWidgetActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class pkm implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pkm(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                r2f r2fVar = (r2f) obj;
                if (!r2fVar.d) {
                    r2fVar.d = true;
                    ((r6l) r2fVar.e).l();
                    break;
                }
                break;
            case 1:
                ((nmm) obj).G0();
                break;
            case 2:
                ((r6n) obj).c.retry();
                break;
            case 3:
                t6n t6nVar = (t6n) obj;
                tjn tjnVar = t6nVar.c;
                fbl fblVar = t6nVar.b;
                tjnVar.j(((OperaListItem) fblVar.e).isChecked());
                t6nVar.U(((OperaListItem) fblVar.e).isChecked());
                break;
            case 4:
                u6n u6nVar = (u6n) obj;
                aln alnVar = u6nVar.f;
                if (alnVar != null) {
                    u6nVar.d.n(alnVar);
                    break;
                }
                break;
            case 5:
                w6n w6nVar = (w6n) obj;
                w6nVar.c.h(w6nVar.d);
                break;
            case 6:
                ((x6n) obj).c.c();
                break;
            case 7:
                y6n y6nVar = (y6n) obj;
                aln alnVar2 = y6nVar.c;
                if (alnVar2 != null) {
                    y6nVar.b.n(alnVar2);
                    break;
                }
                break;
            case 8:
                g3b g3bVar = (g3b) obj;
                ((tah) g3bVar.t).M((fdn) g3bVar.s);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((gjm) obj).e(new vfn(), false);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                idn idnVar = (idn) obj;
                ((hdn) idnVar.l).run(idnVar.j);
                break;
            case 11:
                bg7 bg7Var = (bg7) obj;
                bg7Var.finish(hjm.a);
                ((ydn) bg7Var.b).C(false);
                bg7Var.d();
                ((x5f) bg7Var.d).L(7, wb0.f, null);
                vx3 vx3VarA = ay3.a("https://support-vpn-pro.opera.com/", lqm.v, false);
                vx3VarA.b = 3;
                o18.t(vx3VarA, true, vx3VarA);
                break;
            case 12:
                yug yugVar = (yug) obj;
                Context context = view.getContext();
                String[] strArr = OperaApplication.K;
                if (((OperaApplication) context.getApplicationContext()).D().d()) {
                    yugVar.a(10);
                    break;
                }
                break;
            case 13:
                ((x5f) ((ukn) obj).F).S(11);
                String strQ = rih.q(view.getContext());
                if (strQ != null) {
                    vx3 vx3VarA2 = ay3.a(strQ, lqm.d, false);
                    vx3VarA2.a(true);
                    vx3VarA2.b = 3;
                    am2.v(vx3VarA2);
                    break;
                }
                break;
            case 14:
                int i = WeatherWidgetActivity.e0;
                ChromiumContent chromiumContent = ((WeatherWidgetActivity) obj).N;
                if (chromiumContent != null) {
                    chromiumContent.x(false);
                    break;
                }
                break;
            case 15:
                exn exnVar = (exn) obj;
                exnVar.k0();
                exnVar.h0();
                break;
            case 16:
                fxn fxnVar = (fxn) obj;
                if (fxnVar.f != null) {
                    fxnVar.b.c();
                    fxnVar.k0();
                    fxnVar.h0();
                    break;
                }
                break;
            case 17:
                ((AdActivity) obj).finish();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                ((jz2) obj).g.set(true);
                break;
            case 19:
                ((u2p) obj).j(view);
                break;
            case SizeUtil.textSize0 /* 20 */:
                oep oepVar = (oep) obj;
                if (aap.f().j) {
                    oepVar.onClick(view);
                    break;
                }
                break;
            case 21:
                ((mt0) obj).a(ev.b);
                break;
            default:
                ((rr1) obj).a(true);
                break;
        }
    }
}
