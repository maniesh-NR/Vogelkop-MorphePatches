package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class msn {
    public static final msn a;
    public static final msn b;
    public static final msn c;
    public static final msn d;
    public static final msn e;
    public static final msn f;
    public static final /* synthetic */ msn[] g;

    static {
        msn msnVar = new msn("SUBMIT_TEXT_DISABLED", 0);
        a = msnVar;
        msn msnVar2 = new msn("SUBMIT_TEXT_ENABLED", 1);
        b = msnVar2;
        msn msnVar3 = new msn("VOICE_INPUT_DISABLED", 2);
        c = msnVar3;
        msn msnVar4 = new msn("VOICE_INPUT_ENABLED", 3);
        d = msnVar4;
        msn msnVar5 = new msn("VOICE_INPUT_ACTIVE", 4);
        e = msnVar5;
        msn msnVar6 = new msn("STOP_RESPONSE", 5);
        f = msnVar6;
        g = new msn[]{msnVar, msnVar2, msnVar3, msnVar4, msnVar5, msnVar6};
    }

    public static msn valueOf(String str) {
        return (msn) Enum.valueOf(msn.class, str);
    }

    public static msn[] values() {
        return (msn[]) g.clone();
    }
}
