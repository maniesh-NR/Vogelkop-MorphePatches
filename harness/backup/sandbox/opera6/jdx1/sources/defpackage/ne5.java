package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.icu.text.RuleBasedCollator;
import android.icu.text.StringSearch;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.google.firebase.components.ComponentRegistrar;
import com.leanplum.messagetemplates.OperaWallpaperSheet;
import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.text.StringCharacterIterator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ne5 implements zd5, vnk, k7j, n5o, hh4, o7h, gln {
    public static final le5 h = new le5((byte) 0);
    public static final byte[] i = {0, 7, 8, 15};
    public static final byte[] j = {0, 119, -120, -1};
    public static final byte[] k = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public ne5(Context context) {
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        WeakHashMap weakHashMap3 = new WeakHashMap();
        uto utoVar = new uto();
        tuj tujVar = new tuj(context, (byte) 2);
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = weakHashMap;
        this.c = weakHashMap2;
        this.d = weakHashMap3;
        this.g = utoVar;
        this.a = tujVar;
        tujVar.i = new dgo(this, (byte) 3);
        this.e = handler;
        this.f = new vr9(this);
    }

    public ne5(gd7 gd7Var, WebView webView, String str, List list, String str2, vp vpVar) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = new HashMap();
        this.b = gd7Var;
        this.c = webView;
        this.e = str;
        this.g = vpVar;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                t1n t1nVar = (t1n) it.next();
                ((HashMap) this.a).put(UUID.randomUUID().toString(), t1nVar);
            }
        }
        this.f = str2;
    }

    public /* synthetic */ ne5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
    }

    public ne5(Executor executor, ArrayList arrayList, ArrayList arrayList2, he5 he5Var) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        kb8 kb8Var = new kb8(executor);
        this.e = kb8Var;
        this.g = he5Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(kd5.c(kb8Var, kb8.class, new Class[]{wkk.class, v9h.class}));
        int i2 = 0;
        arrayList3.add(kd5.c(this, ne5.class, new Class[0]));
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            kd5 kd5Var = (kd5) obj;
            if (kd5Var != null) {
                arrayList3.add(kd5Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((l7h) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((he5) this.g).c(componentRegistrar));
                        it.remove();
                    }
                } catch (gjb unused) {
                    it.remove();
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((kd5) it2.next()).b.toArray();
                int length = array.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        Object obj3 = array[i5];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.d).contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            ((HashSet) this.d).add(obj3.toString());
                        }
                        i5++;
                    }
                }
            }
            if (((HashMap) this.a).isEmpty()) {
                qyn.x(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                qyn.x(arrayList6);
            }
            int size3 = arrayList3.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj4 = arrayList3.get(i6);
                i6++;
                kd5 kd5Var2 = (kd5) obj4;
                ((HashMap) this.a).put(kd5Var2, new m4c(new me5(this, kd5Var2, (byte) 0)));
            }
            arrayList5.addAll(N(arrayList3));
            arrayList5.addAll(O());
            M();
        }
        int size4 = arrayList5.size();
        while (i2 < size4) {
            Object obj5 = arrayList5.get(i2);
            i2++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f).get();
        if (bool != null) {
            x((HashMap) this.a, bool.booleanValue());
        }
    }

    public ne5(zd4 zd4Var, HashSet hashSet) {
        Size sizeF = d2m.f(zd4Var.g().g());
        xd4 xd4VarG = zd4Var.g();
        shf shfVar = new shf(xd4VarG, sizeF);
        this.a = new HashMap();
        this.b = sizeF;
        Rational rational = ((double) sizeF.getWidth()) / ((double) sizeF.getHeight()) > 1.539600717839002d ? ua2.c : ua2.a;
        sizeF.toString();
        Objects.toString(rational);
        this.c = rational;
        Rational rational2 = ua2.a;
        if (rational.equals(rational2)) {
            rational2 = ua2.c;
        } else if (!rational.equals(ua2.c)) {
            s49.l(rational, "Invalid sensor aspect-ratio: ");
            throw null;
        }
        this.e = rational2;
        this.g = xd4VarG;
        this.d = hashSet;
        this.f = shfVar;
    }

    public static int[] A() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = B(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = B(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = B(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = B(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = B(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int B(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public static Rect C(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalT = T(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalT2 = T(size);
        if (rationalT.floatValue() == rationalT2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalT.floatValue() > rationalT2.floatValue()) {
                float f = width;
                float fFloatValue = f / rationalT.floatValue();
                float f2 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
            } else {
                float f3 = height;
                float fFloatValue2 = rationalT.floatValue() * f3;
                float f4 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean F(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static void J(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        byte[] bArr2;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        boolean z4;
        int i15;
        int i16;
        Paint paint2 = paint;
        bq4 bq4Var = new bq4(bArr, bArr.length);
        int i17 = i3;
        int i18 = i4;
        byte[] bArrR = null;
        byte[] bArrR2 = null;
        byte[] bArrR3 = null;
        while (bq4Var.b() != 0) {
            int i19 = 8;
            int i20 = bq4Var.i(8);
            if (i20 != 240) {
                int i21 = 3;
                int i22 = 2;
                int i23 = 4;
                switch (i20) {
                    case 16:
                        byte[] bArr3 = i2 == 3 ? bArrR == null ? j : bArrR : i2 == 2 ? bArrR3 == null ? i : bArrR3 : null;
                        boolean z5 = false;
                        while (true) {
                            int i24 = bq4Var.i(2);
                            if (i24 != 0) {
                                z = z5;
                                i5 = i24;
                                i6 = 1;
                            } else {
                                if (bq4Var.h()) {
                                    i7 = bq4Var.i(3) + 3;
                                    z = z5;
                                    i5 = bq4Var.i(2);
                                } else {
                                    if (bq4Var.h()) {
                                        z = z5;
                                        i6 = 1;
                                    } else {
                                        int i25 = bq4Var.i(2);
                                        if (i25 == 0) {
                                            z = true;
                                        } else if (i25 == 1) {
                                            z = z5;
                                            i6 = 2;
                                        } else if (i25 == 2) {
                                            i6 = bq4Var.i(4) + 12;
                                            i5 = bq4Var.i(2);
                                            z = z5;
                                        } else if (i25 != 3) {
                                            z = z5;
                                        } else {
                                            i7 = bq4Var.i(8) + 29;
                                            i5 = bq4Var.i(2);
                                            z = z5;
                                        }
                                        i5 = 0;
                                        i6 = 0;
                                    }
                                    i5 = 0;
                                }
                                i6 = i7;
                            }
                            if (i6 == 0 || paint2 == null) {
                                i8 = i17;
                            } else {
                                if (bArr3 != 0) {
                                    i5 = bArr3[i5];
                                }
                                paint2.setColor(iArr[i5]);
                                i8 = i17;
                                canvas.drawRect(i17, i18, i17 + i6, i18 + 1, paint2);
                            }
                            i17 = i8 + i6;
                            if (z) {
                                bq4Var.c();
                                break;
                            } else {
                                paint2 = paint;
                                z5 = z;
                            }
                        }
                    case 17:
                        if (i2 == 3) {
                            bArr2 = bArrR2 == null ? k : bArrR2;
                        } else {
                            bArr2 = null;
                        }
                        boolean z6 = false;
                        while (true) {
                            int i26 = bq4Var.i(i23);
                            if (i26 != 0) {
                                z2 = z6;
                                i11 = i26;
                                i9 = 1;
                            } else if (bq4Var.h()) {
                                if (bq4Var.h()) {
                                    int i27 = bq4Var.i(i22);
                                    if (i27 == 0) {
                                        z2 = z6;
                                        i9 = 1;
                                    } else if (i27 != 1) {
                                        if (i27 == i22) {
                                            i9 = bq4Var.i(i23) + 9;
                                            i10 = bq4Var.i(i23);
                                        } else if (i27 != i21) {
                                            z2 = z6;
                                            i9 = 0;
                                        } else {
                                            i9 = bq4Var.i(i19) + 25;
                                            i10 = bq4Var.i(i23);
                                        }
                                        i11 = i10;
                                    } else {
                                        z2 = z6;
                                        i9 = i22;
                                    }
                                    i11 = 0;
                                } else {
                                    i9 = bq4Var.i(i22) + 4;
                                    i11 = bq4Var.i(i23);
                                }
                                z2 = z6;
                            } else {
                                int i28 = bq4Var.i(i21);
                                if (i28 != 0) {
                                    i9 = i28 + 2;
                                    z2 = z6;
                                    i11 = 0;
                                } else {
                                    z2 = true;
                                    i9 = 0;
                                    i11 = 0;
                                }
                            }
                            if (i9 == 0 || paint2 == null) {
                                i12 = i17;
                                i13 = i21;
                                i14 = i22;
                            } else {
                                if (bArr2 != 0) {
                                    i11 = bArr2[i11];
                                }
                                paint2.setColor(iArr[i11]);
                                i13 = i21;
                                i14 = 2;
                                i12 = i17;
                                canvas.drawRect(i17, i18, i17 + i9, i18 + 1, paint2);
                            }
                            i17 = i12 + i9;
                            if (z2) {
                                bq4Var.c();
                                break;
                            } else {
                                z6 = z2;
                                i21 = i13;
                                i22 = i14;
                                i23 = 4;
                                i19 = 8;
                            }
                        }
                    case 18:
                        while (true) {
                            int i29 = bq4Var.i(8);
                            if (i29 != 0) {
                                z4 = z3;
                                i15 = 1;
                            } else if (bq4Var.h()) {
                                z4 = z3;
                                i15 = bq4Var.i(7);
                                i29 = bq4Var.i(8);
                            } else {
                                int i30 = bq4Var.i(7);
                                if (i30 != 0) {
                                    z4 = z3;
                                    i15 = i30;
                                    i29 = 0;
                                } else {
                                    z4 = true;
                                    i29 = 0;
                                    i15 = 0;
                                }
                            }
                            if (i15 == 0 || paint2 == null) {
                                i16 = i17;
                            } else {
                                paint2.setColor(iArr[i29]);
                                i16 = i17;
                                canvas.drawRect(i17, i18, i17 + i15, i18 + 1, paint2);
                            }
                            i17 = i16 + i15;
                            z3 = z4 ? false : z4;
                        }
                        break;
                    default:
                        switch (i20) {
                            case 32:
                                bArrR3 = r(4, 4, bq4Var);
                                break;
                            case 33:
                                bArrR = r(4, 8, bq4Var);
                                break;
                            case 34:
                                bArrR2 = r(16, 8, bq4Var);
                                break;
                        }
                }
            } else {
                i18 += 2;
                i17 = i3;
            }
            paint2 = paint;
        }
    }

    public static yn7 K(bq4 bq4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 8;
        int i9 = bq4Var.i(8);
        bq4Var.t(8);
        int i10 = 2;
        int i11 = i2 - 2;
        int i12 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrY = y();
        int[] iArrA = A();
        while (i11 > 0) {
            int i13 = bq4Var.i(i8);
            int i14 = bq4Var.i(i8);
            int[] iArr2 = (i14 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? iArr : (i14 & 64) != 0 ? iArrY : iArrA;
            if ((i14 & 1) != 0) {
                i6 = bq4Var.i(i8);
                i7 = bq4Var.i(i8);
                i3 = bq4Var.i(i8);
                i5 = bq4Var.i(i8);
                i4 = i11 - 6;
            } else {
                int i15 = bq4Var.i(6) << i10;
                int i16 = bq4Var.i(4) << 4;
                i3 = bq4Var.i(4) << 4;
                i4 = i11 - 4;
                i5 = bq4Var.i(i10) << 6;
                i6 = i15;
                i7 = i16;
            }
            if (i6 == 0) {
                i7 = i12;
                i3 = i7;
                i5 = 255;
            }
            double d = i6;
            double d2 = i7 - 128;
            double d3 = i3 - 128;
            iArr2[i13] = B((byte) (255 - (i5 & 255)), tym.i((int) ((1.402d * d2) + d), 0, 255), tym.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), tym.i((int) ((d3 * 1.772d) + d), 0, 255));
            i11 = i4;
            i12 = 0;
            i9 = i9;
            iArrA = iArrA;
            i8 = 8;
            i10 = 2;
        }
        return new yn7(i9, iArr, iArrY, iArrA);
    }

    public static zn7 L(bq4 bq4Var) {
        byte[] bArr;
        int i2 = bq4Var.i(16);
        bq4Var.t(4);
        int i3 = bq4Var.i(2);
        boolean zH = bq4Var.h();
        bq4Var.t(1);
        byte[] bArr2 = tym.b;
        if (i3 != 1) {
            if (i3 == 0) {
                int i4 = bq4Var.i(16);
                int i5 = bq4Var.i(16);
                if (i4 > 0) {
                    bArr2 = new byte[i4];
                    bq4Var.l(i4, bArr2);
                }
                if (i5 > 0) {
                    bArr = new byte[i5];
                    bq4Var.l(i5, bArr);
                }
            }
            return new zn7(i2, zH, bArr2, bArr);
        }
        bq4Var.t(bq4Var.i(8) << 4);
        bArr = bArr2;
        return new zn7(i2, zH, bArr2, bArr);
    }

    public static Rational T(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static byte[] r(int i2, int i3, bq4 bq4Var) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) bq4Var.i(i3);
        }
        return bArr;
    }

    public static ne5 v(gd7 gd7Var, WebView webView, String str) {
        zch.d(webView, "WebView is null");
        return new ne5(gd7Var, webView, null, null, str, vp.HTML);
    }

    public static ne5 w(gd7 gd7Var, String str, List list, String str2) {
        zch.d(str, "OM SDK JS script content is null");
        zch.d(list, "VerificationScriptResources is null");
        return new ne5(gd7Var, null, str, list, str2, vp.NATIVE);
    }

    public static int[] y() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = B(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = B(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public final ssg D(qsm qsmVar, Rect rect, int i2, boolean z) {
        boolean z2;
        Size size;
        Size size2;
        Pair pairCreate;
        if (d2m.c(i2)) {
            z2 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z2 = false;
        }
        if (z) {
            Size sizeF = d2m.f(rect);
            Iterator it = E(qsmVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(sizeF, sizeF);
                    break;
                }
                Size size3 = (Size) it.next();
                Size sizeF2 = d2m.f(C(size3, sizeF));
                if (!F(sizeF2, sizeF)) {
                    pairCreate = Pair.create(size3, sizeF2);
                    break;
                }
            }
            size = (Size) pairCreate.first;
            size2 = (Size) pairCreate.second;
        } else {
            Size sizeF3 = d2m.f(rect);
            List listE = E(qsmVar);
            Iterator it2 = listE.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listE.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = sizeF3;
                            break;
                        }
                        size = (Size) it3.next();
                        if (!F(size, sizeF3)) {
                            break;
                        }
                    }
                } else {
                    Size size4 = (Size) it2.next();
                    Rational rationalT = ua2.a;
                    Size size5 = qpj.c;
                    if (!ua2.a(sizeF3, rationalT, size5)) {
                        rationalT = ua2.c;
                        if (!ua2.a(sizeF3, rationalT, size5)) {
                            rationalT = T(sizeF3);
                        }
                    }
                    if (!I(rationalT, size4) && !F(size4, sizeF3)) {
                        size = size4;
                        break;
                    }
                }
            }
            rect = C(sizeF3, size);
            size2 = size;
        }
        return z2 ? new ssg(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size2.getHeight(), size2.getWidth()), size) : new ssg(rect, size2, size);
    }

    public final List E(qsm qsmVar) {
        Rational rationalT;
        HashMap map = (HashMap) this.a;
        if (!((HashSet) this.d).contains(qsmVar)) {
            s49.l(qsmVar, "Invalid child config: ");
            return null;
        }
        if (map.containsKey(qsmVar)) {
            List list = (List) map.get(qsmVar);
            Objects.requireNonNull(list);
            return list;
        }
        ArrayList arrayListY = ((shf) this.f).y(qsmVar);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int size = arrayListY.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListY.get(i2);
            i2++;
            Size size2 = (Size) obj;
            Iterator it = map2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rationalT = null;
                    break;
                }
                rationalT = (Rational) it.next();
                Rational rational = ua2.a;
                if (ua2.a(size2, rationalT, qpj.c)) {
                    break;
                }
            }
            if (rationalT != null) {
                Size size3 = (Size) map2.get(rationalT);
                Objects.requireNonNull(size3);
                if (size2.getHeight() > size3.getHeight() || size2.getWidth() > size3.getWidth() || (size2.getWidth() == size3.getWidth() && size2.getHeight() == size3.getHeight())) {
                }
            } else {
                rationalT = T(size2);
            }
            arrayList.add(size2);
            map2.put(rationalT, size2);
        }
        map.put(qsmVar, arrayList);
        return arrayList;
    }

    public final void G(boolean z) {
        HashMap map;
        AtomicReference atomicReference = (AtomicReference) this.f;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap((HashMap) this.a);
        }
        x(map, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
    
        if (r11 != r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014c, code lost:
    
        if (r11 != r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0163, code lost:
    
        if (r11 == r1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum H(nt5 r12) throws m2 {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne5.H(nt5):java.lang.Enum");
    }

    public final boolean I(Rational rational, Size size) {
        Rational rational2 = (Rational) this.c;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = ua2.a;
        Size size2 = qpj.c;
        if (ua2.a(size, rational, size2)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalT = ua2.a;
        if (!ua2.a(size, rationalT, size2)) {
            rationalT = ua2.c;
            if (!ua2.a(size, rationalT, size2)) {
                rationalT = T(size);
            }
        }
        float fFloatValue3 = rationalT.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        return fFloatValue > fFloatValue2 ? fFloatValue2 < fFloatValue3 : fFloatValue2 > fFloatValue3;
    }

    public final void M() {
        for (kd5 kd5Var : ((HashMap) this.a).keySet()) {
            for (y27 y27Var : kd5Var.c) {
                if (y27Var.b == 2 && !((HashMap) this.c).containsKey(y27Var.a)) {
                    HashMap map = (HashMap) this.c;
                    qfh qfhVar = y27Var.a;
                    Set set = Collections.EMPTY_SET;
                    a7c a7cVar = new a7c();
                    a7cVar.b = null;
                    a7cVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    a7cVar.a.addAll(set);
                    map.put(qfhVar, a7cVar);
                } else if (((HashMap) this.b).containsKey(y27Var.a)) {
                    continue;
                } else {
                    byte b = y27Var.b;
                    if (b == 1) {
                        throw new a37("Unsatisfied dependency for component " + kd5Var + ": " + y27Var.a);
                    }
                    if (b != 2) {
                        HashMap map2 = (HashMap) this.b;
                        qfh qfhVar2 = y27Var.a;
                        odf odfVar = srf.c;
                        le5 le5Var = srf.d;
                        srf srfVar = new srf();
                        srfVar.a = odfVar;
                        srfVar.b = le5Var;
                        map2.put(qfhVar2, srfVar);
                    }
                }
            }
        }
    }

    public final ArrayList N(ArrayList arrayList) {
        HashMap map = (HashMap) this.b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            kd5 kd5Var = (kd5) obj;
            if (!kd5Var.e) {
                l7h l7hVar = (l7h) ((HashMap) this.a).get(kd5Var);
                for (qfh qfhVar : kd5Var.b) {
                    if (map.containsKey(qfhVar)) {
                        arrayList2.add(new fh4((l7h) map.get(qfhVar), (Object) l7hVar, (byte) 10));
                    } else {
                        map.put(qfhVar, l7hVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList O() {
        HashMap map = (HashMap) this.c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            kd5 kd5Var = (kd5) entry.getKey();
            if (kd5Var.e) {
                l7h l7hVar = (l7h) entry.getValue();
                for (qfh qfhVar : kd5Var.b) {
                    if (!map2.containsKey(qfhVar)) {
                        map2.put(qfhVar, new HashSet());
                    }
                    ((Set) map2.get(qfhVar)).add(l7hVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                a7c a7cVar = (a7c) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new fh4((Object) a7cVar, it.next(), (byte) 11));
                }
            } else {
                qfh qfhVar2 = (qfh) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                a7c a7cVar2 = new a7c();
                a7cVar2.b = null;
                a7cVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                a7cVar2.a.addAll(set);
                map.put(qfhVar2, a7cVar2);
            }
        }
        return arrayList;
    }

    public final void P(v7l v7lVar) {
        if (((qmi) this.d).isCancelled()) {
            return;
        }
        ((tmi) this.c).invoke(v7lVar);
    }

    public final ArrayList Q(List list, boolean z) {
        int i2;
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = ua2.a;
        map.put(rational, new ArrayList());
        Rational rational2 = ua2.c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                int size2 = arrayList2.size();
                while (true) {
                    if (i2 >= size2) {
                        arrayList = null;
                        break;
                    }
                    Object obj = arrayList2.get(i2);
                    i2++;
                    Rational rational3 = (Rational) obj;
                    if (ua2.a(size, rational3, qpj.c)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalT = T(size);
                    arrayList2.add(rationalT);
                    map.put(rationalT, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new jk(T((Size) this.b), (byte) 8));
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        while (i2 < size3) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            Rational rational4 = (Rational) obj2;
            if (!rational4.equals(ua2.c) && !rational4.equals(ua2.a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(R(rational4, list2, z));
            }
        }
        return arrayList4;
    }

    public final ArrayList R(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = ua2.a;
            if (ua2.a(size, rational, qpj.c)) {
                arrayList2.add(size);
            }
        }
        int i2 = 0;
        Collections.sort(arrayList2, new uc5((byte) 0, true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = ((HashSet) this.d).iterator();
        while (it2.hasNext()) {
            List<Size> listE = E((qsm) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listE) {
                    if (!I(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listE = arrayList3;
            }
            if (listE.isEmpty()) {
                return new ArrayList();
            }
            if (listE.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                int size3 = arrayList2.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    Size size4 = (Size) obj;
                    Iterator it3 = listE.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!F((Size) it3.next(), size4)) {
                            arrayList4.add(size4);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listE.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                int size5 = arrayList5.size();
                int i4 = 0;
                while (i4 < size5) {
                    Object obj2 = arrayList5.get(i4);
                    i4++;
                    Size size6 = (Size) obj2;
                    Iterator it4 = listE.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size6);
                            break;
                        }
                        if (F((Size) it4.next(), size6)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        int size7 = arrayList2.size();
        while (i2 < size7) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            Size size8 = (Size) obj3;
            if (!hashSet.contains(size8)) {
                arrayList6.add(size8);
            }
        }
        return arrayList6;
    }

    public final void S(Size size) {
        if (size != null) {
            this.a = size;
        } else {
            t3p.q("Null resolution");
        }
    }

    public final void U(al3 al3Var, boolean z) {
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.b;
        if (arrayList2.remove(al3Var)) {
            arrayList2.add(al3Var);
        }
        if (arrayList.remove(al3Var)) {
            if (!z || t(al3Var, (String) this.c)) {
                arrayList.add(al3Var);
            }
        }
    }

    public final void V() {
        xf8.F0((pde) this.g, s());
    }

    public final void b() {
        ((oml) this.g).cancel(false);
    }

    public final synchronized l7h c(qfh qfhVar) {
        a7c a7cVar = (a7c) ((HashMap) this.c).get(qfhVar);
        if (a7cVar != null) {
            return a7cVar;
        }
        return h;
    }

    public final void cancel() {
        ((qmi) this.d).cancel(false);
        ((c8l) this.g).c.a((nwa) this.f);
    }

    public final void d(View view) {
        ((WeakHashMap) this.b).remove(view);
        ((WeakHashMap) this.c).remove(view);
        ((WeakHashMap) this.d).remove(view);
        ((WeakHashMap) ((tuj) this.a).g).remove(view);
    }

    public final void e(ArrayList arrayList) {
        BrowserActivity browserActivity = (BrowserActivity) this.c;
        OperaWallpaperSheet.initializeSheetRequest.2.1 r1 = (OperaWallpaperSheet.initializeSheetRequest.2.1) this.a;
        umn umnVar = (umn) this.b;
        LinkedHashSet linkedHashSet = umnVar.a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (linkedHashSet.contains(((aln) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            r1.onInvalidData(vmn.d.d(linkedHashSet));
            return;
        }
        eej eejVarO = browserActivity.O();
        qln qlnVar = (qln) this.d;
        x5f x5fVar = (x5f) this.e;
        SettingsManager settingsManager = (SettingsManager) this.f;
        d8j d8jVar = (d8j) this.g;
        qlnVar.q(linkedHashSet);
        xq3 xq3Var = new xq3((byte) 15, new ymn(qlnVar, x5fVar, settingsManager, eejVarO, d8jVar, umnVar, eejVarO.c), new xbf(browserActivity, qlnVar, settingsManager, r1), false);
        nej nejVar = eejVarO.a;
        nejVar.getClass();
        nejVar.b(xq3Var, ijm.b);
        ymn.n = xq3Var;
    }

    public final synchronized l7h f(qfh qfhVar) {
        kfo.y(qfhVar, "Null interface requested.");
        return (l7h) ((HashMap) this.b).get(qfhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c6  */
    @Override // defpackage.n5o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne5.g(java.lang.Object):java.lang.Object");
    }

    public final Object get() {
        Context context = (Context) ((qh) this.a).a;
        pxd pxdVar = (pxd) ((o7h) this.b).get();
        ydi ydiVar = (ydi) ((o7h) this.c).get();
        x77 x77Var = (x77) ((shf) this.d).get();
        Executor executor = (Executor) ((o7h) this.e).get();
        ydi ydiVar2 = (ydi) ((o7h) this.f).get();
        tmj tmjVar = new tmj((byte) 9);
        cpj cpjVar = new cpj((byte) 7);
        ydi ydiVar3 = (ydi) ((o7h) this.g).get();
        ks3 ks3Var = new ks3();
        ks3Var.b = context;
        ks3Var.a = pxdVar;
        ks3Var.c = ydiVar;
        ks3Var.d = x77Var;
        ks3Var.e = executor;
        ks3Var.f = ydiVar2;
        ks3Var.g = tmjVar;
        ks3Var.h = cpjVar;
        ks3Var.i = ydiVar3;
        return ks3Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    @Override // defpackage.vnk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(byte[] r55, int r56, int r57, defpackage.unk r58, defpackage.op5 r59) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne5.j(byte[], int, int, unk, op5):void");
    }

    public final void m(View view, hko hkoVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.b;
        if (weakHashMap.get(view) != hkoVar) {
            d(view);
            weakHashMap.put(view, hkoVar);
            tuj tujVar = (tuj) this.a;
            int iA = hkoVar.a();
            tujVar.getClass();
            tujVar.a(view.getContext(), view);
            WeakHashMap weakHashMap2 = (WeakHashMap) tujVar.g;
            ovo ovoVar = (ovo) weakHashMap2.get(view);
            if (ovoVar == null) {
                ovoVar = new ovo();
                weakHashMap2.put(view, ovoVar);
                if (!tujVar.c) {
                    tujVar.c = true;
                    ((Handler) tujVar.k).postDelayed((iv) tujVar.j, 100L);
                }
            }
            ovoVar.d = view;
            ovoVar.a = iA;
            ovoVar.b = iA;
            long j2 = tujVar.b;
            ovoVar.c = j2;
            ovoVar.e = 1;
            long j3 = 1 + j2;
            tujVar.b = j3;
            if (j3 % 50 == 0) {
                long j4 = j2 - 49;
                ArrayList arrayList = (ArrayList) tujVar.d;
                for (Map.Entry entry : weakHashMap2.entrySet()) {
                    if (((ovo) entry.getValue()).c < j4) {
                        arrayList.add((View) entry.getKey());
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    weakHashMap2.remove((View) obj);
                }
                arrayList.clear();
            }
        }
    }

    public final void n(pxj pxjVar) {
        tsd tsdVar = (tsd) this.g;
        k4a k4aVar = (k4a) this.f;
        y7h y7hVar = pxjVar.b;
        int i2 = pxjVar.a;
        View view = (View) this.b;
        int iK = y7hVar.k(view.getContext());
        if (iK != k4aVar.a) {
            k4aVar.a = iK;
            k4aVar.a();
        }
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((g5a) obj).b.r(og.a);
        }
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < i2; i4++) {
            Context context = view.getContext();
            cyj cyjVar = (cyj) tsdVar.g();
            ShapeDrawable shapeDrawableE = j14.E(-1, cyjVar.b.k(context), -1);
            shapeDrawableE.setTintList(cyjVar.h.c.b(context));
            arrayList2.add(shapeDrawableE);
        }
        k4aVar.d(arrayList2);
        int size2 = ((List) this.d).size();
        int i5 = i2 > size2 ? size2 : i2;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 == i2 - 1 && ((List) this.d).size() > i2) {
                Context context2 = view.getContext();
                cyj cyjVar2 = (cyj) tsdVar.g();
                String str = String.format(Locale.getDefault(), "+%d", Arrays.copyOf(new Object[]{Integer.valueOf(((List) this.d).size() - i6)}, 1));
                if (str.length() > pxjVar.f) {
                    str = "…";
                }
                y7h y7hVar2 = cyjVar2.b;
                pxj pxjVar2 = cyjVar2.h;
                ShapeDrawable shapeDrawableE2 = j14.E(-1, y7hVar2.k(context2), -1);
                shapeDrawableE2.setTintList(pxjVar2.c.b(context2));
                k4aVar.c(j14.p(shapeDrawableE2, new ngl(str, Typeface.SANS_SERIF, pxjVar2.e.k(context2), pxjVar2.d.b(context2))), i6);
                return;
            }
            g5a g5aVar = new g5a(view.getContext(), tsdVar, (yqa) this.c, (b2l) ((List) this.d).get(i6), new gv(this, i6, (byte) 2));
            arrayList.add(g5aVar);
            xf8.F0(g5aVar.b, ((tsd) this.a).g());
        }
    }

    public final void o() {
        ((WeakHashMap) this.b).clear();
        ((WeakHashMap) this.c).clear();
        ((WeakHashMap) this.d).clear();
        tuj tujVar = (tuj) this.a;
        ((WeakHashMap) tujVar.g).clear();
        ((Handler) tujVar.k).removeMessages(0);
        tujVar.c = false;
        ((Handler) this.e).removeMessages(0);
        ((WeakHashMap) tujVar.g).clear();
        ((Handler) tujVar.k).removeMessages(0);
        tujVar.c = false;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) ((WeakReference) tujVar.f).get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener((ml2) tujVar.e);
        }
        ((WeakReference) tujVar.f).clear();
        tujVar.i = null;
    }

    public final void onFailure() {
        ((OperaWallpaperSheet.initializeSheetRequest.2.1) this.a).onInvalidData(vmn.b.d(((umn) this.b).a));
    }

    public final to2 p() {
        String strConcat = ((Size) this.a) == null ? " resolution" : "";
        if (((Size) this.b) == null) {
            strConcat = strConcat.concat(" originalConfiguredResolution");
        }
        if (((ip7) this.c) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (((Integer) this.d) == null) {
            strConcat = strConcat.concat(" sessionType");
        }
        if (((Range) this.e) == null) {
            strConcat = strConcat.concat(" expectedFrameRateRange");
        }
        if (((Boolean) this.g) == null) {
            strConcat = strConcat.concat(" zslDisabled");
        }
        if (strConcat.isEmpty()) {
            return new to2((Size) this.a, (Size) this.b, (ip7) this.c, ((Integer) this.d).intValue(), (Range) this.e, (eb4) this.f, ((Boolean) this.g).booleanValue());
        }
        qp2.n("Missing required properties:".concat(strConcat));
        return null;
    }

    public final zai q() throws GeneralSecurityException {
        qie qieVar;
        qie qieVar2;
        dbi dbiVar = (dbi) this.a;
        if (dbiVar == null) {
            t3p.w("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        qie qieVar3 = (qie) this.c;
        if (qieVar3 == null || (qieVar = (qie) this.d) == null) {
            t3p.w("Cannot build without prime factors");
            return null;
        }
        qie qieVar4 = (qie) this.b;
        if (qieVar4 == null) {
            t3p.w("Cannot build without private exponent");
            return null;
        }
        qie qieVar5 = (qie) this.e;
        if (qieVar5 == null || (qieVar2 = (qie) this.f) == null) {
            t3p.w("Cannot build without prime exponents");
            return null;
        }
        qie qieVar6 = (qie) this.g;
        if (qieVar6 == null) {
            t3p.w("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = dbiVar.f.b;
        BigInteger bigInteger2 = dbiVar.g;
        BigInteger bigInteger3 = (BigInteger) qieVar3.b;
        BigInteger bigInteger4 = (BigInteger) qieVar.b;
        BigInteger bigInteger5 = (BigInteger) qieVar4.b;
        BigInteger bigInteger6 = (BigInteger) qieVar5.b;
        BigInteger bigInteger7 = (BigInteger) qieVar2.b;
        BigInteger bigInteger8 = (BigInteger) qieVar6.b;
        if (!bigInteger3.isProbablePrime(10)) {
            t3p.w("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            t3p.w("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            t3p.w("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            t3p.w("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            t3p.w("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            t3p.w("dQ is invalid.");
            return null;
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new zai((dbi) this.a, (qie) this.c, (qie) this.d, (qie) this.b, (qie) this.e, (qie) this.f, (qie) this.g);
        }
        t3p.w("qInv is invalid.");
        return null;
    }

    @Override // defpackage.vnk
    public final void reset() {
        do7 do7Var = (do7) this.f;
        ((SparseArray) do7Var.c).clear();
        ((SparseArray) do7Var.d).clear();
        ((SparseArray) do7Var.e).clear();
        ((SparseArray) do7Var.f).clear();
        ((SparseArray) do7Var.g).clear();
        do7Var.h = null;
        do7Var.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v6k s() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.a
            com.opera.android.settings.SettingsManager r0 = (com.opera.android.settings.SettingsManager) r0
            java.lang.String r1 = "enable_start_page_customize_button"
            boolean r5 = r0.i(r1)
            java.lang.Object r0 = r9.e
            pz6 r0 = (pz6) r0
            rlh r1 = r0.h
            nak r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            boolean r1 = r1 instanceof vpn
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L20
            if (r1 == 0) goto L20
            r1 = r3
            goto L22
        L20:
            r1 = r3
            r3 = r2
        L22:
            if (r5 == 0) goto L38
            java.lang.Object r4 = r9.b
            ode r4 = (defpackage.ode) r4
            java.lang.Object r4 = r4.g()
            t8k r4 = (t8k) r4
            if (r4 == 0) goto L33
            boolean r4 = r4.g
            goto L34
        L33:
            r4 = r1
        L34:
            if (r4 == 0) goto L38
            r4 = r2
            goto L39
        L38:
            r4 = r1
        L39:
            java.lang.Object r1 = r9.d
            pde r1 = (pde) r1
            java.lang.Object r1 = r1.g()
            r2 = r1
            laj r2 = (laj) r2
            laj r6 = laj.e
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r2, r6)
            if (r2 == 0) goto L4d
            r1 = 0
        L4d:
            r6 = r1
            laj r6 = (laj) r6
            java.lang.Object r9 = r9.c
            pde r9 = (pde) r9
            java.lang.Object r9 = r9.g()
            f8k r9 = (f8k) r9
            w6k r7 = r9.d
            rlh r9 = r0.h
            nak r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            r8 = r9
            zpn r8 = (zpn) r8
            v6k r2 = new v6k
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne5.s():v6k");
    }

    public final boolean t(al3 al3Var, String str) {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) this.g;
        if (str != null && str.length() != 0) {
            String title = al3Var.getTitle();
            if (title.length() > 0 && new StringSearch(str, new StringCharacterIterator(title), ruleBasedCollator).next() >= 0) {
                return true;
            }
            if (al3Var instanceof pl3) {
                String str2 = (String) ((pl3) al3Var).getUrl().b;
                if (str2.length() > 0 && new StringSearch(str, new StringCharacterIterator(str2), ruleBasedCollator).next() >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void x(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            kd5 kd5Var = (kd5) entry.getKey();
            l7h l7hVar = (l7h) entry.getValue();
            byte b = kd5Var.d;
            if (b == 1 || (b == 2 && z)) {
                l7hVar.get();
            }
        }
        kb8 kb8Var = (kb8) this.e;
        synchronized (kb8Var) {
            arrayDeque = kb8Var.b;
            if (arrayDeque != null) {
                kb8Var.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw p3p.g(it);
            }
        }
    }

    @Override // defpackage.vnk
    public final int z() {
        return 2;
    }
}
