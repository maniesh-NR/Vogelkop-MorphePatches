package defpackage;

import androidx.recyclerview.widget.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qqk extends ro9 {
    public final ArrayList l;

    public qqk() {
        super((byte) 28);
        this.l = new ArrayList();
    }

    public final i t(int i) {
        i iVarT = super.t(i);
        if (iVarT != null && this.l.remove(iVarT)) {
            u8n.g(iVarT.itemView);
        }
        return iVarT;
    }
}
