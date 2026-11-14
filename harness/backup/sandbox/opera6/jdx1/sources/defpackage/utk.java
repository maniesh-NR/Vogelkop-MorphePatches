package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class utk {
    public static final hp7 a = new hp7(new thk((byte) 3), (byte) 0);

    public static final void a(c8e c8eVar, paj pajVar, long j, long j2, float f, float f2, Function2 function2, ih5 ih5Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            c8eVar = z7e.b;
        }
        if ((i2 & 2) != 0) {
            pajVar = kfo.i;
        }
        if ((i2 & 4) != 0) {
            j = ((sa5) ((vt9) ih5Var).j(ua5.a)).p;
        }
        if ((i2 & 8) != 0) {
            j2 = ua5.b(j, ih5Var);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        vt9 vt9Var = (vt9) ih5Var;
        hp7 hp7Var = a;
        float f3 = f + ((gh7) vt9Var.j(hp7Var)).a;
        kfo.d(new k7h[]{aq5.a.a(new u95(j2)), hp7Var.a(new gh7(f3))}, gyg.P(421772006, new rtk(c8eVar, pajVar, j, f3, null, f2, function2), vt9Var), vt9Var, 56);
    }

    public static final void b(Function0 function0, c8e c8eVar, boolean z, paj pajVar, long j, long j2, float f, go3 go3Var, lde ldeVar, ue5 ue5Var, ih5 ih5Var, int i, int i2) {
        lde ldeVar2;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        paj pajVar2 = (i2 & 8) != 0 ? kfo.i : pajVar;
        long j3 = (i2 & 16) != 0 ? ((sa5) ((vt9) ih5Var).j(ua5.a)).p : j;
        long jB = (i2 & 32) != 0 ? ua5.b(j3, ih5Var) : j2;
        float f2 = (i2 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? 0.0f : f;
        go3 go3Var2 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : go3Var;
        lde ldeVar3 = (i2 & NotificationCompat.FLAG_GROUP_SUMMARY) == 0 ? ldeVar : null;
        if (ldeVar3 == null) {
            vt9 vt9Var = (vt9) ih5Var;
            vt9Var.W(-1701037204);
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = new lde();
                vt9Var.g0(objK);
            }
            ldeVar2 = (lde) objK;
            vt9Var.p(false);
        } else {
            vt9 vt9Var2 = (vt9) ih5Var;
            vt9Var2.W(2023337163);
            vt9Var2.p(false);
            ldeVar2 = ldeVar3;
        }
        vt9 vt9Var3 = (vt9) ih5Var;
        hp7 hp7Var = a;
        float f3 = 0.0f + ((gh7) vt9Var3.j(hp7Var)).a;
        kfo.d(new k7h[]{aq5.a.a(new u95(jB)), hp7Var.a(new gh7(f3))}, gyg.P(849208527, new stk(c8eVar, pajVar2, j3, f3, go3Var2, ldeVar2, z2, function0, f2, ue5Var), vt9Var3), vt9Var3, 56);
    }

    public static final c8e c(c8e c8eVar, paj pajVar, long j, go3 go3Var, float f) {
        paj pajVar2;
        c8e c8eVarP;
        c8e fo3Var = z7e.b;
        if (f > 0.0f) {
            pajVar2 = pajVar;
            c8eVarP = z5i.P(fo3Var, 0.0f, 0.0f, 0.0f, f, pajVar2, 124895);
        } else {
            pajVar2 = pajVar;
            c8eVarP = fo3Var;
        }
        c8e c8eVarD = c8eVar.d(c8eVarP);
        if (go3Var != null) {
            fo3Var = new fo3(go3Var.a, go3Var.b, pajVar2);
        }
        return x1p.j(sfe.C(c8eVarD.d(fo3Var), j, pajVar2), pajVar2);
    }

    public static final long d(long j, float f, vt9 vt9Var) {
        sa5 sa5Var = (sa5) vt9Var.j(ua5.a);
        boolean zBooleanValue = ((Boolean) vt9Var.j(ua5.b)).booleanValue();
        long j2 = sa5Var.p;
        int i = u95.h;
        if (!jgm.a(j, j2) || !zBooleanValue) {
            return j;
        }
        if (gh7.b(f, 0.0f)) {
            return j2;
        }
        return cs5.q(u95.b(sa5Var.t, ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f), j2);
    }
}
