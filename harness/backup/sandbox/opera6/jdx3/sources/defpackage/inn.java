package defpackage;

import android.util.Size;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class inn {
    public final pde a;
    public final pde b;
    public final ykn c;
    public final j4c d;
    public final pde e = new pde(a());

    public inn(ndc ndcVar, pde pdeVar, pde pdeVar2, ykn yknVar, j4c j4cVar) {
        this.a = pdeVar;
        this.b = pdeVar2;
        this.c = yknVar;
        this.d = j4cVar;
        final byte b = 0;
        pdeVar.j(ndcVar, new t7d(new Function1(this) { // from class: hnn
            public final /* synthetic */ inn b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                inn innVar = this.b;
                switch (b2) {
                    case 0:
                        innVar.e.r(innVar.a());
                        break;
                    default:
                        innVar.e.r(innVar.a());
                        break;
                }
                return Unit.a;
            }
        }, (byte) 29));
        final byte b2 = 1;
        pdeVar2.j(ndcVar, new t7d(new Function1(this) { // from class: hnn
            public final /* synthetic */ inn b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                inn innVar = this.b;
                switch (b22) {
                    case 0:
                        innVar.e.r(innVar.a());
                        break;
                    default:
                        innVar.e.r(innVar.a());
                        break;
                }
                return Unit.a;
            }
        }, (byte) 29));
    }

    public final Size a() {
        Size size = (Size) this.a.g();
        int width = size.getWidth();
        int height = size.getHeight();
        pde pdeVar = this.b;
        int i = ((jzk) pdeVar.g()).a;
        ykn yknVar = this.c;
        avl avlVar = (avl) ((bvl) yknVar.a.get()).getState().g();
        return new Size(width, (height - (avlVar.e != 2 ? 0 : i + avlVar.c)) - yknVar.a(((jzk) pdeVar.g()).b, ((q8l) ((t8l) this.d.get()).c.g()).a));
    }
}
