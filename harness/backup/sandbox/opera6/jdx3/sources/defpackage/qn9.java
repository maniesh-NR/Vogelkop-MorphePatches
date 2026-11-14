package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class qn9 extends lim {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ rn9 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public qn9(rn9 rn9Var, int i, RecyclerView recyclerView) {
        this.b = rn9Var;
        this.c = i;
        this.d = recyclerView;
    }

    public qn9(rn9 rn9Var, int[] iArr, int i) {
        this.b = rn9Var;
        this.d = iArr;
        this.c = i;
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        View view;
        byte b = this.a;
        int i = this.c;
        Object obj = this.d;
        rn9 rn9Var = this.b;
        switch (b) {
            case 0:
                ndcVar.getLifecycle().b(this);
                RecyclerView recyclerView = (RecyclerView) obj;
                bm8 bm8Var = new bm8(new ug5(rn9Var, i, (byte) 1), (byte) 15);
                if (!recyclerView.isLaidOut()) {
                    q9n.d(bm8Var, recyclerView);
                    break;
                } else {
                    bm8Var.j();
                    break;
                }
            default:
                ndcVar.getLifecycle().b(this);
                int[] iArr = (int[]) obj;
                if (iArr.length != 0 && (view = ((ltl) rn9Var.c).getView()) != null) {
                    if (iArr.length == 0) {
                        h9o.h("Array is empty.");
                        break;
                    } else {
                        View viewFindViewById = view.findViewById(iArr[0]);
                        if (viewFindViewById != null) {
                            bm8 bm8Var2 = new bm8(new q14((Object) rn9Var, (Object) iArr, i, (byte) 3), (byte) 15);
                            if (!viewFindViewById.isLaidOut()) {
                                q9n.d(bm8Var2, viewFindViewById);
                                break;
                            } else {
                                bm8Var2.j();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
