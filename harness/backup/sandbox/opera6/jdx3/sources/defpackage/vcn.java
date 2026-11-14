package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* loaded from: classes.dex */
public final class vcn extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public vcn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, i, i2, new int[]{this.a, this.b}, (float[]) null, Shader.TileMode.CLAMP);
    }
}
