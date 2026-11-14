package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;

/* loaded from: classes.dex */
public final class fob extends JobServiceEngine implements bob {
    public static mlf e;
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public Object d;

    public fob(ilf ilfVar, hlf hlfVar, z8b z8bVar, kqd kqdVar) {
        super(ilfVar);
        this.b = hlfVar;
        this.c = z8bVar;
        this.d = kqdVar;
    }

    public fob(iob iobVar) {
        super(iobVar);
        this.c = new Object();
        this.b = iobVar;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        switch (this.a) {
            case 0:
                this.d = jobParameters;
                ((iob) this.b).ensureProcessorRunningLocked(false);
                return true;
            default:
                z8b z8bVar = (z8b) this.c;
                synchronized (z8bVar.a) {
                    z8bVar.b = new pad(jobParameters);
                }
                hlf hlfVar = (hlf) this.b;
                hlfVar.b.getClass();
                hlfVar.c.release();
                return true;
        }
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        switch (this.a) {
            case 0:
                boolean zDoStopCurrentWork = ((iob) this.b).doStopCurrentWork();
                synchronized (this.c) {
                    this.d = null;
                }
                return zDoStopCurrentWork;
            default:
                mlf mlfVar = e;
                if (mlfVar != null) {
                    mlfVar.g(jobParameters);
                }
                Object obj = ((kqd) this.d).b;
                z8b z8bVar = (z8b) this.c;
                synchronized (z8bVar.a) {
                    pad padVar = (pad) z8bVar.b;
                    if (padVar != null) {
                        synchronized (padVar.b) {
                            try {
                                padVar.c = null;
                            } finally {
                            }
                        }
                    }
                    z8bVar.b = null;
                }
                return true;
        }
    }
}
