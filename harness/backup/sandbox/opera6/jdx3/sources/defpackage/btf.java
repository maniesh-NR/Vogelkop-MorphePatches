package defpackage;

import android.app.job.JobParameters;

/* loaded from: classes.dex */
public abstract class btf extends nzc {
    public final boolean b;
    public atf c;

    public btf(boolean z) {
        this.b = z;
    }

    @Override // defpackage.nzc
    public final boolean a(JobParameters jobParameters) {
        atf atfVar = this.c;
        if (atfVar != null) {
            atfVar.interrupt();
            this.c = null;
        }
        return b(false);
    }

    public boolean b(boolean z) {
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (sfe.g0(this)) {
            return false;
        }
        atf atfVar = new atf(this, jobParameters, getClass().getSimpleName());
        this.c = atfVar;
        atfVar.start();
        return true;
    }
}
