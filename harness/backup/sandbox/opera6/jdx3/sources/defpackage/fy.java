package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fy {
    public static final fy a;
    public static final fy b;
    public static final fy c;
    public static final /* synthetic */ fy[] d;

    static {
        fy fyVar = new fy("BIG_CARD", 0);
        a = fyVar;
        fy fyVar2 = new fy("SMALL_CARD", 1);
        b = fyVar2;
        fy fyVar3 = new fy("MODAL_DIALOG", 2);
        c = fyVar3;
        d = new fy[]{fyVar, fyVar2, fyVar3};
    }

    public static fy valueOf(String str) {
        return (fy) Enum.valueOf(fy.class, str);
    }

    public static fy[] values() {
        return (fy[]) d.clone();
    }
}
