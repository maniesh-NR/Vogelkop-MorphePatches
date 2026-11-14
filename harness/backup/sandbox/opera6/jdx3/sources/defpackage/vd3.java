package defpackage;

import android.graphics.Rect;
import android.util.Size;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class vd3 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vd3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return ((Number) ((q92) obj3).invoke(obj, obj2)).intValue();
            case 1:
                for (Function1 function1 : (Function1[]) obj3) {
                    int iA = ad5.a((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (iA != 0) {
                        return iA;
                    }
                }
                return 0;
            case 2:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.v).compareTo(Boolean.valueOf(materialButton2.v));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 == 0 ? Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2)) : iCompareTo2;
            case 3:
                vgd vgdVar = (vgd) obj3;
                return vgdVar.c(obj2) - vgdVar.c(obj);
            case 4:
                return ((Number) ((voj) obj3).invoke(obj, obj2)).intValue();
            case 5:
                return ((Number) ((voj) obj3).invoke(obj, obj2)).intValue();
            case 6:
                HashMap map = (HashMap) obj3;
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                int iCompareTo3 = ((Long) entry2.getValue()).compareTo((Long) entry.getValue());
                return iCompareTo3 == 0 ? ((Long) map.get(entry2.getKey())).compareTo((Long) map.get(entry.getKey())) : iCompareTo3;
            default:
                Rect rect = (Rect) obj3;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(size.getWidth() - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
    }
}
