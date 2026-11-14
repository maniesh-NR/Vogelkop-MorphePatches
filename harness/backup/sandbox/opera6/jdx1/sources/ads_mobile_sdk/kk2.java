package ads_mobile_sdk;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a0p;
import defpackage.a4h;

/* loaded from: classes.dex */
public final class kk2 extends rno {
    public final /* synthetic */ lk2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk2(lk2 lk2Var) {
        super("com.google.android.play.core.prewarm.protocol.IPrewarmServiceCallback", (byte) 1);
        this.a = lk2Var;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i2 = a0p.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(a4h.a("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
        u13 u13Var = this.a.a;
        if (u13Var == null) {
            return true;
        }
        lk2.c.a("detach", new Object[0]);
        u13Var.getClass();
        u13Var.b(new p13(u13Var, (byte) 0));
        return true;
    }
}
