package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class wta {
    public static final c8e a = mpj.h(z7e.b, qqj.c);

    public static final void a(final yza yzaVar, String str, c8e c8eVar, long j, ih5 ih5Var, final int i, final int i2) {
        String str2;
        final long j2;
        final c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-126890956);
        int i3 = (vt9Var.f(yzaVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= vt9Var.f(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        int i5 = i3 | (((i2 & 8) == 0 && vt9Var.e(j)) ? 2048 : 1024);
        if (vt9Var.N(i5 & 1, (i5 & 1171) != 1170)) {
            vt9Var.S();
            if ((i & 1) == 0 || vt9Var.x()) {
                if (i4 != 0) {
                    c8eVar = z7e.b;
                }
                if ((i2 & 8) != 0) {
                    j = ((u95) vt9Var.j(aq5.a)).a;
                    i5 &= -7169;
                }
                c8e c8eVar3 = c8eVar;
                long j3 = j;
                vt9Var.q();
                str2 = str;
                b(u0h.p(yzaVar, vt9Var), str2, c8eVar3, j3, vt9Var, 8 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
                c8eVar2 = c8eVar3;
                j2 = j3;
            } else {
                vt9Var.Q();
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                }
                c8e c8eVar32 = c8eVar;
                long j32 = j;
                vt9Var.q();
                str2 = str;
                b(u0h.p(yzaVar, vt9Var), str2, c8eVar32, j32, vt9Var, 8 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
                c8eVar2 = c8eVar32;
                j2 = j32;
            }
        } else {
            str2 = str;
            vt9Var.Q();
            j2 = j;
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            final String str3 = str2;
            znhVarR.d = new Function2() { // from class: vta
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wta.a(yzaVar, str3, c8eVar2, j2, (ih5) obj, aoh.m(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.hyf r16, java.lang.String r17, defpackage.c8e r18, long r19, defpackage.ih5 r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wta.b(hyf, java.lang.String, c8e, long, ih5, int, int):void");
    }
}
