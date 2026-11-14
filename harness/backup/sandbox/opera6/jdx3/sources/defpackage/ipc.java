package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class ipc extends kr implements dr9 {
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        List list = (List) obj3;
        ((fpc) ((kr) this).a).getClass();
        return Boolean.valueOf(zBooleanValue && zBooleanValue2 && !list.isEmpty());
    }
}
