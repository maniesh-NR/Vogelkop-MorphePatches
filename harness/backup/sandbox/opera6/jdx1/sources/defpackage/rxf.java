package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class rxf extends nt5 {
    public sxf t;
    public gfe u;
    public kuk v;
    public /* synthetic */ Object w;
    public final /* synthetic */ sxf x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxf(sxf sxfVar, nt5 nt5Var) {
        super(nt5Var);
        this.x = sxfVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= LinearLayoutManager.INVALID_OFFSET;
        return sxf.s(this.x, null, null, this);
    }
}
