package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class ca1 implements cdo, v2j, n0g {
    public final Object a;
    public final Object b;

    public ca1(Function1 function1) {
        this.a = function1;
        this.b = new v15();
    }

    public ca1(Function2 function2) {
        this.a = function2;
        this.b = new v15();
    }

    public ca1(pe4 pe4Var, Range range) {
        this.a = pe4Var;
        this.b = range;
    }

    @Override // defpackage.cdo
    public final float a() {
        return ((Number) ((Range) this.b).getUpper()).floatValue();
    }

    public final Object b(itb itbVar, ArrayList arrayList) {
        KSerializer q0iVar;
        zee zeeVar = (zee) ((v15) this.b).get(((n15) itbVar).a());
        Object m0gVar = zeeVar.a.get();
        if (m0gVar == null) {
            synchronized (zeeVar) {
                m0gVar = zeeVar.a.get();
                if (m0gVar == null) {
                    m0gVar = new m0g();
                    zeeVar.a = new SoftReference(m0gVar);
                }
            }
        }
        m0g m0gVar2 = (m0g) m0gVar;
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(new bub((ytb) obj));
        }
        ConcurrentHashMap concurrentHashMap = m0gVar2.a;
        Object obj2 = concurrentHashMap.get(arrayList2);
        if (obj2 == null) {
            try {
                p0i p0iVar = t0i.b;
                q0iVar = (KSerializer) ((Function2) this.a).invoke(itbVar, arrayList);
            } catch (Throwable th) {
                p0i p0iVar2 = t0i.b;
                q0iVar = new q0i(th);
            }
            t0i t0iVar = new t0i(q0iVar);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, t0iVar);
            obj2 = objPutIfAbsent == null ? t0iVar : objPutIfAbsent;
        }
        return ((t0i) obj2).a;
    }

    @Override // defpackage.cdo
    public final h07 c(zrm zrmVar) {
        ArrayList arrayListJ = j95.j(new CaptureRequest.Key[]{CaptureRequest.CONTROL_ZOOM_RATIO});
        if (Build.VERSION.SDK_INT >= 34) {
            arrayListJ.add(CaptureRequest.CONTROL_SETTINGS_OVERRIDE);
        }
        yrm yrmVar = yrm.a;
        return zrmVar.k(arrayListJ);
    }

    public final KSerializer d(itb itbVar) {
        zee zeeVar = (zee) ((v15) this.b).get(((n15) itbVar).a());
        Object h74Var = zeeVar.a.get();
        if (h74Var == null) {
            synchronized (zeeVar) {
                h74Var = zeeVar.a.get();
                if (h74Var == null) {
                    h74Var = new h74((KSerializer) ((Function1) this.a).invoke(itbVar));
                    zeeVar.a = new SoftReference(h74Var);
                }
            }
        }
        return ((h74) h74Var).a;
    }

    @Override // defpackage.cdo
    public final float i() {
        return ((Number) ((Range) this.b).getLower()).floatValue();
    }

    @Override // defpackage.cdo
    public final Rect l() {
        return (Rect) ((ma4) ((pe4) this.a).b).c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    @Override // defpackage.cdo
    public final h07 m(float f, zrm zrmVar) {
        float fI = i();
        if (f > a() || fI > f) {
            qp2.o("Failed requirement.");
            return null;
        }
        LinkedHashMap linkedHashMapD = rbd.d(new Pair[]{new Pair(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f))});
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            fe4 fe4Var = ge4.Oo;
            ge4 ge4Var = ((pe4) this.a).b;
            fe4Var.getClass();
            if (i >= 34 && g8.C(ge4Var)) {
                g8.U(linkedHashMapD);
            }
        }
        return zrm.h(zrmVar, linkedHashMapD);
    }
}
