package defpackage;

import android.text.TextUtils;
import com.leanplum.utils.SizeUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class w10 extends aqi implements nq {
    public final cie u;

    public w10(String str, String str2, String str3, String str4, String str5, String str6, dl dlVar, String str7, cie cieVar, p00 p00Var, i3j i3jVar, ap apVar) {
        super(str, str2, str3, str4, "", str5, str6, dlVar, str7, yo.ADX, p00Var, i3jVar, apVar);
        this.u = cieVar;
    }

    @Override // defpackage.nq
    public final mq a(dl dlVar, km kmVar, k8 k8Var, kq kqVar, List list) {
        return new x10(this, dlVar, kmVar, k8Var, kqVar, list);
    }

    @Override // defpackage.aqi, defpackage.yz
    public final void c() {
        super.c();
        cie cieVar = this.u;
        if (!cieVar.U) {
            cieVar.unregister();
        }
        aoo aooVar = cieVar.w0;
        if (aooVar != null) {
            aooVar.o();
            cieVar.w0 = null;
        }
        cieVar.b = rbe.B;
    }

    @Override // defpackage.yz
    public final boolean d(iq iqVar) {
        return this.u.d == w06.g ? iqVar == iq.c : super.d(iqVar);
    }

    @Override // defpackage.yz
    public final v50 e() {
        return s00.p(this.u.d);
    }

    @Override // defpackage.yz
    public final vz i() {
        cie cieVar = this.u;
        String str = cieVar.u0;
        String str2 = cieVar.v0;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new vz(str, str2);
    }

    @Override // defpackage.yz
    public final List k() {
        cie cieVar = this.u;
        return TextUtils.isEmpty(cieVar.j) ? Collections.EMPTY_LIST : Arrays.asList(new v10(wz.a, 1, cieVar), new v10(wz.d, 2, cieVar), new v10(wz.b, 3, cieVar), new v10(wz.c, 4, cieVar));
    }

    public final boolean v() {
        int iOrdinal = this.u.d.ordinal();
        if (iOrdinal == 8 || iOrdinal == 15) {
            return true;
        }
        switch (iOrdinal) {
            case 19:
            case SizeUtil.textSize0 /* 20 */:
            case 21:
                return true;
            default:
                return false;
        }
    }
}
