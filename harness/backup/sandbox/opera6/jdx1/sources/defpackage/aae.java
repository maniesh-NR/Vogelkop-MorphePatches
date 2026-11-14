package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class aae implements z9e {
    public final Context a;
    public a64 b;
    public final p0g c = new p0g(1.0f);
    public d3k d;

    public aae(Context context) {
        this.a = context;
    }

    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final CoroutineContext.Element get(g gVar) {
        return f.a(this, gVar);
    }

    public final CoroutineContext minusKey(g gVar) {
        return f.b(this, gVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.a(this, coroutineContext);
    }

    @Override // defpackage.z9e
    public final float q() {
        mt5 mt5Var;
        lak lakVar;
        if (this.d == null) {
            Context context = this.a;
            see seeVar = z3o.a;
            synchronized (seeVar) {
                Object objG = seeVar.g(context);
                mt5Var = null;
                if (objG == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    p04 p04VarH = xf8.h(-1, null, null, 6);
                    objG = a26.o0(new xd6(new ogb(contentResolver, uriFor, new aa(p04VarH, Handler.createAsync(Looper.getMainLooper()), (byte) 3), p04VarH, context, null), (byte) 11), sgb.f(), new f9k(0L), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    seeVar.m(context, objG);
                }
                lakVar = (lak) objG;
            }
            this.c.i(((Number) lakVar.getValue()).floatValue());
            a64 a64Var = this.b;
            if (a64Var == null) {
                qp2.n("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.d = na2.B(a64Var, null, null, new qmb((Object) lakVar, (Object) this, mt5Var, (byte) 9), 3);
        }
        return this.c.h();
    }
}
