package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import com.opera.hype.image.editor.EditImage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i97 {
    public static final PointF e = new PointF();
    public final PointF a;
    public final PointF b;
    public float c;
    public final PointF d;

    public i97(PointF pointF, int i) {
        PointF pointF2 = new PointF();
        pointF = (i & 2) != 0 ? new PointF() : pointF;
        this.a = pointF2;
        this.b = pointF;
        this.c = 1.0f;
        this.d = new PointF();
    }

    public final void a() {
        this.a.set(0.0f, 0.0f);
        this.b.set(0.0f, 0.0f);
        this.c = 1.0f;
        this.d.set(0.0f, 0.0f);
    }

    public final PointF b(float f, float f2) {
        PointF pointF = this.a;
        float f3 = f - pointF.x;
        float f4 = f2 - pointF.y;
        PointF pointF2 = this.b;
        float f5 = f3 / pointF2.x;
        PointF pointF3 = this.d;
        pointF3.x = f5;
        pointF3.y = f4 / pointF2.y;
        return pointF3;
    }

    public final boolean c(EditImage editImage) {
        a();
        ydb ydbVar = editImage.b.a;
        RectF rectFB = ydbVar.b(ydbVar.b);
        if (rectFB == null || rectFB.isEmpty()) {
            return false;
        }
        this.b.set(rectFB.width(), rectFB.height());
        float paddingLeft = rectFB.left + ydbVar.getPaddingLeft();
        PointF pointF = this.a;
        pointF.x = paddingLeft;
        pointF.y = rectFB.top + ydbVar.getPaddingTop();
        this.c = ydbVar.h() * editImage.a;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i97)) {
            return false;
        }
        i97 i97Var = (i97) obj;
        return this.a.equals(i97Var.a) && Intrinsics.a(this.b, i97Var.b) && Float.compare(this.c, i97Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
