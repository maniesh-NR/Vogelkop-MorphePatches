package ads_mobile_sdk;

import defpackage.ujp;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public enum w1 {
    FORMAT_DEFAULT(0),
    ONE_PIXEL(1),
    /* JADX INFO: Fake field, exist only in values array */
    AD_LOAD(2),
    /* JADX INFO: Fake field, exist only in values array */
    NO_IMPRESSION(3),
    THIRD_PARTY_SDK_CALLBACK(4);

    public static final ujp b = new ujp((byte) (0 == true ? 1 : 0));
    public static final LinkedHashMap c;
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        w1[] w1VarArrValues = values();
        int iA = qbd.a(w1VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (w1 w1Var : w1VarArrValues) {
            linkedHashMap.put(Integer.valueOf(w1Var.a), w1Var);
        }
        c = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    w1(int i) {
        this.a = i;
    }
}
