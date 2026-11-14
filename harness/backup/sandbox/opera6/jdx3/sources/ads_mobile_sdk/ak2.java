package ads_mobile_sdk;

import defpackage.tmj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ak2 {
    public static final tmj a;
    public static final ak2 b;
    public static final ak2 c;
    public static final ak2 d;
    public static final /* synthetic */ ak2[] e;

    static {
        ak2 ak2Var = new ak2("UNKNOWN", 0);
        b = ak2Var;
        ak2 ak2Var2 = new ak2("FIFO", 1);
        c = ak2Var2;
        ak2 ak2Var3 = new ak2("ECPM", 2);
        d = ak2Var3;
        e = new ak2[]{ak2Var, ak2Var2, ak2Var3};
        a = new tmj((byte) 17);
    }

    public static ak2[] values() {
        return (ak2[]) e.clone();
    }
}
