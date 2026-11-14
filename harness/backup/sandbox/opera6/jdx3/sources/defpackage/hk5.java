package defpackage;

import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hk5 implements Callback {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public Object c;
    public Object d;

    public hk5(akg akgVar, float[] fArr, ArrayList arrayList) {
        this.b = fArr;
        this.c = arrayList;
        this.d = akgVar;
    }

    public hk5(umi umiVar, ki5 ki5Var, lh4 lh4Var) {
        this.b = ki5Var;
        this.c = lh4Var;
        oml omlVar = new oml(umiVar.d(new lb4(this, (byte) 25)));
        omlVar.b(null, 30L, TimeUnit.SECONDS, null);
        this.d = omlVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                oml omlVar = (oml) this.d;
                if (omlVar != null) {
                    omlVar.cancel(false);
                    this.d = null;
                }
                lh4 lh4Var = (lh4) this.c;
                if (lh4Var != null) {
                    lh4Var.run(obj);
                    this.c = null;
                    break;
                }
                break;
            default:
                ((gig) ((ode) ((xbf) ((akg) this.d).l).c).g()).c(new thg(((float[]) this.b)[((ArrayList) this.c).indexOf((ikg) obj)]));
                break;
        }
    }
}
