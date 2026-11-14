package ads_mobile_sdk;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.a0p;
import defpackage.a4h;
import defpackage.jjp;
import defpackage.p3p;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class wi3 extends rno implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public static final /* synthetic */ int j = 0;
    public final nx5 a;
    public final Context b;
    public final ah3 c;
    public final jjp d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final cd5 h;

    public wi3(nx5 nx5Var, Context context, ah3 ah3Var) {
        super("com.google.android.gms.ads.internal.request.ITrustlessTokenListener", (byte) 1);
        this.a = nx5Var;
        this.b = context;
        this.c = ah3Var;
        this.d = new jjp(context, Looper.getMainLooper(), 8, this, this, null);
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = new cd5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.si3
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.si3 r0 = (ads_mobile_sdk.si3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.si3 r0 = new ads_mobile_sdk.si3
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            ads_mobile_sdk.wi3 r6 = r0.a
            defpackage.ybh.y(r7)
            goto L5d
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L33:
            defpackage.ybh.y(r7)
            return r7
        L37:
            defpackage.ybh.y(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.e
            boolean r7 = r7.getAndSet(r5)
            cd5 r2 = r6.h
            if (r7 == 0) goto L4d
            r0.d = r5
            java.lang.Object r6 = r2.A(r0)
            if (r6 == r1) goto L5c
            return r6
        L4d:
            jjp r7 = r6.d
            r7.checkAvailabilityAndConnect()
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r2.A(r0)
            if (r7 != r1) goto L5d
        L5c:
            return r1
        L5d:
            rap r7 = (defpackage.rap) r7
            nx5 r0 = r6.a
            ads_mobile_sdk.ti3 r1 = new ads_mobile_sdk.ti3
            r2 = 0
            r1.<init>(r6, r3, r2)
            r6 = 3
            defpackage.na2.B(r0, r3, r3, r1, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wi3.a(nt5):java.lang.Object");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        cd5 cd5Var = this.h;
        AtomicBoolean atomicBoolean = this.f;
        if (i == 1) {
            String string = parcel.readString();
            Parcelable.Creator<rg0> creator = rg0.CREATOR;
            int i2 = a0p.a;
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw new BadParcelableException(a4h.a("Parcel data not fully consumed, unread size: ", iDataAvail));
            }
            hv0 hv0Var = new hv0(string);
            if (!atomicBoolean.getAndSet(true)) {
                cd5Var.j0(hv0Var);
            }
        } else {
            if (i != 2) {
                return false;
            }
            Parcelable.Creator<hl0> creator2 = hl0.CREATOR;
            int i3 = a0p.a;
            hl0 hl0Var = (hl0) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
            int iDataAvail2 = parcel.dataAvail();
            if (iDataAvail2 > 0) {
                throw new BadParcelableException(a4h.a("Parcel data not fully consumed, unread size: ", iDataAvail2));
            }
            ev0 ev0Var = new ev0(hl0Var.a + ". Error code: " + hl0Var.b);
            if (!atomicBoolean.getAndSet(true)) {
                cd5Var.j0(ev0Var);
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final void onConnected(Bundle bundle) {
        if (this.g.getAndSet(true)) {
            return;
        }
        defpackage.na2.B(this.a, null, null, new ti3(this, null, (byte) 1), 3);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        ev0 ev0Var = new ev0(p3p.j(connectionResult.getErrorCode(), "Failed to connect to GMSCore. Code: ", ", message: ", connectionResult.getErrorMessage()));
        if (this.f.getAndSet(true)) {
            return;
        }
        this.h.j0(ev0Var);
    }

    public final void onConnectionSuspended(int i) {
        ev0 ev0Var = new ev0(sko.i(i, "GMSCore connection suspended. Code: "));
        if (this.f.getAndSet(true)) {
            return;
        }
        this.h.j0(ev0Var);
    }
}
