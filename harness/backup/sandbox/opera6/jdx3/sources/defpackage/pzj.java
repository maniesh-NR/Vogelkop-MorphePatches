package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pzj {
    public static final pzj a;
    public static final pzj b;
    public static final /* synthetic */ pzj[] c;

    static {
        pzj pzjVar = new pzj("FOLLOW_SPEED_DIAL_SHAPE", 0);
        a = pzjVar;
        pzj pzjVar2 = new pzj("OVERLAPPING_CIRCLES", 1);
        b = pzjVar2;
        c = new pzj[]{pzjVar, pzjVar2};
    }

    public static pzj valueOf(String str) {
        return (pzj) Enum.valueOf(pzj.class, str);
    }

    public static pzj[] values() {
        return (pzj[]) c.clone();
    }
}
