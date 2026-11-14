package defpackage;

/* loaded from: classes.dex */
public final class jsc {
    public static final ixh c = new ixh(60.0f);
    public static final jsc d;
    public static final jsc e;
    public static final jsc f;
    public final shf a;
    public final shf b;

    static {
        dol dolVar = dol.d;
        dol dolVar2 = dol.e;
        dol dolVar3 = dol.b;
        dol dolVar4 = dol.a;
        shf shfVar = new shf(new dol[]{dolVar, dolVar2}, new dol[]{dolVar, dolVar3, dolVar4}, new dol[]{dolVar, dolVar3, dolVar4});
        shf shfVar2 = new shf(new dol[]{dolVar2}, new dol[]{dolVar3, dolVar4}, new dol[]{dolVar3, dolVar4});
        shf shfVar3 = new shf(new dol[]{dolVar, dolVar2}, new dol[]{dolVar, dolVar3, dolVar4}, new dol[]{dol.c, dolVar, dolVar3, dolVar4});
        d = new jsc(new shf(new dol[0], new dol[]{dolVar4}, new dol[]{dolVar4}), new shf(new dol[0], new dol[]{dolVar4}, new dol[]{dolVar4}));
        e = new jsc(shfVar2, shfVar3);
        f = new jsc(shfVar2, shfVar);
    }

    public jsc(shf shfVar, shf shfVar2) {
        this.a = shfVar;
        this.b = shfVar2;
    }
}
