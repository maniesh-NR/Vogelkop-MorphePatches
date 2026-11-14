package defpackage;

/* loaded from: classes.dex */
public enum lkk {
    ANALYTICS(0),
    REQUESTS(1),
    BEHAVIOR(2),
    ONBOARDING(3),
    DOMAINS(4);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    lkk(int i) {
        this.a = i;
    }

    public static lkk d(int i) {
        for (lkk lkkVar : values()) {
            if (i == lkkVar.a) {
                return lkkVar;
            }
        }
        return null;
    }
}
