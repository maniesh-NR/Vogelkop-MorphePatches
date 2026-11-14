package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q5a {
    public static final zyk a = z4c.b(new be8((byte) 14));
    public static final zyk b = z4c.b(new be8((byte) 15));

    public static ArrayList a(ftk ftkVar, ftk ftkVar2) {
        ArrayList arrayList = new ArrayList();
        etk etkVar = new etk();
        igk igkVar = itk.e;
        htk htkVar = htk.a;
        etkVar.a(drj.c(htkVar, ftkVar));
        etk etkVarL = o18.l(htk.c, ftkVar2, etkVar, arrayList, etkVar);
        etkVarL.a(drj.c(htkVar, ftkVar));
        etkVarL.a(drj.c(htk.d, ftkVar2));
        arrayList.add(etkVarL);
        return arrayList;
    }

    public static ArrayList b(ge4 ge4Var, t4n t4nVar) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 35) {
            Object objC = ((ma4) ge4Var).c(CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION);
            if (objC == null) {
                qp2.o("Required value was null.");
                return null;
            }
            int iIntValue = ((Number) objC).intValue();
            if (iIntValue >= 35 && t4nVar != t4n.d) {
                arrayList.addAll((List) a.getValue());
            }
            if (iIntValue >= 36 && t4nVar != t4n.e) {
                arrayList.addAll((List) b.getValue());
                return arrayList;
            }
        }
        return arrayList;
    }
}
