package defpackage;

import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class qlm {
    public static final olm a;
    public static final plm b;
    public static final /* synthetic */ qlm[] c;

    static {
        olm olmVar = new olm();
        a = olmVar;
        plm plmVar = new plm();
        b = plmVar;
        c = new qlm[]{olmVar, plmVar};
    }

    public static qlm valueOf(String str) {
        return (qlm) Enum.valueOf(qlm.class, str);
    }

    public static qlm[] values() {
        return (qlm[]) c.clone();
    }

    public boolean d(boolean z) {
        return z;
    }

    public boolean g(boolean z) {
        return z;
    }

    public boolean h(r22 r22Var, Set set) {
        return false;
    }
}
