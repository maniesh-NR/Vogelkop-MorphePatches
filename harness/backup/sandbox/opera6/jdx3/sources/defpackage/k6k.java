package defpackage;

import com.leanplum.utils.SizeUtil;

/* loaded from: classes.dex */
public abstract class k6k {
    public final e6k a;
    public final u5k b;
    public final pde c = new pde(null);

    public k6k(e6k e6kVar, u5k u5kVar) {
        this.a = e6kVar;
        this.b = u5kVar;
    }

    public kv8 a() {
        iv8 iv8Var = iv8.a;
        return iv8.b;
    }

    public mv8 b(e6k e6kVar) {
        switch (e6kVar == null ? -1 : j6k.a[e6kVar.ordinal()]) {
            case -1:
            case 5:
            case 6:
            case 7:
            case 8:
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case SizeUtil.textSize0_1 /* 18 */:
            case 19:
            case SizeUtil.textSize0 /* 20 */:
                return iv8.a;
            case 0:
            default:
                h9o.p();
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
                return jv8.a;
        }
    }

    public abstract int c(bz3 bz3Var);

    public abstract boolean d(bz3 bz3Var);
}
