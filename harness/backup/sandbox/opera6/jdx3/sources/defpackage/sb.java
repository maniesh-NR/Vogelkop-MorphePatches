package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sb {
    public static final sb a;
    public static final sb b;
    public static final sb c;
    public static final /* synthetic */ sb[] d;

    static {
        sb sbVar = new sb("LOADING", 0);
        a = sbVar;
        sb sbVar2 = new sb("READY", 1);
        b = sbVar2;
        sb sbVar3 = new sb("DESTROYED", 2);
        c = sbVar3;
        d = new sb[]{sbVar, sbVar2, sbVar3};
    }

    public static sb valueOf(String str) {
        return (sb) Enum.valueOf(sb.class, str);
    }

    public static sb[] values() {
        return (sb[]) d.clone();
    }
}
