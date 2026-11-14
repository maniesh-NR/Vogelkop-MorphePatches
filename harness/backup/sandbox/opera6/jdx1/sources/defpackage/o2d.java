package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o2d {
    public static final /* synthetic */ o2d[] a = {new o2d("Immediately", 0), new o2d("OnIterationFinish", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    o2d EF5;

    public static o2d valueOf(String str) {
        return (o2d) Enum.valueOf(o2d.class, str);
    }

    public static o2d[] values() {
        return (o2d[]) a.clone();
    }
}
