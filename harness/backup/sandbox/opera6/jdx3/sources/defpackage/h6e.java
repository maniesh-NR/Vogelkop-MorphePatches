package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class h6e implements usi {
    public final byte a;
    public Object b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public h6e(int i) {
        this.b = new hv5();
        this.c = new Rect();
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h6e(pqk pqkVar, int i) {
        this.c = pqkVar;
        this.a = i;
    }

    public final void a(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount() - 1;
        int i = 0;
        do {
            int iB = b(recyclerView.getChildAt(0));
            byte b = this.a;
            if (iB > b) {
                while (childCount > i && b(recyclerView.getChildAt(childCount)) <= b) {
                    childCount--;
                }
                e(recyclerView, i, childCount);
                return;
            }
            i++;
        } while (i <= childCount);
        f();
    }

    public final int b(View view) {
        Rect rect = (Rect) this.c;
        if (view == null || !view.getGlobalVisibleRect(rect)) {
            return 0;
        }
        int iWidth = rect.width() * rect.height();
        return (iWidth * 100) / (view.getWidth() * view.getHeight());
    }

    @Override // defpackage.usi
    public final dri c(vpb vpbVar, int i, boolean z) {
        dri driVarG;
        if (((pqk) this.c).i(this.a) && (driVarG = g(vpbVar, i, z)) != null) {
            return driVarG;
        }
        h6e h6eVar = (h6e) this.b;
        if (h6eVar != null) {
            return h6eVar.c(vpbVar, i, z);
        }
        return null;
    }

    public final void d(final RecyclerView recyclerView) {
        if (recyclerView.isLayoutRequested() || !recyclerView.isLaidOut()) {
            p37.A(recyclerView, this, (dh4) null, new ViewTreeObserver.OnDrawListener() { // from class: aqh
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    this.a.a(recyclerView);
                }
            });
        } else {
            a(recyclerView);
        }
    }

    public abstract void e(RecyclerView recyclerView, int i, int i2);

    public void f() {
    }

    public abstract dri g(vpb vpbVar, int i, boolean z);
}
