package defpackage;

import androidx.recyclerview.widget.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class yw8 implements t37 {
    public final /* synthetic */ bx8 a;

    public /* synthetic */ yw8(bx8 bx8Var) {
        this.a = bx8Var;
    }

    @Override // defpackage.t37
    public final void a(i iVar) {
        if (iVar instanceof ab2) {
            ab2 ab2Var = (ab2) iVar;
            ArrayList arrayList = this.a.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                xw8 xw8Var = ((zw8) obj).b;
                if (xw8Var != null && xw8.class.isAssignableFrom(xw8.class)) {
                    xw8Var.h.onViewRecycled(ab2Var);
                }
            }
        }
    }
}
