package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public abstract class mom {
    public static volatile boolean a;
    public static final gom b = new gom(lom.a, kom.a, null);

    public static gom a(Context context) {
        boolean z;
        f89 f89Var;
        Integer num;
        Integer num2;
        Integer num3;
        Context applicationContext = context.getApplicationContext();
        String[] strArr = OperaApplication.K;
        g89 g89VarR = ((OperaApplication) applicationContext.getApplicationContext()).r();
        synchronized (g89VarR.k) {
            z = g89VarR.l;
        }
        if (z) {
            synchronized (g89VarR.k) {
                f89Var = g89VarR.m;
            }
            int iOrdinal = f89Var.ordinal();
            if (iOrdinal == 0) {
                lom lomVar = lom.b;
                kom komVar = kom.b;
                synchronized (g89VarR.k) {
                    num = g89VarR.n;
                }
                return new gom(lomVar, komVar, num);
            }
            if (iOrdinal == 1) {
                lom lomVar2 = lom.c;
                kom komVar2 = kom.b;
                synchronized (g89VarR.k) {
                    num2 = g89VarR.n;
                }
                return new gom(lomVar2, komVar2, num2);
            }
            if (iOrdinal == 2) {
                lom lomVar3 = lom.d;
                kom komVar3 = kom.b;
                synchronized (g89VarR.k) {
                    num3 = g89VarR.n;
                }
                return new gom(lomVar3, komVar3, num3);
            }
        }
        return a ? new gom(lom.b, kom.a, null) : ((((fom) hom.t(applicationContext).i()).a & 1) == 0 || !"com.android.vending".equals(r9n.l(applicationContext))) ? b : new gom(lom.b, kom.a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(t5d t5dVar, gom gomVar) {
        Task task;
        lom lomVar = gomVar.a;
        kom komVar = gomVar.b;
        int iOrdinal = lomVar.ordinal();
        if (iOrdinal == 1) {
            int iOrdinal2 = komVar.ordinal();
            if (iOrdinal2 == 0) {
                uup.y(t5dVar, t5dVar.getPackageName(), (String) null, (String) null);
                return;
            } else {
                if (iOrdinal2 != 1) {
                    return;
                }
                String[] strArr = OperaApplication.K;
                ((OperaApplication) t5dVar.getApplication()).r().b(t5dVar, true);
                return;
            }
        }
        if (iOrdinal == 3 && komVar.ordinal() == 1) {
            String[] strArr2 = OperaApplication.K;
            g89 g89VarR = ((OperaApplication) t5dVar.getApplication()).r();
            rsp rspVar = g89VarR.d;
            jup jupVar = rspVar.a;
            String packageName = rspVar.c.getPackageName();
            bvp bvpVar = jupVar.a;
            if (bvpVar == null) {
                r40 r40Var = jup.e;
                Object[] objArr = {-9};
                if (Log.isLoggable("PlayCore", 6)) {
                    r40.g(r40Var.b, "onError(%d)", objArr);
                } else {
                    r40Var.getClass();
                }
                task = Tasks.forException(new gab(-9));
            } else {
                jup.e.f("completeUpdate(%s)", new Object[]{packageName});
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                bvpVar.a().post(new rtp(bvpVar, taskCompletionSource, taskCompletionSource, new rtp(jupVar, taskCompletionSource, taskCompletionSource, packageName, (byte) 1), (byte) 2));
                task = taskCompletionSource.getTask();
            }
            task.addOnFailureListener(new bm8(g89VarR, (byte) 9));
        }
    }
}
