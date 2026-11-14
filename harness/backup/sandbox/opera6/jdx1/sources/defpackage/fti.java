package defpackage;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class fti implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ fti(SearchView searchView, byte b) {
        this.a = b;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SearchView searchView = this.b;
        switch (b) {
            case 0:
                searchView.p();
                break;
            default:
                m46 m46Var = searchView.O;
                if (m46Var instanceof tqk) {
                    m46Var.b(null);
                    break;
                }
                break;
        }
    }
}
