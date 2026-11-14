package defpackage;

import ads_mobile_sdk.ll2;
import ads_mobile_sdk.mk;
import ads_mobile_sdk.nl2;
import ads_mobile_sdk.z6;
import ads_mobile_sdk.zt0;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class vi6 implements me1, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public vi6(Context context, mk mkVar, String str, String str2, z6 z6Var) {
        this.c = str;
        this.e = mkVar;
        this.d = str2;
        this.h = z6Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.g = handlerThread;
        handlerThread.start();
        this.a = System.currentTimeMillis();
        zt0 zt0Var = new zt0(context, handlerThread.getLooper(), this, this, 19621000);
        this.b = zt0Var;
        this.f = new LinkedBlockingQueue();
        zt0Var.checkAvailabilityAndConnect();
    }

    public vi6(wi6 wi6Var, j8m j8mVar, Object obj, if1 if1Var) {
        if1 if1Var2;
        Object obj2;
        wjj wjjVar = new wjj(wi6Var.a);
        this.b = wjjVar;
        this.c = j8mVar;
        this.d = obj;
        if1 if1Var3 = (if1) j8mVar.a.invoke(obj);
        this.f = if1Var3;
        this.g = nb6.m(if1Var);
        Function1 function1 = j8mVar.b;
        if1 if1VarC = (if1) wjjVar.d;
        if (if1VarC == null) {
            if1VarC = if1Var3.c();
            wjjVar.d = if1VarC;
        }
        int iB = if1VarC.b();
        int i = 0;
        while (true) {
            if1Var2 = (if1) wjjVar.d;
            obj2 = wjjVar.a;
            if (i >= iB) {
                break;
            }
            if (if1Var2 == null) {
                if1Var2 = null;
            }
            float fA = if1Var3.a(i);
            float fA2 = if1Var.a(i);
            if1Var2.e((Math.signum(fA2) * ((float) (Math.exp(1.7362676463664735d * ((f82) ((oji) obj2).a).b(fA2)) * r9.a * r9.b))) + fA, i);
            i++;
        }
        this.e = function1.invoke(if1Var2 == null ? null : if1Var2);
        if1 if1VarC2 = (if1) wjjVar.c;
        if (if1VarC2 == null) {
            if1VarC2 = if1Var3.c();
            wjjVar.c = if1VarC2;
        }
        int iB2 = if1VarC2.b();
        long jMax = 0;
        for (int i2 = 0; i2 < iB2; i2++) {
            if1Var3.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((f82) ((oji) obj2).a).b(if1Var.a(i2)) / 1.3582017421722412d) * 1000.0d)) * 1000000);
        }
        this.a = jMax;
        if1 if1VarM = nb6.m(((wjj) this.b).g(jMax, (if1) this.f, if1Var));
        this.h = if1VarM;
        int iB3 = if1VarM.b();
        for (int i3 = 0; i3 < iB3; i3++) {
            if1 if1Var4 = (if1) this.h;
            float fA3 = if1Var4.a(i3);
            ((wjj) this.b).getClass();
            ((wjj) this.b).getClass();
            if1Var4.e(djh.b(fA3, -0.0f, 0.0f), i3);
        }
    }

    public final void a(int i, long j, Exception exc) {
        z6 z6Var = (z6) this.h;
        if (z6Var != null) {
            z6Var.a(i, System.currentTimeMillis() - j, exc);
        }
    }

    public final boolean b() {
        return false;
    }

    public final if1 c(long j) {
        return !d(j) ? ((wjj) this.b).g(j, (if1) this.f, (if1) this.g) : (if1) this.h;
    }

    public final long e() {
        return this.a;
    }

    public final j8m f() {
        return (j8m) this.c;
    }

    public final Object g(long j) {
        if1 if1Var;
        if (d(j)) {
            return this.e;
        }
        Function1 function1 = ((j8m) this.c).b;
        wjj wjjVar = (wjj) this.b;
        if1 if1Var2 = (if1) this.f;
        if1 if1Var3 = (if1) this.g;
        if1 if1VarC = (if1) wjjVar.b;
        if (if1VarC == null) {
            if1VarC = if1Var2.c();
            wjjVar.b = if1VarC;
        }
        int iB = if1VarC.b();
        int i = 0;
        while (true) {
            if1Var = (if1) wjjVar.b;
            if (i >= iB) {
                break;
            }
            if (if1Var == null) {
                if1Var = null;
            }
            oji ojiVar = (oji) wjjVar.a;
            float fA = if1Var2.a(i);
            long j2 = j / 1000000;
            i89 i89VarA = ((f82) ojiVar.a).a(if1Var3.a(i));
            long j3 = i89VarA.c;
            if1Var.e((Math.signum(i89VarA.a) * i89VarA.b * g61.a(j3 > 0 ? j2 / j3 : 1.0f).a) + fA, i);
            i++;
        }
        if (if1Var == null) {
            if1Var = null;
        }
        return function1.invoke(if1Var);
    }

    public final Object h() {
        return this.e;
    }

    public final void onConnected(Bundle bundle) {
        bip bipVar;
        HandlerThread handlerThread = (HandlerThread) this.g;
        long j = this.a;
        zt0 zt0Var = (zt0) this.b;
        try {
            bipVar = (bip) zt0Var.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            bipVar = null;
        }
        if (bipVar != null) {
            try {
                ll2 ll2Var = new ll2((String) this.c, 1, 1, ((mk) this.e).a, (String) this.d);
                sfp sfpVar = (sfp) bipVar;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(sfpVar.c);
                int i = a0p.a;
                parcelObtain.writeInt(1);
                ll2Var.writeToParcel(parcelObtain, 0);
                Parcel parcelA = sfpVar.a(3, parcelObtain);
                Object obj = parcelA.readInt() == 0 ? null : (Parcelable) nl2.CREATOR.createFromParcel(parcelA);
                parcelA.recycle();
                a(5011, j, null);
                ((LinkedBlockingQueue) this.f).put((nl2) obj);
            } catch (Throwable th) {
                try {
                    a(2010, j, new Exception(th));
                    if (zt0Var != null && (zt0Var.isConnected() || zt0Var.isConnecting())) {
                    }
                } catch (Throwable th2) {
                    if (zt0Var != null && (zt0Var.isConnected() || zt0Var.isConnecting())) {
                        zt0Var.disconnect();
                    }
                    handlerThread.quit();
                    throw th2;
                }
            }
            if (zt0Var != null && (zt0Var.isConnected() || zt0Var.isConnecting())) {
                zt0Var.disconnect();
            }
            handlerThread.quit();
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) throws InterruptedException {
        try {
            a(4012, this.a, null);
            ((LinkedBlockingQueue) this.f).put(new nl2(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i) throws InterruptedException {
        try {
            a(4011, this.a, null);
            ((LinkedBlockingQueue) this.f).put(new nl2(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }
}
