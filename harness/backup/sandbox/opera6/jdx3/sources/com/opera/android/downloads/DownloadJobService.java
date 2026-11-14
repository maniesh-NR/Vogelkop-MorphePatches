package com.opera.android.downloads;

import J.N;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import com.opera.android.OperaApplication;
import defpackage.cg;
import defpackage.e7d;
import defpackage.fsp;
import defpackage.nzc;
import defpackage.re7;
import defpackage.rf7;
import defpackage.sf7;
import defpackage.tu;
import defpackage.wt2;
import java.util.Collections;
import kotlin.Metadata;
import org.chromium.base.CommandLine;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/opera/android/downloads/DownloadJobService;", "Lnzc;", "<init>", "()V", "g8", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
@SuppressLint({"SpecifyJobSchedulerIdRange"})
/* loaded from: classes.dex */
public final class DownloadJobService extends nzc {
    public static final /* synthetic */ int d = 0;
    public JobParameters b;
    public cg c;

    @Override // defpackage.nzc
    public final boolean a(JobParameters jobParameters) {
        rf7 rf7Var;
        if (!DownloadService.e) {
            this.b = null;
            cg cgVar = this.c;
            if (cgVar != null) {
                cgVar.h();
            }
            int stopReason = jobParameters.getStopReason();
            if (stopReason != 1) {
                if (stopReason == 13) {
                    String[] strArr = OperaApplication.K;
                    rf7Var = ((OperaApplication) getApplicationContext()).m().a;
                    rf7Var.v();
                    try {
                        for (re7 re7Var : Collections.unmodifiableList(rf7Var.c)) {
                            if (re7Var.m() || re7Var.w) {
                                re7Var.s();
                            }
                        }
                        return false;
                    } finally {
                    }
                }
                String[] strArr2 = OperaApplication.K;
                rf7Var = ((OperaApplication) getApplicationContext()).m().a;
                rf7Var.v();
                try {
                    for (re7 re7Var2 : Collections.unmodifiableList(rf7Var.c)) {
                        if (re7Var2.m() || re7Var2.w) {
                            DownloadPauseManager downloadPauseManager = re7Var2.a.b;
                            N.MUhg9A8g(downloadPauseManager.a, re7Var2.t.getId(), 2);
                        }
                    }
                    return true;
                } finally {
                }
            }
        }
        return false;
    }

    public final void b(Notification notification) {
        JobParameters jobParameters = this.b;
        if (jobParameters != null) {
            setNotification(jobParameters, 2131362541, notification, 1);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        cg cgVar = this.c;
        if (cgVar != null) {
            cgVar.h();
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (!sfe.g0(getApplicationContext())) {
            if (DownloadService.e) {
                ev4.k(this);
                return false;
            }
            if (ev4.g(this)) {
                this.b = jobParameters;
                cg cgVar = this.c;
                if (cgVar == null) {
                    cgVar = new cg(this, new tu(this, (byte) 4));
                    this.c = cgVar;
                }
                Context context = cgVar.b;
                String[] strArr = OperaApplication.K;
                sf7 sf7VarM = ((OperaApplication) context.getApplicationContext()).m();
                sf7VarM.c.a(cgVar.i);
                sf7VarM.a.b(cgVar.h);
                b(cgVar.g());
                CommandLine commandLine = ((OperaApplication) getApplicationContext()).n;
                if (commandLine == null) {
                    commandLine = null;
                }
                fsp.g(this, commandLine);
                e7d.a(this, new wt2(this, (byte) 1));
                return true;
            }
        }
        return false;
    }
}
