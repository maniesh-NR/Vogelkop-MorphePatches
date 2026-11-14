package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class xc4 {
    public final mb4 a;

    public xc4(mb4 mb4Var) {
        this.a = mb4Var;
    }

    public static ArrayList a(xc4 xc4Var) {
        ArrayList arrayListD;
        za4 za4Var = xc4Var.d().b;
        synchronized (za4Var.g) {
            arrayListD = za4Var.h;
        }
        if (arrayListD == null) {
            arrayListD = za4Var.d();
        }
        if (arrayListD == null) {
            kb4.a("CXCP-Camera2");
        }
        return arrayListD;
    }

    public static ge4 b(xc4 xc4Var, String str) {
        return xc4Var.d().c.a(str);
    }

    public static Set c(xc4 xc4Var) {
        za4 za4Var = xc4Var.d().b;
        if (Build.VERSION.SDK_INT < 30) {
            za4Var.getClass();
            return v08.a;
        }
        synchronized (za4Var.g) {
        }
        try {
            Set setG = r9n.g((CameraManager) za4Var.a.get());
            Objects.toString(setG);
            Set<Set> set = setG;
            ArrayList arrayList = new ArrayList(k95.o(set, 10));
            for (Set<String> set2 : set) {
                ArrayList arrayList2 = new ArrayList(k95.o(set2, 10));
                for (String str : set2) {
                    sd4.a(str);
                    arrayList2.add(new sd4(str));
                }
                arrayList.add(CollectionsKt.n0(arrayList2));
            }
            return CollectionsKt.n0(arrayList);
        } catch (CameraAccessException unused) {
            return null;
        }
    }

    public final t94 d() {
        mb4 mb4Var = this.a;
        try {
            Trace.beginSection("getCameraBackend");
            mb4Var.e.getClass();
            t94 t94VarA = mb4Var.a("CXCP-Camera2");
            if (t94VarA != null) {
                return t94VarA;
            }
            throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) kb4.a("CXCP-Camera2"))).toString());
        } finally {
            Trace.endSection();
        }
    }
}
