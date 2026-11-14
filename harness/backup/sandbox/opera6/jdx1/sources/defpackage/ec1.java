package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ec1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c6n b;

    public /* synthetic */ ec1(c6n c6nVar, byte b) {
        this.a = b;
        this.b = c6nVar;
    }

    public final Object invoke() {
        byte b = this.a;
        c6n c6nVar = this.b;
        switch (b) {
            case 0:
                if (c6nVar.e && c6nVar.isAttachedToWindow() && c6nVar.b.getParent() == c6nVar) {
                    if (!c6nVar.isAttachedToWindow()) {
                        a8b.b("Expected AndroidViewHolder to be attached when observing reads.");
                    }
                    p12 p12Var = c6nVar.c.K;
                    ((tuj) p12Var.a).e(c6nVar, c6n.F, c6nVar.d);
                }
                break;
            case 1:
                c6nVar.z.C();
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                c6nVar.A.saveHierarchyState(sparseArray);
                break;
            case 3:
                c6nVar.E.invoke(c6nVar.A);
                p8f p8fVar = c6nVar.B;
                if (p8fVar != null) {
                    p8fVar.K();
                }
                c6nVar.B = null;
                break;
            case 4:
                c6nVar.D.invoke(c6nVar.A);
                break;
            default:
                c6nVar.C.invoke(c6nVar.A);
                break;
        }
        return Unit.a;
    }
}
