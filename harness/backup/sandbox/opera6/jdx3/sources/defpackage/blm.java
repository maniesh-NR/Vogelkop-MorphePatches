package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class blm {
    public static final blm a;
    public static final blm b;
    public static final /* synthetic */ blm[] c;

    static {
        blm blmVar = new blm("MULTIPLE_CHOICE", 0);
        a = blmVar;
        blm blmVar2 = new blm("CHECKBOXES", 1);
        b = blmVar2;
        c = new blm[]{blmVar, blmVar2};
    }

    public static blm valueOf(String str) {
        return (blm) Enum.valueOf(blm.class, str);
    }

    public static blm[] values() {
        return (blm[]) c.clone();
    }
}
