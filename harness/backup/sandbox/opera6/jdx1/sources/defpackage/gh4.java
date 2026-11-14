package defpackage;

import androidx.work.impl.WorkDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class gh4 extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ x4o j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh4(x4o x4oVar, byte b) {
        super(0);
        this.i = b;
        this.j = x4oVar;
    }

    public final Object invoke() {
        byte b = this.i;
        x4o x4oVar = this.j;
        switch (b) {
            case 0:
                WorkDatabase workDatabase = x4oVar.c;
                k3 k3Var = new k3(workDatabase, "com.opera.android.MigrationWorker", x4oVar, (byte) 22);
                workDatabase.getClass();
                workDatabase.u(new j3i(k3Var, (byte) 2));
                ymi.b(x4oVar.b, workDatabase, x4oVar.e);
                break;
            default:
                WorkDatabase workDatabase2 = x4oVar.c;
                fh4 fh4Var = new fh4(workDatabase2, x4oVar);
                workDatabase2.getClass();
                workDatabase2.u(new j3i(fh4Var, (byte) 2));
                ymi.b(x4oVar.b, workDatabase2, x4oVar.e);
                break;
        }
        return Unit.a;
    }
}
