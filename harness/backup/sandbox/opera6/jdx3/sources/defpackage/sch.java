package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sch {
    public static final sch a;
    public static final /* synthetic */ sch[] b;

    static {
        sch schVar = new sch("CDB_CSS", 0);
        a = schVar;
        b = new sch[]{schVar};
    }

    public static sch valueOf(String str) {
        return (sch) Enum.valueOf(sch.class, str);
    }

    public static sch[] values() {
        return (sch[]) b.clone();
    }
}
