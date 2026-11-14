package defpackage;

import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class ltk implements ed2 {
    public final /* synthetic */ ntk a;
    public final /* synthetic */ mtk b;
    public final /* synthetic */ short c;
    public final /* synthetic */ uo2 d;
    public final /* synthetic */ uo2 e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ltk(ntk ntkVar, mtk mtkVar, int i, uo2 uo2Var, uo2 uo2Var2) {
        this.a = ntkVar;
        this.b = mtkVar;
        this.c = i;
        this.d = uo2Var;
        this.e = uo2Var2;
    }

    @Override // defpackage.ed2
    public final ListenableFuture apply(Object obj) {
        mtk mtkVar = this.b;
        Surface surface = (Surface) obj;
        ntk ntkVar = this.a;
        ntkVar.getClass();
        surface.getClass();
        try {
            mtkVar.d();
            vtk vtkVar = new vtk(surface, this.c, ntkVar.g.a, this.d, this.e);
            vtkVar.k.b.addListener(new jtk(mtkVar, (byte) 1), n97.a());
            jpo.n("Consumer can only be linked once.", mtkVar.p == null);
            mtkVar.p = vtkVar;
            return k1g.G(vtkVar);
        } catch (f07 e) {
            return new q0b(e, (byte) 1);
        }
    }
}
