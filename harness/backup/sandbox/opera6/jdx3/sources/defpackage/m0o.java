package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m0o {
    public static final m0o a;
    public static final m0o b;
    public static final m0o c;
    public static final m0o d;
    public static final m0o e;
    public static final m0o f;
    public static final /* synthetic */ m0o[] g;
    public static final /* synthetic */ h58 h;

    static {
        m0o m0oVar = new m0o("FEATURES_ONBOARDING", 0);
        a = m0oVar;
        m0o m0oVar2 = new m0o("DEFAULT_BROWSER", 1);
        b = m0oVar2;
        m0o m0oVar3 = new m0o("NOTIFICATIONS", 2);
        c = m0oVar3;
        m0o m0oVar4 = new m0o("CMP_INTRO", 3);
        d = m0oVar4;
        m0o m0oVar5 = new m0o("CONSENT", 4);
        e = m0oVar5;
        m0o m0oVar6 = new m0o("PERSONALIZATION", 5);
        f = m0oVar6;
        m0o[] m0oVarArr = {m0oVar, m0oVar2, m0oVar3, m0oVar4, m0oVar5, m0oVar6};
        g = m0oVarArr;
        h = new h58(m0oVarArr);
    }

    public static m0o valueOf(String str) {
        return (m0o) Enum.valueOf(m0o.class, str);
    }

    public static m0o[] values() {
        return (m0o[]) g.clone();
    }
}
