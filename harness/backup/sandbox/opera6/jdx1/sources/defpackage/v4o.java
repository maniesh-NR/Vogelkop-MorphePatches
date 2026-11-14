package defpackage;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class v4o {
    public final a5o a;
    public final t1h b;
    public final i5o c;

    static {
        qs7.B("WMFgUpdater");
    }

    public v4o(WorkDatabase workDatabase, t1h t1hVar, a5o a5oVar) {
        this.b = t1hVar;
        this.a = a5oVar;
        this.c = workDatabase.C();
    }
}
