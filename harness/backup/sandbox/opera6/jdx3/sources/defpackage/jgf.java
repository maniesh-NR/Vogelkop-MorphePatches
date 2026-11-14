package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jgf {
    public static final hv5 a;
    public static final /* synthetic */ jgf[] b;
    public static final /* synthetic */ h58 c;

    static {
        jgf[] jgfVarArr = {new jgf("UPSELL_NOTIFICATION", 0)};
        b = jgfVarArr;
        c = new h58(jgfVarArr);
        a = new hv5();
    }

    public static jgf valueOf(String str) {
        return (jgf) Enum.valueOf(jgf.class, str);
    }

    public static jgf[] values() {
        return (jgf[]) b.clone();
    }
}
