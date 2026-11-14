package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x3g {
    public static final x3g a;
    public static final /* synthetic */ x3g[] b;
    public static final /* synthetic */ h58 c;

    static {
        x3g x3gVar = new x3g("HMTL", 0);
        a = x3gVar;
        x3g[] x3gVarArr = {x3gVar, new x3g("BASIC", 1), new x3g("DIGEST", 2), new x3g("OTHER", 3), new x3g("USERNAME_ONLY", 4)};
        b = x3gVarArr;
        c = new h58(x3gVarArr);
    }

    public static x3g valueOf(String str) {
        return (x3g) Enum.valueOf(x3g.class, str);
    }

    public static x3g[] values() {
        return (x3g[]) b.clone();
    }
}
