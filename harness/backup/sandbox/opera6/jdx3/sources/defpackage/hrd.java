package defpackage;

import android.print.PrintAttributes;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class hrd {
    public static final PrintAttributes.MediaSize[] a;

    static {
        Field[] fields = PrintAttributes.MediaSize.class.getFields();
        ArrayList arrayList = new ArrayList(fields.length);
        for (Field field : fields) {
            if ((field.getModifiers() & 24) == 24 && field.getType() == PrintAttributes.MediaSize.class) {
                try {
                    PrintAttributes.MediaSize mediaSize = (PrintAttributes.MediaSize) field.get(null);
                    if (mediaSize != PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE && mediaSize != PrintAttributes.MediaSize.UNKNOWN_PORTRAIT) {
                        arrayList.add(mediaSize);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
        a = (PrintAttributes.MediaSize[]) arrayList.toArray(new PrintAttributes.MediaSize[0]);
    }
}
