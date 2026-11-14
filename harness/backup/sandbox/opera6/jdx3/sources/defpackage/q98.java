package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q98 {
    public static final wu5 f;
    public static final q98 g;
    public static final q98 h;
    public static final q98 i;
    public static final /* synthetic */ q98[] j;
    public static final /* synthetic */ h58 k;
    public final byte a;
    public final int b;
    public final String c;
    public final pxh d;
    public final rxh e;

    static {
        n98 n98Var = n98.a;
        q98 q98Var = new q98("FREE_PROMOTION", 0, 1, 2131362762, "local_free_esim_promo", cqp.Y(n98Var), cqp.X(n98Var));
        g = q98Var;
        n98 n98Var2 = n98.b;
        q98 q98Var2 = new q98("PAID_PROMOTION", 1, 2, 2131362762, "local_paid_esim_promo", cqp.Y(n98Var2), cqp.X(n98Var2));
        h = q98Var2;
        q98 q98Var3 = new q98("UPSELL", 2, 3, 2131362765, "local_free_upsell", new rxh(2132018899), new rxh(2132018898));
        i = q98Var3;
        q98[] q98VarArr = {q98Var, q98Var2, q98Var3};
        j = q98VarArr;
        k = new h58(q98VarArr);
        f = new wu5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q98(String str, int i2, int i3, int i4, String str2, pxh pxhVar, rxh rxhVar) {
        this.a = i3;
        this.b = i4;
        this.c = str2;
        this.d = pxhVar;
        this.e = rxhVar;
    }

    public static q98 valueOf(String str) {
        return (q98) Enum.valueOf(q98.class, str);
    }

    public static q98[] values() {
        return (q98[]) j.clone();
    }
}
