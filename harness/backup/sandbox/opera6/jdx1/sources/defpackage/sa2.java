package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class sa2 implements zk3, j0n, m4f, be2, sog, nup {
    public static sa2 e;
    public final /* synthetic */ byte a;
    public int b;
    public static final sa2 c = new sa2(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
    public static final Object d = new Object();
    public static final float[] f = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    public static final float[] g = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    public sa2(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                this.b = 0;
                break;
            default:
                this.b = 1;
                break;
        }
    }

    public sa2(byte b, int i) {
        this.a = b;
        switch (b) {
            case 18:
                this.b = i;
                if (i > 0) {
                    return;
                }
                qp2.o("maxLength must be positive");
                throw null;
            default:
                id4[] id4VarArr = id4.a;
                this.b = i;
                return;
        }
    }

    public /* synthetic */ sa2(byte b, int i, boolean z) {
        this.a = b;
        this.b = i;
    }

    public /* synthetic */ sa2(byte b, boolean z) {
        this.a = b;
    }

    public final ibk a(int i) {
        int i2 = this.b;
        if (i != 0) {
            return null;
        }
        float f2 = (i2 * 0.5f) / 0.5f;
        float f3 = 0.866f * f2;
        float f4 = -f2;
        float f5 = f4 / 2.0f;
        float f6 = f4 - f3;
        float f7 = 2.0f * f2;
        RectF rectF = new RectF(f5, f6, f5 + f7, f7 + f6);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setAlpha(187);
        paint.setStyle(Paint.Style.FILL);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) f2, (int) (f2 - f3), Bitmap.Config.ALPHA_8);
        new Canvas(bitmapCreateBitmap).drawArc(rectF, 45.0f, 90.0f, true, paint);
        return new ibk(bitmapCreateBitmap);
    }

    public final tog b(tog togVar) {
        cin cinVar = togVar instanceof cin ? (cin) togVar : null;
        if (cinVar != null && cinVar.b == this.b) {
            cinVar.a = 0;
            return cinVar;
        }
        cin cinVar2 = new cin();
        cinVar2.a = 0;
        cinVar2.b = this.b;
        if (cinVar != null) {
            cinVar2.c = cinVar.c;
            cinVar2.d = cinVar.d;
            cinVar2.e = cinVar.e;
            cinVar2.f = cinVar.f;
        }
        return cinVar2;
    }

    public final boolean c(ol3 ol3Var) {
        switch (this.a) {
            case 3:
                if (ol3Var.g()) {
                    this.b++;
                    break;
                }
                break;
            case 4:
                if (!ol3Var.g()) {
                    this.b++;
                    break;
                }
                break;
            default:
                if (ol3Var.g() && ol3Var.b() != null) {
                    this.b++;
                    break;
                }
                break;
        }
        return true;
    }

    public final qop d(qop qopVar) {
        int i = this.b;
        if (qopVar == null) {
            return null;
        }
        int i2 = qopVar.a;
        long j = qopVar.d;
        long j2 = qopVar.e;
        ArrayList arrayList = qopVar.f;
        return qop.a(i2, 6, i, j, j2, arrayList != null ? new ArrayList(arrayList) : new ArrayList(), qopVar.b());
    }

    public final boolean e() {
        int i = this.b;
        this.b = i - 1;
        return i > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f8, code lost:
    
        if (r22.b == r5) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fa, code lost:
    
        if (r4 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fc, code lost:
    
        r12 = r12 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fe, code lost:
    
        r12 = r12 + r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0082 A[EDGE_INSN: B:99:0x0082->B:36:0x0082 BREAK  A[LOOP:0: B:12:0x0030->B:35:0x007b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float f(int r23, int r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa2.f(int, int, java.lang.String):float");
    }

    public final List g(int i, String str) {
        if (str.length() == 0) {
            return l08.a;
        }
        int length = str.length();
        int i2 = this.b;
        if (length <= i2) {
            return Collections.singletonList(new ffl(str, i));
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = 0;
        char c2 = '\n';
        String string = "";
        int length2 = 0;
        for (String str2 : StringsKt.X(str, new char[]{'\n'})) {
            if (str2.length() + string.length() + (string.length() > 0 ? i3 : i4) <= i2) {
                if (string.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) string);
                    sb.append(c2);
                    string = sb.toString();
                }
                string = ((Object) string) + str2;
            } else {
                if (string.length() > 0) {
                    arrayList.add(new ffl(string, i + length2));
                    length2 += string.length();
                }
                if (str2.length() > i2) {
                    int i5 = i + length2;
                    ArrayList arrayList2 = new ArrayList();
                    int length3 = str2.length();
                    int length4 = str2.length();
                    int i6 = length4 / i2;
                    int i7 = length4 % i2;
                    if ((length4 ^ i2) >= 0 && i7 != 0) {
                        i6++;
                    }
                    int i8 = length3 / i6;
                    int i9 = length3 % i6;
                    if ((length3 ^ i6) >= 0 && i9 != 0) {
                        i8++;
                    }
                    dgh.f(i8, i8);
                    int length5 = str2.length();
                    ArrayList arrayList3 = new ArrayList((length5 / i8) + (length5 % i8 == 0 ? i4 : i3));
                    int i10 = i4;
                    while (i10 >= 0 && i10 < length5) {
                        int i11 = i10 + i8;
                        arrayList3.add(str2.subSequence(i10, (i11 < 0 || i11 > length5) ? length5 : i11).toString());
                        i10 = i11;
                    }
                    int size = arrayList3.size();
                    int length6 = 0;
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList3.get(i12);
                        i12++;
                        String str3 = (String) obj;
                        arrayList2.add(new ffl(str3, i5 + length6));
                        length6 += str3.length();
                    }
                    arrayList.addAll(arrayList2);
                    length2 += str2.length();
                    string = "";
                } else {
                    string = str2;
                }
            }
            i3 = 1;
            i4 = 0;
            c2 = '\n';
        }
        if (string.length() > 0) {
            arrayList.add(new ffl(string, i + length2));
        }
        return arrayList;
    }

    public final String i() {
        switch (this.a) {
            case 14:
                return p3p.k(this.b, " digits", new StringBuilder("expected at least "));
            default:
                return p3p.k(this.b, " digits", new StringBuilder("expected at most "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    @Override // defpackage.j0n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.esb r22, float r23) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa2.n(esb, float):java.lang.Object");
    }
}
