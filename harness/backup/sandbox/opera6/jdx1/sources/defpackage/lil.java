package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lil {
    public static final lil a;
    public static final lil b;
    public static final /* synthetic */ lil[] c;

    static {
        lil lilVar = new lil("Filled", 0);
        a = lilVar;
        lil lilVar2 = new lil("Outlined", 1);
        b = lilVar2;
        c = new lil[]{lilVar, lilVar2};
    }

    public static lil valueOf(String str) {
        return (lil) Enum.valueOf(lil.class, str);
    }

    public static lil[] values() {
        return (lil[]) c.clone();
    }
}
