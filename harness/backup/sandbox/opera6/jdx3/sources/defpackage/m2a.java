package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m2a extends Drawable {
    public static final List f = Arrays.asList(new l2a(0, 0.0f), new l2a(0, 1.0f));
    public List a = f;
    public final Paint b;
    public List c;
    public LinearGradient d;
    public final Rect e;

    public m2a() {
        Paint paint = new Paint(4);
        paint.setColor(-1);
        this.b = paint;
        this.c = this.a;
        this.e = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean zA = Intrinsics.a(this.c, this.a);
        Rect rect = this.e;
        if (!zA || this.d == null || !Intrinsics.a(rect, getBounds())) {
            this.c = this.a;
            rect.set(getBounds());
            float f2 = rect.right;
            float f3 = rect.top;
            float f4 = rect.left;
            float f5 = rect.bottom;
            List list = this.c;
            ArrayList arrayList = new ArrayList(k95.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((l2a) it.next()).a));
            }
            int[] iArrJ0 = CollectionsKt.j0(arrayList);
            List list2 = this.c;
            ArrayList arrayList2 = new ArrayList(k95.o(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Float.valueOf(((l2a) it2.next()).b));
            }
            this.d = new LinearGradient(f2, f3, f4, f5, iArrJ0, CollectionsKt.h0(arrayList2), Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.d;
        if (linearGradient != null) {
            Paint paint = this.b;
            paint.setShader(linearGradient);
            canvas.drawRect(getBounds(), paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
