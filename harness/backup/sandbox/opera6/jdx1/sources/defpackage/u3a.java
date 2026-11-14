package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;

/* loaded from: classes.dex */
public final class u3a {
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public byte F;
    public final pjn a;
    public final uh4 b;
    public final RenderNode c;
    public long d;
    public Paint e;
    public Matrix f;
    public boolean g;
    public float h;
    public int i;
    public kh3 j;
    public long k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public u3a() {
        pjn pjnVar = new pjn((byte) 22);
        uh4 uh4Var = new uh4();
        this.a = pjnVar;
        this.b = uh4Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.c = renderNode;
        this.d = 0L;
        renderNode.setClipToBounds(false);
        b(renderNode, 0);
        this.h = 1.0f;
        this.i = 3;
        this.k = 9205357640488583168L;
        this.l = 1.0f;
        this.m = 1.0f;
        long j = u95.b;
        this.q = j;
        this.r = j;
        this.v = 8.0f;
        this.F = (byte) 0;
    }

    public final void a() {
        boolean z = this.w;
        boolean z2 = false;
        boolean z3 = z && !this.g;
        if (z && this.g) {
            z2 = true;
        }
        boolean z4 = this.B;
        RenderNode renderNode = this.c;
        if (z3 != z4) {
            this.B = z3;
            renderNode.setClipToBounds(z3);
        }
        if (z2 != this.C) {
            this.C = z2;
            renderNode.setClipToOutline(z2);
        }
    }

    public final void b(RenderNode renderNode, int i) {
        Paint paint = this.e;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void c() {
        byte b = this.F;
        RenderNode renderNode = this.c;
        if (b != 1 && this.i == 3 && this.j == null) {
            b(renderNode, b);
        } else {
            b(renderNode, 1);
        }
    }

    public final void d() {
        long j = this.k;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.c;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.d >> 32)) / 2.0f) + this.x);
            renderNode.setPivotY((Float.intBitsToFloat((int) (this.d & 4294967295L)) / 2.0f) + this.y);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.x);
            renderNode.setPivotY(Float.intBitsToFloat((int) (this.k & 4294967295L)) + this.y);
        }
    }

    public final void e() {
        int i = this.D;
        this.c.setPosition(i - this.x, this.E - this.y, i + ((int) Float.intBitsToFloat((int) (this.d >> 32))) + this.z, this.E + ((int) Float.intBitsToFloat((int) (this.d & 4294967295L))) + this.A);
    }
}
