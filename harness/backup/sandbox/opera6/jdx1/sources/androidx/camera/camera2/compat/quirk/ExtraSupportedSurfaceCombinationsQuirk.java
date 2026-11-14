package androidx.camera.camera2.compat.quirk;

import defpackage.drj;
import defpackage.etk;
import defpackage.ftk;
import defpackage.htk;
import defpackage.igk;
import defpackage.itk;
import defpackage.o18;
import defpackage.tgh;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;", "Ltgh;", "ui6", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExtraSupportedSurfaceCombinationsQuirk implements tgh {
    public static final etk a;
    public static final etk b;
    public static final Set c;
    public static final Set d;

    static {
        etk etkVar = new etk();
        igk igkVar = itk.e;
        htk htkVar = htk.b;
        ftk ftkVar = ftk.VGA;
        etkVar.a(drj.c(htkVar, ftkVar));
        htk htkVar2 = htk.a;
        ftk ftkVar2 = ftk.PREVIEW;
        etkVar.a(drj.c(htkVar2, ftkVar2));
        ftk ftkVar3 = ftk.MAXIMUM;
        etkVar.a(drj.c(htkVar, ftkVar3));
        a = etkVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(drj.c(htkVar, ftkVar));
        arrayList.add(drj.c(htkVar, ftkVar2));
        arrayList.add(drj.c(htkVar, ftkVar3));
        etk etkVar2 = new etk();
        o18.u(htkVar2, ftkVar2, etkVar2, htkVar2, ftkVar);
        etkVar2.a(drj.c(htkVar, ftkVar3));
        b = etkVar2;
        c = e82.E(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"});
        d = e82.E(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"});
    }
}
