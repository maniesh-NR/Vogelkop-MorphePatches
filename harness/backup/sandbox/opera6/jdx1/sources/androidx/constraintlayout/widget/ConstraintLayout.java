package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.ft5;
import defpackage.ho5;
import defpackage.io5;
import defpackage.jfc;
import defpackage.jo5;
import defpackage.ko5;
import defpackage.m9f;
import defpackage.n5h;
import defpackage.pad;
import defpackage.r5a;
import defpackage.shh;
import defpackage.so5;
import defpackage.uo5;
import defpackage.vo5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static final /* synthetic */ int o = 0;
    public final SparseArray a;
    public final ArrayList b;
    public final vo5 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public so5 j;
    public int k;
    public HashMap l;
    public final SparseArray m;
    public final n5h n;

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new vo5();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = -1;
        this.l = new HashMap();
        this.m = new SparseArray();
        this.n = new n5h(this, this);
        n(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new vo5();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = -1;
        this.l = new HashMap();
        this.m = new SparseArray();
        this.n = new n5h(this, this);
        n(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException {
        super(context, attributeSet, 0, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new vo5();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = -1;
        this.l = new HashMap();
        this.m = new SparseArray();
        this.n = new n5h(this, this);
        n(attributeSet, 0, i);
    }

    public ConstraintLayout(ft5 ft5Var) throws XmlPullParserException, IOException {
        super(ft5Var);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new vo5();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = -1;
        this.l = new HashMap();
        this.m = new SparseArray();
        this.n = new n5h(this, this);
        n(null, 0, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jo5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((ho5) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public final void f() {
        performClick();
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new jo5(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) throws NumberFormatException {
        Context context = getContext();
        jo5 jo5Var = new jo5(context, attributeSet);
        jo5Var.a = -1;
        jo5Var.b = -1;
        jo5Var.c = -1.0f;
        jo5Var.d = true;
        jo5Var.e = -1;
        jo5Var.f = -1;
        jo5Var.g = -1;
        jo5Var.h = -1;
        jo5Var.i = -1;
        jo5Var.j = -1;
        jo5Var.k = -1;
        jo5Var.l = -1;
        jo5Var.m = -1;
        jo5Var.n = -1;
        jo5Var.o = -1;
        jo5Var.p = -1;
        jo5Var.q = 0;
        jo5Var.r = 0.0f;
        jo5Var.s = -1;
        jo5Var.t = -1;
        jo5Var.u = -1;
        jo5Var.v = -1;
        jo5Var.w = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.x = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.y = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.z = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.A = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.B = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.C = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.D = 0;
        jo5Var.E = 0.5f;
        jo5Var.F = 0.5f;
        jo5Var.G = null;
        jo5Var.H = -1.0f;
        jo5Var.I = -1.0f;
        jo5Var.J = 0;
        jo5Var.K = 0;
        jo5Var.L = 0;
        jo5Var.M = 0;
        jo5Var.N = 0;
        jo5Var.O = 0;
        jo5Var.P = 0;
        jo5Var.Q = 0;
        jo5Var.R = 1.0f;
        jo5Var.S = 1.0f;
        jo5Var.T = -1;
        jo5Var.U = -1;
        jo5Var.V = -1;
        jo5Var.W = false;
        jo5Var.X = false;
        jo5Var.Y = null;
        jo5Var.Z = 0;
        jo5Var.a0 = true;
        jo5Var.b0 = true;
        jo5Var.c0 = false;
        jo5Var.d0 = false;
        jo5Var.e0 = false;
        jo5Var.f0 = -1;
        jo5Var.g0 = -1;
        jo5Var.h0 = -1;
        jo5Var.i0 = -1;
        jo5Var.j0 = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.k0 = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.l0 = 0.5f;
        jo5Var.p0 = new uo5();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shh.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = io5.a.get(index);
            switch (i2) {
                case 1:
                    jo5Var.V = typedArrayObtainStyledAttributes.getInt(index, jo5Var.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.p);
                    jo5Var.p = resourceId;
                    if (resourceId == -1) {
                        jo5Var.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    jo5Var.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, jo5Var.r) % 360.0f;
                    jo5Var.r = f;
                    if (f < 0.0f) {
                        jo5Var.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    jo5Var.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jo5Var.a);
                    break;
                case 6:
                    jo5Var.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jo5Var.b);
                    break;
                case 7:
                    jo5Var.c = typedArrayObtainStyledAttributes.getFloat(index, jo5Var.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.e);
                    jo5Var.e = resourceId2;
                    if (resourceId2 == -1) {
                        jo5Var.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.f);
                    jo5Var.f = resourceId3;
                    if (resourceId3 == -1) {
                        jo5Var.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.g);
                    jo5Var.g = resourceId4;
                    if (resourceId4 == -1) {
                        jo5Var.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.h);
                    jo5Var.h = resourceId5;
                    if (resourceId5 == -1) {
                        jo5Var.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.i);
                    jo5Var.i = resourceId6;
                    if (resourceId6 == -1) {
                        jo5Var.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.j);
                    jo5Var.j = resourceId7;
                    if (resourceId7 == -1) {
                        jo5Var.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.k);
                    jo5Var.k = resourceId8;
                    if (resourceId8 == -1) {
                        jo5Var.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.l);
                    jo5Var.l = resourceId9;
                    if (resourceId9 == -1) {
                        jo5Var.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.m);
                    jo5Var.m = resourceId10;
                    if (resourceId10 == -1) {
                        jo5Var.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.s);
                    jo5Var.s = resourceId11;
                    if (resourceId11 == -1) {
                        jo5Var.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.t);
                    jo5Var.t = resourceId12;
                    if (resourceId12 == -1) {
                        jo5Var.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.u);
                    jo5Var.u = resourceId13;
                    if (resourceId13 == -1) {
                        jo5Var.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.v);
                    jo5Var.v = resourceId14;
                    if (resourceId14 == -1) {
                        jo5Var.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    jo5Var.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.w);
                    break;
                case 22:
                    jo5Var.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.x);
                    break;
                case 23:
                    jo5Var.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.y);
                    break;
                case 24:
                    jo5Var.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.z);
                    break;
                case 25:
                    jo5Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.A);
                    break;
                case 26:
                    jo5Var.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.B);
                    break;
                case 27:
                    jo5Var.W = typedArrayObtainStyledAttributes.getBoolean(index, jo5Var.W);
                    break;
                case 28:
                    jo5Var.X = typedArrayObtainStyledAttributes.getBoolean(index, jo5Var.X);
                    break;
                case 29:
                    jo5Var.E = typedArrayObtainStyledAttributes.getFloat(index, jo5Var.E);
                    break;
                case 30:
                    jo5Var.F = typedArrayObtainStyledAttributes.getFloat(index, jo5Var.F);
                    break;
                case 31:
                    jo5Var.L = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    jo5Var.M = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        jo5Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.N);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, jo5Var.N) == -2) {
                            jo5Var.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        jo5Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.P);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, jo5Var.P) == -2) {
                            jo5Var.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    jo5Var.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, jo5Var.R));
                    jo5Var.L = 2;
                    break;
                case 36:
                    try {
                        jo5Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.O);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, jo5Var.O) == -2) {
                            jo5Var.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        jo5Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.Q);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, jo5Var.Q) == -2) {
                            jo5Var.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    jo5Var.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, jo5Var.S));
                    jo5Var.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            so5.m(jo5Var, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            jo5Var.H = typedArrayObtainStyledAttributes.getFloat(index, jo5Var.H);
                            break;
                        case 46:
                            jo5Var.I = typedArrayObtainStyledAttributes.getFloat(index, jo5Var.I);
                            break;
                        case 47:
                            jo5Var.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            jo5Var.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            jo5Var.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jo5Var.T);
                            break;
                        case 50:
                            jo5Var.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jo5Var.U);
                            break;
                        case 51:
                            jo5Var.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.n);
                            jo5Var.n = resourceId15;
                            if (resourceId15 == -1) {
                                jo5Var.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, jo5Var.o);
                            jo5Var.o = resourceId16;
                            if (resourceId16 == -1) {
                                jo5Var.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            jo5Var.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.D);
                            break;
                        case 55:
                            jo5Var.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jo5Var.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    so5.l(jo5Var, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    so5.l(jo5Var, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    jo5Var.Z = typedArrayObtainStyledAttributes.getInt(index, jo5Var.Z);
                                    break;
                                case 67:
                                    jo5Var.d = typedArrayObtainStyledAttributes.getBoolean(index, jo5Var.d);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        jo5Var.a();
        return jo5Var;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        jo5 jo5Var = new jo5(layoutParams);
        jo5Var.a = -1;
        jo5Var.b = -1;
        jo5Var.c = -1.0f;
        jo5Var.d = true;
        jo5Var.e = -1;
        jo5Var.f = -1;
        jo5Var.g = -1;
        jo5Var.h = -1;
        jo5Var.i = -1;
        jo5Var.j = -1;
        jo5Var.k = -1;
        jo5Var.l = -1;
        jo5Var.m = -1;
        jo5Var.n = -1;
        jo5Var.o = -1;
        jo5Var.p = -1;
        jo5Var.q = 0;
        jo5Var.r = 0.0f;
        jo5Var.s = -1;
        jo5Var.t = -1;
        jo5Var.u = -1;
        jo5Var.v = -1;
        jo5Var.w = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.x = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.y = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.z = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.A = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.B = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.C = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.D = 0;
        jo5Var.E = 0.5f;
        jo5Var.F = 0.5f;
        jo5Var.G = null;
        jo5Var.H = -1.0f;
        jo5Var.I = -1.0f;
        jo5Var.J = 0;
        jo5Var.K = 0;
        jo5Var.L = 0;
        jo5Var.M = 0;
        jo5Var.N = 0;
        jo5Var.O = 0;
        jo5Var.P = 0;
        jo5Var.Q = 0;
        jo5Var.R = 1.0f;
        jo5Var.S = 1.0f;
        jo5Var.T = -1;
        jo5Var.U = -1;
        jo5Var.V = -1;
        jo5Var.W = false;
        jo5Var.X = false;
        jo5Var.Y = null;
        jo5Var.Z = 0;
        jo5Var.a0 = true;
        jo5Var.b0 = true;
        jo5Var.c0 = false;
        jo5Var.d0 = false;
        jo5Var.e0 = false;
        jo5Var.f0 = -1;
        jo5Var.g0 = -1;
        jo5Var.h0 = -1;
        jo5Var.i0 = -1;
        jo5Var.j0 = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.k0 = LinearLayoutManager.INVALID_OFFSET;
        jo5Var.l0 = 0.5f;
        jo5Var.p0 = new uo5();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) jo5Var).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) jo5Var).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) jo5Var).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) jo5Var).bottomMargin = marginLayoutParams.bottomMargin;
            jo5Var.setMarginStart(marginLayoutParams.getMarginStart());
            jo5Var.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof jo5)) {
            return jo5Var;
        }
        jo5 jo5Var2 = (jo5) layoutParams;
        jo5Var.a = jo5Var2.a;
        jo5Var.b = jo5Var2.b;
        jo5Var.c = jo5Var2.c;
        jo5Var.d = jo5Var2.d;
        jo5Var.e = jo5Var2.e;
        jo5Var.f = jo5Var2.f;
        jo5Var.g = jo5Var2.g;
        jo5Var.h = jo5Var2.h;
        jo5Var.i = jo5Var2.i;
        jo5Var.j = jo5Var2.j;
        jo5Var.k = jo5Var2.k;
        jo5Var.l = jo5Var2.l;
        jo5Var.m = jo5Var2.m;
        jo5Var.n = jo5Var2.n;
        jo5Var.o = jo5Var2.o;
        jo5Var.p = jo5Var2.p;
        jo5Var.q = jo5Var2.q;
        jo5Var.r = jo5Var2.r;
        jo5Var.s = jo5Var2.s;
        jo5Var.t = jo5Var2.t;
        jo5Var.u = jo5Var2.u;
        jo5Var.v = jo5Var2.v;
        jo5Var.w = jo5Var2.w;
        jo5Var.x = jo5Var2.x;
        jo5Var.y = jo5Var2.y;
        jo5Var.z = jo5Var2.z;
        jo5Var.A = jo5Var2.A;
        jo5Var.B = jo5Var2.B;
        jo5Var.C = jo5Var2.C;
        jo5Var.D = jo5Var2.D;
        jo5Var.E = jo5Var2.E;
        jo5Var.F = jo5Var2.F;
        jo5Var.G = jo5Var2.G;
        jo5Var.H = jo5Var2.H;
        jo5Var.I = jo5Var2.I;
        jo5Var.J = jo5Var2.J;
        jo5Var.K = jo5Var2.K;
        jo5Var.W = jo5Var2.W;
        jo5Var.X = jo5Var2.X;
        jo5Var.L = jo5Var2.L;
        jo5Var.M = jo5Var2.M;
        jo5Var.N = jo5Var2.N;
        jo5Var.P = jo5Var2.P;
        jo5Var.O = jo5Var2.O;
        jo5Var.Q = jo5Var2.Q;
        jo5Var.R = jo5Var2.R;
        jo5Var.S = jo5Var2.S;
        jo5Var.T = jo5Var2.T;
        jo5Var.U = jo5Var2.U;
        jo5Var.V = jo5Var2.V;
        jo5Var.a0 = jo5Var2.a0;
        jo5Var.b0 = jo5Var2.b0;
        jo5Var.c0 = jo5Var2.c0;
        jo5Var.d0 = jo5Var2.d0;
        jo5Var.f0 = jo5Var2.f0;
        jo5Var.g0 = jo5Var2.g0;
        jo5Var.h0 = jo5Var2.h0;
        jo5Var.i0 = jo5Var2.i0;
        jo5Var.j0 = jo5Var2.j0;
        jo5Var.k0 = jo5Var2.k0;
        jo5Var.l0 = jo5Var2.l0;
        jo5Var.Y = jo5Var2.Y;
        jo5Var.Z = jo5Var2.Z;
        jo5Var.p0 = jo5Var2.p0;
        return jo5Var;
    }

    public final void h(boolean z) {
        setSelected(z);
    }

    public final uo5 l(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof jo5) {
            return ((jo5) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof jo5) {
            return ((jo5) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void n(AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException {
        vo5 vo5Var = this.c;
        vo5Var.e0 = this;
        n5h n5hVar = this.n;
        vo5Var.t0 = n5hVar;
        vo5Var.r0.g = n5hVar;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, shh.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 15) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 113) {
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            o(resourceId);
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        so5 so5Var = new so5();
                        this.j = so5Var;
                        so5Var.j(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.k = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        vo5Var.C0 = this.i;
        jfc.q = vo5Var.R(NotificationCompat.FLAG_GROUP_SUMMARY);
    }

    public final void o(int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        String str;
        Context context = getContext();
        pad padVar = new pad((byte) 10, false);
        padVar.b = new SparseArray();
        padVar.c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            m9f m9fVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                break;
                            } else {
                                padVar.s(context, xml);
                                continue;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                m9f m9fVar2 = new m9f(context, xml);
                                ((SparseArray) padVar.b).put(m9fVar2.a, m9fVar2);
                                m9fVar = m9fVar2;
                                break;
                            } else {
                                continue;
                            }
                        case 1382829617:
                            str = "StateSet";
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                ko5 ko5Var = new ko5(context, xml);
                                if (m9fVar != null) {
                                    ((ArrayList) m9fVar.c).add(ko5Var);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        default:
                            continue;
                    }
                    name.equals(str);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            jo5 jo5Var = (jo5) childAt.getLayoutParams();
            uo5 uo5Var = jo5Var.p0;
            if (childAt.getVisibility() != 8 || jo5Var.d0 || jo5Var.e0 || zIsInEditMode) {
                int iO = uo5Var.o();
                int iP = uo5Var.p();
                childAt.layout(iO, iP, uo5Var.n() + iO, uo5Var.k() + iP);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ho5) arrayList.get(i6)).n();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r34, int r35) throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        uo5 uo5VarL = l(view);
        if ((view instanceof Guideline) && !(uo5VarL instanceof r5a)) {
            jo5 jo5Var = (jo5) view.getLayoutParams();
            r5a r5aVar = new r5a();
            jo5Var.p0 = r5aVar;
            jo5Var.d0 = true;
            r5aVar.N(jo5Var.V);
        }
        if (view instanceof ho5) {
            ho5 ho5Var = (ho5) view;
            ho5Var.o();
            ((jo5) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(ho5Var)) {
                arrayList.add(ho5Var);
            }
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        uo5 uo5VarL = l(view);
        this.c.p0.remove(uo5VarL);
        uo5VarL.z();
        this.b.remove(view);
        this.h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.vo5 r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.p(vo5, int, int, int):void");
    }

    public final void q(uo5 uo5Var, jo5 jo5Var, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        uo5 uo5Var2 = (uo5) sparseArray.get(i);
        if (uo5Var2 == null || view == null || !(view.getLayoutParams() instanceof jo5)) {
            return;
        }
        jo5Var.c0 = true;
        if (i2 == 6) {
            jo5 jo5Var2 = (jo5) view.getLayoutParams();
            jo5Var2.c0 = true;
            jo5Var2.p0.D = true;
        }
        uo5Var.i(6).b(uo5Var2.i(i2), jo5Var.D, jo5Var.C, true);
        uo5Var.D = true;
        uo5Var.i(3).j();
        uo5Var.i(5).j();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
