package defpackage;

import ads_mobile_sdk.iu0;
import ads_mobile_sdk.j;
import ads_mobile_sdk.ox;
import ads_mobile_sdk.qb1;
import ads_mobile_sdk.qx;
import java.util.ArrayList;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class fep extends iu0 {
    public final void b(ArrayList arrayList) {
        b$1();
        qx qxVar = (qx) this.b;
        RandomAccess randomAccess = qxVar.allowedApis_;
        if (!((j) randomAccess).a) {
            qb1 qb1Var = (qb1) randomAccess;
            qxVar.allowedApis_ = qb1Var.a(qb1Var.c << 1);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qb1) qxVar.allowedApis_).b(((ox) obj).getNumber());
        }
    }

    public final hf0 c() {
        qx qxVar = (qx) this.b;
        qxVar.getClass();
        return new hf0(qxVar.allowedApis_, qx.allowedApis_converter_);
    }
}
