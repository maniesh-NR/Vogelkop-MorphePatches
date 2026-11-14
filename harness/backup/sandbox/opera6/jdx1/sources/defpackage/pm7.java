package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pm7 extends zi4 {
    public laj A;
    public final Function0 x;
    public final Function0 y;
    public final RenderNode z = new RenderNode("blur");
    public float B = 1.0f;

    public pm7(Function0 function0, Function0 function02) {
        this.x = function0;
        this.y = function02;
    }

    @Override // defpackage.zi4
    public final boolean F() {
        return false;
    }

    @Override // defpackage.zi4
    public final boolean X(float f) {
        if (this.B == f) {
            return false;
        }
        this.B = f;
        this.z.setAlpha(f);
        return true;
    }

    @Override // defpackage.zi4
    public final boolean Y(laj lajVar) {
        RenderEffect renderEffectCreateOffsetEffect;
        if (Intrinsics.a(this.A, lajVar)) {
            return false;
        }
        this.A = lajVar;
        if (lajVar != null) {
            float f = lajVar.a;
            int i = lajVar.d;
            float f2 = lajVar.c;
            float f3 = lajVar.b;
            renderEffectCreateOffsetEffect = f == 0.0f ? RenderEffect.createOffsetEffect(f3, f2, RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN))) : RenderEffect.createOffsetEffect(f3, f2, RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN), RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR)));
        } else {
            renderEffectCreateOffsetEffect = null;
        }
        this.z.setRenderEffect(renderEffectCreateOffsetEffect);
        return true;
    }

    @Override // defpackage.zi4
    public final void k(Canvas canvas, Function1 function1) {
        if (this.A == null || this.B == 0.0f) {
            return;
        }
        int iIntValue = ((Number) this.x.invoke()).intValue();
        int iIntValue2 = ((Number) this.y.invoke()).intValue();
        RenderNode renderNode = this.z;
        renderNode.setPosition(0, 0, iIntValue, iIntValue2);
        function1.invoke(renderNode.beginRecording());
        renderNode.endRecording();
        canvas.drawRenderNode(renderNode);
    }
}
