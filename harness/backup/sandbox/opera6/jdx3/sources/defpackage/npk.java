package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class npk {
    public static final npk a;
    public static final npk b;
    public static final /* synthetic */ npk[] c;

    static {
        npk npkVar = new npk("LOADING", 0);
        a = npkVar;
        npk npkVar2 = new npk("DATA", 1);
        b = npkVar2;
        c = new npk[]{npkVar, npkVar2};
    }

    public static npk valueOf(String str) {
        return (npk) Enum.valueOf(npk.class, str);
    }

    public static npk[] values() {
        return (npk[]) c.clone();
    }
}
