package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s8k {
    public static final s8k a;
    public static final s8k b;
    public static final s8k c;
    public static final /* synthetic */ s8k[] d;

    static {
        s8k s8kVar = new s8k("APPBAR", 0);
        a = s8kVar;
        s8k s8kVar2 = new s8k("START_PAGE_TOP_STICKY", 1);
        b = s8kVar2;
        s8k s8kVar3 = new s8k("START_PAGE_BOTTOM_COLLAPSING", 2);
        c = s8kVar3;
        d = new s8k[]{s8kVar, s8kVar2, s8kVar3};
    }

    public static s8k valueOf(String str) {
        return (s8k) Enum.valueOf(s8k.class, str);
    }

    public static s8k[] values() {
        return (s8k[]) d.clone();
    }
}
