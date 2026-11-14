package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lyi {
    public static final lyi a;
    public static final lyi b;
    public static final /* synthetic */ lyi[] c;

    static {
        lyi lyiVar = new lyi("FREE", 0);
        a = lyiVar;
        lyi lyiVar2 = new lyi("PRO", 1);
        b = lyiVar2;
        c = new lyi[]{lyiVar, lyiVar2};
    }

    public static lyi valueOf(String str) {
        return (lyi) Enum.valueOf(lyi.class, str);
    }

    public static lyi[] values() {
        return (lyi[]) c.clone();
    }
}
