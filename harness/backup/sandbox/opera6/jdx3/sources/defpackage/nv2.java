package defpackage;

/* loaded from: classes.dex */
public final class nv2 {
    public final ji a;
    public final ji b;
    public final g92 c;
    public final ji d;
    public final zyk e = z4c.b(new oc2(this, 4));

    public nv2(ji jiVar, ji jiVar2, g92 g92Var, ji jiVar3) {
        this.a = jiVar;
        this.b = jiVar2;
        this.c = g92Var;
        this.d = jiVar3;
    }

    public final boolean a(hk6 hk6Var) {
        switch (hk6Var.ordinal()) {
            case 0:
                return ((Boolean) this.a.get()).booleanValue();
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
            case 8:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return true;
            case 5:
                return ((Boolean) this.b.get()).booleanValue();
            case 6:
                return ((Boolean) this.c.get()).booleanValue();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return ((Boolean) this.d.get()).booleanValue();
            default:
                h9o.p();
                return false;
        }
    }
}
