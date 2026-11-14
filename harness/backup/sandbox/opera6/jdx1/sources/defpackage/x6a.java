package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x6a {
    public static final x6a a;
    public static final x6a b;
    public static final x6a c;
    public static final /* synthetic */ x6a[] d;

    static {
        x6a x6aVar = new x6a("Cursor", 0);
        a = x6aVar;
        x6a x6aVar2 = new x6a("SelectionStart", 1);
        b = x6aVar2;
        x6a x6aVar3 = new x6a("SelectionEnd", 2);
        c = x6aVar3;
        d = new x6a[]{x6aVar, x6aVar2, x6aVar3};
    }

    public static x6a valueOf(String str) {
        return (x6a) Enum.valueOf(x6a.class, str);
    }

    public static x6a[] values() {
        return (x6a[]) d.clone();
    }
}
