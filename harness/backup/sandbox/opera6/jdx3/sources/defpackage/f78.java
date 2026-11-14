package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f78 {
    public static final f78 a;
    public static final /* synthetic */ f78[] b;

    static {
        f78 f78Var = new f78("INFO", 0);
        a = f78Var;
        b = new f78[]{f78Var};
    }

    public static f78 valueOf(String str) {
        return (f78) Enum.valueOf(f78.class, str);
    }

    public static f78[] values() {
        return (f78[]) b.clone();
    }
}
