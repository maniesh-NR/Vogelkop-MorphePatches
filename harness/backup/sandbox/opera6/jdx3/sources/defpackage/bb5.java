package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.util.TypedValue;
import java.util.List;

/* loaded from: classes.dex */
public abstract class bb5 extends f83 {
    public static final /* synthetic */ int j = 0;
    public final int i;

    public bb5(List list, int i, eya eyaVar) {
        super(list, eyaVar);
        this.i = i;
        this.h.setColor(i);
    }

    @Override // defpackage.f83, defpackage.fya
    public final void b(Canvas canvas, kk7 kk7Var) {
        f(kk7Var);
        super.b(canvas, kk7Var);
    }

    public Paint f(kk7 kk7Var) {
        Resources resources = kk7Var.e;
        float fApplyDimension = ((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics())) * kk7Var.b.c;
        Paint paint = this.h;
        paint.setStrokeWidth(fApplyDimension);
        return paint;
    }

    @Override // defpackage.f83, defpackage.fya, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.i);
    }
}
