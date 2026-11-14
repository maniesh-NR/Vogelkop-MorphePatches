package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class id4 {
    public static final /* synthetic */ id4[] a = {new id4("AT_LEAST", 0), new id4("EXACT", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    id4 EF5;

    public static id4 valueOf(String str) {
        return (id4) Enum.valueOf(id4.class, str);
    }

    public static id4[] values() {
        return (id4[]) a.clone();
    }
}
