package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lq {
    public static final lq a;
    public static final lq b;
    public static final lq c;
    public static final lq d;
    public static final /* synthetic */ lq[] e;

    static {
        lq lqVar = new lq("New", 0);
        a = lqVar;
        lq lqVar2 = new lq("Visible", 1);
        b = lqVar2;
        lq lqVar3 = new lq("VisibleAndReplaceable", 2);
        c = lqVar3;
        lq lqVar4 = new lq("Replaced", 3);
        d = lqVar4;
        e = new lq[]{lqVar, lqVar2, lqVar3, lqVar4};
    }

    public static lq valueOf(String str) {
        return (lq) Enum.valueOf(lq.class, str);
    }

    public static lq[] values() {
        return (lq[]) e.clone();
    }
}
