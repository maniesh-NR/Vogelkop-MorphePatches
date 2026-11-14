package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import androidx.fragment.app.r;
import com.opera.android.browser.PrivateTabsBroadcastReceiver;

/* loaded from: classes.dex */
public final class d7d extends AsyncTask {
    public final /* synthetic */ byte a = 0;
    public final Context b;

    public d7d(Context context) {
        this.b = context;
    }

    public d7d(r rVar) {
        this.b = rVar.getApplicationContext();
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.a) {
            case 0:
                try {
                    wbc.g.a();
                    return null;
                } catch (UnsatisfiedLinkError | h1h e) {
                    return e;
                }
            default:
                synchronized (PrivateTabsBroadcastReceiver.b) {
                    if (PrivateTabsBroadcastReceiver.c) {
                        PrivateTabsBroadcastReceiver.a(this.b);
                    }
                }
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r10 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r9 = r9.b;
        r10 = defpackage.ks3.k;
        ((defpackage.qz5) r10.g).d();
        defpackage.vml.e(new defpackage.fv2(r10, (byte) 18));
        r10 = com.opera.android.OperaApplication.K;
        r10 = (com.opera.android.OperaApplication) r9.getApplicationContext();
        r1 = defpackage.vml.d;
        r2 = r10.J();
        defpackage.s9g.h = new defpackage.s9g(r1, r2, new defpackage.k5o(r9, r1, (byte) 12));
        r2.n("version_code");
        r1 = defpackage.s9g.h;
        r2 = r1.c;
        r1 = r1.e;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        r4 = new java.io.ObjectInputStream(new java.io.BufferedInputStream(((android.content.Context) r1.b).openFileInput("permissions.bin")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        r1 = defpackage.k5o.q(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        xvg.l(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        xvg.l(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014e, code lost:
    
        defpackage.e7d.b(1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0151, code lost:
    
        return;
     */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPostExecute(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d7d.onPostExecute(java.lang.Object):void");
    }
}
