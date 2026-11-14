package ads_mobile_sdk;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public abstract class v52 extends AsyncTask {
    public os a;
    public final ji b;

    public v52(ji jiVar) {
        this.b = jiVar;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(String str) {
        os osVar = this.a;
        if (osVar != null) {
            osVar.c = null;
            v52 v52Var = (v52) ((ArrayDeque) osVar.b).poll();
            osVar.c = v52Var;
            if (v52Var != null) {
                v52Var.executeOnExecutor((ThreadPoolExecutor) osVar.a, new Object[0]);
            }
        }
    }
}
