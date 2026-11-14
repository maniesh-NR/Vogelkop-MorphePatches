package defpackage;

import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class bp8 extends aqi implements nq {
    public final ap8 u;

    public bp8(String str, yo yoVar, String str2, dl dlVar, bp bpVar, i3j i3jVar, ap apVar) {
        ap8 ap8Var;
        super("Native Ad", str, null, null, "", "ID String", str2, dlVar, "Call to action text", yoVar, bpVar, i3jVar, apVar);
        ap8.b.getClass();
        if (!TextUtils.isEmpty(str2)) {
            h58 h58Var = ap8.e;
            w4 w4VarE = sko.e(h58Var, h58Var);
            while (true) {
                if (!w4VarE.hasNext()) {
                    ap8Var = ap8.c;
                    break;
                }
                ap8 ap8Var2 = (ap8) w4VarE.next();
                if (ap8Var2.a.equals(str2)) {
                    ap8Var = ap8Var2;
                    break;
                }
            }
        } else {
            ap8Var = ap8.c;
        }
        this.u = ap8Var;
    }

    @Override // defpackage.nq
    public final mq a(dl dlVar, km kmVar, k8 k8Var, kq kqVar, List list) {
        return new ro8(this, dlVar, kmVar, k8Var, kqVar, list);
    }

    @Override // defpackage.yz
    public final v50 e() {
        return v50.n;
    }

    @Override // defpackage.yz
    public final String n() {
        return this.a;
    }
}
