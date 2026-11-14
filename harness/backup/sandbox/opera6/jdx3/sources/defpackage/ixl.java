package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ixl {
    public static final ixl a;
    public static final ixl b;
    public static final ixl c;
    public static final /* synthetic */ ixl[] d;

    static {
        ixl ixlVar = new ixl("SUCCESS", 0);
        a = ixlVar;
        ixl ixlVar2 = new ixl("FAILED", 1);
        b = ixlVar2;
        ixl ixlVar3 = new ixl("FAILED_INVALID_GROUP", 2);
        c = ixlVar3;
        d = new ixl[]{ixlVar, ixlVar2, ixlVar3};
    }

    public static ixl valueOf(String str) {
        return (ixl) Enum.valueOf(ixl.class, str);
    }

    public static ixl[] values() {
        return (ixl[]) d.clone();
    }
}
