package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zvh {
    public static final zvh b;
    public static final /* synthetic */ zvh[] c;
    public static final /* synthetic */ h58 d;
    public final byte a;

    static {
        zvh zvhVar = new zvh("DEFAULT", 0, 0);
        b = zvhVar;
        zvh[] zvhVarArr = {zvhVar, new zvh("ENABLED", 1, 1), new zvh("DISABLED", 2, 2)};
        c = zvhVarArr;
        d = new h58(zvhVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zvh(String str, int i, int i2) {
        this.a = i2;
    }

    public static zvh[] values() {
        return (zvh[]) c.clone();
    }
}
