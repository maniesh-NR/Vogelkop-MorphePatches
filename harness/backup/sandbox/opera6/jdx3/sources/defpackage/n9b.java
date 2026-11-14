package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n9b {
    public static final n9b a;
    public static final /* synthetic */ n9b[] b;
    public static final /* synthetic */ h58 c;

    static {
        n9b n9bVar = new n9b("LEAKED", 0);
        a = n9bVar;
        n9b[] n9bVarArr = {n9bVar, new n9b("PHISHED", 1), new n9b("WEAK", 2), new n9b("REUSED", 3)};
        b = n9bVarArr;
        c = new h58(n9bVarArr);
    }

    public static n9b valueOf(String str) {
        return (n9b) Enum.valueOf(n9b.class, str);
    }

    public static n9b[] values() {
        return (n9b[]) b.clone();
    }
}
