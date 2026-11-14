package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.annotations.WeakOwner;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class af3 implements as6 {
    public final hjf a;
    public final umi b;

    @Nullable
    @WeakOwner
    private df3 g;
    public boolean h;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Object f = new Object();

    @NonNull
    @WeakOwner
    private final fbh i = new fbh() { // from class: te3
        @Override // defpackage.fbh
        public final void a(mf3 mf3Var, List list) {
            ArrayList arrayList = this.a.e;
            if (mf3Var.a != 0 || list == null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    lh4 lh4Var = ((xe3) obj).b;
                    n1 ef3Var = mf3Var.a == 1 ? new ef3() : new gf3();
                    lh4Var.run(new ff3(ef3Var, (jf3) ef3Var.b));
                }
                arrayList.clear();
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vah vahVar = (vah) it.next();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    xe3 xe3Var = (xe3) it2.next();
                    ArrayList arrayListA = vahVar.a();
                    JSONObject jSONObject = vahVar.c;
                    if (arrayListA.contains(xe3Var.a.a)) {
                        it2.remove();
                        lh4 lh4Var2 = xe3Var.b;
                        jSONObject.optString("token", jSONObject.optString("purchaseToken"));
                        TextUtils.isEmpty(jSONObject.optString("orderId"));
                        jSONObject.optString("developerPayload");
                        h1b.s(vahVar.a());
                        jSONObject.optBoolean("acknowledged", true);
                        jSONObject.optLong("purchaseTime");
                        jf3 jf3Var = jf3.a;
                        lh4Var2.run(new ff3(new if3(jf3Var, (byte) 5), jf3Var));
                    }
                }
            }
        }
    };
    public cf3 c = c();

    public af3(hjf hjfVar, umi umiVar) {
        this.a = hjfVar;
        this.b = umiVar;
        hjfVar.getLifecycle().a(this);
        this.h = hjfVar.getLifecycle().i.d(qcc.d);
    }

    public final cf3 c() {
        Context applicationContext = this.a.getApplicationContext();
        bf3 bf3Var = new bf3(applicationContext);
        bf3Var.a = new hr5();
        bf3Var.d = true;
        bf3Var.c = new ye3(this.i);
        if (applicationContext == null) {
            qp2.o("Please provide a valid Context.");
            return null;
        }
        if (bf3Var.c == null) {
            qp2.o("Please provide a valid listener for purchases updates.");
            return null;
        }
        if (bf3Var.a == null) {
            qp2.o("Pending purchases for one-time products must be supported.");
            return null;
        }
        bf3Var.a.getClass();
        ye3 ye3Var = bf3Var.c;
        hr5 hr5Var = bf3Var.a;
        if (ye3Var == null) {
            return bf3Var.a() ? new mrp(hr5Var, applicationContext, bf3Var) : new cf3(hr5Var, applicationContext, bf3Var);
        }
        ye3 ye3Var2 = bf3Var.c;
        return bf3Var.a() ? new mrp(hr5Var, applicationContext, ye3Var2, bf3Var) : new cf3(hr5Var, applicationContext, ye3Var2, bf3Var);
    }

    public final void d(Callback callback) {
        if (!this.h) {
            callback.run(new yah(new zah(), cbh.b));
        } else {
            byte b = 0;
            e(new dz8(new b94(this.b, callback, b), b));
        }
    }

    public final void e(bg1 bg1Var) {
        cf3 cf3Var;
        synchronized (this.f) {
            cf3 cf3Var2 = this.c;
            cf3Var = cf3Var2.z ? true : cf3Var2.v() ? this.c : null;
        }
        if (cf3Var != null) {
            bg1Var.run(cf3Var);
            return;
        }
        synchronized (this.f) {
            this.d.add(bg1Var);
            if (this.g != null) {
                return;
            }
            ve3 ve3Var = new ve3(this);
            this.g = ve3Var;
            this.c.d(new ve3(ve3Var));
        }
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        synchronized (this.f) {
            this.c.a();
            this.g = null;
        }
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        this.h = true;
    }

    @Override // defpackage.as6
    public final void onStop(ndc ndcVar) {
        this.h = false;
    }
}
