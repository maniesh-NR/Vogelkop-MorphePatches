package defpackage;

import android.content.res.Resources;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class pxh implements Parcelable {
    public final CharSequence a(Resources resources) {
        if (this instanceof qxh) {
            return ((qxh) this).a;
        }
        if (this instanceof rxh) {
            return resources.getString(((rxh) this).a);
        }
        if (this instanceof sxh) {
            sxh sxhVar = (sxh) this;
            ArrayList arrayListC = e82.C(sxhVar.b);
            int size = arrayListC.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayListC.get(i);
                if (obj instanceof pxh) {
                    arrayListC.set(i, ((pxh) obj).a(resources));
                }
            }
            Object[] array = arrayListC.toArray(new Object[0]);
            return resources.getString(sxhVar.a, Arrays.copyOf(array, array.length));
        }
        if (!(this instanceof txh)) {
            h9o.p();
            return null;
        }
        txh txhVar = (txh) this;
        ArrayList arrayListC2 = e82.C(txhVar.c);
        int size2 = arrayListC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj2 = arrayListC2.get(i2);
            if (obj2 instanceof pxh) {
                arrayListC2.set(i2, ((pxh) obj2).a(resources));
            }
        }
        Object[] array2 = arrayListC2.toArray(new Object[0]);
        return resources.getQuantityString(txhVar.a, txhVar.b, Arrays.copyOf(array2, array2.length));
    }
}
