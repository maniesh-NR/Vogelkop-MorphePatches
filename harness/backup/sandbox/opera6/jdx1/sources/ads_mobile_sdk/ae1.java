package ads_mobile_sdk;

import defpackage.xrc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ae1 {
    public static final ae1 a;
    public static final ae1 b;
    public static final ae1 c;
    public static final ae1 d;
    public static final ae1 e;
    public static final ae1 f;
    public static final ae1 g;
    public static final ae1 h;
    public static final ae1 i;
    public static final ae1 j;
    public static final ae1 k;
    public static final ae1 l;
    public static final ae1 m;
    public static final ae1 n;
    public static final /* synthetic */ ae1[] o;

    static {
        ae1 ae1Var = new ae1("INTERNAL_ERROR", 0);
        a = ae1Var;
        ae1 ae1Var2 = new ae1("INVALID_REQUEST", 1);
        b = ae1Var2;
        ae1 ae1Var3 = new ae1("NO_FILL", 2);
        c = ae1Var3;
        ae1 ae1Var4 = new ae1("APP_ID_MISSING", 3);
        d = ae1Var4;
        ae1 ae1Var5 = new ae1("NETWORK_ERROR", 4);
        e = ae1Var5;
        ae1 ae1Var6 = new ae1("INVALID_AD_UNIT_ID", 5);
        ae1 ae1Var7 = new ae1("INVALID_AD_SIZE", 6);
        ae1 ae1Var8 = new ae1("MEDIATION_SHOW_ERROR", 7);
        ae1 ae1Var9 = new ae1("NOT_READY", 8);
        ae1 ae1Var10 = new ae1("AD_RESPONSE_ALREADY_USED", 9);
        f = ae1Var10;
        ae1 ae1Var11 = new ae1("APP_NOT_FOREGROUND", 10);
        ae1 ae1Var12 = new ae1("INTERNAL_SHOW_ERROR", 11);
        ae1 ae1Var13 = new ae1("MEDIATION_NO_FILL", 12);
        g = ae1Var13;
        ae1 ae1Var14 = new ae1("INVALID_AD_RESPONSE", 13);
        h = ae1Var14;
        ae1 ae1Var15 = new ae1("REQUEST_ID_MISMATCH", 14);
        i = ae1Var15;
        ae1 ae1Var16 = new ae1("TIMEOUT", 15);
        j = ae1Var16;
        ae1 ae1Var17 = new ae1("CANCELLED", 16);
        k = ae1Var17;
        ae1 ae1Var18 = new ae1("WEB_VIEW_DESTROYED_ERROR", 17);
        l = ae1Var18;
        ae1 ae1Var19 = new ae1("ADAPTER_INITIALIZATION_ERROR", 18);
        m = ae1Var19;
        ae1 ae1Var20 = new ae1("INVALID_DATA_URL", 19);
        n = ae1Var20;
        o = new ae1[]{ae1Var, ae1Var2, ae1Var3, ae1Var4, ae1Var5, ae1Var6, ae1Var7, ae1Var8, ae1Var9, ae1Var10, ae1Var11, ae1Var12, ae1Var13, ae1Var14, ae1Var15, ae1Var16, ae1Var17, ae1Var18, ae1Var19, ae1Var20};
    }

    public static ae1[] values() {
        return (ae1[]) o.clone();
    }

    public final xrc a() {
        switch (ordinal()) {
            case 0:
                return xrc.INTERNAL_ERROR;
            case 1:
                return xrc.INVALID_REQUEST;
            case 2:
                return xrc.NO_FILL;
            case 3:
                return xrc.APP_ID_MISSING;
            case 4:
                return xrc.NETWORK_ERROR;
            case 5:
                return xrc.INVALID_REQUEST;
            case 6:
                return xrc.INVALID_REQUEST;
            case 7:
                return xrc.INTERNAL_ERROR;
            case 8:
                return xrc.INTERNAL_ERROR;
            case 9:
                return xrc.AD_RESPONSE_ALREADY_USED;
            case 10:
                return xrc.INTERNAL_ERROR;
            case 11:
                return xrc.INTERNAL_ERROR;
            case 12:
                return xrc.NO_FILL;
            case 13:
                return xrc.INVALID_AD_RESPONSE;
            case 14:
                return xrc.REQUEST_ID_MISMATCH;
            case 15:
                return xrc.TIMEOUT;
            case 16:
                return xrc.CANCELLED;
            case 17:
                return xrc.INTERNAL_ERROR;
            case 18:
                return xrc.INTERNAL_ERROR;
            case 19:
                return xrc.INTERNAL_ERROR;
            default:
                h9o.p();
                return null;
        }
    }
}
