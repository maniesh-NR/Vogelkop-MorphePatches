package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u1k {
    public static final u1k a;
    public static final /* synthetic */ u1k[] b;

    static {
        u1k u1kVar = new u1k("START", 0);
        a = u1kVar;
        b = new u1k[]{u1kVar, new u1k("CENTER", 1)};
    }

    public static u1k valueOf(String str) {
        return (u1k) Enum.valueOf(u1k.class, str);
    }

    public static u1k[] values() {
        return (u1k[]) b.clone();
    }
}
