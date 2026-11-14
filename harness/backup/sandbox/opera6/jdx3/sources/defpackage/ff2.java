package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public final class ff2 {
    public static final ff2 e = new ff2(new int[0], new TypedValue());
    public final int[] a;
    public final TypedValue b;
    public final String c;
    public final int d;

    public ff2(int i, String str, int[] iArr) {
        this.a = iArr;
        this.b = null;
        this.c = str;
        this.d = i;
    }

    public ff2(int[] iArr, TypedValue typedValue) {
        this.a = iArr;
        this.b = typedValue;
        this.c = null;
        this.d = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r4 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ff2 a(zg r10, int[] r11) {
        /*
            java.lang.Object r0 = r10.c
            android.util.AttributeSet r0 = (android.util.AttributeSet) r0
            java.lang.Object r1 = r10.b
            android.view.View r1 = (android.view.View) r1
            int r2 = r10.a
            r3 = 0
            if (r0 == 0) goto L9e
            android.content.Context r4 = r1.getContext()
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            java.lang.Object r6 = r10.d
            android.content.res.Resources$Theme r6 = (android.content.res.Resources.Theme) r6
            if (r6 != 0) goto L2a
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Resources$Theme r6 = r1.newTheme()
            r10.d = r6
        L2a:
            r1 = 0
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r0, r11, r1, r1)
            boolean r7 = r6.getValue(r1, r5)
            r6.recycle()
            r6 = 2
            if (r7 == 0) goto L54
            int r10 = r5.type
            if (r10 != r6) goto L44
            int r10 = r5.data
            r0 = 2130968700(0x7f04007c, float:1.7546061E38)
            if (r10 == r0) goto L9e
        L44:
            int r10 = r5.resourceId
            r0 = 2131100167(0x7f060207, float:1.7812708E38)
            if (r10 != r0) goto L4e
            ff2 r10 = defpackage.ff2.e
            return r10
        L4e:
            ff2 r10 = new ff2
            r10.<init>(r11, r5)
            return r10
        L54:
            r7 = r1
        L55:
            int r8 = r0.getAttributeCount()
            if (r7 >= r8) goto L66
            int r8 = r0.getAttributeNameResource(r7)
            r9 = r11[r1]
            if (r8 == r9) goto L9e
            int r7 = r7 + 1
            goto L55
        L66:
            int r7 = r0.getStyleAttribute()
            if (r7 == 0) goto L83
            android.content.res.Resources r8 = r4.getResources()
            java.lang.String r8 = r8.getResourceTypeName(r7)
            java.lang.String r9 = "attr"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L81
            int r8 = e(r10, r7, r11)
            goto L84
        L81:
            r8 = 3
            goto L84
        L83:
            r8 = r6
        L84:
            if (r2 == 0) goto L8b
            int r10 = e(r10, r2, r11)
            goto L8c
        L8b:
            r10 = r6
        L8c:
            if (r10 != r6) goto L9f
            r10 = 1
            if (r8 == r10) goto L9f
            android.content.res.TypedArray r10 = r4.obtainStyledAttributes(r0, r11, r2, r1)
            boolean r4 = r10.getValue(r1, r5)
            r10.recycle()
            if (r4 != 0) goto L9f
        L9e:
            return r3
        L9f:
            if (r7 != 0) goto Lad
            ff2 r10 = new ff2
            java.lang.String r0 = "?"
            java.lang.String r0 = defpackage.sko.i(r2, r0)
            r10.<init>(r1, r0, r11)
            return r10
        Lad:
            java.lang.String r10 = "style"
            java.lang.String r10 = r0.getAttributeValue(r3, r10)
            ff2 r0 = new ff2
            r0.<init>(r2, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff2.a(zg, int[]):ff2");
    }

    public static boolean b(ff2 ff2Var) {
        return ff2Var == null || ff2Var == e;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.TypedValue d(android.content.Context r4, android.util.TypedValue r5) {
        /*
            int r0 = r5.resourceId
            r1 = 2131100167(0x7f060207, float:1.7812708E38)
            r2 = 0
            if (r0 != r1) goto L9
            return r2
        L9:
            int r1 = r5.type
            if (r1 == 0) goto L3c
            r3 = 1
            if (r1 == r3) goto L39
            r0 = 2
            if (r1 == r0) goto L26
            r4 = 3
            if (r1 == r4) goto L3b
            r4 = 5
            if (r1 == r4) goto L3b
            r4 = 16
            if (r1 == r4) goto L3b
            r4 = 28
            if (r1 < r4) goto L3c
            r4 = 31
            if (r1 > r4) goto L3c
            goto L3b
        L26:
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r5 = r5.data
            r1.resolveAttribute(r5, r0, r3)
            android.util.TypedValue r4 = d(r4, r0)
            return r4
        L39:
            if (r0 == 0) goto L3c
        L3b:
            return r5
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff2.d(android.content.Context, android.util.TypedValue):android.util.TypedValue");
    }

    public static int e(zg zgVar, int i, int[] iArr) {
        Context context = ((View) zgVar.b).getContext();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            hai.d();
            return 0;
        }
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            hai.d();
            return 0;
        }
        Resources.Theme themeNewTheme = (Resources.Theme) zgVar.d;
        if (themeNewTheme == null) {
            themeNewTheme = ((View) zgVar.b).getContext().getResources().newTheme();
            zgVar.d = themeNewTheme;
        }
        TypedArray typedArrayObtainStyledAttributes = themeNewTheme.obtainStyledAttributes(null, iArr, 0, i2);
        boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
        typedArrayObtainStyledAttributes.recycle();
        return value ? 1 : 2;
    }

    public static ColorStateList f(Context context, TypedValue typedValue) {
        int i = typedValue.type;
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        if (i == 1 || i == 3) {
            return nb6.v(typedValue.resourceId, context);
        }
        return null;
    }

    public static int g(Context context, TypedValue typedValue) {
        if (typedValue.type != 5) {
            return 0;
        }
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static Drawable h(Context context, TypedValue typedValue) {
        int i = typedValue.type;
        if (i >= 28 && i <= 31) {
            return new ColorDrawable(typedValue.data);
        }
        if (i == 1 || i == 3) {
            return sgb.F(typedValue.resourceId, context);
        }
        return null;
    }

    public final TypedValue c(Context context) throws NumberFormatException {
        int identifier;
        Resources.Theme theme;
        int identifier2;
        TypedValue typedValue = this.b;
        if (typedValue != null) {
            return d(context, typedValue);
        }
        String str = this.c;
        if (str.startsWith("?")) {
            TypedValue typedValue2 = new TypedValue();
            try {
                identifier2 = Integer.parseInt(str.substring(1));
            } catch (NumberFormatException unused) {
                identifier2 = context.getResources().getIdentifier(str.substring(1), "attr", context.getPackageName());
            }
            identifier = (identifier2 == 0 || !context.getTheme().resolveAttribute(identifier2, typedValue2, true)) ? 0 : typedValue2.resourceId;
        } else {
            if (!str.startsWith("@")) {
                return null;
            }
            int iIndexOf = str.indexOf(47);
            identifier = iIndexOf == -1 ? context.getResources().getIdentifier(str.substring(1), "style", context.getPackageName()) : context.getResources().getIdentifier(str.substring(iIndexOf), "style", context.getPackageName());
        }
        int i = this.d;
        if (i != 0) {
            TypedValue typedValue3 = new TypedValue();
            if (context.getTheme().resolveAttribute(i, typedValue3, true)) {
                theme = context.getResources().newTheme();
                theme.setTo(context.getTheme());
                theme.applyStyle(typedValue3.resourceId, true);
            } else {
                theme = context.getTheme();
            }
        } else {
            theme = context.getTheme();
        }
        TypedValue typedValue4 = new TypedValue();
        int[] iArr = this.a;
        TypedArray typedArrayObtainStyledAttributes = identifier != 0 ? theme.obtainStyledAttributes(identifier, iArr) : theme.obtainStyledAttributes(iArr);
        boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue4);
        typedArrayObtainStyledAttributes.recycle();
        if (value) {
            return d(context, typedValue4);
        }
        return null;
    }
}
