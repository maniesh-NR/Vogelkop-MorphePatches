package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e9b {
    public static final e9b a;
    public static final e9b b;
    public static final e9b c;
    public static final /* synthetic */ e9b[] d;

    static {
        e9b e9bVar = new e9b("Focused", 0);
        a = e9bVar;
        e9b e9bVar2 = new e9b("UnfocusedEmpty", 1);
        b = e9bVar2;
        e9b e9bVar3 = new e9b("UnfocusedNotEmpty", 2);
        c = e9bVar3;
        d = new e9b[]{e9bVar, e9bVar2, e9bVar3};
    }

    public static e9b valueOf(String str) {
        return (e9b) Enum.valueOf(e9b.class, str);
    }

    public static e9b[] values() {
        return (e9b[]) d.clone();
    }
}
