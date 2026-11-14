package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z4a {
    public static final z4a a;
    public static final z4a b;
    public static final z4a c;
    public static final z4a d;
    public static final /* synthetic */ z4a[] e;

    static {
        z4a z4aVar = new z4a("FIRST", 0);
        a = z4aVar;
        z4a z4aVar2 = new z4a("LAST", 1);
        b = z4aVar2;
        z4a z4aVar3 = new z4a("MIDDLE", 2);
        c = z4aVar3;
        z4a z4aVar4 = new z4a("SINGLE", 3);
        d = z4aVar4;
        e = new z4a[]{z4aVar, z4aVar2, z4aVar3, z4aVar4};
    }

    public static z4a valueOf(String str) {
        return (z4a) Enum.valueOf(z4a.class, str);
    }

    public static z4a[] values() {
        return (z4a[]) e.clone();
    }
}
