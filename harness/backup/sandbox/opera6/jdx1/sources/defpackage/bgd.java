package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bgd {
    public static final bgd a;
    public static final bgd b;
    public static final /* synthetic */ bgd[] c;

    static {
        bgd bgdVar = new bgd("Min", 0);
        a = bgdVar;
        bgd bgdVar2 = new bgd("Max", 1);
        b = bgdVar2;
        c = new bgd[]{bgdVar, bgdVar2};
    }

    public static bgd valueOf(String str) {
        return (bgd) Enum.valueOf(bgd.class, str);
    }

    public static bgd[] values() {
        return (bgd[]) c.clone();
    }
}
