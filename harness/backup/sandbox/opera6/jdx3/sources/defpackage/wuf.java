package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wuf {
    public static final wuf a;
    public static final wuf b;
    public static final /* synthetic */ wuf[] c;

    static {
        wuf wufVar = new wuf("FROM_COLOR", 0);
        a = wufVar;
        wuf wufVar2 = new wuf("FORCE_BRIGHT", 1);
        b = wufVar2;
        c = new wuf[]{wufVar, wufVar2};
    }

    public static wuf valueOf(String str) {
        return (wuf) Enum.valueOf(wuf.class, str);
    }

    public static wuf[] values() {
        return (wuf[]) c.clone();
    }
}
