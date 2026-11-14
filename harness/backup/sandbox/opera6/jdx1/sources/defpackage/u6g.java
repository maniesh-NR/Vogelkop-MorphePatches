package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u6g {
    public static final /* synthetic */ u6g[] a = {new u6g("CounterClockwise", 0), new u6g("Clockwise", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    u6g EF5;

    public static u6g valueOf(String str) {
        return (u6g) Enum.valueOf(u6g.class, str);
    }

    public static u6g[] values() {
        return (u6g[]) a.clone();
    }
}
