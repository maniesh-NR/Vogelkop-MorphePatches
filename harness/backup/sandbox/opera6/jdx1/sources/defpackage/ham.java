package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class ham {
    public static final drj a;
    public static final y3d b;
    public static Paint c;

    static {
        Trace.beginSection("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 31) {
            a = new jam();
        } else {
            a = new drj();
        }
        b = new y3d(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, ni9[] ni9VarArr, int i) {
        Trace.beginSection("TypefaceCompat.createFromFontInfo");
        try {
            drj drjVar = a;
            drjVar.getClass();
            Typeface typefaceBuild = null;
            try {
                FontFamily fontFamilyG = drjVar.g(ni9VarArr, context.getContentResolver());
                if (fontFamilyG != null) {
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyG).setStyle(drj.f(fontFamilyG, i).getStyle()).build();
                }
            } catch (Exception unused) {
            }
            return typefaceBuild;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        r10 = r11.build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r17, defpackage.zh9 r18, android.content.res.Resources r19, int r20, java.lang.String r21, int r22, int r23, defpackage.dbh r24, boolean r25) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ham.b(android.content.Context, zh9, android.content.res.Resources, int, java.lang.String, int, int, dbh, boolean):android.graphics.Typeface");
    }

    public static Typeface c(Resources resources, int i, String str, int i2, int i3) throws IOException {
        Typeface typefaceBuild;
        a.getClass();
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            typefaceBuild = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            typefaceBuild = null;
        }
        if (typefaceBuild != null) {
            b.put(d(resources, i, str, i2, i3), typefaceBuild);
        }
        return typefaceBuild;
    }

    public static String d(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface e(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font f(Typeface typeface) {
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
