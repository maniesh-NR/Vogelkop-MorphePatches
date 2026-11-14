package defpackage;

import android.view.MotionEvent;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class nwc implements nph {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ SearchView b;

    public nwc(SearchView searchView) {
        this.b = searchView;
    }

    public nwc(ndn ndnVar, SearchView searchView) {
        this.b = searchView;
    }

    private final void a(boolean z) {
    }

    private final void e(boolean z) {
    }

    private final void f(MotionEvent motionEvent) {
    }

    private final void g(MotionEvent motionEvent) {
    }

    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        byte b = this.a;
        SearchView searchView = this.b;
        switch (b) {
            case 0:
                if (searchView.hasFocus()) {
                    q9n.u(searchView);
                    searchView.clearFocus();
                    break;
                }
                break;
            default:
                if (searchView.hasFocus()) {
                    q9n.u(searchView);
                    searchView.clearFocus();
                    break;
                }
                break;
        }
        return false;
    }

    public final void c(boolean z) {
        byte b = this.a;
    }

    public final void d(MotionEvent motionEvent) {
        byte b = this.a;
    }
}
