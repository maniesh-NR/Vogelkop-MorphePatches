package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yxc {
    public static final yxc a;
    public static final yxc b;
    public static final /* synthetic */ yxc[] c;

    static {
        yxc yxcVar = new yxc("AUTO", 0);
        a = yxcVar;
        yxc yxcVar2 = new yxc("MANUAL", 1);
        b = yxcVar2;
        c = new yxc[]{yxcVar, yxcVar2};
    }

    public static yxc valueOf(String str) {
        return (yxc) Enum.valueOf(yxc.class, str);
    }

    public static yxc[] values() {
        return (yxc[]) c.clone();
    }
}
