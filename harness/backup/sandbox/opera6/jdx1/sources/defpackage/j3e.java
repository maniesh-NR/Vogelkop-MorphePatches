package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j3e implements lva {
    public static final Size e = new Size(480, 360);
    public final ArrayList a;
    public final ms7 b;
    public final Executor c;
    public Matrix d;

    public j3e(List list, Executor executor, ms7 ms7Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((s33) it.next()).getClass();
            Preconditions.checkArgument(true, "Segmentation only works with COORDINATE_SYSTEM_ORIGINAL");
        }
        this.a = new ArrayList(list);
        this.b = ms7Var;
        this.c = executor;
    }

    public final void a(d5j d5jVar) throws Exception {
        sxa sxaVar = d5jVar.e;
        Matrix matrix = new Matrix();
        Matrix matrix2 = this.d;
        if (matrix2 == null) {
            d5jVar.close();
            return;
        }
        Matrix matrix3 = new Matrix(sxaVar.b());
        RectF rectF = new RectF(0.0f, 0.0f, d5jVar.f, d5jVar.g);
        int iF = sxaVar.f();
        RectF rectF2 = d2m.a;
        jpo.i("Invalid rotation degrees: " + iF, iF % 90 == 0);
        matrix3.postConcat(d2m.a(rectF, d2m.c(d2m.j(iF)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF, sxaVar.f(), false));
        matrix3.invert(matrix);
        matrix.postConcat(matrix2);
        b(d5jVar, 0, matrix, new HashMap(), new HashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(final d5j d5jVar, final int i, final Matrix matrix, final HashMap map, final HashMap map2) throws Exception {
        Image imageY = d5jVar.b.y();
        if (imageY == null) {
            d5jVar.close();
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        Executor executor = this.c;
        if (i > size) {
            d5jVar.close();
            executor.execute(new qn(this, map, d5jVar, map2, (byte) 16));
            return;
        }
        final s33 s33Var = (s33) arrayList.get(i);
        try {
            ((r6e) s33Var).h(imageY, d5jVar.e.f(), matrix).addOnCompleteListener(executor, new OnCompleteListener() { // from class: h3e
                public final void onComplete(Task task) throws Exception {
                    boolean zIsCanceled = task.isCanceled();
                    HashMap map3 = map2;
                    s33 s33Var2 = s33Var;
                    HashMap map4 = map;
                    if (zIsCanceled) {
                        map3.put(s33Var2, new CancellationException("The task is canceled."));
                    } else if (task.isSuccessful()) {
                        map4.put(s33Var2, task.getResult());
                    } else {
                        map3.put(s33Var2, task.getException());
                    }
                    this.a.b(d5jVar, i + 1, matrix, map4, map3);
                }
            });
        } catch (Exception e2) {
            map2.put(s33Var, new RuntimeException("Failed to process the image.", e2));
            b(d5jVar, i + 1, matrix, map, map2);
        }
    }

    public final Size c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        Size size2 = e;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((s33) obj).getClass();
            Size size3 = new Size(1280, 720);
            if (size3.getWidth() * size3.getHeight() > size2.getHeight() * size2.getWidth()) {
                size2 = size3;
            }
        }
        return size2;
    }
}
