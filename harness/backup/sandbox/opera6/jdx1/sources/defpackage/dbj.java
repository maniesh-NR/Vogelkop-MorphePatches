package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dbj extends a73 {
    public final vaj i;
    public final Path j;
    public ArrayList k;

    public dbj(List list) {
        super(list);
        this.i = new vaj();
        this.j = new Path();
    }

    @Override // defpackage.a73
    public final Object f(zvb zvbVar, float f) {
        int i;
        vaj vajVar;
        float f2;
        boolean z;
        vaj vajVar2 = (vaj) zvbVar.b;
        vaj vajVar3 = (vaj) zvbVar.c;
        vaj vajVar4 = this.i;
        ArrayList arrayList = vajVar4.a;
        if (vajVar4.b == null) {
            vajVar4.b = new PointF();
        }
        boolean z2 = vajVar2.c;
        ArrayList arrayList2 = vajVar2.a;
        boolean z3 = true;
        vajVar4.c = z2 || vajVar3.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = vajVar3.a;
        if (size != arrayList3.size()) {
            izc.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new v36());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = vajVar2.b;
        PointF pointF2 = vajVar3.b;
        float fD = l1e.d(pointF.x, pointF2.x, f);
        float fD2 = l1e.d(pointF.y, pointF2.y, f);
        PointF pointF3 = vajVar4.b;
        if (pointF3 == null) {
            pointF3 = new PointF();
            vajVar4.b = pointF3;
        }
        pointF3.set(fD, fD2);
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            v36 v36Var = (v36) arrayList2.get(size4);
            v36 v36Var2 = (v36) arrayList3.get(size4);
            PointF pointF4 = v36Var.a;
            PointF pointF5 = v36Var.b;
            PointF pointF6 = v36Var.c;
            PointF pointF7 = v36Var2.a;
            PointF pointF8 = v36Var2.b;
            PointF pointF9 = v36Var2.c;
            ((v36) arrayList.get(size4)).a.set(l1e.d(pointF4.x, pointF7.x, f), l1e.d(pointF4.y, pointF7.y, f));
            ((v36) arrayList.get(size4)).b.set(l1e.d(pointF5.x, pointF8.x, f), l1e.d(pointF5.y, pointF8.y, f));
            ((v36) arrayList.get(size4)).c.set(l1e.d(pointF6.x, pointF9.x, f), l1e.d(pointF6.y, pointF9.y, f));
            size4--;
            z3 = z3;
        }
        boolean z4 = z3;
        ArrayList arrayList4 = this.k;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            while (true) {
                ArrayList arrayList5 = vajVar4.a;
                if (size5 < 0) {
                    break;
                }
                y8i y8iVar = (y8i) this.k.get(size5);
                y8iVar.getClass();
                if (arrayList5.size() > 2) {
                    float fFloatValue = ((Float) y8iVar.b.e()).floatValue();
                    if (fFloatValue != 0.0f) {
                        boolean z5 = vajVar4.c;
                        int size6 = arrayList5.size() - 1;
                        int i2 = 0;
                        while (size6 >= 0) {
                            v36 v36Var3 = (v36) arrayList5.get(size6);
                            v36 v36Var4 = (v36) arrayList5.get(y8i.c(size6 - 1, arrayList5.size()));
                            PointF pointF10 = (size6 != 0 || z5) ? v36Var4.c : vajVar4.b;
                            i2 = (((size6 != 0 || z5) ? v36Var4.b : pointF10).equals(pointF10) && v36Var3.a.equals(pointF10) && !((vajVar4.c || (size6 != 0 && size6 != arrayList5.size() + (-1))) ? false : z4)) ? i2 + 2 : i2 + 1;
                            size6--;
                        }
                        vaj vajVar5 = y8iVar.c;
                        if (vajVar5 == null || vajVar5.a.size() != i2) {
                            ArrayList arrayList6 = new ArrayList(i2);
                            for (int i3 = 0; i3 < i2; i3++) {
                                arrayList6.add(new v36());
                            }
                            i = 0;
                            y8iVar.c = new vaj(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i = 0;
                        }
                        vaj vajVar6 = y8iVar.c;
                        vajVar6.c = z5;
                        PointF pointF11 = vajVar4.b;
                        float f3 = pointF11.x;
                        float f4 = pointF11.y;
                        PointF pointF12 = vajVar6.b;
                        if (pointF12 == null) {
                            pointF12 = new PointF();
                            vajVar6.b = pointF12;
                        }
                        pointF12.set(f3, f4);
                        ArrayList arrayList7 = vajVar6.a;
                        boolean z6 = vajVar4.c;
                        int i4 = i;
                        int i5 = i4;
                        while (i4 < arrayList5.size()) {
                            v36 v36Var5 = (v36) arrayList5.get(i4);
                            v36 v36Var6 = (v36) arrayList5.get(y8i.c(i4 - 1, arrayList5.size()));
                            v36 v36Var7 = (v36) arrayList5.get(y8i.c(i4 - 2, arrayList5.size()));
                            PointF pointF13 = (i4 != 0 || z6) ? v36Var6.c : vajVar4.b;
                            PointF pointF14 = (i4 != 0 || z6) ? v36Var6.b : pointF13;
                            PointF pointF15 = v36Var5.a;
                            PointF pointF16 = v36Var7.c;
                            int i6 = size5;
                            PointF pointF17 = v36Var5.c;
                            ArrayList arrayList8 = arrayList5;
                            boolean z7 = (vajVar4.c || !(i4 == 0 || i4 == arrayList8.size() + (-1))) ? false : z4;
                            if (pointF14.equals(pointF13) && pointF15.equals(pointF13) && !z7) {
                                float f5 = pointF13.x;
                                float f6 = f5 - pointF16.x;
                                float f7 = pointF13.y;
                                float f8 = f7 - pointF16.y;
                                float f9 = pointF17.x - f5;
                                float f10 = pointF17.y - f7;
                                vajVar = vajVar4;
                                f2 = fFloatValue;
                                float fHypot = (float) Math.hypot(f6, f8);
                                float fHypot2 = (float) Math.hypot(f9, f10);
                                float fMin = Math.min(f2 / fHypot, 0.5f);
                                float fMin2 = Math.min(f2 / fHypot2, 0.5f);
                                float f11 = pointF13.x;
                                float fG = v0g.g(pointF16.x, f11, fMin, f11);
                                float f12 = pointF13.y;
                                float fG2 = v0g.g(pointF16.y, f12, fMin, f12);
                                float fG3 = v0g.g(pointF17.x, f11, fMin2, f11);
                                float fG4 = v0g.g(pointF17.y, f12, fMin2, f12);
                                float f13 = fG - ((fG - f11) * 0.5519f);
                                float f14 = fG2 - ((fG2 - f12) * 0.5519f);
                                float f15 = fG3 - ((fG3 - f11) * 0.5519f);
                                float f16 = fG4 - ((fG4 - f12) * 0.5519f);
                                v36 v36Var8 = (v36) arrayList7.get(y8i.c(i5 - 1, arrayList7.size()));
                                v36 v36Var9 = (v36) arrayList7.get(i5);
                                z = z6;
                                v36Var8.b.set(fG, fG2);
                                v36Var8.c.set(fG, fG2);
                                if (i4 == 0) {
                                    PointF pointF18 = vajVar6.b;
                                    if (pointF18 == null) {
                                        pointF18 = new PointF();
                                        vajVar6.b = pointF18;
                                    }
                                    pointF18.set(fG, fG2);
                                }
                                v36Var9.a.set(f13, f14);
                                v36 v36Var10 = (v36) arrayList7.get(i5 + 1);
                                v36Var9.b.set(f15, f16);
                                v36Var9.c.set(fG3, fG4);
                                v36Var10.a.set(fG3, fG4);
                                i5 += 2;
                            } else {
                                vajVar = vajVar4;
                                f2 = fFloatValue;
                                z = z6;
                                v36 v36Var11 = (v36) arrayList7.get(y8i.c(i5 - 1, arrayList7.size()));
                                v36 v36Var12 = (v36) arrayList7.get(i5);
                                PointF pointF19 = v36Var6.b;
                                v36Var11.b.set(pointF19.x, pointF19.y);
                                PointF pointF20 = v36Var6.c;
                                v36Var11.c.set(pointF20.x, pointF20.y);
                                PointF pointF21 = v36Var5.a;
                                v36Var12.a.set(pointF21.x, pointF21.y);
                                i5++;
                            }
                            i4++;
                            size5 = i6;
                            arrayList5 = arrayList8;
                            vajVar4 = vajVar;
                            fFloatValue = f2;
                            z6 = z;
                        }
                        vajVar4 = vajVar6;
                    }
                }
                size5--;
            }
        }
        Path path = this.j;
        path.reset();
        PointF pointF22 = vajVar4.b;
        ArrayList arrayList9 = vajVar4.a;
        path.moveTo(pointF22.x, pointF22.y);
        PointF pointF23 = l1e.a;
        pointF23.set(pointF22.x, pointF22.y);
        for (int i7 = 0; i7 < arrayList9.size(); i7++) {
            v36 v36Var13 = (v36) arrayList9.get(i7);
            PointF pointF24 = v36Var13.a;
            PointF pointF25 = v36Var13.b;
            PointF pointF26 = v36Var13.c;
            if (pointF24.equals(pointF23) && pointF25.equals(pointF26)) {
                path.lineTo(pointF26.x, pointF26.y);
            } else {
                path.cubicTo(pointF24.x, pointF24.y, pointF25.x, pointF25.y, pointF26.x, pointF26.y);
            }
            pointF23.set(pointF26.x, pointF26.y);
        }
        if (vajVar4.c) {
            path.close();
        }
        return path;
    }
}
