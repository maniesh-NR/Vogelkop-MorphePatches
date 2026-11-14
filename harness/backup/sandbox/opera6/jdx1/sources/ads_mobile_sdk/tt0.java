package ads_mobile_sdk;

import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.k3p;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class tt0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zt0 a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;

    public tt0(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        zt0 zt0Var = new zt0(context, handlerThread.getLooper(), this, this, 9200000);
        this.a = zt0Var;
        this.d = new LinkedBlockingQueue();
        zt0Var.checkAvailabilityAndConnect();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConnected(android.os.Bundle r8) {
        /*
            r7 = this;
            android.os.HandlerThread r8 = r7.e
            java.util.concurrent.LinkedBlockingQueue r0 = r7.d
            ads_mobile_sdk.zt0 r1 = r7.a
            r2 = 0
            android.os.IInterface r3 = r1.getService()     // Catch: java.lang.Throwable -> Le
            bip r3 = (defpackage.bip) r3     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r3 = r2
        Lf:
            if (r3 == 0) goto Lb6
            ads_mobile_sdk.cu0 r4 = new ads_mobile_sdk.cu0     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = r7.b     // Catch: java.lang.Throwable -> L78
            java.lang.String r7 = r7.c     // Catch: java.lang.Throwable -> L78
            r6 = 1
            r4.<init>(r6, r5, r7)     // Catch: java.lang.Throwable -> L78
            sfp r3 = (defpackage.sfp) r3     // Catch: java.lang.Throwable -> L78
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = r3.c     // Catch: java.lang.Throwable -> L78
            r7.writeInterfaceToken(r5)     // Catch: java.lang.Throwable -> L78
            int r5 = defpackage.a0p.a     // Catch: java.lang.Throwable -> L78
            r7.writeInt(r6)     // Catch: java.lang.Throwable -> L78
            r5 = 0
            r4.writeToParcel(r7, r5)     // Catch: java.lang.Throwable -> L78
            android.os.Parcel r7 = r3.a(r6, r7)     // Catch: java.lang.Throwable -> L78
            android.os.Parcelable$Creator<ads_mobile_sdk.eu0> r3 = ads_mobile_sdk.eu0.CREATOR     // Catch: java.lang.Throwable -> L78
            int r4 = r7.readInt()     // Catch: java.lang.Throwable -> L78
            if (r4 != 0) goto L3d
            r3 = r2
            goto L43
        L3d:
            java.lang.Object r3 = r3.createFromParcel(r7)     // Catch: java.lang.Throwable -> L78
            android.os.Parcelable r3 = (android.os.Parcelable) r3     // Catch: java.lang.Throwable -> L78
        L43:
            ads_mobile_sdk.eu0 r3 = (ads_mobile_sdk.eu0) r3     // Catch: java.lang.Throwable -> L78
            r7.recycle()     // Catch: java.lang.Throwable -> L78
            ads_mobile_sdk.pd r7 = r3.b     // Catch: java.lang.Throwable -> L78
            if (r7 != 0) goto L5a
            byte[] r7 = r3.c     // Catch: java.lang.Throwable -> L71 java.lang.Throwable -> L78
            ads_mobile_sdk.ul0 r4 = ads_mobile_sdk.ul0.a()     // Catch: java.lang.Throwable -> L71 java.lang.Throwable -> L78
            ads_mobile_sdk.pd r7 = ads_mobile_sdk.pd.a(r7, r4)     // Catch: java.lang.Throwable -> L71 java.lang.Throwable -> L78
            r3.b = r7     // Catch: java.lang.Throwable -> L71 java.lang.Throwable -> L78
            r3.c = r2     // Catch: java.lang.Throwable -> L71 java.lang.Throwable -> L78
        L5a:
            r3.a()     // Catch: java.lang.Throwable -> L78
            ads_mobile_sdk.pd r7 = r3.b     // Catch: java.lang.Throwable -> L78
            r0.put(r7)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto Lb3
            boolean r7 = r1.isConnected()
            if (r7 != 0) goto Lb0
            boolean r7 = r1.isConnecting()
            if (r7 == 0) goto Lb3
            goto Lb0
        L71:
            r7 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            k3p r7 = ads_mobile_sdk.pd.w()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> La2
            r2 = 32768(0x8000, double:1.61895E-319)
            r7.b(r2)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> La2
            ads_mobile_sdk.ku0 r7 = r7.a()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> La2
            ads_mobile_sdk.pd r7 = (ads_mobile_sdk.pd) r7     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> La2
            r0.put(r7)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> La2
            goto La2
        L8c:
            r7 = move-exception
            if (r1 == 0) goto L9e
            boolean r0 = r1.isConnected()
            if (r0 != 0) goto L9b
            boolean r0 = r1.isConnecting()
            if (r0 == 0) goto L9e
        L9b:
            r1.disconnect()
        L9e:
            r8.quit()
            throw r7
        La2:
            if (r1 == 0) goto Lb3
            boolean r7 = r1.isConnected()
            if (r7 != 0) goto Lb0
            boolean r7 = r1.isConnecting()
            if (r7 == 0) goto Lb3
        Lb0:
            r1.disconnect()
        Lb3:
            r8.quit()
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tt0.onConnected(android.os.Bundle):void");
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) throws InterruptedException {
        try {
            LinkedBlockingQueue linkedBlockingQueue = this.d;
            k3p k3pVarW = pd.w();
            k3pVarW.b(32768L);
            linkedBlockingQueue.put((pd) k3pVarW.a());
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i) throws InterruptedException {
        try {
            LinkedBlockingQueue linkedBlockingQueue = this.d;
            k3p k3pVarW = pd.w();
            k3pVarW.b(32768L);
            linkedBlockingQueue.put((pd) k3pVarW.a());
        } catch (InterruptedException unused) {
        }
    }
}
