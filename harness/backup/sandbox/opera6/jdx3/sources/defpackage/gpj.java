package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gpj {
    public static final gpj a;
    public static final gpj b;
    public static final gpj c;
    public static final /* synthetic */ gpj[] d;

    static {
        gpj gpjVar = new gpj("COMPACT", 0);
        a = gpjVar;
        gpj gpjVar2 = new gpj("MEDIUM", 1);
        b = gpjVar2;
        gpj gpjVar3 = new gpj("EXPANDED", 2);
        c = gpjVar3;
        d = new gpj[]{gpjVar, gpjVar2, gpjVar3};
    }

    public static gpj valueOf(String str) {
        return (gpj) Enum.valueOf(gpj.class, str);
    }

    public static gpj[] values() {
        return (gpj[]) d.clone();
    }

    public final boolean d() {
        return ordinal() <= 0;
    }
}
