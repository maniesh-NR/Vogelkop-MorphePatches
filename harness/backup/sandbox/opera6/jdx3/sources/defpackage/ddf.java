package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ddf {
    public static final ddf a;
    public static final ddf b;
    public static final /* synthetic */ ddf[] c;

    static {
        ddf ddfVar = new ddf("DRAW", 0);
        a = ddfVar;
        ddf ddfVar2 = new ddf("ABORT_DRAW", 1);
        b = ddfVar2;
        c = new ddf[]{ddfVar, ddfVar2};
    }

    public static ddf valueOf(String str) {
        return (ddf) Enum.valueOf(ddf.class, str);
    }

    public static ddf[] values() {
        return (ddf[]) c.clone();
    }
}
