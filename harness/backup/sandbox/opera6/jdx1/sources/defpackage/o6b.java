package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o6b {
    public static final o6b a;
    public static final o6b b;
    public static final o6b c;
    public static final /* synthetic */ o6b[] d;

    static {
        o6b o6bVar = new o6b("Yes", 0);
        a = o6bVar;
        o6b o6bVar2 = new o6b("No", 1);
        b = o6bVar2;
        o6b o6bVar3 = new o6b("NotInitialized", 2);
        c = o6bVar3;
        d = new o6b[]{o6bVar, o6bVar2, o6bVar3};
    }

    public static o6b valueOf(String str) {
        return (o6b) Enum.valueOf(o6b.class, str);
    }

    public static o6b[] values() {
        return (o6b[]) d.clone();
    }
}
