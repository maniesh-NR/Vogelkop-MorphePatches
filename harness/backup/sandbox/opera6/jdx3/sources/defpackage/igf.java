package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class igf {
    public static final wu5 b;
    public static final /* synthetic */ igf[] c;
    public static final /* synthetic */ h58 d;
    public final byte a;

    static {
        igf[] igfVarArr = {new igf("DESTINATIONS", 0, 1), new igf("PLANS", 1, 2), new igf("FREE_ONBOARDING", 2, 3)};
        c = igfVarArr;
        d = new h58(igfVarArr);
        b = new wu5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public igf(String str, int i, int i2) {
        this.a = i2;
    }

    public static igf valueOf(String str) {
        return (igf) Enum.valueOf(igf.class, str);
    }

    public static igf[] values() {
        return (igf[]) c.clone();
    }
}
