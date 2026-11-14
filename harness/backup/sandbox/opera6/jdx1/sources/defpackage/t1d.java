package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t1d {
    public static final t1d a;
    public static final t1d b;
    public static final t1d c;
    public static final /* synthetic */ t1d[] d;

    static {
        t1d t1dVar = new t1d("IsPlacedInLookahead", 0);
        a = t1dVar;
        t1d t1dVar2 = new t1d("IsPlacedInApproach", 1);
        b = t1dVar2;
        t1d t1dVar3 = new t1d("IsNotPlaced", 2);
        c = t1dVar3;
        d = new t1d[]{t1dVar, t1dVar2, t1dVar3};
    }

    public static t1d valueOf(String str) {
        return (t1d) Enum.valueOf(t1d.class, str);
    }

    public static t1d[] values() {
        return (t1d[]) d.clone();
    }
}
