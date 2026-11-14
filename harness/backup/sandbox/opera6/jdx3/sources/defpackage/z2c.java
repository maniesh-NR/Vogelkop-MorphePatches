package defpackage;

import androidx.recyclerview.widget.i;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class z2c implements y2c {
    public final tx7 a;
    public final byte b;
    public final LinkedHashMap c = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public z2c(int i, tx7 tx7Var) {
        this.a = tx7Var;
        this.b = i;
    }

    @Override // defpackage.y2c
    public final x2c a(i iVar) {
        int layoutPosition = iVar.getLayoutPosition();
        LinkedHashMap linkedHashMap = this.c;
        x2c x2cVar = layoutPosition != -1 ? (x2c) linkedHashMap.get(iVar) : null;
        int bindingAdapterPosition = iVar.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return null;
        }
        tx7 tx7Var = this.a;
        byte b = this.b;
        int iE = tx7Var.e(bindingAdapterPosition, b);
        int i = b - 1;
        boolean z = iE == 0;
        boolean z2 = iE == i;
        boolean z3 = iE > 0;
        boolean z4 = iE < i;
        if (x2cVar != null && z == x2cVar.a && z2 == x2cVar.b && z3 == x2cVar.d && z4 == x2cVar.c) {
            return x2cVar;
        }
        x2c x2cVar2 = new x2c(z, z2, z4, z3);
        linkedHashMap.put(iVar, x2cVar2);
        return x2cVar2;
    }

    @Override // defpackage.y2c
    public final void invalidate() {
        tx7 tx7Var = this.a;
        tx7Var.h();
        tx7Var.g();
    }
}
