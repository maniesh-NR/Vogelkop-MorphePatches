package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Menu;

/* loaded from: classes.dex */
public final class l66 extends lsk {
    public final /* synthetic */ r9i g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l66(r9i r9iVar, dkf dkfVar) {
        super(dkfVar);
        this.g = r9iVar;
    }

    public final void inflate(int i, Menu menu) {
        super.inflate(i, menu);
        dkf dkfVar = (dkf) this.g.b;
        int size = menu.size();
        TypedArray typedArrayObtainStyledAttributes = dkfVar.obtainStyledAttributes((AttributeSet) null, o66.G);
        try {
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            if (colorStateList != null) {
                for (int size2 = menu.size(); size2 < size; size2++) {
                    ptd item = menu.getItem(size2);
                    if (item instanceof ptd) {
                        o66.l(item, colorStateList);
                    }
                }
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
