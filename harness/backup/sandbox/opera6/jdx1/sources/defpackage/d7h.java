package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.opera.api.Callback;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class d7h implements rr9, sog, InstallReferrerStateListener, OnCompleteListener {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public d7h(byte b) {
        this.a = b;
        switch (b) {
            case 14:
                List list = Collections.EMPTY_LIST;
                this.b = list;
                this.c = list;
                break;
            default:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                break;
        }
    }

    public /* synthetic */ d7h(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public d7h(Context context) {
        this.a = (byte) 6;
        this.b = context.getSharedPreferences("androidx.emoji2.emojipicker.preferences", 0);
        this.c = z4c.b(new dnj(this, (byte) 16));
    }

    public d7h(dgo dgoVar) {
        this.a = (byte) 15;
        this.c = dgoVar;
    }

    public /* synthetic */ d7h(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public d7h(nak nakVar, nak nakVar2, List list, nak nakVar3) {
        this.a = (byte) 4;
        this.b = nakVar3;
        this.c = nb6.l(nakVar3, nakVar, nakVar2, new z8d((byte) 1, (mt5) null, list));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: q28 */
    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) throws q28 {
        HashMap map = (HashMap) this.b;
        c7h c7hVar = new c7h(byteArrayOutputStream, map, (HashMap) this.c);
        if (obj == null) {
            return;
        }
        l6f l6fVar = (l6f) map.get(obj.getClass());
        if (l6fVar != null) {
            l6fVar.encode(obj, c7hVar);
            return;
        }
        throw new q28("No encoder for " + obj.getClass());
    }

    public final tog b(tog togVar) {
        nq7[] nq7VarArr;
        nq7[] nq7VarArr2;
        cin cinVar = togVar instanceof cin ? (cin) togVar : null;
        cin cinVar2 = (cin) this.b;
        int i = cinVar2.f;
        int length = cinVar2.c.length;
        if (cinVar != null && cinVar.f >= i && (nq7VarArr = cinVar.c) != null && nq7VarArr.length >= length && (nq7VarArr2 = cinVar.d) != null && nq7VarArr2.length >= length) {
            int i2 = cinVar.a;
            if (i2 > 0) {
                cinVar.a = i2 - 1;
            }
            return cinVar;
        }
        cin cinVar3 = new cin();
        cinVar3.a = cinVar2.a;
        nq7 nq7Var = ((cin) this.b).e;
        if (nq7Var != null) {
            cinVar3.e = nq7Var.q((xf8) ((isd) this.c).b);
        }
        nq7[] nq7VarArr3 = ((cin) this.b).c;
        int length2 = nq7VarArr3.length;
        nq7[] nq7VarArr4 = new nq7[length2];
        for (int i3 = 0; i3 < nq7VarArr3.length; i3++) {
            nq7VarArr4[i3] = nq7VarArr3[i3].q((xf8) ((isd) this.c).b);
        }
        cinVar3.c = nq7VarArr4;
        cinVar3.f = i;
        nq7[] nq7VarArr5 = new nq7[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            nq7VarArr5[i4] = nq7VarArr4[i4].l();
        }
        cinVar3.d = nq7VarArr5;
        return cinVar3;
    }

    public final void c(String str, Callback callback) throws Resources.NotFoundException {
        boolean zIsEmpty = str.isEmpty();
        Context context = (Context) this.b;
        if (zIsEmpty) {
            callback.run(sgb.F(2131231847, context));
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167798);
        f84 f84Var = (f84) this.c;
        iyk iykVar = new iyk(this, callback, (byte) 4);
        esg esgVar = f84Var.a;
        b84 b84Var = new b84(f84Var, str, dimensionPixelSize, dimensionPixelSize, iykVar);
        d84 d84Var = (d84) esgVar.b;
        c84 c84Var = d84Var.a;
        c84 c84Var2 = null;
        if (c84Var != null && c84Var.a.equals(str)) {
            c84Var2 = d84Var.a;
        }
        if (c84Var2 != null) {
            b84Var.a(c84Var2);
        } else {
            ((r9i) esgVar.c).M(str, new iu2(b84Var, (byte) 9));
        }
    }

    public final void d(szb szbVar, szb szbVar2, ps0 ps0Var) {
        x5f x5fVar = (x5f) this.b;
        String string = szbVar != null ? szbVar.toString() : null;
        String string2 = szbVar2.toString();
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            os0 os0Var = new os0(2443, -1, 3);
            os0Var.q(1, string == null ? 0 : 1, string);
            os0Var.q(2, string2 == null ? 0 : 1, string2);
            os0Var.q(0, 1, ps0Var);
            x56 x56VarF = zpa.F();
            qd0 qd0VarB = x56VarF.B(zpaVar);
            List list = (List) qd0VarB.n(41);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 41, vep.t(qd0VarB, 41, 1)) : new hf0(qd0VarB, 41, list)).add(os0Var);
            x5fVar.U0(x56VarF);
        }
    }

    public final void e() {
        SharedPreferences sharedPreferences = (SharedPreferences) ((jv1) this.b).get();
        x5f x5fVar = (skm) ((wv1) this.c).b.get();
        Integer numValueOf = !sharedPreferences.contains("IABTCF_gdprApplies") ? null : Integer.valueOf(sharedPreferences.getInt("IABTCF_gdprApplies", 0));
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        x5f x5fVar2 = x5fVar;
        x5fVar2.getClass();
        zpa zpaVar = x5fVar2.d;
        x56 x56VarF = zpa.F();
        new ck0(zpaVar, x56VarF).c().b.p(31, 1, iIntValue);
        x5fVar2.U0(x56VarF);
        String string = sharedPreferences.getString("IABTCF_TCString", null);
        if (string == null) {
            string = "";
        }
        x5f x5fVar3 = x5fVar;
        zpa zpaVar2 = x5fVar3.d;
        x56 x56VarF2 = zpa.F();
        ea0 ea0Var = ((ga0) new ck0(zpaVar2, x56VarF2).q.getValue()).a;
        ea0Var.getClass();
        ea0Var.q(11, 1, string);
        x5fVar3.U0(x56VarF2);
    }

    public final void f(int i) {
        nak nakVar = (nak) this.b;
        s5h s5hVar = (s5h) nakVar.getValue();
        int i2 = s5hVar.c;
        nakVar.k((Object) null, s5h.a(s5hVar, (n8g) null, false, (i2 & i) == i ? i2 & (~i) : i2 | i, 59));
    }

    public final void onComplete(Task task) {
        bvp bvpVar = (bvp) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (bvpVar.f) {
            bvpVar.e.remove(taskCompletionSource);
        }
    }

    public final void onFailure(Throwable th) {
        switch (this.a) {
            case 1:
                Objects.toString(th);
                break;
            default:
                byte b = ((ntk) this.b).f;
                if (b != 2 || !(th instanceof CancellationException)) {
                    n1h.f(b);
                    break;
                }
                break;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
        nh4 nh4Var = (nh4) this.b;
        if (nh4Var.r() instanceof c0f) {
            p0i p0iVar = t0i.b;
            nh4Var.resumeWith((Object) null);
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        ReferrerDetails q0iVar;
        nh4 nh4Var = (nh4) this.b;
        if (nh4Var.r() instanceof c0f) {
            if (i == 0) {
                InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.c;
                try {
                    p0i p0iVar = t0i.b;
                    q0iVar = installReferrerClient.getInstallReferrer();
                } catch (Throwable th) {
                    p0i p0iVar2 = t0i.b;
                    q0iVar = new q0i(th);
                }
                referrerDetails = q0iVar instanceof q0i ? null : q0iVar;
            }
            p0i p0iVar3 = t0i.b;
            nh4Var.resumeWith(referrerDetails);
        }
    }

    public final void onSuccess(Object obj) throws Exception {
        f28 f28Var;
        switch (this.a) {
            case 1:
                f28 f28Var2 = (f28) obj;
                moh mohVar = (moh) this.c;
                Objects.toString(f28Var2);
                if (f28Var2 != null) {
                    ScheduledFuture scheduledFuture = mohVar.v;
                    if (scheduledFuture != null && scheduledFuture.cancel(false) && (f28Var = mohVar.s) != null && f28Var == f28Var2) {
                        f28Var.g.execute(new y18(f28Var, (byte) 3));
                    }
                    mohVar.x = (cyd) this.b;
                    mohVar.p(null);
                    mohVar.o();
                    break;
                }
                break;
            default:
                vtk vtkVar = (vtk) obj;
                vtkVar.getClass();
                ((wtk) ((ghf) this.c).b).b(vtkVar);
                break;
        }
    }
}
