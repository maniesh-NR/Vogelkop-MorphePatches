package defpackage;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class cz7 extends ReplacementSpan {
    public final kam b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public short c = -1;
    public float d = 1.0f;

    public cz7(kam kamVar) {
        jpo.m(kamVar, "rasterizer cannot be null");
        this.b = kamVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        kam kamVar = this.b;
        this.d = fAbs / (kamVar.a().a(14) != 0 ? ((ByteBuffer) ((t9d) r8).d).getShort(r1 + ((t9d) r8).a) : (short) 0);
        vxd vxdVarA = kamVar.a();
        int iA = vxdVarA.a(14);
        if (iA != 0) {
            ((ByteBuffer) ((t9d) vxdVarA).d).getShort(iA + ((t9d) vxdVarA).a);
        }
        short s = (short) ((kamVar.a().a(12) != 0 ? ((ByteBuffer) ((t9d) r5).d).getShort(r7 + ((t9d) r5).a) : (short) 0) * this.d);
        this.c = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
