package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g50 implements uc4 {
    public final ArrayList a;

    public g50(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.uc4
    public final ng2 a(SessionConfiguration sessionConfiguration) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ng2 ng2VarA = ((uc4) obj).a(sessionConfiguration);
            if (ng2VarA.b != 0) {
                return ng2VarA;
            }
        }
        return new ng2((byte) 1, 0);
    }
}
