package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Pattern;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public abstract class eti {
    public static q6e a;
    public static final HashMap b = new HashMap();
    public static final Pattern c = Pattern.compile("#\\{(.*?)\\}");

    public static GURL a(String str, shf shfVar, int i) {
        q6e q6eVar;
        p6l p6lVar = p6l.a;
        GURL gurl = new GURL(str);
        if (gurl.b) {
            return gurl;
        }
        if (!wqm.x(str)) {
            GURL gurlB = wqm.b("https://", aik.t(str).toString());
            if (gurlB.b) {
                return gurlB;
            }
        }
        eri eriVarB = shfVar != null ? (eri) shfVar.c : null;
        if (eriVarB == null && (q6eVar = a) != null) {
            eriVarB = q6eVar.b();
        }
        if (eriVarB != null) {
            String strA = eriVarB.a(i, p6lVar, str == null ? a26.B((String) null) : str);
            if (strA != null) {
                GURL gurl2 = new GURL(strA);
                if (gurl2.b) {
                    return gurl2;
                }
            }
        }
        return new GURL(sko.j("https://www.google.com/search/?q=", a26.C(str)));
    }

    public static Drawable b(Context context, Bitmap bitmap, int i) {
        if (bitmap != null) {
            return new hq4(bitmap, i);
        }
        Drawable drawableF = sgb.F(2131233170, context);
        Objects.requireNonNull(drawableF);
        return drawableF;
    }

    public static LayerDrawable c(eri eriVar, Context context, int i) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(0)});
        layerDrawable.setLayerWidth(0, i);
        layerDrawable.setLayerHeight(0, i);
        if (eriVar != null) {
            eriVar.h(new eh7(i), new lt2((Object) context, i, (Object) layerDrawable, (byte) 4));
            return layerDrawable;
        }
        layerDrawable.setDrawable(0, b(context, null, i));
        return layerDrawable;
    }

    public static LayerDrawable d(eri eriVar, Context context, int i) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c(eriVar, context, i), new p05(fan.a(1.0f, context.getResources()), f03.s(context), i)});
        layerDrawable.setLayerGravity(0, 17);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static lqm e(int i) {
        int iA = vep.A(i);
        return (iA == 0 || iA == 6) ? lqm.i : iA != 9 ? iA != 2 ? iA != 3 ? lqm.b : lqm.z : lqm.y : lqm.s;
    }
}
