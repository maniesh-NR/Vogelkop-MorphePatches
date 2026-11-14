package defpackage;

import android.content.Context;
import android.view.WindowInsetsAnimation;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$AutoPlayState;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$MutePlayState;
import com.google.ads.interactivemedia.v3.internal.zzsx;
import com.google.ads.interactivemedia.v3.internal.zztd;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzje;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjv;
import com.google.android.gms.internal.play_billing.zzjy;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkj;
import com.google.android.gms.internal.play_billing.zzkp;
import com.google.android.gms.internal.play_billing.zzkr;
import com.google.android.gms.internal.play_billing.zzky;
import com.google.android.gms.internal.play_billing.zzlb;
import com.opera.android.OperaApplication;
import com.opera.android.oauth2.OperaAccessToken;
import com.opera.android.settings.SettingsManager;
import com.opera.android.undo.UndoBar;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class mgh implements ahf, xb6, ih4, orp {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public mgh(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ArrayList();
                this.c = new HashMap();
                break;
            default:
                this.b = new ArrayList(16);
                this.c = new ArrayList(16);
                break;
        }
    }

    public mgh(Context context, zzkb zzkbVar) {
        this.a = (byte) 15;
        n9k n9kVar = new n9k();
        try {
            s5m.b(context);
            n9kVar.b = s5m.a().c(z54.e).a("PLAY_BILLING_LIBRARY", new p28("proto"), new urj((byte) 18));
        } catch (Throwable unused) {
            n9kVar.a = true;
        }
        this.c = n9kVar;
        this.b = zzkbVar;
    }

    public mgh(Context context, eyi eyiVar) {
        this.a = (byte) 14;
        this.b = eyiVar;
        nxo nxoVar = new nxo(context, false);
        this.c = nxoVar;
        if (nxoVar.k != null || nxoVar.h == null) {
            return;
        }
        nxoVar.b.getClass();
        kz kzVar = new kz();
        kzVar.d = AdsRequestImpl$AutoPlayState.UNKNOWN;
        kzVar.e = AdsRequestImpl$MutePlayState.UNKNOWN;
        kzVar.f = AdsRequestImpl.ContinuousPlayState.UNKNOWN;
        boolean z = eyiVar.b;
        String str = (String) eyiVar.c;
        if (z) {
            kzVar.a = str;
        } else {
            kzVar.b = str;
        }
        kzVar.d = AdsRequestImpl$AutoPlayState.CLICK;
        kzVar.c = nxoVar.c;
        kzVar.g = Float.valueOf(8000.0f);
        Object obj = new Object();
        nxoVar.k = obj;
        kzVar.h = obj;
        ha6 ha6Var = nxoVar.h;
        ha6Var.getClass();
        ((zztd) ha6Var.b).b(new ypp(ha6Var, kzVar, (byte) 6), (zzsx) ha6Var.o);
    }

    public mgh(WindowInsetsAnimation.Bounds bounds) {
        this.a = (byte) 12;
        this.b = l2o.g(bounds);
        this.c = l2o.f(bounds);
    }

    public mgh(OperaApplication operaApplication) {
        this.a = (byte) 6;
        this.b = operaApplication;
        this.c = new j4c(new jjg(this, (byte) 10), (byte) 0);
    }

    public mgh(UndoBar undoBar) {
        this.a = (byte) 9;
        this.c = undoBar;
        this.b = new mhk((byte) 3);
    }

    public mgh(iwj iwjVar, u7e u7eVar) {
        this.a = (byte) 3;
        this.c = iwjVar;
        this.b = u7eVar;
    }

    public /* synthetic */ mgh(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public mgh(String str) {
        this.a = (byte) 11;
        this.b = new ArrayList();
        this.c = str;
    }

    public final void V(OperaAccessToken operaAccessToken) {
        ((ghj) this.b).e = new fhj(operaAccessToken, false);
        ((Callback) this.c).run(new jsl(operaAccessToken.a));
    }

    public final void a(aln alnVar) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        boolean z = alnVar instanceof ill;
        int iHashCode = LinearLayoutManager.INVALID_OFFSET;
        if (!z) {
            if (vep.e(alnVar.f(), 4)) {
                iHashCode = size * (-1);
            } else if (vep.e(alnVar.f(), 3) || vep.e(alnVar.f(), 2) || vep.e(alnVar.f(), 18) || alnVar.getType() != 2) {
                iHashCode = 0;
            } else if (!(alnVar instanceof by6)) {
                iHashCode = f8a.h.a(((String) this.c) + alnVar.getId()).hashCode();
            }
        }
        arrayList.add(new jnn(alnVar, iHashCode));
    }

    public final void b() {
        ghj ghjVar = (ghj) this.b;
        fhj fhjVar = ghjVar.e;
        if (fhjVar != null && !fhjVar.b) {
            ghjVar.e = null;
        }
        ((Callback) this.c).run(hsl.a);
    }

    public final boolean c(jf0 jf0Var) {
        boolean z;
        synchronized (((ArrayList) this.b)) {
            boolean zIsEmpty = ((ArrayList) this.b).isEmpty();
            ((ArrayList) this.b).add(jf0Var);
            z = !zIsEmpty;
        }
        return z;
    }

    public void cancel() {
        ih4 ih4Var = (ih4) this.b;
        if (ih4Var != null) {
            ih4Var.cancel();
            this.b = null;
        }
        this.c = null;
    }

    @Override // defpackage.xb6
    public final void d(Exception exc) {
        iwj iwjVar = (iwj) this.c;
        u7e u7eVar = (u7e) this.b;
        u7e u7eVar2 = iwjVar.f;
        if (u7eVar2 == null || u7eVar2 != u7eVar) {
            return;
        }
        cj6 cj6Var = iwjVar.b;
        lb6 lb6Var = iwjVar.g;
        yb6 yb6Var = u7eVar.c;
        cj6Var.b(lb6Var, exc, yb6Var, yb6Var.f());
    }

    public final void e(Object obj) {
        Callback callback = (Callback) this.c;
        cancel();
        if (callback != null) {
            callback.run(obj);
        }
    }

    public final void f() {
        mhk mhkVar = (mhk) this.b;
        LinkedList linkedList = (LinkedList) mhkVar.c;
        if (linkedList.isEmpty()) {
            return;
        }
        List listUnmodifiableList = Collections.unmodifiableList(linkedList);
        ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            Iterator it2 = Collections.unmodifiableList((ArrayList) ((mkm) it.next()).a.c).iterator();
            while (it2.hasNext()) {
                arrayList.add(((guh) it2.next()).a);
            }
        }
        mhkVar.b = 0;
        linkedList.clear();
        ((UndoBar) this.c).d.R(arrayList);
    }

    @Override // defpackage.xb6
    public final void g(Object obj) {
        iwj iwjVar = (iwj) this.c;
        u7e u7eVar = (u7e) this.b;
        u7e u7eVar2 = iwjVar.f;
        if (u7eVar2 == null || u7eVar2 != u7eVar) {
            return;
        }
        w97 w97Var = iwjVar.a.p;
        if (obj != null && w97Var.a(u7eVar.c.f())) {
            iwjVar.e = obj;
            iwjVar.b.j();
        } else {
            cj6 cj6Var = iwjVar.b;
            hub hubVar = u7eVar.a;
            yb6 yb6Var = u7eVar.c;
            cj6Var.a(hubVar, obj, yb6Var, yb6Var.f(), iwjVar.g);
        }
    }

    public final jf0 h() {
        try {
            synchronized (((ArrayList) this.b)) {
                ((ArrayList) this.c).addAll((ArrayList) this.b);
                ((ArrayList) this.b).clear();
            }
            if (((ArrayList) this.c).isEmpty()) {
                ((ArrayList) this.c).clear();
                return null;
            }
            jf0 jf0VarM = (jf0) ((ArrayList) this.c).get(0);
            for (int i = 1; i < ((ArrayList) this.c).size(); i++) {
                jf0VarM = ((jf0) ((ArrayList) this.c).get(i)).m(jf0VarM);
            }
            return jf0VarM;
        } finally {
            ((ArrayList) this.c).clear();
        }
    }

    public final synchronized List i(String str) {
        List arrayList;
        if (!((ArrayList) this.b).contains(str)) {
            ((ArrayList) this.b).add(str);
        }
        arrayList = (List) ((HashMap) this.c).get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) this.c).put(str, arrayList);
        }
        return arrayList;
    }

    public final synchronized ArrayList j(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            List<pyh> list = (List) ((HashMap) this.c).get((String) obj);
            if (list != null) {
                for (pyh pyhVar : list) {
                    if ((pyhVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(pyhVar.b)) && !arrayList.contains(pyhVar.b)) {
                        arrayList.add(pyhVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean k(boolean z, boolean z2) {
        SettingsManager settingsManager = (SettingsManager) this.b;
        Boolean boolValueOf = settingsManager.a.contains("enable_start_page_opera_logo") ? Boolean.valueOf(settingsManager.i("enable_start_page_opera_logo")) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : z && !z2;
    }

    public final void l(zzjg zzjgVar) {
        try {
            s(zzjgVar, (zzkb) this.b);
        } catch (Throwable th) {
            zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    public final void m(zzjg zzjgVar, int i, long j) {
        try {
            zzjz zzjzVarZzq = ((zzkb) this.b).zzq();
            zzjzVarZzq.zzc(i);
            zzkb zzkbVar = (zzkb) zzjzVarZzq.zzi();
            this.b = zzkbVar;
            if (j != 0) {
                zzjz zzjzVarZzq2 = zzkbVar.zzq();
                zzjzVarZzq2.zze(j);
                zzkbVar = (zzkb) zzjzVarZzq2.zzi();
            }
            s(zzjgVar, zzkbVar);
        } catch (Throwable th) {
            zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    public final void n(zzjg zzjgVar, long j, boolean z) {
        try {
            zzje zzjeVarZzq = zzjgVar.zzq();
            zzkj zzkjVarZzq = zzjgVar.zze().zzq();
            zzkjVarZzq.zza(z);
            zzjeVarZzq.zzd(zzkjVarZzq);
            zzjg zzjgVar2 = (zzjg) zzjeVarZzq.zzi();
            zzkb zzkbVar = (zzkb) this.b;
            if (j != 0) {
                zzjz zzjzVarZzq = zzkbVar.zzq();
                zzjzVarZzq.zze(j);
                zzkbVar = (zzkb) zzjzVarZzq.zzi();
            }
            s(zzjgVar2, zzkbVar);
        } catch (Throwable th) {
            zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    public final void o(zzjg zzjgVar, int i, long j, boolean z) {
        try {
            zzjz zzjzVarZzq = ((zzkb) this.b).zzq();
            zzjzVarZzq.zzc(i);
            this.b = zzjzVarZzq.zzi();
            zzje zzjeVarZzq = zzjgVar.zzq();
            zzkj zzkjVarZzq = zzjgVar.zze().zzq();
            zzkjVarZzq.zza(z);
            zzjeVarZzq.zzd(zzkjVarZzq);
            zzjg zzjgVar2 = (zzjg) zzjeVarZzq.zzi();
            zzkb zzkbVar = (zzkb) this.b;
            if (j != 0) {
                zzjz zzjzVarZzq2 = zzkbVar.zzq();
                zzjzVarZzq2.zze(j);
                zzkbVar = (zzkb) zzjzVarZzq2.zzi();
            }
            s(zzjgVar2, zzkbVar);
        } catch (Throwable th) {
            zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    public final void p(mf3 mf3Var, long j) {
        try {
            zzjv zzjvVarZza = zzjy.zza();
            zzjvVarZza.zze(4);
            zzjvVarZza.zza(zzju.zze);
            if (mf3Var != null) {
                zzjl zzjlVarZza = zzjp.zza();
                zzjlVarZza.zzp(mf3Var.a);
                zzjlVarZza.zzb(mf3Var.c);
                zzjvVarZza.zzb(zzjlVarZza);
            }
            zzkp zzkpVarZza = zzkr.zza();
            zzkb zzkbVar = (zzkb) this.b;
            if (j != 0) {
                zzjz zzjzVarZzq = zzkbVar.zzq();
                zzjzVarZzq.zze(j);
                zzkbVar = (zzkb) zzjzVarZzq.zzi();
            }
            zzkpVarZza.zzp(zzkbVar);
            zzkpVarZza.zzd(zzjvVarZza);
            ((n9k) this.c).m(zzkpVarZza.zzi());
        } catch (Throwable th) {
            zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    public final void q(zzky zzkyVar) {
        try {
            zzkp zzkpVarZza = zzkr.zza();
            zzkpVarZza.zzp((zzkb) this.b);
            zzjv zzjvVarZza = zzjy.zza();
            zzjvVarZza.zzc("ProxyBillingBroadcastReceiver");
            zzjvVarZza.zze(2);
            zzjvVarZza.zzd(zzkyVar);
            zzkpVarZza.zzd(zzjvVarZza);
            ((n9k) this.c).m(zzkpVarZza.zzi());
        } catch (Throwable th) {
            zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    public final void r(zzlb zzlbVar) {
        try {
            n9k n9kVar = (n9k) this.c;
            zzkp zzkpVarZza = zzkr.zza();
            zzkpVarZza.zzp((zzkb) this.b);
            zzkpVarZza.zzq(zzlbVar);
            n9kVar.m((zzkr) zzkpVarZza.zzi());
        } catch (Throwable th) {
            zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    public final void s(zzjg zzjgVar, zzkb zzkbVar) {
        if (zzjgVar == null) {
            return;
        }
        try {
            zzkp zzkpVarZza = zzkr.zza();
            zzkpVarZza.zzp(zzkbVar);
            zzkpVarZza.zza(zzjgVar);
            ((n9k) this.c).m(zzkpVarZza.zzi());
        } catch (Throwable th) {
            zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    public final void t(zzjk zzjkVar, zzkb zzkbVar) {
        if (zzjkVar == null) {
            return;
        }
        try {
            zzkp zzkpVarZza = zzkr.zza();
            zzkpVarZza.zzp(zzkbVar);
            zzkpVarZza.zzb(zzjkVar);
            ((n9k) this.c).m((zzkr) zzkpVarZza.zzi());
        } catch (Throwable th) {
            zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 12:
                return "Bounds{lower=" + ((r9b) this.b) + " upper=" + ((r9b) this.c) + "}";
            default:
                return super.toString();
        }
    }
}
