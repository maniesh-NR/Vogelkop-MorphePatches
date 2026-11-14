package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class an9 {
    public static final fn9 a = new fn9();
    public static final gn9 b;

    static {
        gn9 gn9Var = null;
        try {
            gn9Var = (gn9) ln9.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = gn9Var;
    }

    public static final void a(int i, ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((View) obj).setVisibility(i);
        }
    }
}
