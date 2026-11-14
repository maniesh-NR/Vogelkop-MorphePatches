package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t6d {
    public static final t6d a;
    public static final t6d b;
    public static final t6d c;
    public static final t6d d;
    public static final /* synthetic */ t6d[] e;
    public static final /* synthetic */ h58 f;

    static {
        t6d t6dVar = new t6d("VISIBLE", 0);
        a = t6dVar;
        t6d t6dVar2 = new t6d("OVERLAPPED", 1);
        b = t6dVar2;
        t6d t6dVar3 = new t6d("HIDING", 2);
        c = t6dVar3;
        t6d t6dVar4 = new t6d("HIDDEN", 3);
        d = t6dVar4;
        t6d[] t6dVarArr = {t6dVar, t6dVar2, t6dVar3, t6dVar4};
        e = t6dVarArr;
        f = new h58(t6dVarArr);
    }

    public static t6d valueOf(String str) {
        return (t6d) Enum.valueOf(t6d.class, str);
    }

    public static t6d[] values() {
        return (t6d[]) e.clone();
    }
}
