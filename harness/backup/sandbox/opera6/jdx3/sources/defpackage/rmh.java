package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class rmh {
    public final zcj a;
    public p1j b;

    public rmh(Context context) {
        String[] strArr = OperaApplication.K;
        this.a = (zcj) ((OperaApplication) context.getApplicationContext()).r.Q0.get();
    }

    public static rmh a(View view) {
        Object tag = view.getTag(2131365012);
        if (tag instanceof rmh) {
            return (rmh) tag;
        }
        rmh rmhVar = new rmh(view.getContext());
        view.setTag(2131365012, rmhVar);
        q9n.g(view, new z61(rmhVar, (byte) 18));
        return rmhVar;
    }

    public final void b(i4d i4dVar, b2l b2lVar, Callback callback) {
        p1j p1jVar = this.b;
        if (p1jVar != null) {
            p1jVar.cancel(false);
        }
        Intent intent = (Intent) i4dVar.b;
        zcj zcjVar = this.a;
        ArrayList arrayListC = zcjVar.c(intent, b2lVar);
        eof eofVar = new eof(this, arrayListC, callback);
        HashMap mapD = zcj.d(arrayListC);
        qie qieVar = zcjVar.c;
        umi umiVar = zcjVar.b;
        nml nmlVarB = umiVar.b(new ycj(zcjVar, intent, mapD, (byte) 1));
        nmlVarB.b(umiVar.f(new txi(eofVar, (byte) 3)));
        this.b = qieVar.n(new oml(nmlVarB), null);
    }
}
