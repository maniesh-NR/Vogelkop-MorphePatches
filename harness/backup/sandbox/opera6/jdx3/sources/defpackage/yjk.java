package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class yjk extends i {
    public final b7k b;
    public ate c;

    public yjk(b7k b7kVar) {
        super((OperaListItem) b7kVar.b);
        this.b = b7kVar;
        ConstraintLayout constraintLayout = (OperaListItem) b7kVar.c;
        kkf kkfVar = new kkf(this, (byte) 29);
        dll dllVarS = q9n.s(constraintLayout);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, constraintLayout, kkfVar);
    }
}
