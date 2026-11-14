package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class iph {
    @Deprecated
    public void getItemOffsets(@NonNull Rect rect, int i, @NonNull RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        getItemOffsets(rect, ((lph) view.getLayoutParams()).a.getLayoutPosition(), recyclerView);
    }

    @Deprecated
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
    }

    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull vph vphVar) {
        onDraw(canvas, recyclerView);
    }

    @Deprecated
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
    }

    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull vph vphVar) {
        onDrawOver(canvas, recyclerView);
    }
}
