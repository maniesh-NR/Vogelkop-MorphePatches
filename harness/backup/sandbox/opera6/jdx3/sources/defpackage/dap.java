package defpackage;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class dap {
    public static final dap a = new dap();
    public static final long b;
    public static volatile t9f c;

    static {
        on7 on7Var = pn7.b;
        b = pn7.f(cs5.x0(5, un7.f));
    }

    public static t9f a(Context context) {
        Long q0iVar;
        pfp.b();
        s9f s9fVar = new s9f();
        sa7 sa7Var = new sa7();
        sa7Var.d(16);
        s9fVar.a = sa7Var;
        File file = new File(context.getCacheDir(), "okhttp.T3Jo36nuHr4ikyZzT2Fokw");
        if (!file.exists() && !file.mkdirs()) {
            file = null;
        }
        if (file != null) {
            try {
                p0i p0iVar = t0i.b;
                StatFs statFs = new StatFs(context.getCacheDir().getPath());
                q0iVar = Long.valueOf((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 100);
            } catch (Throwable th) {
                p0i p0iVar2 = t0i.b;
                q0iVar = new q0i(th);
            }
            long j = 5242880;
            if (q0iVar instanceof q0i) {
                q0iVar = 5242880L;
            }
            long jLongValue = q0iVar.longValue();
            if (jLongValue >= 5242880) {
                j = 52428800;
                if (jLongValue <= 52428800) {
                    j = jLongValue;
                }
            }
            s9fVar.l = new a74(file, j);
        }
        s9fVar.c.add(new x7(context, (byte) 2));
        s9fVar.x = _UtilJvmKt.checkDuration("timeout", b, TimeUnit.MILLISECONDS);
        l9p l9pVar = new l9p();
        if (l9pVar != s9fVar.n) {
            s9fVar.D = null;
        }
        s9fVar.n = l9pVar;
        return new t9f(s9fVar);
    }

    public static final f8p b(icp icpVar, vjo vjoVar) {
        f8p f8pVar = new f8p();
        cfn cfnVar = new cfn(0, f8pVar, f8p.class, "isCanceled", "isCanceled()Z", 0, (byte) 22);
        p0i p0iVar = t0i.b;
        pfp.a(new ky(new q0i(vjoVar), (e9a) null, cfnVar, icpVar, 0));
        return f8pVar;
    }

    public static q8p c(String str, Function1 function1, Function1 function12, icp icpVar) {
        hra hraVarD;
        try {
            rma rmaVar = new rma((byte) 4);
            rmaVar.o(str, null);
            hraVarD = rmaVar.d();
        } catch (IllegalArgumentException unused) {
            hraVarD = null;
        }
        if (hraVarD == null) {
            return b(icpVar, new vjo(9100, sko.j("Invalid url: ", str)));
        }
        t9f t9fVar = c;
        if (t9fVar == null) {
            return b(icpVar, new vjo(9104, (String) null));
        }
        e(t9fVar, hraVarD, function1, function12).enqueue(new u7k(icpVar));
        return new dpj((byte) 14);
    }

    public static Pair d(String str, Function1 function1, Function1 function12, cdp cdpVar) {
        t9f t9fVar = c;
        if (t9fVar == null) {
            qp2.n("Required value was null.");
            return null;
        }
        rma rmaVar = new rma((byte) 4);
        rmaVar.o(str, null);
        pzh pzhVarExecute = e(t9fVar, rmaVar.d(), function1, function12).execute();
        try {
            if (!pzhVarExecute.q) {
                throw new vjo(100, (String) null);
            }
            Pair pair = new Pair(pzhVarExecute.f, cdpVar.s(pzhVarExecute));
            pzhVarExecute.close();
            return pair;
        } finally {
        }
    }

    public static RealCall e(t9f t9fVar, hra hraVar, Function1 function1, Function1 function12) {
        fvh fvhVar = new fvh();
        fvhVar.a = hraVar;
        function1.invoke(fvhVar);
        kvh kvhVar = new kvh(fvhVar);
        if (function12 != null) {
            s9f s9fVarB = t9fVar.b();
            function12.invoke(s9fVarB);
            t9fVar = new t9f(s9fVarB);
        }
        return t9fVar.c(kvhVar);
    }
}
