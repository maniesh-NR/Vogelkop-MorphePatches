package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.opera.android.crashhandler.OperaCrashKeys;
import com.opera.api.Callback;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zd2 extends AsyncTask implements ih4 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public Object d;

    public zd2(Context context, OperaCrashKeys operaCrashKeys, tw2 tw2Var) {
        this.b = context.getApplicationContext();
        this.c = operaCrashKeys;
        this.d = tw2Var;
    }

    public zd2(swl swlVar, Callback callback) {
        this.b = swlVar;
        this.c = callback;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yd2 yd2Var = (yd2) it.next();
            ((OperaCrashKeys) this.c).a(yd2Var.a, yd2Var.b);
        }
        ((ym8) ((tw2) this.d).b).b = true;
    }

    @Override // defpackage.ih4
    public final void cancel() {
        ih4 ih4Var = (ih4) this.d;
        if (ih4Var != null) {
            ih4Var.cancel();
        } else {
            cancel(false);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Object obj2 = ((tw2) this.d).b;
                return ym8.a((Context) obj);
            default:
                return ((swl) obj).run();
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.a) {
            case 0:
                a((List) obj);
                break;
            default:
                qwl qwlVar = (qwl) obj;
                if (qwlVar == null) {
                    Callback callback = (Callback) this.c;
                    if (callback != null) {
                        callback.run(new q43(-1, "KeyStore failure"));
                        break;
                    }
                } else {
                    this.d = qwlVar.run();
                    break;
                }
                break;
        }
    }
}
