package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@h2j
/* loaded from: classes.dex */
public final class cpc {

    /* JADX INFO: Fake field, exist only in values array */
    cpc EF5;
    public static final /* synthetic */ cpc[] b = {new cpc("FOOTBALL", 0), new cpc("CRICKET", 1), new cpc("BASKETBALL", 2)};

    @NotNull
    public static final bpc Companion = new bpc();
    public static final l4c a = z4c.a(f7c.b, new fza((byte) 20));

    public static cpc valueOf(String str) {
        return (cpc) Enum.valueOf(cpc.class, str);
    }

    public static cpc[] values() {
        return (cpc[]) b.clone();
    }
}
