package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ssm {
    public static final ssm a;
    public static final ssm b;
    public static final ssm c;
    public static final ssm d;
    public static final ssm e;
    public static final ssm f;
    public static final /* synthetic */ ssm[] g;

    static {
        ssm ssmVar = new ssm("IMAGE_CAPTURE", 0);
        a = ssmVar;
        ssm ssmVar2 = new ssm("PREVIEW", 1);
        b = ssmVar2;
        ssm ssmVar3 = new ssm("IMAGE_ANALYSIS", 2);
        c = ssmVar3;
        ssm ssmVar4 = new ssm("VIDEO_CAPTURE", 3);
        d = ssmVar4;
        ssm ssmVar5 = new ssm("STREAM_SHARING", 4);
        e = ssmVar5;
        ssm ssmVar6 = new ssm("METERING_REPEATING", 5);
        f = ssmVar6;
        g = new ssm[]{ssmVar, ssmVar2, ssmVar3, ssmVar4, ssmVar5, ssmVar6};
    }

    public static ssm valueOf(String str) {
        return (ssm) Enum.valueOf(ssm.class, str);
    }

    public static ssm[] values() {
        return (ssm[]) g.clone();
    }
}
