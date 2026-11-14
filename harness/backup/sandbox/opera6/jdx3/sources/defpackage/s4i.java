package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s4i {
    public static final s4i a;
    public static final s4i b;
    public static final s4i c;
    public static final /* synthetic */ s4i[] d;

    static {
        s4i s4iVar = new s4i("UNLOCK", 0);
        a = s4iVar;
        s4i s4iVar2 = new s4i("DISMISS", 1);
        b = s4iVar2;
        s4i s4iVar3 = new s4i("GOTO_REWARDS", 2);
        c = s4iVar3;
        d = new s4i[]{s4iVar, s4iVar2, s4iVar3};
    }

    public static s4i valueOf(String str) {
        return (s4i) Enum.valueOf(s4i.class, str);
    }

    public static s4i[] values() {
        return (s4i[]) d.clone();
    }
}
