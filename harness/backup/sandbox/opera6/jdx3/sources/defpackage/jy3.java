package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jy3 {
    public static final y55 c;
    public static final /* synthetic */ jy3[] d;
    public static final /* synthetic */ h58 e;
    public final String a;
    public final int b;

    static {
        jy3[] jy3VarArr = {new jy3("DEFAULT", 0, "default", 2131364282), new jy3("LANGUAGE", 1, "language", 2131364304), new jy3("REWARDS", 2, "rewards", 2131364332), new jy3("STARTUP", 3, "startup", 2131364350), new jy3("TABS", 4, "tabs", 2131364314), new jy3("ISLANDS", 5, "islands", 2131364359)};
        d = jy3VarArr;
        e = new h58(jy3VarArr);
        c = new y55();
    }

    public jy3(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static jy3 valueOf(String str) {
        return (jy3) Enum.valueOf(jy3.class, str);
    }

    public static jy3[] values() {
        return (jy3[]) d.clone();
    }
}
