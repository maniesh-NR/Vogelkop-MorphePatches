package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vxj {
    public static final vxj a;
    public static final vxj b;
    public static final vxj c;
    public static final vxj d;
    public static final /* synthetic */ vxj[] e;

    static {
        vxj vxjVar = new vxj("COMPACT", 0);
        a = vxjVar;
        vxj vxjVar2 = new vxj("MEDIUM", 1);
        b = vxjVar2;
        vxj vxjVar3 = new vxj("EXPANDED", 2);
        c = vxjVar3;
        vxj vxjVar4 = new vxj("LARGE", 3);
        d = vxjVar4;
        e = new vxj[]{vxjVar, vxjVar2, vxjVar3, vxjVar4};
    }

    public static vxj valueOf(String str) {
        return (vxj) Enum.valueOf(vxj.class, str);
    }

    public static vxj[] values() {
        return (vxj[]) e.clone();
    }
}
