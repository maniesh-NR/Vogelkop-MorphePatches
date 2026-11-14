package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.animation.content.GradientFillContent;

/* loaded from: classes.dex */
public final class j2a implements vq5 {
    public final int a;
    public final Path.FillType b;
    public final dd1 c;
    public final dd1 d;
    public final dd1 e;
    public final dd1 f;
    public final String g;
    public final boolean h;

    public j2a(String str, int i, Path.FillType fillType, dd1 dd1Var, dd1 dd1Var2, dd1 dd1Var3, dd1 dd1Var4, boolean z) {
        this.a = i;
        this.b = fillType;
        this.c = dd1Var;
        this.d = dd1Var2;
        this.e = dd1Var3;
        this.f = dd1Var4;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.vq5
    public final wp5 a(f3d f3dVar, p2d p2dVar, c73 c73Var) {
        return new GradientFillContent(f3dVar, p2dVar, c73Var, this);
    }
}
