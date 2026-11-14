package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzjn;
import com.opera.api.Callback;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dz8 implements bg1 {
    public final /* synthetic */ byte a;
    public final Callback b;

    public /* synthetic */ dz8(Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    public final void a(mf3 mf3Var, List list) {
        b94 b94Var = (b94) this.b;
        int i = mf3Var.a;
        cbh cbhVar = cbh.a;
        if (i != 0) {
            if (i != -1) {
                b94Var.run(new yah(new zah(), cbh.b));
                return;
            } else {
                a1b a1bVar = h1b.b;
                b94Var.run(new yah(new bbh(csh.e), cbhVar));
                return;
            }
        }
        scd.q(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            vah vahVar = (vah) it.next();
            JSONObject jSONObject = vahVar.c;
            JSONObject jSONObject2 = vahVar.c;
            String strOptString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
            String strOptString2 = jSONObject2.optString("orderId");
            if (TextUtils.isEmpty(strOptString2)) {
                strOptString2 = null;
            }
            uah uahVar = new uah(strOptString, strOptString2, jSONObject2.optString("developerPayload"), vahVar.b, h1b.s(vahVar.a()), jSONObject2.optBoolean("acknowledged", true), jSONObject2.optLong("purchaseTime"));
            int i3 = i2 + 1;
            int iB = w0b.b(objArrCopyOf.length, i3);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i2] = uahVar;
            i2 = i3;
        }
        b94Var.run(new yah(new bbh(h1b.o(i2, objArrCopyOf)), cbhVar));
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                cf3 cf3Var = (cf3) obj;
                cf3Var.getClass();
                if (cf3.f(new sxd((byte) 5, cf3Var, this, false), 30000L, new vr9(cf3Var, this, (byte) 28), Looper.myLooper() == null ? cf3Var.e : new Handler(Looper.myLooper()), cf3Var.e()) == null) {
                    mf3 mf3VarI = cf3Var.i();
                    cf3Var.y(9, mf3VarI, zzjn.zzy);
                    a(mf3VarI, zzca.zzk());
                    break;
                }
                break;
            default:
                vml.e(new c94(this.b, obj, (byte) 1));
                break;
        }
    }
}
