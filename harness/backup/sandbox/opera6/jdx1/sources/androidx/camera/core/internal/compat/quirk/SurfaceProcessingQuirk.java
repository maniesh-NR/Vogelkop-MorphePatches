package androidx.camera.core.internal.compat.quirk;

import defpackage.tgh;
import defpackage.ygh;
import java.util.ArrayList;

/* loaded from: classes.dex */
public interface SurfaceProcessingQuirk extends tgh {
    static boolean a(ygh yghVar) {
        ArrayList arrayListC = yghVar.c(SurfaceProcessingQuirk.class);
        int size = arrayListC.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListC.get(i);
            i++;
            if (((SurfaceProcessingQuirk) obj).d()) {
                return true;
            }
        }
        return false;
    }

    default boolean d() {
        return true;
    }
}
