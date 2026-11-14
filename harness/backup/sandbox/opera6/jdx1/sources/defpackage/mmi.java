package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class mmi implements y3n, he4 {
    public int i;
    public SurfaceTexture j;
    public byte[] l;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final n5h c = new n5h();
    public final tn d = new tn((byte) 13);
    public final i1 e = new i1();
    public final i1 f = new i1();
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public int k = -1;

    @Override // defpackage.he4
    public final void a(float[] fArr, long j) {
        ((i1) this.d.d).f(j, fArr);
    }

    @Override // defpackage.y3n
    public final void b(long j, long j2, oj9 oj9Var, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListR;
        int iM;
        this.e.f(j2, Long.valueOf(j));
        byte[] bArr = oj9Var.B;
        int i2 = oj9Var.C;
        byte[] bArr2 = this.l;
        int i3 = this.k;
        this.l = bArr;
        int i4 = 0;
        if (i2 == -1) {
            i2 = 0;
        }
        this.k = i2;
        if (i3 == i2 && Arrays.equals(bArr2, bArr)) {
            return;
        }
        byte[] bArr3 = this.l;
        int i5 = 2;
        l5h l5hVar = null;
        if (bArr3 != null) {
            int i6 = this.k;
            g1g g1gVar = new g1g(bArr3);
            try {
                g1gVar.O(4);
                iM = g1gVar.m();
                g1gVar.N(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iM == 1886547818) {
                g1gVar.O(8);
                int i7 = g1gVar.b;
                int i8 = g1gVar.c;
                while (i7 < i8) {
                    int iM2 = g1gVar.m() + i7;
                    if (iM2 <= i7 || iM2 > i8) {
                        break;
                    }
                    int iM3 = g1gVar.m();
                    if (iM3 == 2037673328 || iM3 == 1836279920) {
                        g1gVar.M(iM2);
                        arrayListR = m5h.r(g1gVar);
                        break;
                    } else {
                        g1gVar.N(iM2);
                        i7 = iM2;
                    }
                }
                arrayListR = null;
            } else {
                arrayListR = m5h.r(g1gVar);
            }
            if (arrayListR != null) {
                int size = arrayListR.size();
                if (size == 1) {
                    k5h k5hVar = (k5h) arrayListR.get(0);
                    l5hVar = new l5h(k5hVar, k5hVar, i6);
                } else if (size == 2) {
                    l5hVar = new l5h((k5h) arrayListR.get(0), (k5h) arrayListR.get(1), i6);
                }
            }
        }
        if (l5hVar == null || !n5h.c(l5hVar)) {
            int i9 = this.k;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < 36) {
                float f = (i10 * 0.08726647f) - 1.5707964f;
                int i13 = i10 + 1;
                float f2 = (i13 * 0.08726647f) - 1.5707964f;
                for (int i14 = i4; i14 < 73; i14++) {
                    int i15 = 0;
                    while (i15 < i5) {
                        float f3 = i15 == 0 ? f : f2;
                        float f4 = i14 * 0.08726647f;
                        float f5 = f;
                        float f6 = f2;
                        double d = (f4 + 3.1415927f) - 3.1415927f;
                        double d2 = f3;
                        fArr[i11] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i11 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i16 = i11 + 3;
                        fArr[i11 + 2] = (float) (Math.cos(d) * 50.0d * Math.cos(d2));
                        fArr2[i12] = f4 / 6.2831855f;
                        int i17 = i12 + 2;
                        fArr2[i12 + 1] = ((i10 + i15) * 0.08726647f) / 3.1415927f;
                        if ((i14 == 0 && i15 == 0) || (i14 == 72 && i15 == 1)) {
                            System.arraycopy(fArr, i11, fArr, i16, 3);
                            i11 += 6;
                            i = 2;
                            System.arraycopy(fArr2, i12, fArr2, i17, 2);
                            i12 += 4;
                        } else {
                            i = 2;
                            i11 = i16;
                            i12 = i17;
                        }
                        i15++;
                        i5 = i;
                        f = f5;
                        f2 = f6;
                    }
                }
                i10 = i13;
                i4 = 0;
            }
            k5h k5hVar2 = new k5h(new i1(0, 1, fArr, fArr2));
            l5hVar = new l5h(k5hVar2, k5hVar2, i9);
        }
        this.f.f(j2, l5hVar);
    }

    @Override // defpackage.he4
    public final void c() {
        this.e.m();
        tn tnVar = this.d;
        ((i1) tnVar.d).m();
        tnVar.a = false;
        this.b.set(true);
    }

    public final SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            fr3.p();
            this.c.a();
            fr3.p();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            fr3.p();
            int i = iArr[0];
            fr3.k(36197, i);
            this.i = i;
        } catch (qy9 e) {
            w7d.r("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: lmi
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.a.a.set(true);
            }
        });
        return this.j;
    }
}
