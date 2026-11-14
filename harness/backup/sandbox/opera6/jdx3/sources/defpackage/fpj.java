package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fpj {
    public static final dpj a;
    public static final fpj b;
    public static final fpj c;
    public static final fpj d;
    public static final fpj e;
    public static final fpj f;
    public static final /* synthetic */ fpj[] g;

    static {
        fpj fpjVar = new fpj("HEIGHT_COMPACT", 0);
        b = fpjVar;
        fpj fpjVar2 = new fpj("COMPACT", 1);
        c = fpjVar2;
        fpj fpjVar3 = new fpj("MEDIUM", 2);
        d = fpjVar3;
        fpj fpjVar4 = new fpj("EXPANDED", 3);
        e = fpjVar4;
        fpj fpjVar5 = new fpj("LARGE", 4);
        f = fpjVar5;
        g = new fpj[]{fpjVar, fpjVar2, fpjVar3, fpjVar4, fpjVar5};
        a = new dpj((byte) 0);
    }

    public static fpj valueOf(String str) {
        return (fpj) Enum.valueOf(fpj.class, str);
    }

    public static fpj[] values() {
        return (fpj[]) g.clone();
    }
}
