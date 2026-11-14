package ads_mobile_sdk;

import android.view.View;
import defpackage.fq;
import defpackage.llp;
import java.util.ArrayList;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class td1 extends cc1 {
    public final View m;
    public final llp n;

    public td1(View view, String str, a2 a2Var, xv xvVar, kh3 kh3Var, z2 z2Var, ph0 ph0Var, se2 se2Var, jz2 jz2Var, ve2 ve2Var, llp llpVar, defpackage.r83 r83Var) {
        super(str, a2Var, xvVar, kh3Var, z2Var, ph0Var, se2Var, jz2Var, ve2Var, r83Var);
        this.m = view;
        this.n = llpVar;
    }

    public final fq l() {
        if (b().r0) {
            ArrayList arrayList = b().a0;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (StringsKt.E((String) obj, "FirstParty", false)) {
                    }
                }
            }
            View view = this.m;
            return new fq(view.getWidth(), view.getHeight());
        }
        h2 h2Var = !b().y.isEmpty() ? (h2) b().y.get(0) : (h2) b().g.get(0);
        return h2Var.c ? fq.i : new fq(h2Var.a, h2Var.b);
    }
}
