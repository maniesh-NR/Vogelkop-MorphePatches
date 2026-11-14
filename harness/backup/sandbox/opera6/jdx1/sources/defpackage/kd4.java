package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;

/* loaded from: classes.dex */
public final class kd4 {
    public final qb4 a;
    public final tb5 b;
    public final m20 c;
    public final gf4 d;
    public final pdo e;
    public final fel f;
    public final ge4 g;
    public final yg4 h;
    public final i16 i;
    public final u59 j = new u59((byte) 26);
    public final DynamicRangeProfiles k;

    public kd4(qb4 qb4Var, tb5 tb5Var, m20 m20Var, gf4 gf4Var, pdo pdoVar, fel felVar, ge4 ge4Var, yg4 yg4Var, i16 i16Var) {
        this.a = qb4Var;
        this.b = tb5Var;
        this.c = m20Var;
        this.d = gf4Var;
        this.e = pdoVar;
        this.f = felVar;
        this.g = ge4Var;
        this.h = yg4Var;
        this.i = i16Var;
        int i = Build.VERSION.SDK_INT;
        DynamicRangeProfiles dynamicRangeProfilesB = null;
        if (i >= 33 && ge4Var != null) {
            qe6 qe6VarK = t8.k(ge4Var);
            if (i < 33) {
                t14.c(p3p.i(i, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API ", " (requires API 33)"));
                throw null;
            }
            dynamicRangeProfilesB = ((lp7) qe6VarK.b).b();
        }
        this.k = dynamicRangeProfilesB;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jd4 a(int r38, defpackage.u3j r39, boolean r40, defpackage.o3a r41, java.lang.Integer r42, java.util.Map r43, java.util.Map r44) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd4.a(int, u3j, boolean, o3a, java.lang.Integer, java.util.Map, java.util.Map):jd4");
    }

    public final String toString() {
        return "CameraGraphConfigProvider<" + ((Object) sd4.b(this.c.b)) + '>';
    }
}
