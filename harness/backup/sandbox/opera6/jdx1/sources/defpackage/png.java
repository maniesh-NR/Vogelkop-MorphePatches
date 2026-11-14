package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class png implements z6g, x63, fvb {
    public final String b;
    public final f3d c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final t89 g;
    public final a73 h;
    public final t89 i;
    public final t89 j;
    public final t89 k;
    public final t89 l;
    public final t89 m;
    public boolean o;
    public final Path a = new Path();
    public final d14 n = new d14((byte) 1);

    public png(f3d f3dVar, c73 c73Var, qng qngVar) {
        a73 a73VarD;
        a73 a73VarD2;
        this.c = f3dVar;
        this.b = qngVar.a;
        int i = qngVar.b;
        this.d = i;
        this.e = qngVar.j;
        this.f = qngVar.k;
        a73 a73VarD3 = qngVar.c.D();
        this.g = (t89) a73VarD3;
        a73 a73VarD4 = qngVar.d.D();
        this.h = a73VarD4;
        a73 a73VarD5 = qngVar.e.D();
        this.i = (t89) a73VarD5;
        a73 a73VarD6 = qngVar.g.D();
        this.k = (t89) a73VarD6;
        a73 a73VarD7 = qngVar.i.D();
        this.m = (t89) a73VarD7;
        if (i == 1) {
            a73VarD = qngVar.f.D();
            this.j = (t89) a73VarD;
            a73VarD2 = qngVar.h.D();
            this.l = (t89) a73VarD2;
        } else {
            a73VarD = null;
            this.j = null;
            this.l = null;
            a73VarD2 = null;
        }
        c73Var.g(a73VarD3);
        c73Var.g(a73VarD4);
        c73Var.g(a73VarD5);
        c73Var.g(a73VarD6);
        c73Var.g(a73VarD7);
        if (i == 1) {
            c73Var.g(a73VarD);
            c73Var.g(a73VarD2);
        }
        a73VarD3.a(this);
        a73VarD4.a(this);
        a73VarD5.a(this);
        a73VarD6.a(this);
        a73VarD7.a(this);
        if (i == 1) {
            a73VarD.a(this);
            a73VarD2.a(this);
        }
    }

    @Override // defpackage.x63
    public final void a() {
        this.o = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.wp5
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            wp5 wp5Var = (wp5) arrayList.get(i);
            if (wp5Var instanceof h7m) {
                h7m h7mVar = (h7m) wp5Var;
                if (h7mVar.c == 1) {
                    this.n.a.add(h7mVar);
                    h7mVar.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.evb
    public final void c(dvb dvbVar, int i, ArrayList arrayList, dvb dvbVar2) {
        l1e.e(dvbVar, i, arrayList, dvbVar2, this);
    }

    @Override // defpackage.evb
    public final void d(ua7 ua7Var, Object obj) {
        t89 t89Var;
        t89 t89Var2;
        if (obj == k3d.r) {
            this.g.j(ua7Var);
            return;
        }
        if (obj == k3d.s) {
            this.i.j(ua7Var);
            return;
        }
        if (obj == k3d.i) {
            this.h.j(ua7Var);
            return;
        }
        if (obj == k3d.t && (t89Var2 = this.j) != null) {
            t89Var2.j(ua7Var);
            return;
        }
        if (obj == k3d.u) {
            this.k.j(ua7Var);
            return;
        }
        if (obj == k3d.v && (t89Var = this.l) != null) {
            t89Var.j(ua7Var);
        } else if (obj == k3d.w) {
            this.m.j(ua7Var);
        }
    }

    @Override // defpackage.z6g
    public final Path e() {
        float f;
        float f2;
        float f3;
        float f4;
        double d;
        float f5;
        float f6;
        float f7;
        float f8;
        int i;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i2;
        double d2;
        boolean z = this.o;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.e) {
            this.o = true;
            return path;
        }
        int iA = vep.A(this.d);
        a73 a73Var = this.h;
        t89 t89Var = this.k;
        t89 t89Var2 = this.m;
        t89 t89Var3 = this.i;
        t89 t89Var4 = this.g;
        if (iA == 0) {
            float fFloatValue = ((Float) t89Var4.e()).floatValue();
            double radians = Math.toRadians((t89Var3 != null ? ((Float) t89Var3.e()).floatValue() : 0.0d) - 90.0d);
            double d3 = fFloatValue;
            float f16 = (float) (6.283185307179586d / d3);
            if (this.f) {
                f16 *= -1.0f;
            }
            float f17 = f16;
            float f18 = f17 / 2.0f;
            float f19 = fFloatValue - ((int) fFloatValue);
            if (f19 != 0.0f) {
                f = 2.0f;
                f2 = f18;
                radians += (1.0f - f19) * f18;
            } else {
                f = 2.0f;
                f2 = f18;
            }
            float fFloatValue2 = ((Float) t89Var.e()).floatValue();
            float fFloatValue3 = ((Float) this.j.e()).floatValue();
            t89 t89Var5 = this.l;
            float fFloatValue4 = t89Var5 != null ? ((Float) t89Var5.e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = t89Var2 != null ? ((Float) t89Var2.e()).floatValue() / 100.0f : 0.0f;
            if (f19 != 0.0f) {
                float fG = v0g.g(fFloatValue2, fFloatValue3, f19, fFloatValue3);
                double d4 = fG;
                float fCos = (float) (Math.cos(radians) * d4);
                float fSin = (float) (Math.sin(radians) * d4);
                path.moveTo(fCos, fSin);
                d = radians + ((f17 * f19) / f);
                f4 = f2;
                f5 = fSin;
                f6 = fG;
                f3 = fCos;
            } else {
                double d5 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d5);
                float fSin2 = (float) (d5 * Math.sin(radians));
                path.moveTo(fCos2, fSin2);
                f3 = fCos2;
                f4 = f2;
                d = radians + f4;
                f5 = fSin2;
                f6 = 0.0f;
            }
            double dCeil = Math.ceil(d3) * 2.0d;
            float f20 = f5;
            double d6 = d;
            int i3 = 0;
            boolean z2 = false;
            while (true) {
                double d7 = i3;
                if (d7 >= dCeil) {
                    break;
                }
                float f21 = z2 ? fFloatValue2 : fFloatValue3;
                float f22 = (f6 == 0.0f || d7 != dCeil - 2.0d) ? f4 : (f17 * f19) / f;
                if (f6 == 0.0f || d7 != dCeil - 1.0d) {
                    f7 = f19;
                    f8 = f21;
                    i = i3;
                    f9 = f4;
                } else {
                    f7 = f19;
                    f8 = f6;
                    f9 = f4;
                    i = i3;
                }
                double d8 = f8;
                float fCos3 = (float) (Math.cos(d6) * d8);
                float fSin3 = (float) (Math.sin(d6) * d8);
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f15 = fCos3;
                    f10 = fSin3;
                } else {
                    float f23 = f20;
                    double dAtan2 = (float) (Math.atan2(f20, f3) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    Path path2 = path;
                    f10 = fSin3;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    if (z2) {
                        f12 = fFloatValue2;
                        f11 = fFloatValue3;
                        f14 = fFloatValue5;
                        f13 = fFloatValue4;
                    } else {
                        f11 = fFloatValue2;
                        f12 = fFloatValue3;
                        f13 = fFloatValue5;
                        f14 = fFloatValue4;
                    }
                    float f24 = f11 * f13 * 0.47829f;
                    float f25 = fCos4 * f24;
                    float f26 = f24 * fSin4;
                    float f27 = f12 * f14 * 0.47829f;
                    float f28 = fCos5 * f27;
                    float f29 = f27 * fSin5;
                    if (f19 != 0.0f) {
                        if (i == 0) {
                            f25 *= f7;
                            f26 *= f7;
                        } else if (d7 == dCeil - 1.0d) {
                            f28 *= f7;
                            f29 *= f7;
                        }
                    }
                    f15 = fCos3;
                    path = path2;
                    path.cubicTo(f3 - f25, f23 - f26, f28 + fCos3, f10 + f29, f15, f10);
                }
                d6 += f22;
                z2 = !z2;
                i3 = i + 1;
                f3 = f15;
                f4 = f9;
                f19 = f7;
                f20 = f10;
                f = 2.0f;
            }
            PointF pointF = (PointF) a73Var.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iA == 1) {
            int iFloor = (int) Math.floor(((Float) t89Var4.e()).floatValue());
            double radians2 = Math.toRadians((t89Var3 != null ? ((Float) t89Var3.e()).floatValue() : 0.0d) - 90.0d);
            double d9 = iFloor;
            float fFloatValue6 = ((Float) t89Var2.e()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) t89Var.e()).floatValue();
            double d10 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d10);
            float fSin6 = (float) (Math.sin(radians2) * d10);
            path.moveTo(fCos6, fSin6);
            double d11 = (float) (6.283185307179586d / d9);
            double dCeil2 = Math.ceil(d9);
            double d12 = radians2 + d11;
            int i4 = 0;
            while (i4 < dCeil2) {
                float fCos7 = (float) (Math.cos(d12) * d10);
                a73 a73Var2 = a73Var;
                float fSin7 = (float) (Math.sin(d12) * d10);
                if (fFloatValue6 != 0.0f) {
                    i2 = i4;
                    Path path3 = path;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    d2 = d10;
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f30 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f31 = fCos8 * f30;
                    float f32 = f30 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f30;
                    float fSin9 = fSin7 + (f30 * ((float) Math.sin(dAtan24)));
                    path = path3;
                    path.cubicTo(fCos6 - f31, fSin6 - f32, fCos9 + fCos7, fSin9, fCos7, fSin7);
                } else {
                    i2 = i4;
                    d2 = d10;
                    path.lineTo(fCos7, fSin7);
                }
                d12 += d11;
                i4 = i2 + 1;
                fCos6 = fCos7;
                fSin6 = fSin7;
                a73Var = a73Var2;
                d10 = d2;
            }
            PointF pointF2 = (PointF) a73Var.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.n.a(path);
        this.o = true;
        return path;
    }

    @Override // defpackage.wp5
    public final String getName() {
        return this.b;
    }
}
