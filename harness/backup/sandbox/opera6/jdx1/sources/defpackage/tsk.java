package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tsk {
    public static final tsk a;
    public static final tsk b;
    public static final tsk c;
    public static final tsk d;
    public static final tsk e;
    public static final /* synthetic */ tsk[] f;

    static {
        tsk tskVar = new tsk("END", 0);
        a = tskVar;
        tsk tskVar2 = new tsk("ROLLBACK", 1);
        b = tskVar2;
        tsk tskVar3 = new tsk("BEGIN_EXCLUSIVE", 2);
        c = tskVar3;
        tsk tskVar4 = new tsk("BEGIN_IMMEDIATE", 3);
        d = tskVar4;
        tsk tskVar5 = new tsk("BEGIN_DEFERRED", 4);
        e = tskVar5;
        f = new tsk[]{tskVar, tskVar2, tskVar3, tskVar4, tskVar5};
    }

    public static tsk valueOf(String str) {
        return (tsk) Enum.valueOf(tsk.class, str);
    }

    public static tsk[] values() {
        return (tsk[]) f.clone();
    }
}
