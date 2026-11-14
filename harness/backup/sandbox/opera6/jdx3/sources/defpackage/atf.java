package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.os.Message;
import android.os.Process;
import com.opera.android.OperaApplication;
import com.opera.android.crashhandler.CrashReportProcessingService;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public final class atf extends Thread {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atf(btf btfVar, JobParameters jobParameters, String str) {
        super(str);
        this.c = btfVar;
        setPriority(1);
        this.b = jobParameters;
    }

    public atf(ReferenceQueue referenceQueue, ceg cegVar) {
        this.b = referenceQueue;
        this.c = cegVar;
        setDaemon(true);
        setName("Picasso-refQueue");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException, SecurityException, IllegalArgumentException {
        switch (this.a) {
            case 0:
                Context applicationContext = ((btf) this.c).getApplicationContext();
                boolean zD = false;
                try {
                    if (!xf8.Q(applicationContext)) {
                        String[] strArr = OperaApplication.K;
                        if (((OperaApplication) applicationContext.getApplicationContext()).J().i("eula_accepted.gdpr")) {
                            zD = h11.j.D(((btf) this.c).getApplicationContext(), ((btf) this.c).b);
                            btf btfVar = (btf) this.c;
                            if (btfVar.b) {
                                axh.j.D(btfVar.getApplicationContext(), ((btf) this.c).b);
                                tc3.j.D(((btf) this.c).getApplicationContext(), ((btf) this.c).b);
                                be7.j.D(((btf) this.c).getApplicationContext(), ((btf) this.c).b);
                            }
                            cef.j.D(((btf) this.c).getApplicationContext(), ((btf) this.c).b);
                            CrashReportProcessingService.c(0L, (Context) ks3.k.b);
                        } else {
                            zD = cef.j.D(((btf) this.c).getApplicationContext(), ((btf) this.c).b);
                        }
                    }
                    return;
                } finally {
                    btf btfVar2 = (btf) this.c;
                    btfVar2.jobFinished((JobParameters) this.b, btfVar2.b(false));
                }
            default:
                ceg cegVar = (ceg) this.c;
                Process.setThreadPriority(10);
                while (true) {
                    try {
                        bc bcVarRemove = ((ReferenceQueue) this.b).remove(1000L);
                        Message messageObtainMessage = cegVar.obtainMessage();
                        if (bcVarRemove != null) {
                            messageObtainMessage.what = 3;
                            messageObtainMessage.obj = bcVarRemove.a;
                            cegVar.sendMessage(messageObtainMessage);
                        } else {
                            messageObtainMessage.recycle();
                        }
                    } catch (InterruptedException unused) {
                        return;
                    } catch (Exception e) {
                        cegVar.post(new vl9(this, e, (byte) 21));
                        return;
                    }
                }
        }
    }
}
