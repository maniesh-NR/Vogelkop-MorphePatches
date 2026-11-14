package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v7a {
    public static final v7a a;
    public static final v7a b;
    public static final v7a c;
    public static final v7a d;
    public static final /* synthetic */ v7a[] e;

    static {
        v7a v7aVar = new v7a("HEX_LOWERCASE", 0);
        a = v7aVar;
        v7a v7aVar2 = new v7a("HEX_UPPERCASE", 1);
        v7a v7aVar3 = new v7a("BASE64", 2);
        b = v7aVar3;
        v7a v7aVar4 = new v7a("BASE64_URL", 3);
        c = v7aVar4;
        v7a v7aVar5 = new v7a("BASE64_URL_NO_PADDING", 4);
        d = v7aVar5;
        e = new v7a[]{v7aVar, v7aVar2, v7aVar3, v7aVar4, v7aVar5};
    }

    public static v7a valueOf(String str) {
        return (v7a) Enum.valueOf(v7a.class, str);
    }

    public static v7a[] values() {
        return (v7a[]) e.clone();
    }
}
