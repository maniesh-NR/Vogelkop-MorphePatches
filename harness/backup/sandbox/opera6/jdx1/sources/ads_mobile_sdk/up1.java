package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import defpackage.d9p;
import defpackage.iso;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class up1 {
    public final Context a;
    public final th3 b;
    public final a c;
    public final String d;
    public final boolean e;

    public up1(Context context, th3 th3Var, a aVar, l7 l7Var) {
        this.a = context;
        this.b = th3Var;
        this.c = aVar;
        this.d = l7Var.D();
        this.e = l7Var.x();
    }

    public final String a(long j) {
        String strEncodeToString;
        boolean z;
        iso isoVarO = de.o();
        String str = this.d;
        isoVarO.b$1();
        ((de) isoVarO.b).b(str);
        isoVarO.b$1();
        ((de) isoVarO.b).p();
        String packageName = this.a.getPackageName();
        isoVarO.b$1();
        ((de) isoVarO.b).c(packageName);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        isoVarO.b$1();
        de deVar = (de) isoVarO.b;
        deVar.bitField0_ |= 4;
        deVar.evtTime_ = jCurrentTimeMillis;
        long jCurrentTimeMillis2 = (System.currentTimeMillis() - j) / 1000;
        isoVarO.b$1();
        de deVar2 = (de) isoVarO.b;
        deVar2.bitField0_ |= 32;
        deVar2.uptSignal_ = jCurrentTimeMillis2;
        if (this.e) {
            try {
                Signature[] signatureArr = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 64).signatures;
                if (signatureArr == null || signatureArr.length <= 0) {
                    strEncodeToString = "E";
                } else {
                    byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray());
                    StringBuilder sb = new StringBuilder();
                    for (byte b : bArrDigest) {
                        String hexString = Integer.toHexString(b & 255);
                        if (hexString.length() == 1) {
                            sb.append('0');
                        }
                        sb.append(hexString);
                    }
                    strEncodeToString = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                }
            } catch (Exception unused) {
                strEncodeToString = "E";
            }
            isoVarO.b$1();
            ((de) isoVarO.b).d(strEncodeToString);
        }
        try {
            long j2 = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
            isoVarO.b$1();
            de deVar3 = (de) isoVarO.b;
            deVar3.bitField0_ |= 16;
            deVar3.vcdSignal_ = j2;
        } catch (PackageManager.NameNotFoundException unused2) {
            isoVarO.b$1();
            de deVar4 = (de) isoVarO.b;
            deVar4.bitField0_ |= 16;
            deVar4.vcdSignal_ = -1L;
        }
        a aVar = this.c;
        synchronized (aVar) {
            z = aVar.d;
        }
        if (!z) {
            this.c.a();
        }
        d9p d9pVarA = this.c.a(null, ((de) isoVarO.a()).a());
        d9pVarA.b$1();
        le leVar = (le) d9pVarA.b;
        leVar.getClass();
        leVar.protoName_ = 4;
        leVar.bitField0_ |= 2;
        d9pVarA.b$1();
        le leVar2 = (le) d9pVarA.b;
        leVar2.getClass();
        leVar2.encryptionMethod_ = rfp.b(2);
        leVar2.bitField0_ |= 4;
        return b8h.b(true).c(((le) d9pVarA.a()).a());
    }
}
