package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cgd {
    public static final cgd a;
    public static final cgd b;
    public static final /* synthetic */ cgd[] c;

    static {
        cgd cgdVar = new cgd("Width", 0);
        a = cgdVar;
        cgd cgdVar2 = new cgd("Height", 1);
        b = cgdVar2;
        c = new cgd[]{cgdVar, cgdVar2};
    }

    public static cgd valueOf(String str) {
        return (cgd) Enum.valueOf(cgd.class, str);
    }

    public static cgd[] values() {
        return (cgd[]) c.clone();
    }
}
