package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s1m {
    public static final s1m a;
    public static final s1m b;
    public static final /* synthetic */ s1m[] c;

    static {
        s1m s1mVar = new s1m("DEFERRED", 0);
        a = s1mVar;
        s1m s1mVar2 = new s1m("IMMEDIATE", 1);
        b = s1mVar2;
        c = new s1m[]{s1mVar, s1mVar2, new s1m("EXCLUSIVE", 2)};
    }

    public static s1m valueOf(String str) {
        return (s1m) Enum.valueOf(s1m.class, str);
    }

    public static s1m[] values() {
        return (s1m[]) c.clone();
    }
}
