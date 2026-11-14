package defpackage;

import androidx.core.widget.NestedScrollView;
import com.opera.android.feed.FeedScrollView;

/* loaded from: classes.dex */
public final /* synthetic */ class hw7 implements ile {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hw7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ow7 ow7Var = (ow7) obj;
                if (ow7Var.j) {
                    ow7Var.g.d(ow7Var.c);
                    break;
                }
                break;
            case 1:
                int i5 = FeedScrollView.T;
                i7f i7fVar = ((FeedScrollView) obj).D;
                g7f g7fVarC = u35.c(i7fVar, i7fVar);
                while (g7fVarC.hasNext()) {
                    ((ile) g7fVarC.next()).a(nestedScrollView, i, i2, i3, i4);
                }
                break;
            case 2:
                ((noc) obj).b.d();
                break;
            default:
                kok kokVar = (kok) obj;
                if ((i != i3 || i2 != i4) && kokVar.q) {
                    kokVar.s.d(kokVar.a);
                    break;
                }
                break;
        }
    }
}
