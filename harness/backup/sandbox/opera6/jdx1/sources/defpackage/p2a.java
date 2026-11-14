package defpackage;

import com.airbnb.lottie.animation.content.GradientStrokeContent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p2a implements vq5 {
    public final String a;
    public final int b;
    public final dd1 c;
    public final dd1 d;
    public final dd1 e;
    public final dd1 f;
    public final ed1 g;
    public final int h;
    public final int i;
    public final float j;
    public final ArrayList k;
    public final ed1 l;
    public final boolean m;

    public p2a(String str, int i, dd1 dd1Var, dd1 dd1Var2, dd1 dd1Var3, dd1 dd1Var4, ed1 ed1Var, int i2, int i3, float f, ArrayList arrayList, ed1 ed1Var2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = dd1Var;
        this.d = dd1Var2;
        this.e = dd1Var3;
        this.f = dd1Var4;
        this.g = ed1Var;
        this.h = i2;
        this.i = i3;
        this.j = f;
        this.k = arrayList;
        this.l = ed1Var2;
        this.m = z;
    }

    @Override // defpackage.vq5
    public final wp5 a(f3d f3dVar, p2d p2dVar, c73 c73Var) {
        return new GradientStrokeContent(f3dVar, c73Var, this);
    }
}
