package defpackage;

import android.media.MediaFormat;
import android.util.Size;

/* loaded from: classes.dex */
public final class ep2 implements x18 {
    public final String a;
    public final int b;
    public final zpl c;
    public final Size d;
    public final int e;
    public final fp2 f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public ep2(String str, int i, zpl zplVar, Size size, int i2, fp2 fp2Var, int i3, int i4, int i5, int i6) {
        this.a = str;
        this.b = i;
        this.c = zplVar;
        this.d = size;
        this.e = i2;
        this.f = fp2Var;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
    }

    public static tah a() {
        tah tahVar = new tah((byte) 1);
        tahVar.c = -1;
        tahVar.j = 1;
        tahVar.f = 2130708361;
        tahVar.g = fp2.d;
        return tahVar;
    }

    @Override // defpackage.x18
    public final String c() {
        return this.a;
    }

    @Override // defpackage.x18
    public final MediaFormat d() {
        Size size = this.d;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.a, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", this.e);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.j);
        int i = this.h;
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i);
        int i2 = this.g;
        if (i2 > i) {
            mediaFormatCreateVideoFormat.setInteger("capture-rate", i2);
            mediaFormatCreateVideoFormat.setInteger("operating-rate", i2);
            mediaFormatCreateVideoFormat.setInteger("priority", 0);
        }
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.i);
        int i3 = this.b;
        if (i3 != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", i3);
        }
        fp2 fp2Var = this.f;
        byte b = fp2Var.a;
        if (b != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", b);
        }
        byte b2 = fp2Var.b;
        if (b2 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", b2);
        }
        byte b3 = fp2Var.c;
        if (b3 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", b3);
        }
        return mediaFormatCreateVideoFormat;
    }

    @Override // defpackage.x18
    public final zpl e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ep2) {
            ep2 ep2Var = (ep2) obj;
            if (this.a.equals(ep2Var.a) && this.b == ep2Var.b && this.c.equals(ep2Var.c) && this.d.equals(ep2Var.d) && this.e == ep2Var.e && this.f.equals(ep2Var.f) && this.g == ep2Var.g && this.h == ep2Var.h && this.i == ep2Var.i && this.j == ep2Var.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", resolution=");
        sb.append(this.d);
        sb.append(", colorFormat=");
        sb.append(this.e);
        sb.append(", dataSpace=");
        sb.append(this.f);
        sb.append(", captureFrameRate=");
        sb.append(this.g);
        sb.append(", encodeFrameRate=");
        sb.append(this.h);
        sb.append(", IFrameInterval=");
        sb.append(this.i);
        sb.append(", bitrate=");
        return p3p.k(this.j, "}", sb);
    }
}
