package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nje {
    public static final nje a;
    public static final nje b;
    public static final nje c;
    public static final /* synthetic */ nje[] d;

    static {
        nje njeVar = new nje("BACK", 0);
        a = njeVar;
        nje njeVar2 = new nje("FORWARD", 1);
        b = njeVar2;
        nje njeVar3 = new nje("HOME", 2);
        c = njeVar3;
        d = new nje[]{njeVar, njeVar2, njeVar3};
    }

    public static nje valueOf(String str) {
        return (nje) Enum.valueOf(nje.class, str);
    }

    public static nje[] values() {
        return (nje[]) d.clone();
    }
}
