package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;

/* loaded from: classes.dex */
public final class f33 {
    public final wtp a;
    public final Rect b;

    public f33(wtp wtpVar, Matrix matrix) {
        Rect rect;
        Point[] pointArrZzo;
        this.a = (wtp) Preconditions.checkNotNull(wtpVar);
        byte b = wtpVar.a;
        Rect rect2 = null;
        int iMin = Integer.MAX_VALUE;
        int iMax = LinearLayoutManager.INVALID_OFFSET;
        switch (b) {
            case 0:
                Point[] pointArrZzo2 = wtpVar.b.zzo();
                if (pointArrZzo2 != null) {
                    int iMin2 = Integer.MAX_VALUE;
                    int iMax2 = Integer.MIN_VALUE;
                    for (Point point : pointArrZzo2) {
                        iMin = Math.min(iMin, point.x);
                        iMax = Math.max(iMax, point.x);
                        iMin2 = Math.min(iMin2, point.y);
                        iMax2 = Math.max(iMax2, point.y);
                    }
                    rect = new Rect(iMin, iMin2, iMax, iMax2);
                    rect2 = rect;
                    break;
                }
                break;
            default:
                zzu zzuVar = wtpVar.b;
                if (zzuVar.zze != null) {
                    int iMin3 = Integer.MAX_VALUE;
                    int iMax3 = Integer.MIN_VALUE;
                    int i = 0;
                    while (true) {
                        Point[] pointArr = zzuVar.zze;
                        if (i >= pointArr.length) {
                            rect = new Rect(iMin, iMin3, iMax, iMax3);
                            rect2 = rect;
                            break;
                        } else {
                            Point point2 = pointArr[i];
                            iMin = Math.min(iMin, point2.x);
                            iMax = Math.max(iMax, point2.x);
                            iMin3 = Math.min(iMin3, point2.y);
                            iMax3 = Math.max(iMax3, point2.y);
                            i++;
                        }
                    }
                }
                break;
        }
        if (rect2 != null && matrix != null) {
            RectF rectF = new RectF(rect2);
            matrix.mapRect(rectF);
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        this.b = rect2;
        switch (wtpVar.a) {
            case 0:
                pointArrZzo = wtpVar.b.zzo();
                break;
            default:
                pointArrZzo = wtpVar.b.zze;
                break;
        }
        if (pointArrZzo == null || matrix == null) {
            return;
        }
        float[] fArr = new float[pointArrZzo.length << 1];
        for (int i2 = 0; i2 < pointArrZzo.length; i2++) {
            Point point3 = pointArrZzo[i2];
            int i3 = i2 << 1;
            fArr[i3] = point3.x;
            fArr[i3 + 1] = point3.y;
        }
        matrix.mapPoints(fArr);
        for (int i4 = 0; i4 < pointArrZzo.length; i4++) {
            int i5 = i4 << 1;
            pointArrZzo[i4].set((int) fArr[i5], (int) fArr[i5 + 1]);
        }
    }
}
