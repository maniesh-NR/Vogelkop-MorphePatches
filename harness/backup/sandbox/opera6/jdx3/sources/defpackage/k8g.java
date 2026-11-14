package defpackage;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class k8g extends d {
    public int a;
    public int b;
    public ro9 c;

    public final int getItemCount() {
        return this.c.b;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final void onBindViewHolder(i iVar, int i) {
        i8g i8gVar = (i8g) iVar;
        ro9 ro9Var = this.c;
        int i2 = this.a;
        int i3 = this.b;
        ImageView imageView = i8gVar.b;
        if (i8gVar.c == ro9Var && i8gVar.d == i && i8gVar.e == i2 && i8gVar.f == i3) {
            return;
        }
        i8gVar.e = i2;
        i8gVar.f = i3;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(null);
        j8g j8gVar = i8gVar.g;
        if (j8gVar != null) {
            j8gVar.cancel(true);
        }
        Bitmap bitmap = i8gVar.h;
        if (bitmap != null) {
            bitmap.recycle();
            i8gVar.h = null;
        }
        i8gVar.c = ro9Var;
        i8gVar.d = i;
        o8f o8fVar = new o8f(i8gVar, (byte) 14);
        ro9Var.getClass();
        j8g j8gVar2 = new j8g(ro9Var, i, i2, i3, o8fVar);
        j8gVar2.executeOnExecutor((ExecutorService) ro9Var.d, new Void[0]);
        i8gVar.g = j8gVar2;
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new i8g(j7c.n(viewGroup, 2131559211, viewGroup, false));
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        ((ExecutorService) this.c.d).shutdownNow();
    }

    public final void onViewRecycled(i iVar) {
        i8g i8gVar = (i8g) iVar;
        i8gVar.b.setImageBitmap(null);
        j8g j8gVar = i8gVar.g;
        if (j8gVar != null) {
            j8gVar.cancel(true);
            i8gVar.g = null;
        }
        Bitmap bitmap = i8gVar.h;
        if (bitmap != null) {
            bitmap.recycle();
            i8gVar.h = null;
        }
        i8gVar.c = null;
        i8gVar.f = 0;
        i8gVar.e = 0;
    }
}
