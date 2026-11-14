package defpackage;

import android.content.Context;
import android.os.IBinder;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class ftj implements bej, lo7, cum, f06, dnp, gtf, hqp {
    public final /* synthetic */ byte a;

    public /* synthetic */ ftj(byte b) {
        this.a = b;
    }

    @Override // defpackage.cum
    public final orb a() {
        return new orb();
    }

    public final f99 b(xkk xkkVar) {
        return new xd6(zdj.a, (byte) 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r11, java.io.File r12, int r13, int r14, nt5 r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.pip
            if (r0 == 0) goto L13
            r0 = r15
            pip r0 = (defpackage.pip) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            pip r0 = new pip
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r10 = r0.t
            px5 r15 = px5.a
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ybh.y(r10)
            return r10
        L27:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r10)
            r10 = 0
            return r10
        L2e:
            ybh.y(r10)
            cv6 r10 = bb7.a
            mr6 r10 = mr6.b
            xwa r3 = new xwa
            r8 = 0
            r9 = 2
            r7 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.v = r2
            java.lang.Object r10 = na2.Z(r10, r3, r0)
            if (r10 != r15) goto L49
            return r15
        L49:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftj.c(android.content.Context, java.io.File, int, int, nt5):java.lang.Object");
    }

    public final Object d(IBinder iBinder) {
        int i = b3p.j;
        if (iBinder == null) {
            return null;
        }
        d6p d6pVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return d6pVarQueryLocalInterface instanceof d6p ? d6pVarQueryLocalInterface : new t1p(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService", (byte) 0);
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return "SharingStarted.Eagerly";
            case 2:
                return "ReusedSlotId";
            case 8:
                return sko.l("CreationExtras.Key@", Integer.toString(hashCode(), CharsKt.checkRadix(16)), "<", uqh.a(String.class).c(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.lo7
    public final no7 x(Context context) {
        return new hom(context);
    }

    public final Object zza(IBinder iBinder) {
        int i = ssp.a;
        if (iBinder == null) {
            return null;
        }
        wsp wspVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHsdpService");
        return wspVarQueryLocalInterface instanceof wsp ? wspVarQueryLocalInterface : new isp(iBinder, "com.google.android.play.core.hsdp.protocol.IHsdpService");
    }
}
