package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bsl {
    public static final bsl a;
    public static final bsl b;
    public static final bsl c;
    public static final /* synthetic */ bsl[] d;

    static {
        bsl bslVar = new bsl("On", 0);
        a = bslVar;
        bsl bslVar2 = new bsl("Off", 1);
        b = bslVar2;
        bsl bslVar3 = new bsl("Indeterminate", 2);
        c = bslVar3;
        d = new bsl[]{bslVar, bslVar2, bslVar3};
    }

    public static bsl valueOf(String str) {
        return (bsl) Enum.valueOf(bsl.class, str);
    }

    public static bsl[] values() {
        return (bsl[]) d.clone();
    }
}
