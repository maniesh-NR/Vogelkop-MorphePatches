package defpackage;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l49 {
    public static final l49 a;
    public static final l49 b;
    public static final /* synthetic */ l49[] c;

    static {
        l49 l49Var = new l49("GRANTED", 0);
        a = l49Var;
        l49 l49Var2 = new l49("DENIED", 1);
        b = l49Var2;
        c = new l49[]{l49Var, l49Var2};
    }

    @NonNull
    public static l49 valueOf(@NonNull String str) {
        return (l49) Enum.valueOf(l49.class, str);
    }

    @NonNull
    public static l49[] values() {
        return (l49[]) c.clone();
    }
}
