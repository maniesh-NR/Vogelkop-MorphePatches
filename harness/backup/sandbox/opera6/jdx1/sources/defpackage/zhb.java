package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zhb {
    public final xc4 a;

    public zhb(xc4 xc4Var) {
        this.a = xc4Var;
    }

    public static int a(float f, float f2) {
        jpo.i("Focal length should be positive.", f > 0.0f);
        jpo.i("Sensor length should be positive.", f2 > 0.0f);
        int degrees = (int) Math.toDegrees(Math.atan(f2 / (2.0f * f)) * 2.0d);
        jpo.k(degrees, 0, 360, "The provided focal length and sensor length result in an invalid view angle degrees.");
        return degrees;
    }

    public static float c(ge4 ge4Var) {
        Object objC = ((ma4) ge4Var).c(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        jpo.m(objC, "The focal lengths can not be empty.");
        float[] fArr = (float[]) objC;
        jpo.n("The focal lengths can not be empty.", !(fArr.length == 0));
        return fArr[0];
    }

    public static float d(ge4 ge4Var) {
        ma4 ma4Var = (ma4) ge4Var;
        Object objC = ma4Var.c(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        jpo.m(objC, "The sensor size can't be null.");
        SizeF sizeF = (SizeF) objC;
        Object objC2 = ma4Var.c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        jpo.m(objC2, "The sensor orientation can't be null.");
        Object objC3 = ma4Var.c(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        jpo.m(objC3, "The active array size can't be null.");
        Size size = (Size) objC3;
        Object objC4 = ma4Var.c(CameraCharacteristics.SENSOR_ORIENTATION);
        jpo.m(objC4, "The pixel array size can't be null.");
        int iIntValue = ((Number) objC4).intValue();
        Size sizeF2 = d2m.f((Rect) objC2);
        if (d2m.c(iIntValue)) {
            SizeF sizeF3 = new SizeF(sizeF.getHeight(), sizeF.getWidth());
            Size size2 = new Size(sizeF2.getHeight(), sizeF2.getWidth());
            size = new Size(size.getHeight(), size.getWidth());
            sizeF2 = size2;
            sizeF = sizeF3;
        }
        return (sizeF.getWidth() * sizeF2.getWidth()) / size.getWidth();
    }

    public final int b(ge4 ge4Var) {
        xc4 xc4Var = this.a;
        try {
            ArrayList arrayListA = xc4.a(xc4Var);
            jpo.m(arrayListA, "Failed to get available camera IDs");
            int size = arrayListA.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListA.get(i);
                i++;
                String str = ((sd4) obj).a;
                ge4 ge4VarA = xc4Var.d().c.a(str);
                sd4.b(str);
                CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                Object objC = ((ma4) ge4VarA).c(key);
                jpo.m(objC, "Failed to get CameraCharacteristics.LENS_FACING for " + ((Object) sd4.b(str)));
                int iIntValue = ((Number) objC).intValue();
                ma4 ma4Var = (ma4) ge4Var;
                Object objC2 = ma4Var.c(key);
                jpo.m(objC2, "Failed to get the required LENS_FACING for " + ((Object) sd4.b(ma4Var.a)));
                if (iIntValue == ((Number) objC2).intValue()) {
                    return a(c(ge4VarA), d(ge4VarA));
                }
            }
            throw new IllegalStateException("Could not find the default camera for " + ((Object) sd4.b(((ma4) ge4Var).a)));
        } catch (Exception e) {
            h9o.m("Failed to get a valid view angle", e);
            return 0;
        }
    }
}
