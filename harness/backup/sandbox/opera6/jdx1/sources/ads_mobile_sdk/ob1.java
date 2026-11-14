package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.kap;
import defpackage.t3p;

/* loaded from: classes.dex */
public final class ob1 implements hlo, kap {
    public static final ob1 b = new ob1(null);
    public final Object a;

    public ob1(Object obj) {
        this.a = obj;
    }

    public static ob1 a(Object obj) {
        if (obj != null) {
            return new ob1(obj);
        }
        t3p.q("instance cannot be null");
        return null;
    }

    @Override // defpackage.tso
    public final Object get() {
        return this.a;
    }
}
