package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lue {
    public static final lue a;
    public static final lue b;
    public static final lue c;
    public static final /* synthetic */ lue[] d;

    static {
        lue lueVar = new lue("InvisibleInitial", 0);
        a = lueVar;
        lue lueVar2 = new lue("Invisible", 1);
        b = lueVar2;
        lue lueVar3 = new lue("Visible", 2);
        c = lueVar3;
        d = new lue[]{lueVar, lueVar2, lueVar3};
    }

    public static lue valueOf(String str) {
        return (lue) Enum.valueOf(lue.class, str);
    }

    public static lue[] values() {
        return (lue[]) d.clone();
    }

    public final boolean d() {
        return this == c;
    }
}
