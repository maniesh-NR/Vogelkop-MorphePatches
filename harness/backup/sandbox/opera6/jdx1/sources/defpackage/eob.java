package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* loaded from: classes.dex */
public final class eob implements dob {
    public final JobWorkItem a;
    public final /* synthetic */ fob b;

    public eob(fob fobVar, JobWorkItem jobWorkItem) {
        this.b = fobVar;
        this.a = jobWorkItem;
    }

    @Override // defpackage.dob
    public final void a() {
        synchronized (this.b.c) {
            JobParameters jobParameters = (JobParameters) this.b.d;
            if (jobParameters != null) {
                jobParameters.completeWork(this.a);
            }
        }
    }

    @Override // defpackage.dob
    public final Intent getIntent() {
        return this.a.getIntent();
    }
}
