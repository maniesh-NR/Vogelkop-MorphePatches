package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class hlf extends Thread {
    public final AtomicBoolean a;
    public final z8b b;
    public final Semaphore c;
    public final /* synthetic */ ilf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(ilf ilfVar, String str, z8b z8bVar) {
        super(str);
        this.d = ilfVar;
        this.a = new AtomicBoolean();
        this.c = new Semaphore(0);
        this.b = z8bVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        yqa yqaVar;
        super.run();
        while (!this.a.get()) {
            try {
                this.c.acquire();
                while (!this.a.get()) {
                    z8b z8bVar = this.b;
                    ClassLoader classLoader = this.d.getClassLoader();
                    synchronized (z8bVar.a) {
                        pad padVar = (pad) z8bVar.b;
                        yqaVar = null;
                        if (padVar != null) {
                            JobWorkItem jobWorkItemA = padVar.a();
                            if (jobWorkItemA != null) {
                                jobWorkItemA.getIntent().setExtrasClassLoader(classLoader);
                                yqaVar = new yqa(jobWorkItemA, padVar, (byte) 25);
                            }
                        }
                    }
                    if (yqaVar != null) {
                        this.d.b(((JobWorkItem) yqaVar.b).getIntent());
                        pad padVar2 = (pad) yqaVar.c;
                        JobWorkItem jobWorkItem = (JobWorkItem) yqaVar.b;
                        synchronized (padVar2.b) {
                            JobParameters jobParameters = (JobParameters) padVar2.c;
                            if (jobParameters != null) {
                                try {
                                    jobParameters.completeWork(jobWorkItem);
                                } catch (IllegalArgumentException | SecurityException unused) {
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException unused2) {
            }
        }
    }
}
