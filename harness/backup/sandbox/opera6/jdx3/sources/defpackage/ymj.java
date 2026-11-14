package defpackage;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.opera.android.utilities.DisplayUtil;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class ymj {
    public final anj a;
    public boolean b;
    public final boolean c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public PointF i;
    public PointF j;
    public PointF k;
    public final TextPaint l;
    public final TextPaint m;

    public ymj(Context context, anj anjVar, int i, nrl nrlVar, int i2, int i3, boolean z) {
        Typeface typefaceCreate;
        Typeface typefaceCreate2;
        this.a = anjVar;
        DisplayUtil.f(context);
        this.c = DisplayUtil.e < 3.5f;
        float f = context.getResources().getDisplayMetrics().density;
        this.d = f;
        this.e = 2.0f * f;
        this.f = 21.0f * f;
        this.g = 11.0f * f;
        this.h = 4.0f * f;
        TextPaint textPaint = new TextPaint(1);
        try {
            typefaceCreate = Typeface.create("sans-serif-medium", 0);
        } catch (ArrayIndexOutOfBoundsException unused) {
            typefaceCreate = Typeface.DEFAULT;
        }
        textPaint.setTypeface(typefaceCreate);
        BitmapShader bitmapShaderW = nrlVar.w();
        textPaint.setColor(i);
        textPaint.setShader(bitmapShaderW);
        if (bitmapShaderW != null) {
            textPaint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
        }
        this.l = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(f * 8.0f);
        try {
            typefaceCreate2 = Typeface.create("sans-serif-condensed", 0);
        } catch (ArrayIndexOutOfBoundsException unused2) {
            typefaceCreate2 = Typeface.DEFAULT;
        }
        textPaint2.setTypeface(typefaceCreate2);
        BitmapShader bitmapShaderW2 = nrlVar.w();
        textPaint2.setColor(i);
        textPaint2.setShader(bitmapShaderW2);
        if (bitmapShaderW2 != null) {
            textPaint2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
        }
        this.m = textPaint2;
    }

    public static Rect a(String str, TextPaint textPaint) {
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        return rect;
    }

    public static Set b(String str, String str2) {
        Matcher matcher = Pattern.compile("[" + str2 + "]").matcher(str);
        if (!matcher.find()) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        do {
            linkedHashSet.add(Integer.valueOf(matcher.start()));
        } while (matcher.find());
        return CollectionsKt.n0(linkedHashSet);
    }
}
