package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f83 extends fya {
    public final List e;
    public final boolean f;
    public final s9i g;
    public final Paint h;

    /* JADX WARN: Multi-variable type inference failed */
    public f83(List list, eya eyaVar) {
        int i;
        int i2;
        Path path;
        Path path2;
        Integer numValueOf;
        Integer numValueOf2;
        super(eyaVar);
        this.e = list;
        int i3 = 1;
        this.f = eyaVar == eya.f;
        if (list.isEmpty()) {
            path = new Path();
            i = 0;
            i2 = 1;
        } else {
            Path path3 = new Path();
            path3.moveTo(((PointF) list.get(0)).x, ((PointF) list.get(0)).y);
            if (list.size() == 1) {
                i = 0;
                i2 = 1;
                path = path3;
            } else {
                int size = list.size();
                int i4 = size - 1;
                if (i4 == 1) {
                    path3.lineTo(((PointF) list.get(1)).x, ((PointF) list.get(1)).y);
                    i = 0;
                    i2 = 1;
                    path = path3;
                } else {
                    int i5 = i4 << 1;
                    PointF[] pointFArr = new PointF[i5];
                    for (int i6 = 0; i6 < i5; i6++) {
                        pointFArr[i6] = new PointF();
                    }
                    PointF[] pointFArr2 = new PointF[i4];
                    for (int i7 = 0; i7 < i4; i7++) {
                        pointFArr2[i7] = new PointF();
                    }
                    pointFArr2[0] = wyh.O((PointF) list.get(0), wyh.Z((PointF) list.get(1), 2.0f));
                    int i8 = size - 2;
                    int i9 = 1;
                    while (i9 < i8) {
                        int i10 = i9 + 1;
                        pointFArr2[i9] = wyh.Z(wyh.O(wyh.Z((PointF) list.get(i9), 2.0f), (PointF) list.get(i10)), 2.0f);
                        i9 = i10;
                        i3 = i3;
                    }
                    i2 = i3;
                    pointFArr2[i8] = wyh.O(wyh.Z((PointF) list.get(i8), 8.0f), (PointF) list.get(i4));
                    PointF[] pointFArr3 = new PointF[i4];
                    for (int i11 = 0; i11 < i4; i11++) {
                        pointFArr3[i11] = new PointF();
                    }
                    float[] fArr = new float[i8];
                    for (int i12 = 0; i12 < i8; i12++) {
                        fArr[i12] = 1.0f;
                    }
                    int i13 = size - 3;
                    fArr[i13] = 2.0f;
                    float[] fArr2 = new float[i4];
                    for (int i14 = 0; i14 < i4; i14++) {
                        fArr2[i14] = 4.0f;
                    }
                    fArr2[0] = 2.0f;
                    fArr2[i8] = 7.0f;
                    Float[] fArr3 = new Float[i8];
                    i = 0;
                    for (int i15 = 0; i15 < i8; i15++) {
                        fArr3[i15] = Float.valueOf(1.0f);
                    }
                    Float[] fArr4 = new Float[i8];
                    for (int i16 = 0; i16 < i8; i16++) {
                        fArr4[i16] = Float.valueOf(0.0f);
                    }
                    fArr4[0] = Float.valueOf(fArr3[0].floatValue() / fArr2[0]);
                    pointFArr3[0] = wyh.Z(pointFArr2[0], 1.0f / fArr2[0]);
                    for (int i17 = i2; i17 < i8; i17++) {
                        int i18 = i17 - 1;
                        fArr4[i17] = Float.valueOf(fArr3[i17].floatValue() / (fArr2[i17] - (fArr4[i18].floatValue() * fArr[i18])));
                    }
                    int i19 = i2;
                    while (i19 < i4) {
                        int i20 = i19 - 1;
                        int i21 = i19;
                        pointFArr3[i21] = wyh.Z(wyh.M(pointFArr2[i19], wyh.Z(pointFArr3[i20], fArr[i20])), 1.0f / (fArr2[i19] - (fArr4[i20].floatValue() * fArr[i20])));
                        i19 = i21 + 1;
                        i13 = i13;
                    }
                    pointFArr[i8] = pointFArr3[i8];
                    for (int i22 = i13; -1 < i22; i22--) {
                        pointFArr[i22] = wyh.M(pointFArr3[i22], wyh.Z(pointFArr[i22 + 1], fArr4[i22].floatValue()));
                    }
                    int i23 = 0;
                    while (i23 < i8) {
                        int i24 = i4 + i23;
                        i23++;
                        pointFArr[i24] = wyh.M(wyh.Z((PointF) list.get(i23), 2.0f), pointFArr[i23]);
                    }
                    pointFArr[i5 - 1] = wyh.Z(wyh.O((PointF) list.get(i4), pointFArr[i8]), 0.5f);
                    int i25 = 0;
                    while (i25 < i4) {
                        int i26 = i25 + 1;
                        PointF pointF = (PointF) list.get(i26);
                        PointF pointF2 = pointFArr[i25];
                        PointF pointF3 = pointFArr[i25 + i4];
                        path3.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF.x, pointF.y);
                        i25 = i26;
                    }
                    path = path3;
                }
            }
        }
        if (this.f) {
            List list2 = this.e;
            if (list2.size() <= 4) {
                path.close();
                path2 = path;
            } else {
                int size2 = list2.size();
                int i27 = size2 - 1;
                PointF pointF4 = (PointF) list2.get(i);
                int size3 = list2.size();
                int i28 = i2;
                while (true) {
                    numValueOf = null;
                    if (i28 >= size3) {
                        numValueOf2 = null;
                        break;
                    }
                    PointF pointF5 = (PointF) list2.get(i28);
                    if (((float) Math.hypot(pointF5.x - pointF4.x, pointF5.y - pointF4.y)) > 0.05f) {
                        numValueOf2 = Integer.valueOf(i28);
                        break;
                    }
                    i28++;
                }
                PointF pointF6 = (PointF) list2.get(i27);
                int i29 = size2 - 2;
                while (true) {
                    if (-1 >= i29) {
                        break;
                    }
                    PointF pointF7 = (PointF) list2.get(i29);
                    if (((float) Math.hypot(pointF7.x - pointF6.x, pointF7.y - pointF6.y)) > 0.05f) {
                        numValueOf = Integer.valueOf(i29);
                        break;
                    }
                    i29--;
                }
                if (numValueOf2 == null || numValueOf == null || numValueOf2.intValue() >= numValueOf.intValue()) {
                    path2 = path;
                    path2.close();
                } else {
                    PointF pointF8 = (PointF) list2.get(0);
                    PointF pointF9 = (PointF) list2.get(numValueOf2.intValue());
                    PointF pointF10 = (PointF) list2.get(numValueOf.intValue());
                    PointF pointF11 = (PointF) list2.get(i27);
                    path.setLastPoint(pointF11.x, pointF11.y);
                    float f = pointF11.x;
                    float fG = v0g.g(f, pointF10.x, 0.4f, f);
                    float f2 = pointF11.y;
                    float fG2 = v0g.g(f2, pointF10.y, 0.4f, f2);
                    float f3 = pointF8.x;
                    float f4 = f3 - ((pointF9.x - f3) * 0.4f);
                    float f5 = pointF8.y;
                    Path path4 = path;
                    path4.cubicTo(fG, fG2, f4, f5 - ((pointF9.y - f5) * 0.4f), f3, f5);
                    path2 = path4;
                    path2.close();
                }
            }
        } else {
            path2 = path;
        }
        this.g = new s9i(path2);
        Paint paint = new Paint();
        paint.setAntiAlias(i2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.h = paint;
    }

    @Override // defpackage.fya
    public void b(Canvas canvas, kk7 kk7Var) {
        i97 i97Var = kk7Var.b;
        Paint paint = this.h;
        s9i s9iVar = this.g;
        if (s9iVar != null) {
            canvas.drawPath(s9iVar.P(i97Var.b), paint);
            return;
        }
        List list = this.e;
        int size = list.size();
        for (int i = 1; i < size; i++) {
            e(i - 1, i, canvas, i97Var, paint);
        }
        if (this.f) {
            if (list.size() >= 2) {
                e(list.size() - 1, 0, canvas, i97Var, paint);
            }
        } else {
            PointF pointF = (PointF) list.get(0);
            PointF pointF2 = i97Var.b;
            canvas.drawPoint(pointF2.x * pointF.x, pointF2.y * pointF.y, paint);
            PointF pointF3 = (PointF) list.get(list.size() - 1);
            PointF pointF4 = i97Var.b;
            canvas.drawPoint(pointF4.x * pointF3.x, pointF4.y * pointF3.y, paint);
        }
    }

    public final void e(int i, int i2, Canvas canvas, i97 i97Var, Paint paint) {
        List list = this.e;
        PointF pointF = (PointF) list.get(i);
        PointF pointF2 = (PointF) list.get(i2);
        PointF pointF3 = i97Var.b;
        float f = pointF3.x;
        float f2 = f * pointF.x;
        float f3 = pointF3.y;
        canvas.drawLine(f2, f3 * pointF.y, f * pointF2.x, f3 * pointF2.y, paint);
    }

    @Override // defpackage.fya, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.e);
    }
}
