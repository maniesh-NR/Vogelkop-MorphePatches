package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwr;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class mtp {
    public static final vza j = vza.a;
    public static boolean k = true;
    public final h5k a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final t33 d;
    public final qtp e;
    public final zzwp f;
    public final zzwr g;
    public final ug3 h;
    public boolean i;

    public mtp(k3e k3eVar, t33 t33Var, qtp qtpVar, zzwp zzwpVar) {
        h5k h5kVar = new h5k();
        h5kVar.b = new Object();
        h5kVar.c = new ArrayDeque();
        h5kVar.d = new AtomicReference();
        this.a = h5kVar;
        this.h = new ug3();
        Preconditions.checkNotNull(k3eVar, "MlKitContext can not be null");
        Preconditions.checkNotNull(t33Var, "BarcodeScannerOptions can not be null");
        this.d = t33Var;
        this.e = qtpVar;
        this.f = zzwpVar;
        this.g = zzwr.zza(k3eVar.b());
    }

    public final Task a(Executor executor, Callable callable, CancellationToken cancellationToken) {
        Preconditions.checkState(this.b.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.a.l(new we3(this, cancellationToken, cancellationTokenSource, callable, taskCompletionSource, (byte) 2), new op1(executor, cancellationToken, cancellationTokenSource, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final List b(x8b x8bVar) throws Throwable {
        mtp mtpVar;
        x8b x8bVar2;
        synchronized (this) {
            try {
                try {
                    ug3 ug3Var = this.h;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    ug3Var.a(x8bVar);
                    try {
                        ArrayList arrayListA = this.e.a(x8bVar);
                        mtpVar = this;
                        x8bVar2 = x8bVar;
                        try {
                            mtpVar.c(zzrb.zza, jElapsedRealtime, x8bVar2, arrayListA);
                            k = false;
                            return arrayListA;
                        } catch (l3e e) {
                            e = e;
                            l3e l3eVar = e;
                            mtpVar.c(l3eVar.a == 14 ? zzrb.zzk : zzrb.zzab, jElapsedRealtime, x8bVar2, null);
                            throw l3eVar;
                        }
                    } catch (l3e e2) {
                        e = e2;
                        mtpVar = this;
                        x8bVar2 = x8bVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [itp] */
    public final void c(zzrb zzrbVar, long j2, x8b x8bVar, List list) {
        zzcp zzcpVar = new zzcp();
        zzcp zzcpVar2 = new zzcp();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f33 f33Var = (f33) it.next();
                int iA = f33Var.a.a();
                if (iA > 4096 || iA == 0) {
                    iA = -1;
                }
                zzrn zzrnVar = (zzrn) zpp.a.get(iA);
                if (zzrnVar == null) {
                    zzrnVar = zzrn.FORMAT_UNKNOWN;
                }
                zzcpVar.zzd(zzrnVar);
                zzro zzroVar = (zzro) zpp.b.get(f33Var.a.c());
                if (zzroVar == null) {
                    zzroVar = zzro.TYPE_UNKNOWN;
                }
                zzcpVar2.zzd(zzroVar);
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        this.f.zzf(new mlf(this, jElapsedRealtime, zzrbVar, zzcpVar, zzcpVar2, x8bVar), zzrc.zzj);
        zzfr zzfrVar = new zzfr();
        zzfrVar.zze(zzrbVar);
        zzfrVar.zzf(Boolean.valueOf(k));
        zzfrVar.zzg(zpp.a(this.d));
        zzfrVar.zzc(zzcpVar.zzf());
        zzfrVar.zzd(zzcpVar2.zzf());
        final zzft zzftVarZzh = zzfrVar.zzh();
        final ?? r13 = new Object() { // from class: itp
        };
        final zzrc zzrcVar = zzrc.zzbe;
        final zzwp zzwpVar = this.f;
        osp.a(1, new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwn
            @Override // java.lang.Runnable
            public final void run() {
                zzwpVar.zzh(zzrcVar, zzftVarZzh, jElapsedRealtime, r13);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j3 = jCurrentTimeMillis - jElapsedRealtime;
        this.g.zzc(true != this.i ? 24301 : 24302, zzrbVar.zza(), j3, jCurrentTimeMillis);
    }
}
