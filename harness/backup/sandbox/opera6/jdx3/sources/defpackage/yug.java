package defpackage;

import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class yug {
    public final et3 a;
    public final q2 b;
    public final q2 c;

    public yug(et3 et3Var, q2 q2Var, q2 q2Var2) {
        this.a = et3Var;
        this.b = q2Var;
        this.c = q2Var2;
    }

    public static /* synthetic */ void c(yug yugVar, int i, ltg ltgVar, int i2) throws JSONException {
        if ((i2 & 2) != 0) {
            ltgVar = ltg.d;
        }
        yugVar.b(i, ltgVar, false);
    }

    public final void a(int i) {
        c(this, i, null, 6);
    }

    public final void b(int i, ltg ltgVar, boolean z) throws JSONException {
        qtg qtgVar = (qtg) this.a.invoke();
        int i2 = qtgVar.a;
        q2 q2Var = this.b;
        if (i2 == 1) {
            ((gjm) q2Var.invoke()).e(new ptg(i, ltgVar, "DEFAULT", qtgVar.b), z);
            return;
        }
        ((gjm) q2Var.invoke()).e(new avg(), z);
        nvg nvgVar = (nvg) this.c.invoke();
        p8f p8fVar = nvgVar.c;
        gmk gmkVar = nvgVar.d;
        if (p8fVar.v()) {
            p8f p8fVar2 = nvgVar.c;
            if (p8fVar2.v()) {
                gmkVar.a.p(nvgVar);
                p8fVar2.C(2);
            }
        }
        if (p8fVar.v()) {
            p8fVar.C(2);
        }
        String str = ltgVar.a;
        String str2 = ltgVar.b;
        String str3 = ltgVar.c;
        List list = Collections.EMPTY_LIST;
        p8fVar.G(new mvg(i, 8, str, str2, str3, list, list, 2));
        if (nvgVar.h != 0) {
            nvgVar.h = (byte) 0;
            nvgVar.b((uvg) gmkVar.a.g());
        }
        gmkVar.a.j(nvgVar.a, nvgVar);
        vvg vvgVar = nvgVar.f;
        byte b = vvgVar.a;
        if (b == 2 || 1 == b) {
            return;
        }
        vvgVar.a = (byte) 1;
        ks3.I(42, "candidate");
    }
}
