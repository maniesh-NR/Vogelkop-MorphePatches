package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l9k {
    public static final l9k a;
    public static final l9k b;
    public static final l9k c;
    public static final l9k d;
    public static final /* synthetic */ l9k[] e;

    static {
        l9k l9kVar = new l9k("NONE", 0);
        a = l9kVar;
        l9k l9kVar2 = new l9k("SUCCESS", 1);
        b = l9kVar2;
        l9k l9kVar3 = new l9k("ABORT", 2);
        c = l9kVar3;
        l9k l9kVar4 = new l9k("TIMEOUT", 3);
        d = l9kVar4;
        e = new l9k[]{l9kVar, l9kVar2, l9kVar3, l9kVar4};
    }

    public static l9k valueOf(String str) {
        return (l9k) Enum.valueOf(l9k.class, str);
    }

    public static l9k[] values() {
        return (l9k[]) e.clone();
    }
}
