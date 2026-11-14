package defpackage;

import android.animation.LayoutTransition;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class r97 implements p59 {
    public final ViewGroup a;
    public final List b = Arrays.asList(2, 0, 3, 1);
    public final ArrayList c = new ArrayList();

    public r97(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.p59
    public final void a() {
        ViewGroup viewGroup = this.a;
        if (viewGroup.getLayoutTransition() != null) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                if (layoutTransition.isTransitionTypeEnabled(iIntValue)) {
                    layoutTransition.disableTransitionType(iIntValue);
                    this.c.add(Integer.valueOf(iIntValue));
                }
            }
        }
    }

    @Override // defpackage.p59
    public final void b(Object obj) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            this.a.getLayoutTransition().enableTransitionType(((Number) obj2).intValue());
        }
        arrayList.clear();
    }
}
