package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class xbe {
    public final x79 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public xbe(x79 x79Var, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iG;
        int i5;
        this.a = x79Var;
        this.b = i;
        if (yo5.j(j) != 0 || yo5.i(j) != 0) {
            b8b.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) x79Var.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            uzf uzfVar = (uzf) arrayList2.get(i6);
            c91 c91Var = uzfVar.a;
            int iH = yo5.h(j);
            if (yo5.c(j)) {
                i4 = i6;
                iG = yo5.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i4 = i6;
                iG = yo5.g(j);
            }
            i3 = 0;
            y81 y81Var = new y81(c91Var, this.b - i7, i2, ap5.b(0, iH, 0, iG, 5));
            float f2 = y81Var.f + f;
            ljl ljlVar = y81Var.d;
            int i8 = i7 + ljlVar.g;
            arrayList.add(new tzf(y81Var, uzfVar.b, uzfVar.c, i7, i8, f, f2));
            if (!ljlVar.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != j95.h((ArrayList) this.a.e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = f2;
            }
            z = true;
            i7 = i8;
            f = f2;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = yo5.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            List list = ((tzf) arrayList.get(i9)).a.g;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                voh vohVar = (voh) list.get(i10);
                arrayList4.add(vohVar != null ? vohVar.i(Float.floatToRawIntBits(r7.f) & 4294967295L) : null);
            }
            o95.t(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.a.b).size()) {
            int size4 = ((List) this.a.b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = CollectionsKt.V(arrayList5, arrayList3);
        }
        this.g = arrayList3;
    }

    public static void i(xbe xbeVar, sh4 sh4Var, long j, jaj jajVar, bgl bglVar, nk7 nk7Var) {
        sh4Var.j();
        ArrayList arrayList = xbeVar.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tzf tzfVar = (tzf) arrayList.get(i);
            tzfVar.a.e(sh4Var, j, jajVar, bglVar, nk7Var);
            sh4Var.e(0.0f, tzfVar.a.f);
        }
        sh4Var.f();
    }

    public static void j(xbe xbeVar, sh4 sh4Var, dz3 dz3Var, float f, jaj jajVar, bgl bglVar, nk7 nk7Var) {
        sh4Var.j();
        ArrayList arrayList = xbeVar.h;
        if (arrayList.size() <= 1 || (dz3Var instanceof nvj)) {
            c26.m(xbeVar, sh4Var, dz3Var, f, jajVar, bglVar, nk7Var);
        } else {
            if (!(dz3Var instanceof haj)) {
                h9o.p();
                return;
            }
            int size = arrayList.size();
            byte b = 0;
            float fMax = 0.0f;
            float f2 = 0.0f;
            for (int i = 0; i < size; i++) {
                y81 y81Var = ((tzf) arrayList.get(i)).a;
                f2 += y81Var.f;
                fMax = Math.max(fMax, y81Var.c());
            }
            Shader shaderB = ((haj) dz3Var).b((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                y81 y81Var2 = ((tzf) arrayList.get(i2)).a;
                y81Var2.f(sh4Var, new ez3(shaderB, b), f, jajVar, bglVar, nk7Var);
                sh4Var.e(0.0f, y81Var2.f);
                matrix.setTranslate(0.0f, -y81Var2.f);
                shaderB.setLocalMatrix(matrix);
            }
        }
        sh4Var.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(float[] fArr, long j) {
        k(xjl.f(j));
        l(xjl.e(j));
        nqh nqhVar = new nqh();
        nqhVar.a = 0;
        sgb.B(this.h, j, new do3(j, (Serializable) fArr, (Serializable) nqhVar, (Serializable) new mqh(), (byte) 1));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        tzf tzfVar = (tzf) arrayList.get(sgb.z(i, arrayList));
        y81 y81Var = tzfVar.a;
        return y81Var.d.e(i - tzfVar.d) + tzfVar.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        m(i);
        ArrayList arrayList = this.h;
        tzf tzfVar = (tzf) arrayList.get(sgb.z(i, arrayList));
        y81 y81Var = tzfVar.a;
        int i2 = i - tzfVar.d;
        ljl ljlVar = y81Var.d;
        if (z) {
            Layout layout = ljlVar.f;
            ThreadLocal threadLocal = pjl.a;
            if (layout.getEllipsisCount(i2) <= 0 || ljlVar.b != TextUtils.TruncateAt.END) {
                x79 x79VarC = ljlVar.c();
                Layout layout2 = (Layout) x79VarC.a;
                iF = x79VarC.M(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = ljlVar.f(i2);
        }
        return iF + tzfVar.b;
    }

    public final int d(int i) {
        int length = ((sf1) this.a.a).b.length();
        ArrayList arrayList = this.h;
        tzf tzfVar = (tzf) arrayList.get(i >= length ? arrayList.size() - 1 : i < 0 ? 0 : sgb.y(i, arrayList));
        return tzfVar.a.d.g(tzfVar.b(i)) + tzfVar.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        tzf tzfVar = (tzf) arrayList.get(sgb.A(arrayList, f));
        int i = tzfVar.c - tzfVar.b;
        int i2 = tzfVar.d;
        if (i == 0) {
            return i2;
        }
        y81 y81Var = tzfVar.a;
        float f2 = f - tzfVar.f;
        ljl ljlVar = y81Var.d;
        int i3 = (int) (f2 - 0.0f);
        int i4 = ljlVar.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = ljlVar.f.getLineForVertical(i3 - ljlVar.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        tzf tzfVar = (tzf) arrayList.get(sgb.z(i, arrayList));
        y81 y81Var = tzfVar.a;
        return y81Var.d.i(i - tzfVar.d) + tzfVar.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        tzf tzfVar = (tzf) arrayList.get(sgb.A(arrayList, fIntBitsToFloat));
        int i2 = tzfVar.c;
        int i3 = tzfVar.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        y81 y81Var = tzfVar.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - tzfVar.f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L);
        ljl ljlVar = y81Var.d;
        int lineForVertical = ljlVar.f.getLineForVertical(((int) (Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) - 0.0f)) - ljlVar.h);
        int i4 = ljlVar.g;
        Layout layout = ljlVar.f;
        if (lineForVertical >= i4) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (ljlVar.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(voh vohVar, int i, gpk gpkVar) {
        long jA;
        long j;
        float f = vohVar.b;
        ArrayList arrayList = this.h;
        int iA = sgb.A(arrayList, f);
        float f2 = ((tzf) arrayList.get(iA)).g;
        float f3 = vohVar.d;
        if (f2 >= f3 || iA == arrayList.size() - 1) {
            tzf tzfVar = (tzf) arrayList.get(iA);
            return tzfVar.a(tzfVar.a.b(vohVar.i(Float.floatToRawIntBits(-tzfVar.f) & 4294967295L), i, gpkVar), true);
        }
        int iA2 = sgb.A(arrayList, f3);
        long jA2 = xjl.b;
        while (true) {
            jA = xjl.b;
            if (!xjl.b(jA2, jA) || iA > iA2) {
                break;
            }
            tzf tzfVar2 = (tzf) arrayList.get(iA);
            jA2 = tzfVar2.a(tzfVar2.a.b(vohVar.i(Float.floatToRawIntBits(-tzfVar2.f) & 4294967295L), i, gpkVar), true);
            iA++;
        }
        if (xjl.b(jA2, jA)) {
            return jA;
        }
        while (true) {
            j = xjl.b;
            if (!xjl.b(jA, j) || iA > iA2) {
                break;
            }
            tzf tzfVar3 = (tzf) arrayList.get(iA2);
            jA = tzfVar3.a(tzfVar3.a.b(vohVar.i(Float.floatToRawIntBits(-tzfVar3.f) & 4294967295L), i, gpkVar), true);
            iA2--;
        }
        return xjl.b(jA, j) ? jA2 : upj.c((int) (jA2 >> 32), (int) (jA & 4294967295L));
    }

    public final void k(int i) {
        sf1 sf1Var = (sf1) this.a.a;
        if (i < 0 || i >= sf1Var.b.length()) {
            b8b.a("offset(" + i + ") is out of bounds [0, " + sf1Var.b.length() + ")");
        }
    }

    public final void l(int i) {
        sf1 sf1Var = (sf1) this.a.a;
        if (i < 0 || i > sf1Var.b.length()) {
            b8b.a("offset(" + i + ") is out of bounds [0, " + sf1Var.b.length() + "]");
        }
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        b8b.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }
}
