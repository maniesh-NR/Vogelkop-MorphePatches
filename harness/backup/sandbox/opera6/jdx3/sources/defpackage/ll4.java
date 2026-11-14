package defpackage;

import J.N;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.playcore_hsdp.zzc;
import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ll4 implements Runnable {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ ll4(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ ll4(Object obj, Object obj2, Object obj3, Object obj4, byte b, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mq mqVarA = null;
        final byte b2 = 1;
        int i = 0;
        Object[] objArr = 0;
        Object obj = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                nl4 nl4Var = (nl4) ((eme) obj2).a;
                ptd ptdVar = (ptd) obj4;
                ml4 ml4Var = (ml4) obj;
                if (ml4Var != null) {
                    nl4Var.A = true;
                    ml4Var.b.c(false);
                    nl4Var.A = false;
                }
                if (ptdVar.isEnabled() && ptdVar.hasSubMenu()) {
                    ((itd) obj3).q(ptdVar, (lud) null, 4);
                    break;
                }
                break;
            case 1:
                p03 p03Var = (p03) obj2;
                if (!p03Var.b) {
                    zcl zclVar = (zcl) obj4;
                    final qie qieVar = (qie) obj3;
                    switch (p03Var.d) {
                        case 0:
                            ioh.z(System.currentTimeMillis() - zclVar.b.getLong("SoonestWakeupTime"), "BackgroundSync.Wakeup.DelayTime");
                            final Object[] objArr2 = objArr == true ? 1 : 0;
                            N.M_JeS6H$(new Runnable() { // from class: o03
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = objArr2;
                                    qie qieVar2 = qieVar;
                                    switch (b3) {
                                        case 0:
                                            qieVar2.a(false);
                                            break;
                                        default:
                                            qieVar2.a(false);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            ioh.z(System.currentTimeMillis() - zclVar.b.getLong("SoonestWakeupTime"), "BackgroundSync.Periodic.Wakeup.DelayTime");
                            N.MggSNLX2(new Runnable() { // from class: o03
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = b2;
                                    qie qieVar2 = qieVar;
                                    switch (b3) {
                                        case 0:
                                            qieVar2.a(false);
                                            break;
                                        default:
                                            qieVar2.a(false);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
                break;
            case 2:
                j5k j5kVar = (j5k) obj2;
                Set set = j5kVar.a;
                k5k k5kVar = j5kVar.e;
                yz yzVar = (yz) obj;
                mq mqVar = (mq) obj4;
                dl dlVar = mqVar.c;
                bz bzVar = j5kVar.d;
                List list = mqVar.f;
                yl ylVar = k5kVar.d.l;
                g5k g5kVar = k5kVar.e;
                f5k f5kVar = k5kVar.f;
                if (yzVar instanceof nq) {
                    mqVarA = ((nq) yzVar).a(dlVar, ylVar, g5kVar, f5kVar, list);
                    mqVarA.e = bzVar.i();
                }
                if (mqVarA != null) {
                    set.add(mqVarA);
                    set.remove(mqVar);
                    int iIndexOf = k5kVar.a.indexOf(mqVar);
                    if (iIndexOf >= 0) {
                        k5kVar.a.set(iIndexOf, mqVarA);
                        eu8 eu8Var = k5kVar.g;
                        if (eu8Var != null) {
                            eu8Var.e(mqVar, mqVarA);
                        }
                        txi txiVar = (txi) obj3;
                        if (txiVar != null) {
                            ((i5k) txiVar.b).c = mqVarA;
                        }
                        mqVar.f();
                        break;
                    }
                }
                break;
            case 3:
                SettingsManager settingsManager = (SettingsManager) obj4;
                int iN = settingsManager.n("version_code");
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                while (i < size) {
                    Object obj5 = arrayList.get(i);
                    i++;
                    ((w1n) obj5).apply(iN);
                }
                dj9 dj9VarT = dj9.t((BrowserActivity) obj);
                dj9VarT.F(new a2n(dj9VarT, (skm) ((wv1) obj3).b.get()));
                settingsManager.h = settingsManager.J();
                settingsManager.V(1910404306, "version_code");
                settingsManager.W(System.currentTimeMillis(), "last_upgrade_time");
                break;
            case 4:
                j2o.i((View) obj, (n2o) obj4, (mgh) obj3);
                ((ValueAnimator) obj2).start();
                break;
            case 5:
                ((Activity) obj).startActivityForResult(y4h.t((String) obj4, (String) obj3, (Map) obj2), 0);
                break;
            default:
                gpp gppVar = (gpp) obj;
                String str = (String) obj4;
                String str2 = (String) obj3;
                Bundle bundle = (Bundle) obj2;
                try {
                    isp ispVar = (wsp) ((IInterface) gppVar.b.k);
                    if (ispVar != null) {
                        String packageName = gppVar.a.getPackageName();
                        rop ropVar = gppVar.d;
                        isp ispVar2 = ispVar;
                        Parcel parcelZza = ispVar2.zza();
                        parcelZza.writeString(packageName);
                        parcelZza.writeString(str);
                        parcelZza.writeString(str2);
                        zzc.zzc(parcelZza, bundle);
                        zzc.zzd(parcelZza, ropVar);
                        ispVar2.zzb(2, parcelZza);
                        break;
                    }
                } catch (DeadObjectException | RemoteException unused) {
                    return;
                }
                break;
        }
    }
}
