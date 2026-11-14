package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l97 implements Executor {
    public static final l97 a;
    public static final /* synthetic */ l97[] b;

    static {
        l97 l97Var = new l97("INSTANCE", 0);
        a = l97Var;
        b = new l97[]{l97Var};
    }

    public static l97 valueOf(String str) {
        return (l97) Enum.valueOf(l97.class, str);
    }

    public static l97[] values() {
        return (l97[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
