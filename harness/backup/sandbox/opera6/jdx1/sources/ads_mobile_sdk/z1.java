package ads_mobile_sdk;

import defpackage.ulp;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public enum z1 {
    FORMAT_DEFAULT(0),
    ON_AD_OPENED(1),
    ON_AD_SHOW(2),
    THIRD_PARTY_SDK_CALLBACK(3);

    public static final ulp b = new ulp(0 == true ? 1 : 0);
    public static final LinkedHashMap c;
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        z1[] z1VarArrValues = values();
        int iA = qbd.a(z1VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (z1 z1Var : z1VarArrValues) {
            linkedHashMap.put(Integer.valueOf(z1Var.a), z1Var);
        }
        c = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    z1(int i) {
        this.a = i;
    }
}
