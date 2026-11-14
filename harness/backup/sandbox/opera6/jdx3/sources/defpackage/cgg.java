package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cgg {
    public static final /* synthetic */ cgg[] a = {new cgg("ANDROID", 0), new cgg("IOS", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    cgg EF5;

    public static cgg valueOf(String str) {
        return (cgg) Enum.valueOf(cgg.class, str);
    }

    public static cgg[] values() {
        return (cgg[]) a.clone();
    }
}
