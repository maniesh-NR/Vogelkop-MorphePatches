package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class wd4 implements xd4, inm {
    public final pe4 a;
    public final m20 b;
    public final mf4 c;
    public final nc4 d;
    public final qb4 e;
    public final gf4 f;
    public final h28 g;
    public final pfk h;
    public final zyk i;
    public final zyk j;

    public wd4(pe4 pe4Var, m20 m20Var, mf4 mf4Var, nc4 nc4Var, qb4 qb4Var, gf4 gf4Var, h28 h28Var, pfk pfkVar) {
        this.a = pe4Var;
        this.b = m20Var;
        this.c = mf4Var;
        this.d = nc4Var;
        this.e = qb4Var;
        this.f = gf4Var;
        this.g = h28Var;
        this.h = pfkVar;
        Object objC = ((ma4) pe4Var.b).c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        final byte b = 0;
        z4c.b(new Function0(this) { // from class: vd4
            public final /* synthetic */ wd4 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                wd4 wd4Var = this.b;
                switch (b2) {
                    case 0:
                        pe4 pe4Var2 = wd4Var.a;
                        Set<sd4> set = (Set) ((ma4) pe4Var2.b).h.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (sd4 sd4Var : set) {
                            String str = sd4Var.a;
                            m20 m20Var2 = new m20(str, (byte) 4);
                            ma4 ma4Var = (ma4) pe4Var2.b;
                            if (!((Set) ma4Var.h.getValue()).contains(sd4Var)) {
                                throw new IllegalStateException((((Object) sd4.b(str)) + " is not a valid physical camera on " + ma4Var).toString());
                            }
                            linkedHashSet.add(new aeg(new pe4(m20Var2, ma4Var.c.a(str))));
                        }
                        return linkedHashSet;
                    case 1:
                        fe4 fe4Var = ge4.Oo;
                        ge4 ge4Var = wd4Var.a.b;
                        fe4Var.getClass();
                        return Boolean.valueOf(fe4.c(ge4Var));
                    default:
                        pe4 pe4Var3 = wd4Var.a;
                        ka4 ka4Var = new ka4();
                        String str2 = pe4Var3.a.b;
                        return ka4Var;
                }
            }
        });
        final byte b2 = 1;
        this.i = z4c.b(new Function0(this) { // from class: vd4
            public final /* synthetic */ wd4 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                wd4 wd4Var = this.b;
                switch (b22) {
                    case 0:
                        pe4 pe4Var2 = wd4Var.a;
                        Set<sd4> set = (Set) ((ma4) pe4Var2.b).h.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (sd4 sd4Var : set) {
                            String str = sd4Var.a;
                            m20 m20Var2 = new m20(str, (byte) 4);
                            ma4 ma4Var = (ma4) pe4Var2.b;
                            if (!((Set) ma4Var.h.getValue()).contains(sd4Var)) {
                                throw new IllegalStateException((((Object) sd4.b(str)) + " is not a valid physical camera on " + ma4Var).toString());
                            }
                            linkedHashSet.add(new aeg(new pe4(m20Var2, ma4Var.c.a(str))));
                        }
                        return linkedHashSet;
                    case 1:
                        fe4 fe4Var = ge4.Oo;
                        ge4 ge4Var = wd4Var.a.b;
                        fe4Var.getClass();
                        return Boolean.valueOf(fe4.c(ge4Var));
                    default:
                        pe4 pe4Var3 = wd4Var.a;
                        ka4 ka4Var = new ka4();
                        String str2 = pe4Var3.a.b;
                        return ka4Var;
                }
            }
        });
        final byte b3 = 2;
        this.j = z4c.b(new Function0(this) { // from class: vd4
            public final /* synthetic */ wd4 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b3;
                wd4 wd4Var = this.b;
                switch (b22) {
                    case 0:
                        pe4 pe4Var2 = wd4Var.a;
                        Set<sd4> set = (Set) ((ma4) pe4Var2.b).h.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (sd4 sd4Var : set) {
                            String str = sd4Var.a;
                            m20 m20Var2 = new m20(str, (byte) 4);
                            ma4 ma4Var = (ma4) pe4Var2.b;
                            if (!((Set) ma4Var.h.getValue()).contains(sd4Var)) {
                                throw new IllegalStateException((((Object) sd4.b(str)) + " is not a valid physical camera on " + ma4Var).toString());
                            }
                            linkedHashSet.add(new aeg(new pe4(m20Var2, ma4Var.c.a(str))));
                        }
                        return linkedHashSet;
                    case 1:
                        fe4 fe4Var = ge4.Oo;
                        ge4 ge4Var = wd4Var.a.b;
                        fe4Var.getClass();
                        return Boolean.valueOf(fe4.c(ge4Var));
                    default:
                        pe4 pe4Var3 = wd4Var.a;
                        ka4 ka4Var = new ka4();
                        String str2 = pe4Var3.a.b;
                        return ka4Var;
                }
            }
        });
    }

    @Override // defpackage.xd4
    public final zpl A() {
        int iIntValue = ((Number) ((ma4) this.a.b).c(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)).intValue();
        zpl zplVar = zpl.a;
        return (iIntValue == 0 || iIntValue != 1) ? zplVar : zpl.b;
    }

    @Override // defpackage.ud4
    public final String B() {
        return ((Boolean) this.i.getValue()).booleanValue() ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.ud4
    public final int C(int i) {
        return kfo.M(kfo.f0(i), ((Number) ((ma4) this.a.b).c(CameraCharacteristics.SENSOR_ORIENTATION)).intValue(), 1 == j());
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        if (s15Var.equals(uqh.a(ka4.class))) {
            return (ka4) this.j.getValue();
        }
        boolean zEquals = s15Var.equals(uqh.a(pe4.class));
        pe4 pe4Var = this.a;
        return zEquals ? pe4Var : s15Var.equals(uqh.a(ge4.class)) ? pe4Var.b : ((ma4) pe4Var.b).E(s15Var);
    }

    @Override // defpackage.xd4
    public final h28 F() {
        return this.g;
    }

    @Override // defpackage.xd4
    public final List J() {
        List listB;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.h.c.b;
        Size[] highSpeedVideoSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoSizes() : null;
        return (highSpeedVideoSizes == null || (listB = e82.B(highSpeedVideoSizes)) == null) ? l08.a : listB;
    }

    @Override // defpackage.ud4
    public final ekc L() {
        return (ode) this.d.a.e.getValue();
    }

    @Override // defpackage.xd4
    public final Set M() {
        Set setE;
        Integer[] numArrI = this.h.c.i();
        return (numArrI == null || (setE = e82.E(numArrI)) == null) ? v08.a : setE;
    }

    @Override // defpackage.xd4
    public final boolean N() {
        fe4 fe4Var = ge4.Oo;
        ge4 ge4Var = this.a.b;
        fe4Var.getClass();
        return fe4.b(ge4Var);
    }

    @Override // defpackage.xd4
    public final Set a() {
        return ((lp7) t8.k(this.a.b).b).a();
    }

    @Override // defpackage.ud4
    public final ekc b() {
        return this.c.c;
    }

    @Override // defpackage.ud4
    public final int c() {
        return C(0);
    }

    @Override // defpackage.xd4
    public final boolean d() {
        if (j() == 2) {
            return true;
        }
        Integer num = (Integer) ((ma4) this.a.b).c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 4;
    }

    @Override // defpackage.xd4
    public final String e() {
        return this.b.b;
    }

    @Override // defpackage.xd4
    public final void f(n97 n97Var, wwg wwgVar) {
        this.e.a(wwgVar, n97Var);
    }

    @Override // defpackage.xd4
    public final Rect g() {
        Rect rect = (Rect) ((ma4) this.a.b).c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, PathInterpolatorCompat.MAX_NUM_POINTS) : rect;
    }

    @Override // defpackage.ud4
    public final int j() {
        int iIntValue = ((Number) ((ma4) this.a.b).c(CameraCharacteristics.LENS_FACING)).intValue();
        if (iIntValue == 0) {
            return 0;
        }
        int i = 1;
        if (iIntValue != 1) {
            i = 2;
            if (iIntValue != 2) {
                return -1;
            }
        }
        return i;
    }

    @Override // defpackage.xd4
    public final Object p() {
        return (CameraCharacteristics) ((ma4) this.a.b).E(uqh.a(CameraCharacteristics.class));
    }

    @Override // defpackage.ud4
    public final boolean q() {
        return oup.h0(this.a);
    }

    @Override // defpackage.xd4
    public final ygh s() {
        return this.f.a();
    }

    @Override // defpackage.xd4
    public final List t(int i) {
        List listB;
        Size[] sizeArrA = this.h.a(i);
        return (sizeArrA == null || (listB = e82.B(sizeArrA)) == null) ? l08.a : listB;
    }

    public final String toString() {
        return "CameraInfoAdapter<" + this.b + ".cameraId>";
    }

    @Override // defpackage.xd4
    public final Set u() {
        Set setD;
        int[] iArr = (int[]) ((ma4) this.a.b).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        return (iArr == null || (setD = e82.D(iArr)) == null) ? v08.a : setD;
    }

    @Override // defpackage.xd4
    public final void v(rb4 rb4Var) {
        qb4 qb4Var = this.e;
        synchronized (qb4Var.a) {
            qb4Var.a.remove(rb4Var);
            qb4Var.c = rbd.i(qb4Var.a);
        }
    }

    @Override // defpackage.xd4
    public final boolean w() {
        int[] iArr = (int[]) ((ma4) this.a.b).c(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        return iArr != null && e82.t(1, iArr) >= 0;
    }

    @Override // defpackage.ud4
    public final ekc x() {
        return this.d.b.e;
    }

    @Override // defpackage.xd4
    public final List y(Range range) {
        List q0iVar;
        try {
            p0i p0iVar = t0i.b;
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.h.c.b;
            Size[] highSpeedVideoSizesFor = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoSizesFor(range) : null;
            q0iVar = highSpeedVideoSizesFor != null ? e82.B(highSpeedVideoSizesFor) : null;
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        List list = q0iVar instanceof q0i ? null : q0iVar;
        return list == null ? l08.a : list;
    }

    @Override // defpackage.xd4
    public final boolean z() {
        fe4 fe4Var = ge4.Oo;
        ge4 ge4Var = this.a.b;
        fe4Var.getClass();
        int[] iArr = (int[]) ((ma4) ge4Var).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            iArr = fe4.b;
        }
        return e82.n(iArr, 9);
    }
}
