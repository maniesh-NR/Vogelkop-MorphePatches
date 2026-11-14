package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jae {
    public static final jae a;
    public static final jae b;
    public static final jae c;
    public static final jae d;
    public static final jae e;
    public static final /* synthetic */ jae[] f;

    static {
        jae jaeVar = new jae("DefaultSpatial", 0);
        a = jaeVar;
        jae jaeVar2 = new jae("FastSpatial", 1);
        b = jaeVar2;
        jae jaeVar3 = new jae("SlowSpatial", 2);
        jae jaeVar4 = new jae("DefaultEffects", 3);
        c = jaeVar4;
        jae jaeVar5 = new jae("FastEffects", 4);
        d = jaeVar5;
        jae jaeVar6 = new jae("SlowEffects", 5);
        e = jaeVar6;
        f = new jae[]{jaeVar, jaeVar2, jaeVar3, jaeVar4, jaeVar5, jaeVar6};
    }

    public static jae valueOf(String str) {
        return (jae) Enum.valueOf(jae.class, str);
    }

    public static jae[] values() {
        return (jae[]) f.clone();
    }
}
