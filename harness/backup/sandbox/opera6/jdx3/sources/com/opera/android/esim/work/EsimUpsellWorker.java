package com.opera.android.esim.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.leanplum.internal.Constants;
import defpackage.hfd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/opera/android/esim/work/EsimUpsellWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", Constants.Params.PARAMS, "Lhfd;", "maybeShowUpsellNotification", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lhfd;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EsimUpsellWorker extends CoroutineWorker {
    public final hfd g;

    public EsimUpsellWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull hfd hfdVar) {
        super(context, workerParameters);
        this.g = hfdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fa8
            if (r0 == 0) goto L13
            r0 = r7
            fa8 r0 = (defpackage.fa8) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            fa8 r0 = new fa8
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ybh.y(r7)
            t0i r7 = (t0i) r7
            java.lang.Object r6 = r7.a
            goto L61
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r3
        L32:
            ybh.y(r7)
            androidx.work.WorkerParameters r7 = r6.b
            ib6 r7 = r7.b
            java.lang.String r2 = "plan_id"
            java.util.HashMap r7 = r7.a
            java.lang.Object r7 = r7.get(r2)
            boolean r2 = r7 instanceof java.lang.String
            if (r2 == 0) goto L48
            java.lang.String r7 = (java.lang.String) r7
            goto L49
        L48:
            r7 = r3
        L49:
            if (r7 != 0) goto L51
            wic r6 = new wic
            r6.<init>()
            return r6
        L51:
            u11 r2 = new u11
            r5 = 12
            r2.<init>(r6, r7, r3, r5)
            r0.v = r4
            java.lang.Object r6 = zch.A(r2, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            java.lang.Throwable r7 = t0i.d(r6)
            if (r7 != 0) goto L68
            return r6
        L68:
            wic r6 = new wic
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.esim.work.EsimUpsellWorker.c(nt5):java.lang.Object");
    }
}
