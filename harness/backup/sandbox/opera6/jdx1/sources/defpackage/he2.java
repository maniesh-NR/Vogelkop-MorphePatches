package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class he2 {
    public static final lhe a;
    public static ThreadPoolExecutor b;
    public static final ThreadPoolExecutor c;
    public static int d;

    static {
        lhe lheVar = new lhe("OperaAsync");
        a = lheVar;
        ge2 ge2Var = new ge2();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 20, 3L, TimeUnit.SECONDS, new SynchronousQueue(), lheVar);
        threadPoolExecutor.setRejectedExecutionHandler(ge2Var);
        c = threadPoolExecutor;
    }

    public static boolean a(AsyncTask asyncTask, Object... objArr) {
        try {
            asyncTask.executeOnExecutor(c, objArr);
            return true;
        } catch (RejectedExecutionException e) {
            int i = d;
            if (i >= 3) {
                return false;
            }
            d = i + 1;
            ks3.D(e);
            return false;
        }
    }
}
