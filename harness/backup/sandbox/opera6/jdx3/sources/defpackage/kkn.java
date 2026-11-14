package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kkn {
    public static final kkn a;
    public static final kkn b;
    public static final kkn c;
    public static final /* synthetic */ kkn[] d;

    static {
        kkn kknVar = new kkn("HOME_SCREEN", 0);
        a = kknVar;
        kkn kknVar2 = new kkn("LOCK_SCREEN", 1);
        b = kknVar2;
        kkn kknVar3 = new kkn("HOME_AND_LOCK_SCREEN", 2);
        c = kknVar3;
        d = new kkn[]{kknVar, kknVar2, kknVar3};
    }

    public static kkn valueOf(String str) {
        return (kkn) Enum.valueOf(kkn.class, str);
    }

    public static kkn[] values() {
        return (kkn[]) d.clone();
    }
}
