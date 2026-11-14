package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h0d {
    public static final h0d a;
    public static final h0d b;
    public static final h0d c;
    public static final /* synthetic */ h0d[] d;

    static {
        h0d h0dVar = new h0d("SIGNED_OUT", 0);
        a = h0dVar;
        h0d h0dVar2 = new h0d("ANONYMOUS", 1);
        b = h0dVar2;
        h0d h0dVar3 = new h0d("SIGNED_IN", 2);
        c = h0dVar3;
        d = new h0d[]{h0dVar, h0dVar2, h0dVar3};
    }

    public static h0d valueOf(String str) {
        return (h0d) Enum.valueOf(h0d.class, str);
    }

    public static h0d[] values() {
        return (h0d[]) d.clone();
    }
}
