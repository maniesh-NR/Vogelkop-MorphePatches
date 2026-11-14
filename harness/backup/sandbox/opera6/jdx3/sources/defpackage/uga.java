package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class uga {
    public static final uga a;
    public static final uga b;
    public static final uga c;
    public static final /* synthetic */ uga[] d;

    static {
        uga ugaVar = new uga("WidthCompact", 0);
        a = ugaVar;
        uga ugaVar2 = new uga("WidthMedium", 1);
        b = ugaVar2;
        uga ugaVar3 = new uga("WidthExpanded", 2);
        c = ugaVar3;
        d = new uga[]{ugaVar, ugaVar2, ugaVar3};
    }

    public static uga valueOf(String str) {
        return (uga) Enum.valueOf(uga.class, str);
    }

    public static uga[] values() {
        return (uga[]) d.clone();
    }
}
