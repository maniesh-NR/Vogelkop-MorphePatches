package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes.dex */
public enum yo {
    ADMOB("admob"),
    ADX("adx"),
    GB_ONLINE("sdkGb"),
    PANGLE("pangle"),
    /* JADX INFO: Fake field, exist only in values array */
    BIGO("bigo"),
    OPERA("neosdk"),
    FAKE_AD("fake_ad");

    public static final Set h = Collections.unmodifiableSet(EnumSet.allOf(yo.class));
    public final String a;

    yo(String str) {
        this.a = str;
    }

    public static yo d(String str) {
        for (yo yoVar : values()) {
            if (yoVar.a.equals(str)) {
                return yoVar;
            }
        }
        qp2.o("unknown ad provider sdk source: ".concat(str));
        return null;
    }

    public static int g(yo yoVar, rm rmVar) {
        int iOrdinal = yoVar.ordinal();
        if (iOrdinal == 0) {
            return rmVar.ordinal() != 6 ? 60 : 720;
        }
        if (iOrdinal != 2) {
            return (iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) ? 60 : 30;
        }
        return 15;
    }

    public static u50 h(yo yoVar) {
        switch (yoVar) {
            case ADMOB:
                break;
            case ADX:
                break;
            case GB_ONLINE:
                break;
            case PANGLE:
                break;
            case BIGO:
                break;
            case OPERA:
                break;
            case FAKE_AD:
                qp2.n("State should not be possible");
                break;
            default:
                h9o.r("Not reached");
                break;
        }
        return null;
    }
}
