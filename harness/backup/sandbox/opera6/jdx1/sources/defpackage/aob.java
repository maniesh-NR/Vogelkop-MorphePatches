package defpackage;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public final class aob extends AsyncTask {
    public final /* synthetic */ iob a;

    public aob(iob iobVar) {
        this.a = iobVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        while (true) {
            iob iobVar = this.a;
            dob dobVarDequeueWork = iobVar.dequeueWork();
            if (dobVarDequeueWork == null) {
                return null;
            }
            iobVar.onHandleWork(dobVarDequeueWork.getIntent());
            dobVarDequeueWork.a();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.a.processorFinished();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.a.processorFinished();
    }
}
