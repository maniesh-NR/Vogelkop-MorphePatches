package defpackage;

/* loaded from: classes.dex */
public final class pxa extends h5a {
    public final boolean a = true;
    public final vt8 b = vt8.d;

    @Override // defpackage.h5a
    public final vt8 a() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        boolean z = this.a;
        return o18.p(sb, z ? !z ? fki.r("UNDEFINED(", z ? 1 : 0, ')') : "JPEG_R" : "JPEG", ')');
    }
}
