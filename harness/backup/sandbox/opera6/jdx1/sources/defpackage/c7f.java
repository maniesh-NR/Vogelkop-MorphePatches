package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c7f {
    public static final c7f a;
    public static final c7f b;
    public static final c7f c;
    public static final /* synthetic */ c7f[] d;

    static {
        c7f c7fVar = new c7f("NO_OP", 0);
        a = c7fVar;
        c7f c7fVar2 = new c7f("ADD", 1);
        b = c7fVar2;
        c7f c7fVar3 = new c7f("REMOVE", 2);
        c = c7fVar3;
        d = new c7f[]{c7fVar, c7fVar2, c7fVar3};
    }

    public static c7f valueOf(String str) {
        return (c7f) Enum.valueOf(c7f.class, str);
    }

    public static c7f[] values() {
        return (c7f[]) d.clone();
    }
}
