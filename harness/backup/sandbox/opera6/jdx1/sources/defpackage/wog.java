package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wog {
    public static final wog a;
    public static final wog b;
    public static final /* synthetic */ wog[] c;

    static {
        wog wogVar = new wog("EXACT", 0);
        a = wogVar;
        wog wogVar2 = new wog("INEXACT", 1);
        b = wogVar2;
        c = new wog[]{wogVar, wogVar2};
    }

    public static wog valueOf(String str) {
        return (wog) Enum.valueOf(wog.class, str);
    }

    public static wog[] values() {
        return (wog[]) c.clone();
    }
}
