package defpackage;

import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzje;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzkf;
import com.google.android.gms.internal.play_billing.zzki;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class cz8 implements bg1 {
    public final ArrayList a;
    public final b94 b;

    public cz8(ArrayList arrayList, b94 b94Var) {
        this.a = arrayList;
        this.b = b94Var;
    }

    public final void a(mf3 mf3Var, yqa yqaVar) {
        int i = mf3Var.a;
        b94 b94Var = this.b;
        if (i != 0) {
            b94Var.run(new v3h(new w3h(), y3h.b));
            return;
        }
        List list = (List) yqaVar.b;
        mn mnVar = new mn((byte) 6);
        scd.q(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            nsh nshVar = (nsh) mnVar.apply(it.next());
            if (nshVar != null) {
                int i3 = i2 + 1;
                int iB = w0b.b(objArrCopyOf.length, i3);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i2] = nshVar;
                i2 = i3;
            }
        }
        b94Var.run(new v3h(new x3h(h1b.o(i2, objArrCopyOf)), y3h.a));
    }

    public final void run(Object obj) {
        mf3 mf3Var;
        cf3 cf3Var = (cf3) obj;
        if (cf3Var.t(n1h.a)) {
            mf3 mf3Var2 = xrp.a;
            mf3Var = cf3Var.r ? xrp.f : xrp.m;
            zzjn zzjnVar = zzjn.zzt;
            zzjg zzjgVar = null;
            if (mf3Var.a != 0) {
                int i = nrp.a;
                try {
                    zzje zzjeVarZza = zzjg.zza();
                    zzjl zzjlVarZza = zzjp.zza();
                    zzjlVarZza.zzp(mf3Var.a);
                    zzjlVarZza.zzb(mf3Var.c);
                    zzjlVarZza.zze(zzjnVar);
                    zzjeVarZza.zzb(zzjlVarZza);
                    zzjeVarZza.zzp(5);
                    zzkf zzkfVarZza = zzki.zza();
                    zzkfVarZza.zza(10);
                    zzjeVarZza.zzc(zzkfVarZza.zzi());
                    zzjgVar = (zzjg) zzjeVarZza.zzi();
                } catch (Exception e) {
                    zzc.zzp("BillingLogger", "Unable to create logging payload", e);
                }
                cf3Var.n(zzjgVar);
            } else {
                int i2 = nrp.a;
                try {
                    zzji zzjiVarZza = zzjk.zza();
                    zzjiVarZza.zze(5);
                    zzkf zzkfVarZza2 = zzki.zza();
                    zzkfVarZza2.zza(10);
                    zzjiVarZza.zzb(zzkfVarZza2.zzi());
                    zzjgVar = (zzjk) zzjiVarZza.zzi();
                } catch (Exception e2) {
                    zzc.zzp("BillingLogger", "Unable to create logging payload", e2);
                }
                cf3Var.o(zzjgVar);
            }
        } else {
            mf3Var = xrp.g;
            zzjn zzjnVar2 = zzjn.zzb;
            if (mf3Var.a != 0) {
                cf3Var.y(5, mf3Var, zzjnVar2);
            } else {
                try {
                    int i3 = nrp.a;
                    cf3Var.o(nrp.c(5, zzju.zza));
                } catch (Throwable th) {
                    zzc.zzp("BillingClient", "Unable to log.", th);
                }
            }
        }
        if (mf3Var.a == -2) {
            this.b.run(new v3h(new w3h(), y3h.b));
            return;
        }
        isd isdVar = new isd((byte) 15, false);
        List list = (List) this.a.stream().map(new mn((byte) 5)).collect(Collectors.toList());
        if (list == null || list.isEmpty()) {
            qp2.o("Product list cannot be empty.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((egh) it.next()).getClass();
            hashSet.add("subs");
        }
        if (hashSet.size() > 1) {
            qp2.o("All products should be of the same product type.");
            return;
        }
        zzca zzcaVarZzj = zzca.zzj(list);
        isdVar.b = zzcaVarZzj;
        if (zzcaVarZzj != null) {
            cf3Var.c(new qie(isdVar), this);
        } else {
            qp2.o("Product list must be set to a non empty list.");
        }
    }
}
