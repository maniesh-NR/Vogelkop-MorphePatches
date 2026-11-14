package defpackage;

import ads_mobile_sdk.a3;
import ads_mobile_sdk.ah0;
import ads_mobile_sdk.av2;
import ads_mobile_sdk.b;
import ads_mobile_sdk.dw;
import ads_mobile_sdk.ep2;
import ads_mobile_sdk.fp2;
import ads_mobile_sdk.l31;
import ads_mobile_sdk.n90;
import ads_mobile_sdk.nj0;
import ads_mobile_sdk.np;
import ads_mobile_sdk.ob1;
import ads_mobile_sdk.rf1;
import ads_mobile_sdk.ru0;
import ads_mobile_sdk.sb0;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class un extends rn {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ao n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un(ao aoVar, Activity activity, zy zyVar, dl dlVar, List list, byte b) {
        super(aoVar, activity, zyVar, dlVar, list);
        this.m = b;
        this.n = aoVar;
    }

    public final void a() {
        switch (this.m) {
            case 0:
                ao.t.d(new c4(new bi(this, (byte) 3), (byte) 8));
                break;
            default:
                ao.t.d(new c4(new bi(this, (byte) 4), (byte) 8));
                break;
        }
    }

    public final void i(boolean z) {
        ao aoVar = this.n;
        if (!z) {
            b(false, bqi.n("ads provider not available", ((bqi) aoVar).g), false, v50.k, (Long) null);
            return;
        }
        int iWidth = ((bqi) aoVar).j.getResources().getDisplayMetrics().widthPixels;
        if (Build.VERSION.SDK_INT >= 30) {
            iWidth = ((rn) this).k.getWindowManager().getCurrentWindowMetrics().getBounds().width();
        }
        byte b = 1;
        int iMax = Math.max(1, Math.max(0, iWidth - (((Integer) aoVar.q.get()).intValue() << 1)) / ((Integer) aoVar.r.get()).intValue());
        String str = ((k43) this).c;
        jta jtaVar = new jta(str);
        ita itaVar = ita.BROWSER;
        zk zkVar = zk.TOP_RIGHT;
        aoVar.s(jtaVar, (List) ((rn) this).l);
        ita itaVar2 = ita.BROWSER;
        if (str == null) {
            qp2.o("Ad unit ID cannot be null.");
            return;
        }
        kta ktaVar = new kta(str, jtaVar.b, jtaVar.c, jtaVar.d, jtaVar.e, jtaVar.f, jtaVar.g, jtaVar.h, jtaVar.i, itaVar2);
        pyl pylVar = new pyl(this, iMax, str);
        l31.j.getClass();
        xgp.a.getClass();
        sb0 sb0Var = ((sb0) ru0.a()).c;
        rhe rheVar = rhe.a;
        List listSingletonList = Collections.singletonList(rheVar);
        l08 l08Var = l08.a;
        she sheVar = she.a;
        CollectionsKt.k0(listSingletonList);
        oie oieVar = new oie(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null, CollectionsKt.k0(Collections.singletonList(rheVar)), l08Var, false, sheVar, zkVar, null, null, false, false, null, l08Var, false, true);
        av2 av2Var = av2.g;
        Boolean bool = Boolean.FALSE;
        Integer numValueOf = Integer.valueOf(iMax);
        ob1 ob1VarA = ob1.a(oieVar);
        ob1 ob1VarA2 = ob1.a(ktaVar);
        ob1 ob1Var = jso.a;
        nj0 nj0Var = new nj0(new a3(ob1Var, ob1Var, ob1Var));
        nj0 nj0Var2 = new nj0(new b(sb0Var.v0, (byte) 28));
        ob1 ob1VarA3 = ob1.a(av2Var);
        ob1 ob1VarA4 = ob1.a(bool);
        nj0 nj0Var3 = new nj0(new np(sb0Var.g1, ob1VarA3, new n90(ob1.a(ktaVar)), nj0Var2, ob1.a(bool), sb0Var.h));
        ob1 ob1VarA5 = ob1.a(numValueOf);
        nj0 nj0Var4 = new nj0(mkh.j);
        ah0 ah0Var = sb0Var.u;
        ((rf1) ((sb0) ru0.a()).T2.get()).a(new bd1((ep2) new nj0(new fp2(sb0Var.a3, ah0Var, ob1VarA, ob1VarA2, nj0Var, sb0Var.t, sb0Var.G, nj0Var2, ob1VarA3, sb0Var.d, ob1VarA4, nj0Var3, sb0Var.F3, ob1VarA5, new nj0(new dw(ah0Var, nj0Var4, b)))).get(), pylVar, null, (byte) 4));
    }

    public final int j() {
        DisplayMetrics displayMetrics = ((bqi) this.n).j.getResources().getDisplayMetrics();
        int iWidth = displayMetrics.widthPixels;
        if (Build.VERSION.SDK_INT >= 30) {
            iWidth = ((rn) this).k.getWindowManager().getCurrentWindowMetrics().getBounds().width();
        }
        return (int) ((iWidth - (((Integer) r0.q.get()).intValue() << 1)) / displayMetrics.density);
    }
}
