package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class smf {
    public static final smf a;
    public static final smf b;
    public static final smf c;
    public static final smf d;
    public static final /* synthetic */ smf[] e;

    static {
        smf smfVar = new smf("Filled", 0);
        a = smfVar;
        smf smfVar2 = new smf("FilledTonal", 1);
        b = smfVar2;
        smf smfVar3 = new smf("Outlined", 2);
        c = smfVar3;
        smf smfVar4 = new smf("OutlinedVariant", 3);
        smf smfVar5 = new smf("Text", 4);
        d = smfVar5;
        e = new smf[]{smfVar, smfVar2, smfVar3, smfVar4, smfVar5, new smf("Elevated", 5)};
    }

    public static smf valueOf(String str) {
        return (smf) Enum.valueOf(smf.class, str);
    }

    public static smf[] values() {
        return (smf[]) e.clone();
    }
}
