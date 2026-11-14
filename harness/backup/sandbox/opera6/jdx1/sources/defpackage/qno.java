package defpackage;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public abstract class qno extends AsyncTask {
    public wtm a;
    public final iuh b;

    public qno(iuh iuhVar) {
        this.b = iuhVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        wtm wtmVar = this.a;
        if (wtmVar != null) {
            wtmVar.c = null;
            qno qnoVar = (qno) ((ArrayDeque) wtmVar.b).poll();
            wtmVar.c = qnoVar;
            if (qnoVar != null) {
                qnoVar.executeOnExecutor((ThreadPoolExecutor) wtmVar.a, new Object[0]);
            }
        }
    }
}
