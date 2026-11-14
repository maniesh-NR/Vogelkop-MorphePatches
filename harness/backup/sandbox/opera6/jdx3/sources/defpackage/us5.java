package defpackage;

import J.N;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.opera.android.browser.chromium.ChromiumContent;

/* loaded from: classes.dex */
public final /* synthetic */ class us5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ at5 b;

    public /* synthetic */ us5(at5 at5Var, byte b) {
        this.a = b;
        this.b = at5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        lqm lqmVar = lqm.d;
        at5 at5Var = this.b;
        switch (b) {
            case 0:
                at5Var.m(new Intent("android.intent.action.DIAL", Uri.parse(at5Var.d.d.replaceAll("^callto:", "tel:"))));
                break;
            case 1:
                at5Var.m(new Intent("android.intent.action.SENDTO", Uri.parse(at5Var.d.b)));
                break;
            case 2:
                at5Var.l(ay3.a(at5Var.d.b, lqmVar, false), false, false);
                break;
            case 3:
                ChromiumContent chromiumContent = at5Var.c;
                qs5 qs5Var = at5Var.d;
                String str = qs5Var.e;
                sqh sqhVar = qs5Var.k;
                chromiumContent.getClass();
                lsc lscVarF = wqm.f(str, sqhVar, lqmVar);
                if (lscVarF != null) {
                    chromiumContent.v(lscVarF);
                    break;
                }
                break;
            case 4:
                at5Var.l(ay3.a(at5Var.d.e, lqmVar, false), false, false);
                break;
            case 5:
                d5o d5oVar = at5Var.f;
                ((k73) d5oVar.c).v(2048, ks5.PNG, new ds5(d5oVar, (byte) 1));
                break;
            case 6:
                at5Var.m(new Intent("android.intent.action.SENDTO", Uri.parse(at5Var.d.d)));
                break;
            case 7:
                d5o d5oVar2 = at5Var.f;
                d5oVar2.getClass();
                ((k73) d5oVar2.c).t(new ge5(d5oVar2, new ds5(d5oVar2, (byte) 2), (byte) 1));
                break;
            case 8:
                d5o d5oVar3 = at5Var.f;
                d5oVar3.getClass();
                ((k73) d5oVar3.c).t(new ge5(d5oVar3, new ds5(d5oVar3, (byte) 0), (byte) 1));
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                d5o d5oVar4 = at5Var.f;
                d5oVar4.getClass();
                ((k73) d5oVar4.c).t(new ge5(d5oVar4, new ds5(d5oVar4, (byte) 3), (byte) 1));
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ChromiumContent chromiumContent2 = at5Var.c;
                qs5 qs5Var2 = at5Var.d;
                String str2 = qs5Var2.e;
                sqh sqhVar2 = qs5Var2.k;
                chromiumContent2.getClass();
                N.M8vd_RmR(chromiumContent2.e(), str2, sqhVar2 != null ? sqhVar2.a : "");
                break;
            case 11:
                at5Var.l(ay3.a(at5Var.d.b, lqmVar, false), true, false);
                break;
            case 12:
                xgf xgfVar = new xgf(at5Var.d.b);
                xgfVar.o = at5Var.c.t;
                xgfVar.n = true;
                zi4.u(at5Var.b.getContext(), xgfVar);
                break;
            case 13:
                phj.t0(at5Var.b.getContext(), at5Var.d.d);
                break;
            case 14:
                phj.t0(at5Var.b.getContext(), at5Var.d.c);
                break;
            case 15:
                ChromiumContent chromiumContent3 = at5Var.c;
                qs5 qs5Var3 = at5Var.d;
                String str3 = qs5Var3.b;
                sqh sqhVar3 = qs5Var3.k;
                chromiumContent3.getClass();
                N.M8vd_RmR(chromiumContent3.e(), str3, sqhVar3 != null ? sqhVar3.a : "");
                break;
            default:
                at5Var.i.run(new yu(at5Var.d.f, at5Var.c.p()));
                break;
        }
    }
}
