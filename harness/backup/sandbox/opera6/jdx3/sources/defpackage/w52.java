package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w52 {
    public static final /* synthetic */ w52[] a = {new w52("TEXT_MODE", 0), new w52("VOICE_MODE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    w52 EF5;

    public static w52 valueOf(String str) {
        return (w52) Enum.valueOf(w52.class, str);
    }

    public static w52[] values() {
        return (w52[]) a.clone();
    }
}
