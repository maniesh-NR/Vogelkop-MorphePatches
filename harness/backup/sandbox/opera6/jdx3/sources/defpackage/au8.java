package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import java.util.EnumMap;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class au8 {
    public final Context a;
    public final EnumMap b = new EnumMap(cue.class);
    public final HashMap c = new HashMap();
    public final b59 d;

    public au8(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.d = w1h.l(applicationContext, vml.d, "feed", new bg1[0]);
    }

    public final Object a(bwf bwfVar, zt8 zt8Var) {
        boolean zEquals = "topnews".equals(bwfVar.a());
        cue cueVar = cue.None;
        if (!zEquals) {
            return bwfVar instanceof zqe ? zt8Var.i(cue.NewsFeed, false) : zt8Var.i(cueVar, false);
        }
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) this.a.getApplicationContext();
        if (operaApplication.J().i("enable_newsfeed")) {
            fue fueVarZ = operaApplication.z();
            fueVarZ.d();
            cueVar = fueVarZ.a;
        }
        return zt8Var.i(cueVar, true);
    }
}
