package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final /* synthetic */ class rrh implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ srh b;

    public /* synthetic */ rrh(srh srhVar, byte b) {
        this.a = b;
        this.b = srhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        srh srhVar = this.b;
        switch (b) {
            case 0:
                SparseArray sparseArray = srhVar.h;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((urh) sparseArray.valueAt(i)).getClass();
                }
                sparseArray.clear();
                break;
            default:
                xrh xrhVar = srhVar.i;
                if (xrhVar.n == srhVar) {
                    xrhVar.j();
                    break;
                }
                break;
        }
    }
}
